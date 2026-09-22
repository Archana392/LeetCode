class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        java.util.HashSet<Integer> a = new java.util.HashSet<>();
        java.util.HashSet<Integer> b = new java.util.HashSet<>();

        for (int x : nums1) a.add(x);

        for (int x : nums2)
            if (a.contains(x)) b.add(x);

        int[] ans = new int[b.size()];
        int i = 0;

        for (int x : b)
            ans[i++] = x;

        return ans;
    }
}