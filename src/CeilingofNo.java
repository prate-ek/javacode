public class CeilingofNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 12, 13, 17, 35, 57};
        int index = binarySearchCeiling(arr, 58);
        System.out.println("Ceiling of the element searched is:" + index);
//        to print no. instead of the array index use arr[index]
    }
    public static int binarySearchCeiling(int[] arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
         int start=0;
         int end= arr.length-1;
         int mid;

         while (start<=end){
             mid=start+(end-start)/2;
             if (arr[mid]>target){
                 end=mid-1;
             }else if (arr[mid]<target){
                 start=mid+1;
             }else{
                 return mid;
             }
         }
         return start;
    }
}
