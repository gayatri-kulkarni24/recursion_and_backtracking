public static void changeArr(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);
            System.out.println();
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
}
