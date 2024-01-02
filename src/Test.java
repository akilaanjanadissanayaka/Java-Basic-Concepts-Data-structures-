import Section_1_Sorting.QuickSort;

import java.util.Arrays;

public class Test {
    public static void QuickSort(int arr[], int lb, int ub){
        int loc;
        if(lb<ub){
            loc=Partition(arr,lb,ub);
            QuickSort(arr,lb,loc-1);
            QuickSort(arr,loc+1,ub);
        }
    }
    public static int Partition(int arr[], int lb, int up){
        int start=lb;
        int end=up;
        int pivot=arr[lb];
        int temp;
        while (start<end){
            while (arr[start]<=pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
        return end;
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        int n=arr.length;

        printArray(arr,n);
//        Arrays.sort(arr);
        QuickSort(arr,0,9);
        printArray(arr,n);


    }
}
