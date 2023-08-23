package com.example.sevenminuteworkoutapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import com.example.sevenminuteworkoutapp.databinding.ActivityExcerciseBinding

class ExerciseActivity : AppCompatActivity() {

    private var binding: ActivityExcerciseBinding? = null

    private var restTimer: CountDownTimer? = null
    private var restProgress = 0
    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0
    private lateinit var mediaPlayer: MediaPlayer

    private var soundPlaying = false

    private var exerciseList: ArrayList<ExerciseModel>? = null
    private var currentExercisePosition = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExcerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExercise)

        mediaPlayer = MediaPlayer.create(this, R.raw.new_countdown)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        exerciseList = Constants.defaultExerciseList()

        binding?.toolbarExercise?.setOnClickListener{
            onBackPressed()
        }
        setupRestView()
    }

    private fun setupRestView() {
        binding?.flRestView?.visibility = View.VISIBLE
        binding?.tvTitle?.visibility = View.VISIBLE
        binding?.tvExerciseName?.visibility = View.INVISIBLE
        binding?.flExerciseView?.visibility = View.INVISIBLE
        binding?.ivGifImage?.visibility = View.INVISIBLE


        if(restTimer != null){
            restTimer?.cancel()
            restProgress = 0
        }

        setRestProgressBar()
    }

    private fun setupExerciseView() {
        binding?.flRestView?.visibility = View.INVISIBLE
        binding?.tvTitle?.visibility = View.INVISIBLE
        binding?.tvExerciseName?.visibility = View.VISIBLE
        binding?.flExerciseView?.visibility = View.VISIBLE
        binding?.ivGifImage?.visibility = View.VISIBLE

        if(exerciseTimer != null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }

        binding?.ivGifImage?.setImageResource(exerciseList!![currentExercisePosition].getGif())
        binding?.tvExerciseName?.text = exerciseList!![currentExercisePosition].getName()

        setExerciseProgressBar()
    }

    private fun setRestProgressBar() {
        binding?.progressBar?.progress = restProgress

        restTimer = object : CountDownTimer(11000, 1100) {
            override fun onTick(p0: Long) {
                restProgress++
                binding?.progressBar?.progress = 11 - restProgress
                binding?.tvTimer?.text = (11 - restProgress).toString()

                if(!soundPlaying){
                    playSound()
                }

            }

            override fun onFinish() {
                stopSound()
                currentExercisePosition++
                setupExerciseView()
            }

        }.start()
    }

    private fun setExerciseProgressBar() {
        binding?.exerciseProgressBar?.progress = exerciseProgress
        exerciseTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(p0: Long) {
                exerciseProgress++
                binding?.exerciseProgressBar?.progress = 10 - exerciseProgress
                binding?.tvExerciseTimer?.text = (10 - exerciseProgress).toString()
            }

            override fun onFinish() {
                if(currentExercisePosition < exerciseList?.size!! - 1){
                    setupRestView()
                }else{
                    Toast.makeText(this@ExerciseActivity, "Congratulations! You have completed all exercises.", Toast.LENGTH_LONG).show()
                }
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        if(restTimer != null){
            restTimer?.cancel()
            restProgress = 0
            mediaPlayer.release()
        }

        if(exerciseTimer != null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        mediaPlayer.release()
        binding = null
    }

    private fun playSound() {
        mediaPlayer.start()
    }

    private fun stopSound() {
        // Release the media player when the timer finishes
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }
}