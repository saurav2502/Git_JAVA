package sorting;

public class SortingApp {

    public static void main(String[] args) {
        SortingImpl selection = new SortingImpl();
        int[] arr = {12,34,67,24,3453,2343455,345,3445,4645,4534,5645};
        int[] ret = selection.selectionSort(arr);
        for (int i = 0; i <ret.length-1 ; i++) {
            System.out.print(ret[i]+" ");
        }
        System.out.println();
        int[] bubbleArr = {34,45,12,10,23,50};
        int[] bubbleRet = selection.bubbleSort(bubbleArr);
        for (int i = 0; i < bubbleArr.length; i++) {
            System.out.print(bubbleArr[i]+" ");
        }
        System.out.println();
        int[] insertArr = {12, 11, 13, 5, 6 };
        int[] insertRET = selection.insertionSort(insertArr);
        for (int i = 0; i < insertRET.length ; i++) {
            System.out.print(insertRET[i]+" ");
        }
    }

}
