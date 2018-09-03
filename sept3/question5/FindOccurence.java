class FindOccurence{
    public static void main(String as[]){
        int pos=0;
        System.out.println(as[0].length());
        for(int i=0;i<as[0].length();){
            pos=as[0].indexOf(as[1], i);
            if(pos==-1)
            break;
            System.out.println(pos);
            i=pos+1;

        }
    }
}