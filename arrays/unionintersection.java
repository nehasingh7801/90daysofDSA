public class unionintersection {
    static void union(int[] a, int n, int[] b,int m){
        int temp[]=new int[n+m];
        int k=0;
        for(int i=0; i<n;i++)
            temp[k++]=a[i];
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(a[i]!=b[j])
                    temp[k++]=b[j];

            }
        }
        for(int i=0; i<n;i++)
            System.out.println(temp[i]);



    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int n=a.length;
        int[] b={2,6,7};
        int m=b.length;
        union(a,n,b,m);
    }
    
}
