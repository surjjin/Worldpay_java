class Policy {
    private int pCode;
    private String pName;
    private String pType;
    private int minAmount;
    private int maxAmount;
    private int lowAge;
    private int maxAge;

    Policy(){
        //default constructor
    }
    Policy(int pcode,String pname,String pType){
        this.pCode=pcode;
        this.pName=pname;
        this.pType=pType;
    }
    Policy(int pcode,String pname,String ptype,int minAmount){
        this(pcode,pname,ptype);
        this.minAmount=minAmount;
    }
    Policy(int pcode,String pname,String ptype,int minAmount,int maxAmount){
        this(pcode,pname,ptype,minAmount);
        this.maxAmount=maxAmount;
    }
    Policy(int pcode,String pname,String ptype,int minAmount,int maxAmount,int lowAge,int maxAge){
        this(pcode,pname,ptype,minAmount,maxAmount);
        this.lowAge=lowAge;
        this.maxAge=maxAge;
    }

    public void setPCode(int pCode){
        this.pCode=pCode;
    }
    public void setPName(String pName){
        this.pName=pName;
    }
    public void setPType(String pType){
        this.pType=pType;
    }
    public void setAmountLimit(int max,int min){
        maxAmount=max;
        minAmount=min;
    }
    public void setAgeLimit(int high,int low){
        maxAge=high;
        lowAge=low;
    }
    public int getPCode(){
        return pCode;
    }
    public String getPName(){
        return pName;
    }
    public String  getPType(){
        return pType;
    }
    public int getMaxAmount(){
        return maxAmount;
    }
    public int getMinAmount(){
        return minAmount;
    }
    public int getMaxAge(){
        return maxAge;
    }
    public int getLowAge(){
        return lowAge;
    }
    public static void displayPolicies(Policy ...policies){
        for (Policy p:policies ){
            System.out.println(p.pCode);
            System.out.println(p.pCode);
            System.out.println(p.pType);
            System.out.println(p.maxAmount);
            System.out.println(p.minAmount);
            System.out.println(p.maxAge);
            System.out.println(p.maxAge);
        }
    }
}