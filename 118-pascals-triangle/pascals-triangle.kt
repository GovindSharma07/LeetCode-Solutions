class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        if(numRows == 1){
            ans.add(listOf(1))
            return ans
        }
        if(numRows == 2){
            ans.add(listOf(1))
            ans.add(listOf(1,1))
            return ans
        }
                    
        ans.add(listOf(1))
        ans.add(listOf(1,1))
    
        for(i in 3..numRows){
            val l = mutableListOf<Int>()
            l.add(1)
            for(j in 1..i-2) l.add(ans[i-2][j-1] + ans[i-2][j])
            l.add(1)
            ans.add(l)
        }

        return ans
    }
}