public class Search {
    public static void main(String[] args) {
         int arr[] = {10,20,30,40,50};
     int target  =40;
     boolean found = false;
     //Scanner sc = new Search(System.int)
     for (int i=0; i<arr.length; i++){
        if(arr[i] == target){
            found = true;
            break;
        }
     } if(found == true){
        System.out.println("Element Found");
     }else{
        System.out.println("Not Found");
     }
    }
   
}