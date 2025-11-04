public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target =50;
        int index = 2 ;
        int low =0 , high= arr.length-1;
        
        while(low <=high){
            int mid = (low+high)/2;
            if (arr[mid] == target){
                index = mid;
                break;
            }else if (arr[mid]< target) {
                low=mid+1;
            }else if (arr[mid] > target){
                high = mid-1;
            }
        }
        if ( index!=-1){
            System.out.println("Element Found");
            System.out.println(index);
        }else{
            System.out.println("Element Not Found");        }


    }
}
