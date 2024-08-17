package recap;

import java.util.Arrays;

public class Algorithm04 {

    public static void main(String[] args) {
        Algorithm04 algorithm04 = new Algorithm04();
        int arr[] = {3, 0, 2, 0, 4};
        int waterStorage = algorithm04.findRainWater(arr);

        System.out.println("total water : " + waterStorage);
    }

    public int findRainWater(int[] arr) {
        int waterStorage = 0;
        int rightWall = arr[0];
        int leftWall = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i] == rightWall){
                if(i == arr.length-1) {
                    break;
                }
                leftWall = rightWall;
                rightWall = findRightWall(leftWall, Arrays.copyOfRange(arr,i+1, arr.length));
                min = Math.min(leftWall, rightWall);
            }else {
                waterStorage = waterStorage + min - arr[i];
            }
        }
        return waterStorage;
    }

    /*
     public int findRainWater(int[] arr) {
        int leftWall = arr[0];
        int rightWall = findRightWall(leftWall, Arrays.copyOfRange(arr,1, arr.length));
        int min = Math.min(leftWall, rightWall);
        int waterStorage = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != rightWall) {
                waterStorage = waterStorage + min - arr[i];
            } else {
                if(i == arr.length-1) {
                    break;
                }
                leftWall = rightWall;
                rightWall = findRightWall(leftWall, Arrays.copyOfRange(arr,i+1, arr.length));
                min = Math.min(leftWall, rightWall);
            }
        }

        return waterStorage;
    }
     */

    public int findRightWall(int leftWall, int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= leftWall) {
                return arr[i];
            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
