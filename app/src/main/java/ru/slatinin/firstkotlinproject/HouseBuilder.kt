package ru.slatinin.firstkotlinproject

interface HouseBuilder {
    fun setWallMaterial(wallMaterial: WallMaterial):House.Builder
    fun setBasementMaterial(bM:String):House.Builder
    fun setRoofMaterial(rM:String):House.Builder
}