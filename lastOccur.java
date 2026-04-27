public static int lastOccur(int arr[],int key,int n){
        if(n==0){
            return -1;
        }
       if(arr[n]==key){
        return n;
       }
       return lastOccur(arr,key,n-1);
    }
