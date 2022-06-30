public class selectionsort {
    static void selectsort(int[] a, int n){
        int i,j,k;
        int temp;
        for( i=0;i<n-1;i++){
            
            for(j=k=i; j<n;j++){
                if(a[j]<a[k]){
                    k=j;
                    
                }
            }
            temp=a[k];
            a[k]=a[i];
            a[i]=temp;
            
        }
    }

    public static void main(String[] args) {
        int[] a={2,4,1,9,3};
        int n=a.length;
        selectsort(a, n);
        for(int i=0; i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}
