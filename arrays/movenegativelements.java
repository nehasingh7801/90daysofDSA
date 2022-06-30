public class movenegativelements {
    static void movenegative(int[] arr, int n){
        int[] temp=new int[n];
        int j=0;
        for(int i=0; i<n;i++){
            if(arr[i]>=0){
                temp[j++]=arr[i];
                
                }
            }
        if(j==n || j==0){
                return;
        }

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[j++]=arr[i];
            }
        }

        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }

            

    }

    public static void main(String[] args) {
        int[] arr={1, 4, -2, 2 , 9, 0, -4};
        int n=arr.length;

        movenegative(arr,n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
    
    

