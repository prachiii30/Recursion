public class linearSearch {
    public static void main(String[] args) {
        int [] arr={12,45,67,33,545,5};
        int target=-12;
        int index=0;
        int ans=find(arr,target,index);
        System.out.println(ans);
    }

    public static int find(int [] array,int key,int i){
        
        if(array[i]==key){
            return i;
        }
        if(i==array.length-1){
            return -1;
        }
        else{
            return find (array,key,i+1);
        }
    

}
}
