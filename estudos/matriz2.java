import javax.swing.JOptionPane;
public class matriz2{
	public static void main(String args[]){	
       	            double m[][] = new double[3][4];
      		double num;
      		for(int lin = 0; lin < 3; lin++){
         		for(int col = 0; col < 4;  col++){
            		         num = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
            		         m[lin][col] = num;
         		}
      		}
      		for(int lin = 0; lin < m.length; lin++){
          		for(int col = 0; col < m[lin].length;  col++){
		                         System.out.println(m[lin][col]);
         		}
      		}
   	}
}
