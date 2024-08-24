package recap.algorithm;

public class Algorithm01 {
    public static void main(String[] args) {

        Algorithm01 algorithm01 = new Algorithm01();

        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int N = 8;
        int sum = algorithm01.sumByN(N);
        System.out.println(sum);
        int missingNumber = algorithm01.findMissingNumber(arr, sum);
        System.out.println("missing number = " + missingNumber);
    }

    public int findMissingNumber(int[] nums, int sum) {
        for(int i=0; i<nums.length; i++) {
            sum = sum - nums[i];
        }
      return sum;
    }

    public int sumByN(int N) {
        int sum = 0;
        for(int i=1; i<=N; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
