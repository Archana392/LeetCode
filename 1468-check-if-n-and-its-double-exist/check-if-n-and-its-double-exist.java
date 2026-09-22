class Solution {
    public boolean checkIfExist(int[] arr) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int x : arr) {
            if (set.contains(2 * x) || (x % 2 == 0 && set.contains(x / 2)))
                return true;
            set.add(x);
        }

        return false;
    }
}