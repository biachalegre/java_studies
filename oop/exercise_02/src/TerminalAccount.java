import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        AccountInfo createNewAccount = new AccountInfo();

        System.out.println("Número da Agência");
        createNewAccount.setAgencyNumber(userInput.nextInt());
        userInput.nextLine();

        System.out.println("Nome da Agência");
        createNewAccount.setAgencyName(userInput.nextLine());

        System.out.println("Nome do Cliente");
        createNewAccount.setClientName(userInput.nextLine());

        System.out.println("Saldo Inicial");
        createNewAccount.setBalance(userInput.nextDouble());

        userInput.close();

        System.out.println("Olá " + createNewAccount.getClientName() + ", obrigado por criar uma conta em nosso banco, sua agência é " + createNewAccount.getAgencyName() + ", conta " + createNewAccount.getAgencyNumber() + " e seu saldo " + createNewAccount.getBalance() + " já está disponível para saque.");
    }

}
