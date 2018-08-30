import java.util.Set;

class Insurance{
    private int pcode;
    private String pname;
    
    Insurance(){}
    Insurance(int pcode,String pname){
        setPcode(pcode);
        setPname(pname);
    }
    public void setPcode(int pcode) {
        this.pcode = pcode;
    }                   
    public void setPname(String pname) {
        this.pname = pname;
    }
    
    public int getPcode() {
        return pcode;
    }
    public String getPname() {
        return pname;
    }


}