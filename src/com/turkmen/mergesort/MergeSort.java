package com.turkmen.mergesort;

/**
 * 
 * @author TTTDEMIRCI
 *
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {21,4,54,43,67,89,45,1,8,9,777,89};
        MergeSort mergeSort = new MergeSort();
         mergeSort.printArr(arr);
        mergeSort.sort(arr, 0, arr.length - 1, "start");
        mergeSort.printArr(arr);
    }

    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    void sort(int[] arr, int left, int right, String x) {
//        System.out.println("left :" + left + " - right: " + right + " ==> " + x);
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle, "first");
            sort(arr, middle + 1, right, "second");
            merge(arr, left, middle, right);
        }

    }

    void merge(int[] arr, int left, int middle, int right) {

//        System.out.println("-------------------------------");
//        System.out.println("left " + left + " middle " + middle + " right " + right);
//        System.out.println("-------------------------------");
        
        int [] first=new int[middle+1-left];
        int [] second=new int[right-middle];
        
       
        
        for(int i=0;i<first.length;i++) {
            first[i]=arr[left+i];
        }
        
        for(int p=0;p<second.length;p++) {
            second[p]=arr[middle+p+1];
        }
        
        int i=0;
        int k=0,j=left;
        
        while(i<first.length && k<second.length) {
            
            if(first[i]<=second[k]) {
                arr[j]=first[i];
                i++;
            }
            else {
                arr[j]=second[k];
                k++;
            }
            j++;
        }
        
        
        while (i < first.length)
        {
            arr[j] = first[i];
            i++;
            j++;
        }
 
        while (k < second.length)
        {
            arr[j] = second[k];
            k++;
            j++;
        }
//        System.out.println(first.length+" - "+second.length);
        

    }

}
