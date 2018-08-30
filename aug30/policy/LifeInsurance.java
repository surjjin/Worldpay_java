class LifeInsurance extends Insurance{
    private int min_sum_assured;
    private int max_sum_assured;
    private String payment_mode;
    private int policy_term;
    private String nominee;
    LifeInsurance(int pcode,String pname,int min_sum_assured,int max_sum_assured,String payment_mode,int policy_term,String nominee){
        super(pcode,pname);
        setMax_sum_assured(max_sum_assured);
        setMin_sum_assured(min_sum_assured);
        setNominee(nominee);
        setPayment_mode(payment_mode);
        setPolicy_term(policy_term);
    }
    
    public void setMax_sum_assured(int max_sum_assured) {
        this.max_sum_assured = max_sum_assured;
    }
    public void setMin_sum_assured(int min_sum_assured) {
        this.min_sum_assured = min_sum_assured;
    }
    public void setNominee(String nominee) {
        this.nominee = nominee;
    }
    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }
    public void setPolicy_term(int policy_term) {
        this.policy_term = policy_term;
    }

    public int getMax_sum_assured() {
        return max_sum_assured;
    }
    public int getMin_sum_assured() {
        return min_sum_assured;
    }
    public String getNominee() {
        return nominee;
    }
    public String getPayment_mode() {
        return payment_mode;
    }
    public int getPolicy_term() {
        return policy_term;
    }
    public void display(){
        System.out.println("pcode "+super.getPcode());
        System.out.println("pname "+super.getPname());
        System.out.println("min_sum_assured "+this.min_sum_assured);
        System.out.println("max_sum_assured "+this.max_sum_assured);
        System.out.println("nominee "+this.nominee);
        System.out.println("payment_mode "+this.payment_mode);
        System.out.println("policy_term "+this.policy_term);

    }
}