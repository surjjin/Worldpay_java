class StudentManagement{
    public static void main(String[] args) {
        Student.setSub("a","b","c","d","e");
        Student s1=new Student("suraj",83,90,90,90,90,90);
        Student.list[Student.count++]=s1;
        Student s2=new Student("ashish",84,100,100,100,100,100);
        Student.list[Student.count++]=s2;
        Student s3=new Student();
        Student.list[Student.count++]=s3;
        s3.setSname("aditya");
        s3.setSrno(85);
        s3.setMarks(80,80,80,80,80);
        Student s4=new Student("abhinav",85,10,10,100,100,100);
        Student.list[Student.count++]=s4;
        s1.setMarks(90,90,90,90,90);
        s1.reportCard();
        s2.reportCard();
        s3.reportCard();
        System.out.println(s1.average());
        System.out.println(s2.average());
        System.out.println(s3.average());
        Student.pass_fail(Student.list);
        Student.displayName(Student.list);

    }
}