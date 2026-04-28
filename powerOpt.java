//optimised power code
    public static int powerOpt(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower=powerOpt(x,n/2);
        if(n%2!=0){
            return x*halfPower*halfPower;
        }
        int calculatedPower=halfPower*halfPower;
        return calculatedPower;
    }
