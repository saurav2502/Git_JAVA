package sorting;

public class SortingImpl {


    public int[] selectionSort(int[] arr) {
        if (arr.length == 0){
            return new int[0];
        }else {
            int len = arr.length;
            for (int i = 0; i < len-1; i++) {
                int min = arr[i];
                for (int j = i+1; j <= len - 1 ; j++) {
                    if (arr[j] < min){
                        min = arr[j];
                        int temp =arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                arr[i] = min;
            }
            return arr;
        }
    }

    public int[] bubbleSort(int[] bubbleArr) {
        if (bubbleArr.length == 0){
            return new int[0];
        }else {
            for (int i = 0; i <bubbleArr.length ; i++) {
                for (int j = i+1; j <= bubbleArr.length-1 ; j++) {
                    if (bubbleArr[i]>bubbleArr[j]){
                        int temp = bubbleArr[i];
                        bubbleArr[i] = bubbleArr[j];
                        bubbleArr[j] = temp;
                    }
                }
            }
            return bubbleArr;
        }
    }

    public int[] insertionSort(int[] insertArr) {
        if (insertArr.length == 0){
            return new int[0];
        }else {
            for (int i = 1; i < insertArr.length; i++) {
                int key = insertArr[i];
                int prevIndex = i-1;
                while (prevIndex >= 0 && insertArr[prevIndex] > key ){
                    insertArr[prevIndex+1] = insertArr[prevIndex];
                    prevIndex--;
                }
                insertArr[prevIndex+1] = key;
            }
            return insertArr;
        }
    }

    private void swap(int[] startIndex) {
        this.bubbleSort(startIndex);
    }
}
