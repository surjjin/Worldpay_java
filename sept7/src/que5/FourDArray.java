package que5;

import static java.lang.System.out;
public class FourDArray {

	public static void main(String[] args) {
		int a[][][][]={{{{10,20,30,40},{15,25,35,45}},{{10,20,30,40},{15,25,35,45}}},{{{10,20,30,40},{15,25,35,45}},{{10,20,30,40},{15,25,35,45}}}};
		int totalSum=0;
		int productsale=0;
		
		for(int[][][] one:a){
			for(int [][]two:one){
				productsale=0;
				for(int[]three:two){
					for(int value:three){
						out.print(value+"\t");
						totalSum=totalSum+value;
						productsale+=value;
					}
					out.println();
				}
				out.println("the sale of product "+productsale);
			}
			
		}
		out.println("the total sales during 2 years "+totalSum);
		int n=0,w=0,s=0,e=0;
		int domestic=0,export=0;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				domestic=0;
				export=0;
				for(int k=0;k<2;k++){
					
					for(int l=0;l<4;l++){
						//out.println(i+" "+j+" "+k+" "+l+" "+"   "+a[i][j][k][l]);
						if(k==0)
						domestic+=a[i][j][k][l];
						else
						export+=a[i][j][k][l];
						if(l==0)
							n+=a[i][j][k][l];
						else if(l==1)
							s+=a[i][j][k][l];
						else if (l==2)
							e+=a[i][j][k][l];
						else
							w+=a[i][j][k][l];
					}
					
				}
				out.println("domestic sale : "+domestic);
				out.println("export sale : "+export);
			}
		}
		
		out.println("N : "+n+" S : "+s+" E : "+e+" W : "+w);
	}

}
