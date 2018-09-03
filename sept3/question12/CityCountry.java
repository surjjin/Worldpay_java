import java.util.StringTokenizer;

class CityCountry{
    public static void main(String as[]){
        StringBuffer city=new StringBuffer(30);
        StringBuffer country=new StringBuffer(30);
        String temp;
        StringTokenizer st=new StringTokenizer(as[0],",;", true);
        while(st.hasMoreElements()){
            temp=st.nextToken();
            System.out.println(temp);
            if(temp.equals(";"))
            break;
            city.append(temp);
        }
        while(st.hasMoreElements()){
            temp=st.nextToken();
            System.out.println(temp);
            country.append(temp);
        }
        System.out.println("cities");
        System.out.println(city);
        System.out.println("countries");
        System.out.println(country);
    }
}