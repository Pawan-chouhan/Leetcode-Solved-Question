class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {

            int ci = arr[i] - 1;

            if (arr[i] <= 0 || arr[i] > n) {
                i++;
            } 
            else if (arr[i] != arr[ci]) {
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
            } 
            else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }
}