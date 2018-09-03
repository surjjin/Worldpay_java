class Exception{
    public static void main(String as[]){
        try{
            int a=Integer.parseInt(as[0]);
            int b=Integer.parseInt(as[1]);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            if(Integer.parseInt(e1.getMessage())==1)
            System.out.println("second value not passed");
            else if(Integer.parseInt(e1.getMessage())==0)
            System.out.println("both first and second value are not passed");
        }
    }
}