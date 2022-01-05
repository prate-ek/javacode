public class binarysearch {
    public static int binarySearch(int [] arr, int x){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]>x){
                end=mid-1;
            }else if (arr[mid]<x){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={2,3,4,5,12,13,17,35,57};
        int index=binarySearch(arr,35);
        System.out.println("Index of the element searched is:"+ index);
    }
}
