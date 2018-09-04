import java.io.FileWriter;
import java.io.IOException;

class StoreCity{
    public static void main(String[] as) throws IOException{
        FileWriter fw=new FileWriter("cities.txt",true);
        for(String s:as){
            fw.write(s+"\n");
        }
        fw.flush();
        fw.close();

    }
}