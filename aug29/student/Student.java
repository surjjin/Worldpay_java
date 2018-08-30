class Student{
    private String sname;
    private int srno;
    private int marks[]=new int[5];
    public static String sub[] =new String[5];
    public static Student list[]=new Student[100];
    public static int count;
    Student(){
        //default constructor
    }
    Student(String sname,int srno,int ...a){
        this.sname=sname;
        this.srno=srno;
        int i=0;
        for(int m : a)
        {
            marks[i++]=m;
        }
    }

    public void setSname(String sname){
        this.sname=sname;
    }
    public void setSrno(int srno){
        this.srno=srno;
    }
    public void setMarks(int ...a)
    {
        int i=0;
        for(int m : a)
        {
            marks[i++]=m;
        }
    }
    public static void setSub(String ...a){
        int i=0;
        for(String m : a)
        {
            sub[i++]=m;
        }
    }

    public String getSname(){
        return sname;
    }
    public int getSrno(){
        return srno;
    }
    public int[] getMarks(){
        return marks;
    }
    public String[] getSub(){
        return sub;
    }

    public void reportCard(){
        for(int i=0;i<5;i++){
            System.out.println(sub[i]+"   "+marks[i]);
        }
    }

    public int average(){
        int j=0;
        int sum=0;
        for(int i:marks){
            sum=sum+i;j++;
        }
        return sum/j;
    }
    public static void displayName(Student s[]){
        for(int i=0;i<count;i++)    
        System.out.println(s[i].sname);
        }
    

    public static void pass_fail(Student s[]){
        int j=0;
        for(int i=0;i<count;i++) {
            for(int k:s[i].marks){
                if(k<33)
                { j=0;break;}
                else 
                j=1;
            }
            if(j==0)
            System.out.println(s[i].sname+" fail");
            else
            System.out.println(s[i].sname+" pass");
        }
    }    

}