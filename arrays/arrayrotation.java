public class arrayrotation {

    static void rotation(int[] arr, int n){
        int p=1;
        while(p<=n){
            int last=arr[0];
            for(int i=0;i<arr.length-1; i++){
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=last;
            p++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[ ] A={2,4,5,6,8,10};
        rotation(A, 50);
    }
    
}
