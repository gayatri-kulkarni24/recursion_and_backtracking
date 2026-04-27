public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x* power(x,n-1);
    }
