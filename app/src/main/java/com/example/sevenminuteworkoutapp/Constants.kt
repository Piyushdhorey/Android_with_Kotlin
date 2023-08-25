package com.example.sevenminuteworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val bicycleCrunch  = ExerciseModel(
            1,
            "COMPOUND PUSHUPS",
            "pushup.json",
            false,
            false
        )
        exerciseList.add(bicycleCrunch)

        val compundPushups = ExerciseModel(
            2,
            "JUMPING LUNGES",
            "jumpingLunges.json",
            false,
            false
        )
        exerciseList.add(compundPushups)

        val cobra = ExerciseModel(
            3,
            "COBRA",
            "cobra.json",
            false,
            false
        )
        exerciseList.add(cobra)

        val frogPress = ExerciseModel(
            3,
            "FROG PRESS",
            "frog_press.json",
            false,
            false
        )
        exerciseList.add(frogPress)

        val jumpingJack = ExerciseModel(
            4,
            "JUMPING JACK",
            "jumping_jack.json",
            false,
            false
        )
        exerciseList.add(jumpingJack)

        val reverseCrunches = ExerciseModel(
            5,
            "REVERSE CRUNCHES",
            "forward_lunges.json",
            false,
            false
        )
        exerciseList.add(reverseCrunches)

        val shoulderStretch = ExerciseModel(
            6,
            "SHOULDER STRETCH",
            "shoulder_stretch.json",
            false,
            false
        )
        exerciseList.add(shoulderStretch)

        val squatKicks = ExerciseModel(
            7,
            "SQUAT KICKS",
            "squat_kicks.json",
            false,
            false
        )
        exerciseList.add(squatKicks)

        val stepUpChair = ExerciseModel(
            8,
            "STEPUP CHAIR",
            "step_up_chair.json",
            false,
            false
        )
        exerciseList.add(stepUpChair)

        val squatReach = ExerciseModel(
            9,
            "SQUAT REACH",
            "squat_reach.json",
            false,
            false
        )
        exerciseList.add(squatReach)

        val singleLegHipDown = ExerciseModel(
            10,
            "SINGLE LEG HIP DOWN",
            "single_leg_hip_down.json",
            false,
            false
        )
        exerciseList.add(singleLegHipDown)

        return exerciseList
    }
}