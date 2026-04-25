public static void printInc(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
          printInc(n-1);
        System.out.println(n );
      
    }
