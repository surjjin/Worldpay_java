class AddArray{
    static int add(int a[]){
        int n=0;
        for(int i : a)
            n=n+i;
        return n;      
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(add(a));
    }
}