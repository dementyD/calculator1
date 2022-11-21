import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws ScannerException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        User user = new User();
        String name = " human";
        String name1 = " business";

        user.setSum(scanner.nextDouble());
        user.setPay(scanner.nextDouble());
        user.setBet(scanner.nextDouble());
        user.setType(scanner.nextLine());

        if (user.getSum() < 30000 || user.getPay() < 3000 || user.getBet() < 1){
            throw new ScannerException("throws Exception");
        }
        if (user.getType().compareToIgnoreCase(name) != 0 && user.getType().compareToIgnoreCase(name1) != 0 ) {
           throw new ScannerException("throws Exception");
        }
        if (user.getType().equalsIgnoreCase(name)) {
            user.countHuman();
        }
        else if (user.getType().equalsIgnoreCase(name1)) {
            user.countBusiness();
        }
    }
}







