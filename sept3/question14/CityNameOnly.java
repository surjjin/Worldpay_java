import java.util.StringTokenizer;

class CityNameOnly{
    public static void main(String as[]){
        StringTokenizer st=new StringTokenizer(as[0],".,", true);
        StringBuffer cities=new StringBuffer(30);
        String temp;
        while(st.hasMoreTokens()){
            temp=st.nextToken();
            if(temp.equals("."))
            cities.append(st.nextToken());
        }
        System.out.println(cities);
    }
}