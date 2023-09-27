import java.util.Scanner;

public class FinalGrade {
    public double grade;

    public void dataStorage() {
        Scanner dataInput = new Scanner(System.in);

        System.out.println("Nota do aluno(a): ");
        grade = dataInput.nextDouble();

        dataInput.close();

        finalGradeCalculus();

    }

    public void finalGradeCalculus() {
        if (grade > 6) {
            System.out.println("Aprovado");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
