public class mergesort {

    public static void divide(int[] arr , int si , int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,ei,mid);
    }

    public static void conquer(int[] arr, int si, int ei, int mid) {

        int[] sorted = new int[ei-si+1];

        int id1 = si;
        int id2 = mid+1;

        int x=0;

        while(id1<=mid && id2<=ei){

            if(arr[id1]<=arr[id2]){
                sorted[x++] = arr[id1++];
            }else{
                sorted[x++]=arr[id2++];
            }
        }

        while(id1<=mid){
            sorted[x++] = arr[id1++];
        }

        while(id2<=ei){
            sorted[x++]=arr[id2++];
    }

    for(int i=0,j=si;i<sorted.length;i++,j++){
        arr[j]=sorted[i];
    }

    }

    public static void pa(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }


    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
    pa(arr);

    divide(arr, 0, arr.length-1);
    System.out.println("");
    pa(arr);

    }
    
}
