public class User extends Calculator {

    private double sum;
    private double pay;
    private double bet;
    private String type;

    public void setSum(double sum) {this.sum = sum;}
    public void setPay(double pay) {this.pay = pay;}
    public void setBet(double bet) {this.bet = bet;}
    public void setType(String type) {this.type = type;}

    void countUser() {
        double sumMonth = sum / pay;
        double payYear = pay * 12;
        double firstProc = 0;
        double finishproc = 0;
        double saveProc = 0;
        double proc;
        double itog;

            if (sumMonth <= 12) {

                if (type.equalsIgnoreCase(HUMAN)) {
                    itog = sum * (bet / 100);
                    System.out.println(Math.ceil(itog));
                }
                if (type.equalsIgnoreCase(BUSINESS)) {
                    System.out.println(0.0);
                }
            } else if (sumMonth > 12) {

                if (type.equalsIgnoreCase(HUMAN)) {
                    firstProc = sum * (bet / 100);
                    sum += firstProc;
                }
                do {
                    proc = 0;

                    sum = sum - payYear;
                    proc = sum * (bet / 100);
                    sum = sum + proc;

                    saveProc = proc;
                    finishproc = saveProc + finishproc;

                } while (sum >= payYear);
                System.out.println(Math.ceil(firstProc + finishproc));
            }


    }
    void checkUserInput () throws ScannerException {

        if (sum < 0) {
            throw new ScannerException("Сумма кредита должна быть положительной: проверьте ввод данных");
        }
        if (type.compareToIgnoreCase(Calculator.HUMAN) == 0) {
            if (sum * (bet / 100) >= pay * 12) {
                throw new ScannerException("Сумма годового платежа должна быть больше суммы годовых процентов: проверьте ввод данных");
            }
        }
        if (type.compareToIgnoreCase(Calculator.BUSINESS) == 0) {
            double a = sum - pay * 12;
            if (a * (bet / 100) >= pay* 12) {
                throw new ScannerException("Сумма годового платежа должна быть больше суммы годовых процентов: проверьте ввод данных");
            }
        }

        if (type.compareToIgnoreCase(Calculator.HUMAN) != 0 && type.compareToIgnoreCase(Calculator.BUSINESS) != 0 ) {
            throw new ScannerException("Тип клиента должен быть 'human' или 'business'");
        }
    }
}
