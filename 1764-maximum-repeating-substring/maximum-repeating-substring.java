class Solution {
    public int maxRepeating(String s, String word) {
        int count = 0;
        String x = word;

        while(s.contains(x)) {
            count++;
            x += word;
        }

        return count;
    }
}