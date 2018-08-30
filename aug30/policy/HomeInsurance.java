class HomeInsurance extends Insurance{
    private int sum_assured;
    private int building_cost;
    private int appliance_cost;
    private String address;

    HomeInsurance(int pcode,String pname,int sum_assured,int building_cost,int appliance_cost,String address){
        super(pcode,pname);
        setAddress(address);
        setAppliance_cost(appliance_cost);
        setSum_assured(sum_assured);
        setBuilding_cost(building_cost);
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setAppliance_cost(int appliance_cost) {
        this.appliance_cost = appliance_cost;
    }
    public void setBuilding_cost(int building_cost) {
        this.building_cost = building_cost;
    }
    public void setSum_assured(int sum_assured) {
        this.sum_assured = sum_assured;
    }
    public String getAddress() {
        return address;
    }
    public int getAppliance_cost() {
        return appliance_cost;
    }
    public int getBuilding_cost() {
        return building_cost;
    }
    public int getSum_assured() {
        return sum_assured;
    }
    public void display(){
        System.out.println("pcode "+super.getPcode());
        System.out.println("pname "+super.getPname());
        System.out.println("getSum_assured "+this.getSum_assured());
        System.out.println("address "+this.getAddress());
        System.out.println("appliance cost "+this.getAppliance_cost());
        System.out.println("building cost "+this.getBuilding_cost());
    }
}