package springSept27QueFour;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Employee {
	HashSet<String> emails;
	List<Mobile> mobiles;
	Map<String, Info> family;
	public HashSet<String> getEmails() {
		return emails;
	}
	public void setEmails(HashSet<String> emails) {
		this.emails = emails;
	}
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, Info> getFamily() {
		return family;
	}
	public void setFamily(Map<String, Info> family) {
		this.family = family;
	}
	public Employee(HashSet<String> emails, List<Mobile> mobiles, Map<String, Info> family) {
		super();
		this.emails = emails;
		this.mobiles = mobiles;
		this.family = family;
	}
	public Employee() {
		super();
	}
	
}
