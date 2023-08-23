package com.example.sevenminuteworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val bicycleCrunch  = ExerciseModel(
            1,
            "Bicycle Crunch",
            R.drawable.bicyclecrunch,
            false,
            false
        )
        exerciseList.add(bicycleCrunch)

        val compundPushups = ExerciseModel(
            2,
            "Compound PushUps",
            R.drawable.compundpushups,
            false,
            false
        )
        exerciseList.add(compundPushups)

        val forwardLunges = ExerciseModel(
            3,
            "Forward Lunges",
            R.drawable.forwardlunges,
            false,
            false
        )
        exerciseList.add(forwardLunges)

        return exerciseList
    }
}