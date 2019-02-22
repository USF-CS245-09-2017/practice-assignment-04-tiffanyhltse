//fills 1st index with smallest value in array

public class SelectionSort implements SortingAlgorithm {
    public void sort(int [] a){
        for (int i = 0; i < a.length-1; i++){ //not necessary to check last index because everything will be sorted by then
            swap(a, i, smallest(a, i));

        }

    }

    //first find smallest value in array
    //compare all unsorted numbers to determine which is the smallest one
    public int smallest(int[] a, int start){
        int smallest = start;
        for (int i = start + 1; i < a.length; i++){
            if (a[i] < a[smallest]){ //if next number is less than previous number
                smallest = i; //set it as the smallest
            }
        }
        return smallest;


    }

    //swap the smallest number w/the first number in the unsorted section
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }




}
