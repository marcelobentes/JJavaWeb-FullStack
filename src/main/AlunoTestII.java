package main;

import javax.swing.JOptionPane;

import model.AlunoII;

public class AlunoTestII {
	public static void main(String[] args) {
	
	AlunoII aluno = new AlunoII();
	String nome = JOptionPane.showInputDialog("Informe o nome: ");
	String escola = JOptionPane.showInputDialog("Informe a escola: ");
	String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
	String mae = JOptionPane.showInputDialog("Informe o nome da m?e: ");
	String idade = JOptionPane.showInputDialog("Informe a idade: ");
	String dataNascimento = JOptionPane.showInputDialog("Informe data de nascimento: ");
	String matricula = JOptionPane.showInputDialog("Informe a matricula: ");
	String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
	String rg = JOptionPane.showInputDialog("Informe o RG: ");
	String serie = JOptionPane.showInputDialog("Informe a serie: ");
	String disciplina1 = JOptionPane.showInputDialog("Informe a disciplina1: ");
	String nota1 = JOptionPane.showInputDialog("Informe o nota1: ");
	String disciplina2 = JOptionPane.showInputDialog("Informe a disciplina2: ");
	String nota2 = JOptionPane.showInputDialog("Informe o nota2: ");
	String disciplina3 = JOptionPane.showInputDialog("Informe a disciplina3: ");
	String nota3 = JOptionPane.showInputDialog("Informe o nota3: ");
	String disciplina4 = JOptionPane.showInputDialog("Informe a disciplina4: ");
	String nota4 = JOptionPane.showInputDialog("Informe o nota4: ");
	
	
	aluno.setNome(nome);
	aluno.setNomeEscola(escola);
	aluno.setNomeMae(mae);
	aluno.setNomePai(pai);
	aluno.setIdade(Integer.parseInt(idade));
	aluno.setDataNascimento(dataNascimento);
	aluno.setDataMatricula(matricula);
	aluno.setNumeroCpf(cpf);
	aluno.setRg(rg);
	aluno.setSerieMatriculado(serie);
}
	
}	
