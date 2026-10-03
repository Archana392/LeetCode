class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];

        for (int[] log : logs) {
            year[log[0] - 1950]++;
            year[log[1] - 1950]--;
        }

        int count = 0, max = 0, ans = 1950;

        for (int i = 0; i < 101; i++) {
            count += year[i];

            if (count > max) {
                max = count;
                ans = 1950 + i;
            }
        }

        return ans;
    }
}