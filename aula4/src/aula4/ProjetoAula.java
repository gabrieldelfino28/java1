package aula4;

import javax.swing.JOptionPane;

public class ProjetoAula {
 public static void main (String [] args ) {
	 // TODO Auto-generated method stub
	 String x = JOptionPane.showInputDialog("Digite um Valor: ");
	 
	 try {
		 int j = Integer.parseInt(x);
		 
		 while ( j < 10) {
			 System.out.println(j);
			 j = j + 1;
		 }
		 
		 
	 }catch (Exception e) {
		 System.out.println(x);
		 
}
 }
}
