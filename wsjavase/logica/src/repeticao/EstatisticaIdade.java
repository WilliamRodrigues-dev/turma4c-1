package repeticao;

import javax.swing.JOptionPane;
class EstatisticaIdade{
	public static void main(String args[]){
		int idade = 0;
		String nome = "";
		String nomeMaisVelha = "";
		String nomeMaisNova = "";

		int maisvelha = 0;
		int maisnova = 0;
		
		int contTotal = 0;
		int contIdadeTotal = 0;
		int contMaioresIdade = 0;
		
		do{
			contTotal++;
			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			nome = JOptionPane.showInputDialog("Digite seu nome");
			contIdadeTotal += idade;	
			
			//Se for a primeira pessoa...
			if(contTotal==1){
				maisvelha = idade;
				maisnova = idade;
				nomeMaisVelha = nome;
				nomeMaisNova = nome;
			}
			
			if(idade > maisvelha){
				maisvelha = idade;
				nomeMaisVelha = nome;
			}
			else{
				if (idade < maisnova){
					maisnova = idade;
					nomeMaisNova = nome;
				}
			}
			if(idade>=18){
				contMaioresIdade++;
			}
		}while(JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
		
		System.out.println("O nome da pessoa mais velha eh.....: "+nomeMaisVelha);
		System.out.println("O nome da pessoa mais nova eh......: "+nomeMaisNova);
		System.out.println("O total de maiores de idade eh.....: "+contMaioresIdade);
		System.out.println("A idade media das pessoas eh.......: "+(contIdadeTotal/contTotal));
	}
}