class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int[] a = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int x = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p = i + j + 1;

                a[p] += x;
                a[p - 1] += a[p] / 10;
                a[p] %= 10;
            }
        }

        StringBuilder s = new StringBuilder();

        for (int x : a) {
            if (s.length() == 0 && x == 0)
                continue;
            s.append(x);
        }

        return s.toString();
    }
}