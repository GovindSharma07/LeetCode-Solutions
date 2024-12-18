class Solution {
    fun romanToInt(s: String): Int {
        var total:Int = 0
        val map : Map<String,Int> = mapOf(
            "I" to            1,
"V" to             5,
"X"     to         10,
"L"         to    50,
"C"           to  100,
"D"           to 500,
"M"             to 1000,
        )

        for( i in 0..<s.length-1){
            if(map.getOrDefault(s[i].toString(),0) < map.getOrDefault(s[i+1].toString(),0)) total -= map.getOrDefault(s[i].toString(),0)
            else total += map.getOrDefault(s[i].toString(),0)
        }

        total += map.getOrDefault(s.last().toString(),0)


        return total
    }
}