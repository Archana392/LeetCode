class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int sa = 0, sb = 0;

        for (int x : a) sa += x;
        for (int x : b) sb += x;

        int d = (sa - sb) / 2;
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int x : a) set.add(x);

        for (int y : b)
            if (set.contains(y + d))
                return new int[]{y + d, y};

        return new int[0];
    }
}