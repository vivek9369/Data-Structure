public class Lastoccur {
    public static int lastOccurance(int arr[], int key , int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6,8 ,9,5,3,5,2,1};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
