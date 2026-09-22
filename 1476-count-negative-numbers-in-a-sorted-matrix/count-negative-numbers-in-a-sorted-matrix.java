class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            int l = 0, r = row.length - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;

                if (row[m] < 0)
                    r = m - 1;
                else
                    l = m + 1;
            }

            count += row.length - l;
        }

        return count;
    }
}