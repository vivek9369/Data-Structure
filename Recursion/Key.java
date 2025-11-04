public class Key {
    public static int findKey(int arr[] , int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
     return   findKey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3,8,4,6};
        System.out.println(findKey(arr, 8, 0));
    }
}


