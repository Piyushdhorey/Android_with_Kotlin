package com.example.sevenminuteworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val bicycleCrunch  = ExerciseModel(
            1,
            "COMPOUND PUSH-UPS",
            R.drawable.compundpushups,
            false,
            false
        )
        exerciseList.add(bicycleCrunch)

        val compundPushups = ExerciseModel(
            2,
            "BICYCLE CRUNCH",
            R.drawable.bicyclecrunch,
            false,
            false
        )
        exerciseList.add(compundPushups)

        val forwardLunges = ExerciseModel(
            3,
            "FORWARD LUNGES",
            R.drawable.forwardlunges,
            false,
            false
        )
        exerciseList.add(forwardLunges)

        return exerciseList
    }
}