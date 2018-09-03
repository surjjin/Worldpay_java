class ReplaceDigit{
    public static void main(String as[]){
        StringBuffer s=new StringBuffer(as[0]);
        int j=0;
        for(int i=0;i<as[0].length();i++)
        {
            j=as[0].charAt(i);
            if(j>47&&j<58)
            s.replace(i,i+1,"#");
        }
        System.out.println(s);
    }
}