package Main;

import Objetos.Escolha;
import Objetos.Pera;
import Objetos.Pessoa;

public class Exercicio {
	public static void main(String args[]) {
		Escolha escolha= new Escolha();
		Pera pera= new Pera();
		Pessoa pessoa=new Pessoa();
		escolha.Escolher_funcao();
		if(escolha.escolha_int==1){
		pera.Calcular_valor_pera();
		}else if(escolha.escolha_int==2){
			for(;pessoa.idade!=0;) {				
				pessoa.Pesquisa_calcular_idade();				
				pessoa.Pesquisa_calcular_sexo();
				pessoa.Pesquisa_calcular_salario();			
			}			
			pessoa.pesquisa_finalizar();
		}else System.exit(0);
			
	}

}
