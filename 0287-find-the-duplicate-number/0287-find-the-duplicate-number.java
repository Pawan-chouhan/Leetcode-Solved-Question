class Solution {

    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int ci = arr[i] - 1;

            if (arr[i] != arr[ci]) {
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
            } else {
                if (i != ci) {
                    return arr[i];
                }
                i++;
            }
        }

        return -1;
    }
}