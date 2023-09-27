import java.util.Scanner;

public class UniMonthlyPayment {
    public double monthlyCost = 352.87;
    public double monthlyCostDiscount = 0;
    public int choiceEntry = 1;

    public void dataStorage() {
        Scanner dataInput = new Scanner(System.in);

        while (choiceEntry > 0) {
            System.out.println(
                    "Para calcular o valor da mensalidade + descontos, insira o turno em que o aluno estuda: ");
            System.out.println("1- Turno da Manhã");
            System.out.println("2- Turno da Tarde");
            System.out.println("3- Turno da Noite");
            System.out.println("0- Encerrar");
            System.out.println("Digite '0', '1', '2' ou '3' \n");
            choiceEntry = dataInput.nextInt();

            switch (choiceEntry) {
                case 0:
                    System.out.println("Sessão finalizada.");
                    break;
                case 1:
                    monthlyCostDiscount = monthlyCost - (monthlyCost * 0.2);
                    String s1 = String.format("%,.2f", monthlyCostDiscount);
                    System.out.println("O valor da mensalidade para o turno da manhã é de R$:" + s1 + "\n");
                    break;
                case 2:
                    monthlyCostDiscount = monthlyCost - (monthlyCost * 0.13);
                    String s2 = String.format("%,.2f", monthlyCostDiscount);
                    System.out.println("O valor da mensalidade para o turno da tarde é de R$:" + s2 + "\n");
                    break;
                case 3:
                    System.out.println("O valor da mensalidade para o turno da noite é de R$:" + monthlyCost + "\n");
            }
        }
        dataInput.close();
    }
}
