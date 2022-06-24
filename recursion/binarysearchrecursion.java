public class binarysearchrecursion {

    public static void main(String[] args) {
        int[] arr={1,2,3, 4, 45,68,96};
        int target=96;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search (int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m =s+ (e-s)/2 ;//middle

        if(arr[m]==target){
            return m;
        }

        if(target<arr[m]){
            return search(arr, target, s, m-1 );
        }

        return search(arr, target, m+1, e );//without this return statement the program wouldnt run


    }
    
}
