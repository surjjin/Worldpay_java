class SortCities{
    public static void main(String as[]) {
        String a,temp;
        int m=0;
        for(int i=0;i<as.length;i++)
        {
            a=as[i];
            m=i;    
            for(int j=i+1;j<as.length;j++)
            {
                if (as[j].compareTo(a)<0)
                {a=as[j];m=j;}
            }
            temp=as[i];
            as[i]=a;
            as[m]=temp;
            
        }
        for(String a1 :as){
            System.out.println(a1);
        }
    }
}