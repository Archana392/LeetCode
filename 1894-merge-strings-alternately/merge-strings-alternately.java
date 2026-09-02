class Solution {
    public String mergeAlternately(String a, String b) {
        String r = "";
        int i = 0;

        while(i < a.length() || i < b.length()) {
            if(i < a.length()) r += a.charAt(i);
            if(i < b.length()) r += b.charAt(i);
            i++;
        }

        return r;
    }
}