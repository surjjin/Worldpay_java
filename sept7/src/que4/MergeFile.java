package que4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MergeFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		//System.out.println();
		String path="C:\\Users\\hp\\Desktop\\Suraj_Jain\\Worldpay_java\\sept7\\src\\que4\\";
		FileInputStream f1=new FileInputStream(path+"data1.txt");
		FileInputStream f2=new FileInputStream(path+"data2.txt");
		FileInputStream f3=new FileInputStream(path+"data3.txt");
		FileInputStream f4=new FileInputStream(path+"data4.txt");
		FileOutputStream fout =new FileOutputStream(path+"cities.txt");
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		v.add(f4);
		
		Enumeration<FileInputStream> enu= v.elements();
		
		SequenceInputStream sq=new SequenceInputStream(enu);
		
		int n;
		while(( n=sq.read())!=-1){
			fout.write(n);
		}
		fout.close();
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		sq.close();
		
	}

}
