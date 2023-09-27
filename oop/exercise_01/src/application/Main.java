
package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
              
        ArrayList<Student> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<SchoolSubject> disciplinas = new ArrayList<>();
        ArrayList<SchoolClass> turmas = new ArrayList<>();

        Scanner inputMenu = new Scanner(System.in);
        Scanner inputDados = new Scanner(System.in);
        

        int opcao = 0;
        while (opcao != 9) {
            System.out.println(" ");
            System.out.println("Bem-vindo! Escolha uma das opções abaixo:");
            System.out.println("1- Registrar novo aluno no sistema");
            System.out.println("2- Registrar novo professor no sistema");
            System.out.println("3- Criar nova disciplina");
            System.out.println("4- Criar nova turma");         
             System.out.println("5- Listar informações dos alunos registrados");
             System.out.println("6- Listar informações de um professor");
             System.out.println("7- Listar informações de uma disciplina");
             System.out.println("8- Listar informações de uma turma");
             System.out.println("9- Sair");
             System.out.println(" ");

            opcao = inputMenu.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira os dados do aluno: ");
                    
                    Student alunoNovo = new Student();
                    
                    System.out.println("Nome: ");
                    alunoNovo.setNome(inputDados.nextLine());
                    
                    System.out.println("Data de Nascimento: ");
                    alunoNovo.setDataDeNascimento(inputDados.nextLine());  
                    
                    System.out.println("Matricula: ");
                    alunoNovo.setMatricula(inputDados.nextLine()); 
                    
                    System.out.println("CPF: ");
                    alunoNovo.setCpf(inputDados.nextLine()); 
                    
                    System.out.println("Mensalidade: ");
                    alunoNovo.setMensalidade(inputDados.nextDouble()); 
                    
                    alunos.add(alunoNovo);

                    break;
                case 2:
                    System.out.println("Insira os dados do professor: ");
                    Professor professorNovo = new Professor();
                    
                    System.out.println("Nome: ");
                    professorNovo.setNome(inputDados.nextLine());
                    
                    System.out.println("Data de Nascimento: ");
                    professorNovo.setDataDeNascimento(inputDados.nextLine());  
                    
                    System.out.println("Matricula: ");
                    professorNovo.setMatricula(inputDados.nextLine()); 
                    
                    System.out.println("CPF: ");
                    professorNovo.setCpf(inputDados.nextLine()); 
                   
                    System.out.println("Formação Acadêmica: ");
                    professorNovo.setFormacaoAcademica(inputDados.nextLine());
                    
                    System.out.println("Salário: ");
                    professorNovo.setSalario(inputDados.nextDouble());
                    
                    inputDados.nextLine();
                    
                    professores.add(professorNovo);

                    break;
                case 3: 
                    System.out.println("Insira os dados da disciplina: ");
                    SchoolSubject disciplinaNova = new SchoolSubject(); 
                    
                    System.out.println("Nome: ");
                    disciplinaNova.setNome(inputDados.nextLine());
                    
                    System.out.println("Carga Horária: ");
                    disciplinaNova.setCargaHoraria(inputDados.nextInt());
                    inputDados.nextLine();

                   
                    disciplinas.add(disciplinaNova);                    
                    break;
                case 4:
                    System.out.println("Insira os dados da turma: ");
                    SchoolClass turmaNova = new SchoolClass();
                    
                    System.out.println("Nome: ");
                    
                    turmaNova.setNome(inputDados.nextLine());
                    
                    turmas.add(turmaNova);

                    
                    break;
                case 5:
                    for (int i = 0; i < alunos.size(); i++) {         
                        alunos.get(i).mostraDados();
                        System.out.println("---------------");
                    }
                    break;
                case 6:
                    for (int i = 0; i < professores.size(); i++) {         
                        professores.get(i).mostraDados();
                        System.out.println("---------------");
                    }
                    break;
                case 7:
                    for (int i = 0; i < disciplinas.size(); i++) {   
                        System.out.println(disciplinas.get(i).getNome());
                        System.out.println(disciplinas.get(i).getCargaHoraria());
                        System.out.println("---------------");
                    }
                    break;
                case 8:
                      for (int i = 0; i < turmas.size(); i++) {   
                        System.out.println(turmas.get(i).getNome());     
                        System.out.println("---------------");
                    }
                    break;
                case 9:
                    System.out.println("Sair");
                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        }
    }
    
}