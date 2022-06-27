public class reversestring {

    static void reverse(char[] arr){

        int i=0;
        int j=arr.length-1;
        solution(arr, i, j);
        for(int s=0;s<arr.length;s++){
            System.out.print(arr[s]);
        }
    }

    static void solution(char[] arr, int i, int j){
        if(i>=j){
            return;
        }
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        solution(arr, ++i, --j);

    }

    public static void main(String[] args) {
        char[] A={'s','t','u','p','i','d'};
        reverse(A);
    }


    
}
