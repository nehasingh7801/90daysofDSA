public class validstring 
{
    static boolean valid(String s){
        if(!(s.charAt(0)>=a && s.charAt(0)<=z || s.charAt(0)=='_' ||  s.charAt(0)>=A && s.charAt(0)<=Z)){
            return false;

        }
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>=a && s.charAt(i)<=z || s.charAt(i)=='_' ||  s.charAt(i)>=A && s.charAt(i)<=Z)){
                return false;
        }

    }
}

    public static void main(String[] args) {
        String s="neha_4#";
        
    }
    
}
