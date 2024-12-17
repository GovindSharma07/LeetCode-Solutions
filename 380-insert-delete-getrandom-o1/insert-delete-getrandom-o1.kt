class RandomizedSet() {
    val localSet = mutableSetOf<Int>()

    fun insert(`val`: Int): Boolean {
        return localSet.add(`val`)
    }

    fun remove(`val`: Int): Boolean {
        return localSet.remove(`val`)  
    }

    fun getRandom(): Int {
        return localSet.elementAt((1..localSet.size).random() - 1)
    }
}