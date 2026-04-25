    public static void printDecr(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDecr(n-1);
    }
