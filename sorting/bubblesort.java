public class bubblesort {
    static void bubblesorting(int[] a, int n){
        boolean swap;
        //i is for number of passes, 
        for(int i=0; i<n-1;i++){
            swap=false;
            //
            for(int j=0;j<n-i-1;j++){
            int temp;
                if(a[j+1]<a[j]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    swap=true;
                }
            }
            //if not swapped even once that means array is sorted
            if(swap=false)
                break;
            
        }
    }

    public static void main(String[] args) {
        int[] a={2,8,7,1,9,5};
        int n=a.length;
        bubblesorting(a, n);
        for(int i=0; i<n;i++){
            System.out.println(a[i]);
        }
        // System.out.println(Arrays.toString(a));
    }
    
}
