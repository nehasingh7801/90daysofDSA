// Input : A = {1, 2, 3, 4, 5}
// Output : [48]
//          [20, 28] 
//          [8, 12, 16] 
//          [3, 5, 7, 9] 
//          [1, 2, 3, 4, 5] 

import java.util.*;
public class sumofarraytriangle {

    public static void printTriangle(int[] A)
    {
        //base condition
        if(A.length<1){
            return;
        }
        int[] temp= new int[A.length-1];
        for(int i=0; i<A.length-1;i++){
            temp[i]=A[i]+A[i+1];
        }

        printTriangle(temp);
        //to print the smaller arrays first
        System.out.println(Arrays.toString(A));

        
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
}

