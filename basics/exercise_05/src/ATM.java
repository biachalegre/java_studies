import java.util.Scanner;

public class ATM {
    public double balanceBeforeDeposit = 0;
    public double initialBalance;
    public double balanceAfterDeposit;
    public double balanceAfterWithdraw;
    public double finalBalance;
    public double deposityValue;
    public double withdrawValue;
    public int choiceEntry = 1;

    public void menu() {

        Scanner input = new Scanner(System.in);

        while (choiceEntry > 0) {
            System.out.println("Escolha uma das opções a seguir: ");
            System.out.println("1- Depositar dinheiro");
            System.out.println("2- Retirar dinheiro");
            System.out.println("3- Saldo da conta");
            System.out.println("0- Finalizar Sessão");
            System.out.println("Digite \"0\", \"1\", \"2\", \"3\" \n");
            choiceEntry = input.nextInt();

            switch (choiceEntry) {
                case 0:
                    System.out.println("Sessão finalizada.");
                    break;
                case 1:
                    System.out.println("O seu saldo atual é de " + balanceBeforeDeposit + " reais \n");

                    System.out.printf("Valor a ser depositado: ");
                    deposityValue = input.nextDouble();

                    balanceAfterDeposit = deposityValue + initialBalance;

                    System.out.println("O seu saldo atual é de: " + balanceAfterDeposit + "\n");
                    break;
                case 2:
                    finalBalance = balanceAfterDeposit - withdrawValue;
                    if (finalBalance == 0) {
                        System.out.println("Realize um depósito primeiro.");
                    } else {
                        System.out.printf("Valor a ser retirado é de: ");
                        withdrawValue = input.nextDouble();
                        balanceAfterWithdraw = balanceAfterDeposit - withdrawValue;
                        System.out.println("O seu saldo atual é de: " + balanceAfterWithdraw + "\n");
                        break;
                    }
                case 3:
                    finalBalance = balanceAfterDeposit - withdrawValue;

                    System.out.println("O seu saldo atual é de: " + finalBalance + "\n");
                    break;
            }
        }
        input.close();
    }
}