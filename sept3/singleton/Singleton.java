import javax.lang.model.util.ElementScanner6;

class Singleton{
    private static Singleton st;
    private int n;
    private Singleton(){
        n=10;
    }

    static Singleton makeObject(){
        if(st==null)
        return new Singleton();
        else
        return st;
        
    }
    public void display(){
        System.out.println("the value of n "+n);
    }
    public static void main(String as[]){
        Singleton obj=Singleton.makeObject();
        Singleton obj1=Singleton.makeObject();
        obj.display();
        obj1.display();
    }
}