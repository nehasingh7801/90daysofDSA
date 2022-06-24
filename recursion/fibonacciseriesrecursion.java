public class fibonacciseriesrecursion {
    public static void main(String[] args) {
        fibonacci(6, 0, 1);
        
    }

    static void fibonacci(int n, int a, int b){
        if(n<0){
            return;
        }
        
        System.out.print(" "+b);

        fibonacci(n-1, b, a+b);



    }
    
}
