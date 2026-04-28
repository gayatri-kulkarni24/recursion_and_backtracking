public static int fibbonacci(int n,int stop){
        if(n==stop){
            return 0;
        }
        if(n==1 && (n+1)==1){
            return 2;
        }
        System.out.print(n + " ");
        return  fibbonacci(n+1,stop)+fibbonacci(n+2,stop);
}
