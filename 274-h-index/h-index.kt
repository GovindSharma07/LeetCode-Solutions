class Solution {
    fun hIndex(citations: IntArray): Int {
        var bucket = IntArray(citations.size+1)
        var h = 0

        //inserting values into the bucket(a new array) according to the appeared
        for(i in citations){
            if(i<=citations.size) bucket[i]++
            else bucket[bucket.size - 1]++
        }

        //iterarting from reverse and checking h value which fullfill the condition
        for(i in (bucket.size - 1) downTo 0){
            h = h + bucket[i]
            if(h>=i){
                return i
            }
        }
        return h
    }
}