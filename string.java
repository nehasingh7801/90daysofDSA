static long[] findScore(int n, int k, String[] s){
    long[] result=new long[n];
    for(int i=0; i<n; i++){
        for(int j=0;j<k;j++){
            for(int l=0;l<n;l++){
                if(s[l].startsWith(s[i].substring(0,j))){
                    result[i]++;
                }
            }
        }
    }

    return result;

}