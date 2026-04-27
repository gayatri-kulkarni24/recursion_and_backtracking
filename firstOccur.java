public static int firstOccur(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return firstOccur(arr,key,i+1);

    }
