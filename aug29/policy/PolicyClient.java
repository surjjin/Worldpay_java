public class PolicyClient {
    public static void main(String args[]) {
        Policy p1 = new Policy();
        p1.setPCode(10);
        p1.setPCode(1);
        p1.setPName("AXA");
        p1.setPType("lifeInsurance");
        p1.setAgeLimit(18,60);
        p1.setAmountLimit(15000,100000);
        
        Policy p2 = new Policy(2,"Efco Tokio","Life Inusrance");
        Policy p3 = new Policy(3,"LIC","Vehicle Insurance");
        Policy p4 = new Policy(4,"Max Secure","Health Insurance",20000,45000);

        Policy.displayPolicies(p1);
        Policy.displayPolicies(p1,p2,p3,p4);
    }
}