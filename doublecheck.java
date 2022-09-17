public class doublecheck {
    public static double check(int[] arr1){
        int i;
        for(i=0;i<arr1.length-2;i++){
            if(arr1[i]==arr1[i+1]+1){
                break;
            }
        }
        return((arr1[i]+arr1[i+1])/2);


        
    }
    public static void main(String[] args) {
        int[] arr1={3,4,5};
        check(arr1);
        
        
    }
    
}
