class Solution {
  List<int> twoSum(List<int> nums, int target) {
    var map = Map<int,int>();
    int i = 0;
    while(i<nums.length){
        if(map[target-nums[i]] != null) return [map[target-nums[i]]!,i];
        else map[nums[i]] = i;
        i++;
    }
    return [-1,-1];
  }
}