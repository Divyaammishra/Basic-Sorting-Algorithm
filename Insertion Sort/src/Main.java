public class Main {

    /*
    Inserting sort an algorithm to arrange any unsorted array in sorted form.
    It could be in ascending or descending order.
     */

    public static void insertionSort(int array[]){

        //Outer loop
        for(int i=1; i<array.length; i++){

            int currentPosition = array[i];
            int previousPosition = i-1;

            while(previousPosition >= 0 && array[previousPosition] > currentPosition){
                array[previousPosition+1] = array[previousPosition];
                previousPosition--;
            }
            array[previousPosition+1] = currentPosition;
        }
    }
    public static void main(String[] args) {

        int array[] = {34,54,44,64,84,74,94};

        insertionSort(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}