package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno objeto = new Aluno();
		
		//objeto.preencherNome(JOptionPane.showInputDialog("Digite um nome"));
		//objeto.preencherNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula")));
		//objeto.preencherEmail(JOptionPane.showInputDialog("Digite o E-mail"));
		
		objeto.preencherTudo(JOptionPane.showInputDialog("Digite um nome"), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula")),
				JOptionPane.showInputDialog("Digite o E-mail"));
		System.out.println(objeto.exibirTudo());
		//System.out.println("Nome do aluno........: " + objeto.exibirNome());
		//System.out.println("Matricula do aluno...: " + objeto.exibirNumeroMatricula());
		//System.out.println("E-mail do aluno......: " + objeto.exibirEmail());
		
	}

}
