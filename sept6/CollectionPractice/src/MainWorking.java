import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.System.out;
public class MainWorking {

	public ArrayList<Student> fill(ArrayList<Student> a,String n) {
		a.add(new Student(n));
		return a;
	}
	
	public ArrayList<Student> csStudent(ArrayList<Student> a){
		ArrayList<Student> cs =new ArrayList<>();
		for(Student temp:a) {
			if(temp.getBranch().equals("cs")) {
				cs.add(temp);
			}
		}
		return cs;
		
	}
	
	public ArrayList<Student> itStudent(ArrayList<Student> a){
		ArrayList<Student> it =new ArrayList<>();
		for(Student temp:a) {
			if(temp.getBranch().equals("it")) {
				it.add(temp);
			}
		}
		return it;
		
	}
	
	public void display(ArrayList<Student> a) {
		for(Student temp:a) {
			temp.display();
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Student> std=new ArrayList<>();
		MainWorking obj=new MainWorking();
		std=obj.fill(std,"suraj");
		std=obj.fill(std,"ashish");
		std=obj.fill(std,"aditya");
		std=obj.fill(std,"abhinav");
		std=obj.fill(std,"verma");
		std=obj.fill(std,"astha");
		std=obj.fill(std,"abc");
		std=obj.fill(std,"cde");
		std=obj.fill(std,"fgh");
		std=obj.fill(std,"lki");
		
		obj.display(std);
		ArrayList<Student> std_cs=obj.csStudent(std);
		ArrayList<Student> std_it=obj.itStudent(std);
		out.println("CS-----------------------------");
		obj.display(std_cs);
		out.println("It-----------------------------");
		obj.display(std_it);
		
		//MAP
		HashMap<String, ArrayList> mp=new HashMap<>();
		mp.put("cs", std_cs);
		mp.put("it", std_it);
		out.println("CS MAP--------------------------");
		obj.display(mp.get("cs"));
		out.println("It MAP--------------------------");
		obj.display(mp.get("it"));
		
		out.println("SORTED---------------------------");
		Collections.sort(std);
		obj.display(std);
		
		out.println("ABNORMAL SORTED-------------------");
		Collections.sort(std,new Student(null));
		obj.display(std);
		
		//inner class practice
		Collections.sort(std, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		out.println("ABNORMAL SORTED-INNER CLASS---");
		obj.display(std);
		
		
		
	}

}
