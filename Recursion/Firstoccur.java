public class Firstoccur {

    public static int firstOccurance(int arr[], int key, int i){
        if (i == arr.length-1) {
            return - 1;
        }
        if (arr[i] == key) {
            return i;
        }
         return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 8, 4, 9 ,5, 4, 6 ,7 ,5, 2 ,1};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}