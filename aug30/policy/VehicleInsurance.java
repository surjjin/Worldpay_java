class VehicleInsurance extends Insurance{

    private int sum_assured;
    private int regno;
    private int engno;

    VehicleInsurance(int pcode,String pname,int setSum_assured,int regno,int engno){
        super(pcode,pname);
        setSum_assured(sum_assured);
        setEngno(engno);
        setRegno(regno);
    }
    
    public void setEngno(int engno) {
        this.engno = engno;
    }
    public void setRegno(int regno) {
        this.regno = regno;
    }
    public void setSum_assured(int sum_assured) {
        this.sum_assured = sum_assured;
    }

    public int getEngno() {
        return engno;
    }
    public int getRegno() {
        return regno;
    }
    public int getSum_assured() {
        return sum_assured;
    }
    public void display(){
        System.out.println("pcode "+super.getPcode());
        System.out.println("pname "+super.getPname());
        System.out.println("getSum_assured "+this.getSum_assured());
        System.out.println("Engno "+this.getEngno());
        System.out.println("regno "+this.getRegno());
    }
        
}