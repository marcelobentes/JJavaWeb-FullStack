package main;

import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoTest {

	public static void main(String[] args) {
		/*Objeto ainda não existe na memoria*/
		//Aluno aluno1;
		
		/*Agora temos um objeto real na memoria*/
		Aluno aluno2 = new Aluno(null, 0, null, null, null, null, null, null, null, null);
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String escola = JOptionPane.showInputDialog("Informe a escola: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da mãe: ");
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
		
		aluno2.setNome(nome);
		aluno2.setNomeEscola(escola);
		aluno2.setNomeMae(mae);
		aluno2.setNomePai(pai);
		aluno2.setIdade(Integer.parseInt(idade));
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setDataMatricula(matricula);
		aluno2.setNumeroCpf(cpf);
		aluno2.setRg(rg);
		aluno2.setSerieMatriculado(serie);
		aluno2.getDisciplina().setDisciplina1(disciplina1);
		aluno2.getDisciplina().setDisciplina2(disciplina2);
		aluno2.getDisciplina().setDisciplina3(disciplina3);
		aluno2.getDisciplina().setDisciplina4(disciplina4);
		
		aluno2.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno2.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno2.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno2.getDisciplina().setNota4(Double.parseDouble(nota4));
		System.out.println("O nome do Aluno é "+aluno2.getNome());
		System.out.println("Nome da escola: "+aluno2.getNomeEscola());
		System.out.println("Idade: "+aluno2.getIdade());
		System.out.println("Série: "+aluno2.getSerieMatriculado());
		
		System.out.println("A Media da nota: "+aluno2.getMedianota());
		System.out.println("Resultado: "+(aluno2.getResultado() ?"Aprovado." :"Reprovado."));

	}

}
