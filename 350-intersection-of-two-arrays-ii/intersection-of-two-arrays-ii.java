class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        for (int x : nums1)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for (int x : nums2) {
            if (map.getOrDefault(x, 0) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}