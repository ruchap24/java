public class deletearray {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int loc=3;
        int size=a.length;
        for(int i=loc;i<size-1;i++){
            a[i]=a[i+1];
        }
        size--;
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
