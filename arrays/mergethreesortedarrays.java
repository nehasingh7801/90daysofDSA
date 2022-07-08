import java.util.*;
public class mergethreesortedarrays {

    static void mergethreearray(int[] A, int[] B, int[] C){
        ArrayList<Integer> list= new ArrayList<Integer>();
        int i=0, j=0, k=0;
        while(i<A.length && j<B.length && j<C.length){
            int a = A[i];
            int b = B[j];
            int c = C[k];
            if (a <= b && a <= c) {
                list.add(a);
                i++;
            }
            else if (b <= a && b <= c) {
                list.add(b);
                j++;
            }
            else {
                list.add(c);
                k++;
            }
        }

        //if one of the three arrays get exhausted
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                list.add(A[i]);
                i++;
            }
            else {
                list.add(B[j]);
                j++;
            }
        }
        while (j < B.length && k < C.length) {
            if (B[j] < C[k]) {
                list.add(B[j]);
                j++;
            }
            else {
                list.add(C[k]);
                k++;
            }
        }
        while (i < A.length && k < C.length) {
            if (A[i] < C[k]) {
                list.add(A[i]);
                i++;
            }
            else {
                list.add(C[k]);
                k++;
            }
        }

        //if two of them get exhausted or just one is left
        while (i < A.length) {
            list.add(A[i]);
            i++;
        }
        while (j < B.length) {
            list.add(B[j]);
            j++;
        }
        while (k < C.length) {
            list.add(C[k]);
            k++;
        }
       
        // finally print the list
        for (Integer x : list)
            System.out.print(x + " ");

    }


    public static void main(String[] args)
    {
        int A[] = { 1, 2, 41, 52, 84 };
        int B[] = { 1, 2, 41, 52, 67 };
        int C[] = { 1, 2, 41, 52, 67, 85 };
 
        // call the function to sort and print the sorted numbers
        mergethreearray(A, B, C);
    }
    
}
