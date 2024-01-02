package Section_1_Sorting;

public class SelectionSort {
    public static int smallest(int a[], int i,int n){
        int smallest =a[i];
        int pos=i;
        for(int j=i+1; j<n;j++ ){
            if(smallest>a[j]){
                smallest=a[j];
                pos=j;
            }
        }
        return pos;
    }
    public static void selectionSort(int a[],int n){
        int pos,temp;
        for(int i=0;i<n;i++){
            pos=smallest(a,i,n);
            temp=a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}