public class selectionsortt {
    public static void selectionSort(int[] arr){
        for (int i=0; i< arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            for (int j=i+1;j< arr.length;j++)
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            if (minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={3,24,23,32,1,21,2};
        selectionSort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);//System.out.println(arr[i]);
    }
}
