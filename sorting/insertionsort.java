
public class insertionsort {
    static void insort(int[] arr, int n){
        int temp;
        for(int i=0; i<=n-1;i++){
            for(int j=i; j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0, -23, 56, 8, 2};
        int n=arr.length;
        insort(arr, n);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
