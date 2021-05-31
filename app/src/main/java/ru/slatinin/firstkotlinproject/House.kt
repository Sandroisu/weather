package ru.slatinin.firstkotlinproject

class House(wMat: WallMaterial?, basementMat: String?, roofMat: String?) {
    private val wallMaterial = wMat;
    private val basementMaterial = basementMat;
    private val roofMaterial = roofMat;

    fun getWallMaterial(): String {
        return wallMaterial?.getMaterial() ?: "НЕИЗВЕСТНЫЙ МАТЕРИАЛ"
    }

    fun getBasementMaterial(): String {
        return basementMaterial?:"НЕИЗВЕСТНЫЙ МАТЕРИАЛ"
    }

    fun getRoofMaterial(): String {
        return roofMaterial?:"НЕИЗВЕСТНЫЙ МАТЕРИАЛ"
    }

    companion object Builder : HouseBuilder {
        private var nestedMaterial: WallMaterial? = null
        private var nestedBasementMaterial :String? = null
        private var nestedRoofMaterial :String? = null
        override fun setWallMaterial(wallMaterial: WallMaterial): Builder {
            nestedMaterial = wallMaterial
            return this
        }

        override fun setBasementMaterial(bM:String):Builder {
            nestedBasementMaterial = bM
            return this
        }

        override fun setRoofMaterial(rM:String):Builder {
            nestedRoofMaterial = rM
            return this
        }

        fun build(): House {
            return House(nestedMaterial, nestedBasementMaterial, nestedRoofMaterial);
        }

    }
}