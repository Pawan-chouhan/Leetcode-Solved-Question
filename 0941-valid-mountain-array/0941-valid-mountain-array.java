class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3)
            return false;

        int i = 0;

        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == arr.length - 1)
            return false;

        int j = arr.length - 1;

        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return i == j;
    }
}