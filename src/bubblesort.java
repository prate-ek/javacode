import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={5,21,34,53,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {

//run the steps n-1 times
        for (int i=0; i<arr.length;i++){
//            for each step, max item will come at the last respective index
            for (int j=0; j< arr.length-i-1;j++){
//                swap if the item is smaller than the previous item
                if(arr[j]>arr[j+1]) {
//                    swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

                }
            }

        }

    }

