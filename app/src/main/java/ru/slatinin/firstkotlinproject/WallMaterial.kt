package ru.slatinin.firstkotlinproject

class WallMaterial (material:Materials){
    val mat = material
    fun getMaterial():String{
        return when (mat){
            Materials.WOOD -> "ДЕРЕВО"
            Materials.CONCRETE -> "БЕТОН"
            Materials.STEEL -> "СТАЛЬ"
        }
    }
}
