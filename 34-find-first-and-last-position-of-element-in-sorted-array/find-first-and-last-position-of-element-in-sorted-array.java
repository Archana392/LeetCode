class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = find(nums, target);
        int last = find(nums, target + 1) - 1;

        if (first == nums.length || first > last)
            return new int[]{-1, -1};

        return new int[]{first, last};
    }

    int find(int[] a, int x) {
        int l = 0, r = a.length;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (a[m] < x) l = m + 1;
            else r = m;
        }

        return l;
    }
}