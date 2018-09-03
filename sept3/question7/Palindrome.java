class palindrome{
    public static void main(String as[]){
        StringBuffer s1=new StringBuffer(as[0]);
        StringBuffer s2=new StringBuffer(as[0]);
        s2.reverse();
        
        System.out.println(s1+" "+s2);
        if(s1.toString().equals(s2.toString()))
        System.out.println("the string "+s1+" is palindrome");
        else
        System.out.println("the string "+s1+" is  NOT palindrome");
    }
}