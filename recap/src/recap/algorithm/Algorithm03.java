package recap.algorithm;

import java.util.Arrays;

public class Algorithm03 {

    public static void main(String[] args) {
        Algorithm03 algorithm03 = new Algorithm03();
        int[] arr = {1, 2, 4, 6, 3, 7, 5};
        Arrays.sort(arr);
        int N = 8;

        int missingNumber = algorithm03.findMissingNumber(arr, N);
        System.out.println(missingNumber);
    }

    public int findMissingNumber(int[] arr, int N) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) {
                return i+1;
            }
        }

        return N;
    }
}
