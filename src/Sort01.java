import java.util.Arrays;

public class Sort01 {
    public static void sortZerosAndOnes(int arr[]) {
        int temp = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
                }
            else if(arr[i]!=0 &&arr[j]==0){
                temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j--;
            } else {
                j--;
            }
        }

    }

}