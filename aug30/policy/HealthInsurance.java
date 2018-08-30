class HealthInsurance extends Insurance{
    private int sum_assured;
    private int rent_per_day;
    private int pre_hostpital;
    private int post_hospital;

    HealthInsurance(int pcode,String pname,int sum_assured,int rent_per_day,int pre_hostpital,int post_hospital){
        super(pcode,pname);
        setSum_assured(sum_assured);
        setPost_hospital(post_hospital);
        setPre_hostpital(pre_hostpital);
        setRent_per_day(rent_per_day);

    }
    public void setPost_hospital(int post_hospital) {
        this.post_hospital = post_hospital;
    }
    public void setPre_hostpital(int pre_hostpital) {
        this.pre_hostpital = pre_hostpital;
    }
    public void setSum_assured(int sum_assured) {
        this.sum_assured = sum_assured;
    }
    public void setRent_per_day(int rent_per_day) {
        this.rent_per_day = rent_per_day;
    }

    public int getPost_hospital() {
        return post_hospital;
    }
    public int getPre_hostpital() {
        return pre_hostpital;
    }
    public int getRent_per_day() {
        return rent_per_day;
    }
    public int getSum_assured() {
        return sum_assured;
    }

    public void display(){
        System.out.println("pcode "+super.getPcode());
        System.out.println("pname "+super.getPname());
        System.out.println("getSum_assured "+this.getSum_assured());
        System.out.println("rent_per_day "+this.getRent_per_day());
        System.out.println("pre_hostpital "+this.getPre_hostpital());
        System.out.println("post_hospital "+this.getPost_hospital());
    }
}