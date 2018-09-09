package que3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.out;

public class Working {
	
	public void display(Collection<Employe> c){
		Iterator<Employe> it=c.iterator();
		while (it.hasNext()) {
			it.next().display();
		}
	}
	
	public static void main(String[] args) {
		
		Working obj=new Working();
		Scanner sc =new Scanner(System.in);
		HashSet<Employe> permemp=new HashSet<>();
		permemp.add(new Employe("suraj"));
		permemp.add(new Employe("ashish"));
		permemp.add(new Employe("aditya"));
		permemp.add(new Employe("abhinav"));
		permemp.add(new Employe("verma"));
		HashSet<Employe> tempemp = new HashSet<>();
		tempemp.add(new Employe("astha"));
		tempemp.add(new Employe("abc"));
		
		out.println("PERMANENT EMPLOYEE ");
		obj.display(permemp);
		out.println("TEMPORARY EMPLOYEE ");
		obj.display(tempemp);
		
		int ch=0;
		int eno;
		boolean b;
		String name;
		while(true){
		
			out.println("enter true to continue");
			b=sc.nextBoolean();
			if(!b)
				break;
			out.println("1. Add New Emp \n2. Remove Emp\n 3. View Perm Emp\n 4. View Temp Emp\n	5. Promote Emp");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
			{
				out.println("enter name");
				name=sc.next();
				tempemp.add(new Employe(name));
			}
				break;
			case 2:
			{
				out.println("enter eno");
				Employe e1 = null;
				eno=sc.nextInt();
				for(Employe e:tempemp){
					if(e.getEno()==eno)
						{e1=e;break;}
				}
				tempemp.remove(e1);
			}
				break;
			case 3:
			{
				obj.display(permemp);
			}
				break;
			case 4:
			{
				obj.display(tempemp);
			}
				break;
			case 5:
			{
				permemp.addAll(tempemp);
			}
			default:
				break;
			}
		
		}
	}
}
