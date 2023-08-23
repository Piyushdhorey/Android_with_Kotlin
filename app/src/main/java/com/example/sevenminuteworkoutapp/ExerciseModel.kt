package com.example.sevenminuteworkoutapp

class ExerciseModel (
    private var id: Int,
    private var name: String,
    private var gif: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean,
){
    fun getId(): Int{
        return id
    }
    fun setId(id: Int){
        this.id = id
    }
    fun getName(): String{
        return name
    }
    fun setName(name: String){
        this.name = name
    }
    fun getGif(): Int{
        return gif
    }
    fun setGif(gif: Int){
        this.gif = gif
    }
    fun getIsCompleted(): Boolean{
        return isCompleted
    }
    fun setIsCompleted(isCompleted: Boolean){
        this.isCompleted = isCompleted
    }
    fun getIsSelected(): Boolean{
        return isSelected
    }
    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }
}