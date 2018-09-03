class PrintCommaSep{
    public static void main(String as[]){
        int pos=0;
        StringBuffer s=new StringBuffer(as[0]);
        for(int i=0;i<s.length();){
            pos=s.indexOf(",",i);
            if(pos==-1)
            break;
            System.out.println(s.substring(i, pos));
            i=pos+1;
        }
    }
}