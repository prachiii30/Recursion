class checkSorted{
    public static void main(String[] args) {
        int [] arr={1,2,3,0,45};
        int i=0;
        boolean ans= check(arr,i);
        System.out.println(ans);
    }

    public static boolean check(int [] a,int i){
        if(i==a.length-1){
            return true;
    }
    else{
        return(a[i]<a[i+1] && check(a,i+1));
    }
    }
}