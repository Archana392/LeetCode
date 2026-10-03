class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            ans[i] = list.get(i);

        return ans;
    }
}