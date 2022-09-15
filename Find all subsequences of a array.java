import java.util.ArrayList;
import java.util.List;

//recursion
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    private void recur(int i, int[] nums, List<Integer> temp){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        recur(i+1, nums, temp);
        temp.add(nums[i]);
        recur(i+1, nums, temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        recur(0, nums, temp);
        System.out.println(ans);
    }
}
