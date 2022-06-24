 

public class numbersrecursion {
    public class numbers {
        public static void main(String[] args) {
    
            //write a fucntion that takes a number and prints it
            //print first five numbers 1 2 3 4 5 
            print1(1);
            
        }
    
        static void print1(int n){
            if(n==5){
                System.out.println(n);
                return;
            }
            System.out.println(n);
            print1(n+1);
        }

         
        
        
    }
    
}
