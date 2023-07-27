
//Use Selection Sort sorting algorithm to sort an array into descending order
public class Main {

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPosition = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[minPosition] < arr[j]){
                        minPosition = j;
                    }
                }
                int temp = arr[minPosition];
                arr[minPosition] = arr[i];
                arr[i] = temp;

        }
    }
    public static void main(String[] args) {

        int arr[] ={3,6,2,1,8,7,4,5,3,1};

        selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}