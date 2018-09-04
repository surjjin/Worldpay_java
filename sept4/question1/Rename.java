import java.io.File;

class Rename{
    public static void main(String as[]){
        File f1=new File(as[0]);
        File f2=new File(as[1]);

        if(f1.exists())
        {
            if(f1.isFile())
            {
                if(!f2.exists())
                {
                    if(f1.length()<500)
                    {
                        f1.renameTo(f2);
                        System.out.println("name has been renamed");
                    }
                    else
                    System.out.println("file f1 is too large");
                }
                else
                System.out.println("file f2 already exists");
            }
            else{
                System.out.println("the giver f1 is not file ");
            }
        }
        else{
            System.out.println("file f1 doesnt exists");
        }

    }
}