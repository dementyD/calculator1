import java.util.Scanner;

public class Calculator {

    public static final String HUMAN = " human";
    public static final String BUSINESS = " business";

    public static void main(String[] args) throws ScannerException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: сумма кредита, ежемесячный платеж, ставка%, тип клиента.");
        User user = new User();

        user.setSum(scanner.nextDouble());
        user.setPay(scanner.nextDouble());
        user.setBet(scanner.nextDouble());
        user.setType(scanner.nextLine());

        user.checkUserInput();

        user.countUser();
    }
}







