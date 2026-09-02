class Solution {
    public boolean canConstruct(String r, String m) {
        int[] a = new int[26];

        for(char c : m.toCharArray())
            a[c-'a']++;

        for(char c : r.toCharArray())
            if(a[c-'a']-- == 0) return false;

        return true;
    }
}