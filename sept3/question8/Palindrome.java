class Palindrome{
    public static void main(String as[]){
        int i=0,j=0;
        String s=as[0];
        System.out.println("length "+s.length());
        for(j=0;j<s.length()/2;j++)
        {
            System.out.println(s.charAt(j));
            if(s.charAt(j)!=s.charAt(s.length()-j-1))
                break;
        }
        if(j==as[0].length()/2)
        System.out.println("palindrome");
        else
        System.out.println("NOO");
    }
}