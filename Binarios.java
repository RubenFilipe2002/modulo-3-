package Binarios;

import javax.swing.JOptionPane;

public class Binarios {

	public static void main(String[] args) {
		int binarioDecimal = 0;  
        int controle = 1;
       String aux =JOptionPane.showInputDialog("informe um numero binario"); 
       String n = aux;
       for (int i = 0; i <= aux.length();i++) {  
    	   //se n for maior q n.length() entregue o ultimo numero 
    	   String g = n.length() > 0? n.substring(n.length()-1): "0";
    	   //n recebe n - o numero entregue a variavel g
    	   n = n.length() > 0? n.substring(0,n.length()-1): "";
    	  //calcula
    	   binarioDecimal += controle * Integer.parseInt(g);
    	   controle*=2;
         }  
        JOptionPane.showMessageDialog(null, "resultado em decimal: "+binarioDecimal);  
	}
}