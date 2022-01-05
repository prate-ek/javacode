public class floorofaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 12, 13, 17, 35, 57};
        int index = binarySearchFloor(arr, 7);
        System.out.println("Ceiling of the element searched is:" + arr[index]);
    }
    public static int binarySearchFloor(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
