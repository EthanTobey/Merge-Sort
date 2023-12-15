import java.util.ArrayList;

public class MergeSortTester {
  
  public static Integer[] mergeSort(Integer[] arr) {
    return arr = myMergeSort(arr);
  }
  
  public static void incX(int x) {
    x = (int)(Math.random()*x);
  }
  
  public static Integer[] myMergeSort(Integer[] arr) {
    if (arr.length == 1)       //base case
      return arr;
    Integer[] leftArr = new Integer[arr.length - arr.length/2]; //holds left side of array
    Integer[] rightArr = new Integer[arr.length/2];             //holds right side of array
    split(arr, leftArr, rightArr);
    //recursive call left side of array
    leftArr = myMergeSort(leftArr);
    //recursive call right side of array
    rightArr = myMergeSort(rightArr);
    arr = merge(leftArr, rightArr, arr);    //set array equal to merge of left and right
    return arr;
  }
  
  public static void split(Integer[] arr, Integer[] leftArr, Integer[] rightArr) {
    //copy left side into left array
    for (int i = 0; i < leftArr.length; i++) {
      leftArr[i] = arr[i];
    }
    //copy right side into right array
    for (int i = 0; i < rightArr.length; i++) {
      rightArr[i] = arr[i + leftArr.length];
    }
  }
  
  public static Integer[] merge(Integer[] arr1, Integer[] arr2, Integer[] outputArray) {
    Integer[] mergedArray = new Integer[arr1.length + arr2.length];
    int i = 0;    //index arr1
    int j = 0;    //index arr2
    int k = 0;    //index mergedArray
    while (i < arr1.length && j < arr2.length) {
      if ( arr1[i].compareTo(arr2[j]) <= 0) {  //element in arr1 is smaller
        mergedArray[k] = arr1[i];
        i++;
      }
      else {                                 //element in arr2 is smaller
        mergedArray[k] = arr2[j];
        j++;
      }
      k++;
    }
    //STEP e
    //if arr1 not fully copied
    while (i < arr1.length) {
      mergedArray[k] = arr1[i];
      i++;
      k++;
    }
    //if arr2 not fully copied
    while (j < arr2.length) {
      mergedArray[k] = arr2[j];
      j++;
      k++;
    }
    return outputArray = mergedArray;
  }
}