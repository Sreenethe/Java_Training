public class Min_arr {
    public static void main(String[] args) {
        int a[]={4,1,2,6,3};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
