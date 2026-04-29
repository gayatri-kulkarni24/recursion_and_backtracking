    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=friendsPairing(n-1);
        int pairs=(n-1)*friendsPairing(n-2);
        return single+pairs;
    }
