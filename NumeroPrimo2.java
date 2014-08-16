package exemplos;

import javax.swing.JOptionPane;

public class NumeroPrimo2 {

	public static void main(String[] args){
		
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		
		if(ehPrimo(n)){
			JOptionPane.showMessageDialog(null, "O Número é Primo !");
		} else {
			JOptionPane.showMessageDialog(null, "O Número não é Primo !");
		}
		
	}
	
	public static boolean ehPrimo(int n){
		for(int i=2; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
}
