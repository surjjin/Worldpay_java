class Authenitcation{
    public static void main(String as[]){
        String s1,s2;
        s1=as[0];
        s2=as[1];
        if(s2.equals("india") && s1.toLowerCase().equals("indore".toLowerCase()))
        System.out.println("welcome user");
        else if(s2.equals("india"))
        System.out.println("Wrong userid");
        else if(s1.toLowerCase().equals("indore".toLowerCase())) 
        System.out.println("wrong password");
        else 
        System.out.println("both userid and password are wrong");



    }
}