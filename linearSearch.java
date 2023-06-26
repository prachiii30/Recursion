public class linearSearch {
    public static void main(String[] args) {
        int [] arr={12,45,67,33,545,5};
        int target=-12;
        int index=0;
        int ans=find(arr,target,index);
        System.out.println(ans);
    }

    public static int find(int [] a,int key,int i){
        
        if(a[i]==key){
            return i;
        }
        if(i==a.length-1){
            return -1;
        }
        else{
            return find (a,key,i+1);
        }
    

}
}
