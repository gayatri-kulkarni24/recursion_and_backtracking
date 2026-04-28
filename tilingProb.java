public static int tilingProb(int n){
        //board=2*n tile=2*1
        if(n==0 || n==1){
            return 1;
        }
        int vertical=tilingProb(n-1);
        int horizontal=tilingProb(n-2);
        return vertical+horizontal;
}
