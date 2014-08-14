package exemplos;

import javax.swing.JOptionPane;

public class IdadecomDOWhile2 {

	public static void main(String[] args){
		
		int idade;
		
		do{
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));
		} while (idade < 1 || idade > 120);
		
		JOptionPane.showMessageDialog(null, "A idade é: "+idade);
		
	}
	
}
