class ReplaceExtention{
    public static void main(String as[]){
        StringBuffer s=new StringBuffer(as[0]);
        int pos=s.lastIndexOf(".");
        System.out.println(s.replace(pos,s.length(),".enc"));
    }
}