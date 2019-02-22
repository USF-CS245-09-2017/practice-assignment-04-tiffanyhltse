//compares adjacent values & swaps them if they're not in order

public class BubbleSort implements SortingAlgorithm {
    public void sort(int [] a){
        for (int j = 0; j < a.length-1; j++){ //keeps track of number of passes
            for (int i = 0; i < a.length-1-j; i++) { //comparisons made in each pass
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }

    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



}
