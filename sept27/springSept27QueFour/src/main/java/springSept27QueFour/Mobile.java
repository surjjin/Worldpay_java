package springSept27QueFour;

public class Mobile {
	int mbno;
	String serviceProvider;
	String ctrcode;
	public int getMbno() {
		return mbno;
	}
	public void setMbno(int mbno) {
		this.mbno = mbno;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getCtrcode() {
		return ctrcode;
	}
	public void setCtrcode(String ctrcode) {
		this.ctrcode = ctrcode;
	}
	public Mobile(int mbno, String serviceProvider, String ctrcode) {
		super();
		this.mbno = mbno;
		this.serviceProvider = serviceProvider;
		this.ctrcode = ctrcode;
	}
	public Mobile() {
		super();
	}
	
}
