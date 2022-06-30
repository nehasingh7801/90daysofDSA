import javax.swing.text.html.StyleSheet;

public class fibonaccinumber {
    public static void main(String[] args) {
        System.out.println(fibonum(50)); 
        
    }

    static int fibonum(int n){
        return (int) ((int)(Math.pow((1+Math.sqrt(5))/2, n))/Math.sqrt(5));
    }

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        
        return fibonacci(n-1)+fibonacci(n-2);



    }
    
}
