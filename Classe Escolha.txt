package Objetos;

import javax.swing.JOptionPane;

public class Escolha {
	private String escolha;
	public int escolha_int=0;
	public void Escolher_funcao() {
		for(;;)
		try {
		escolha=JOptionPane.showInputDialog("digite 1 para escolher o exercício 1\n Digite 2 para escolher o exercício 2");
		if(escolha.equals("Null"))
			break;
		escolha_int=Integer.parseInt(escolha);
		if(escolha_int!=1&&escolha_int!=2)
			JOptionPane.showMessageDialog(null,"Apenas 2 opções disponiveis para escolha: 1 e 2.");
		else
			break;
		} catch(NumberFormatException e) {
			e.getCause();
			  JOptionPane.showMessageDialog(null,"Opa, algo de errado não está certo!\n formato de entrada inválido,\n "
				  		+ "tente novamente."+e,null,JOptionPane.ERROR_MESSAGE); 
		} catch(NullPointerException e) {
			break;
			
		}
		
		
	}

}
