class CountCharDigits{
    public static void main(String as[]){
        int j=0;
        for(int i=0;i<as[0].length();i++)
        {
            j=as[0].charAt(i);
            if(j>47&&j<58)
            System.out.println("digit "+as[0].charAt(i));
            else if (j>64 && j<91)
            System.out.println("Capital "+as[0].charAt(i));
            else if (j>96 && j<123)
            System.out.println("lower "+as[0].charAt(i));

        }
    }
}