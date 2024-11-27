package CodingTest;

 // find the Missing Number: Given an array containing n distinct
  // numbers taken from 0, 1, 2, ..., n, find the missing number

public class Main {

    public static void findMissingNo(int[] arr, int max){
        for (int i=1; i<=max;i++){
            boolean found = false;
            for (int num: arr){
                if (num==i){
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int[] arr ={1,3,4,5,7};
    int max= 7;
        System.out.println("Missing no. in array is");
        findMissingNo(arr,max);
    }
}
