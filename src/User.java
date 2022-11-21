public class User {

    private double sum;
    private double pay;
    private double bet;
    private String type;

    public void setSum (double sum) {
        this.sum = sum;
    }
    public void setPay (double pay) {
        this.pay = pay;
    }
    public void setBet (double bet) {
        this.bet = bet;
    }
    public void setType (String type) {
        this.type = type;
    }
    public double getSum () {
        return sum;
    }
    public double getPay () {
        return pay;
    }
    public double getBet () {
        return bet;
    }
    public String getType () {
        return type;
    }

    void countHuman() {
        double proc;
        double sumMonth = sum / pay;
        double payYear = pay * 12;
        double finishproc = 0;
        double saveProc = 0;
        double itog;
        if (sumMonth <= 12) {
            itog = sum * (bet / 100);
            System.out.println(Math.ceil(itog));
        } else if (sumMonth > 12) {
            double firstProc = sum * (bet / 100);
            sum += firstProc;

            for (double i = sum; sum > payYear; ) {
                proc = 0;

                sum = sum - payYear;
                proc = sum * (bet / 100);
                sum = sum + proc;

                saveProc = proc;
                finishproc = saveProc + finishproc;
            }
            System.out.println(Math.ceil(firstProc + finishproc));
        }
    }

    void countBusiness() {
        double proc;
        double sumMonth = sum / pay;
        double payYear = pay * 12;
        double finishproc = 0;
        double saveProc = 0;
        if (sumMonth <= 12) {
            System.out.println(0.0);
        } else if (sumMonth > 12) {
            do {
                proc = 0;

                sum = sum - payYear;
                proc = sum * (bet / 100);
                sum = sum + proc;

                saveProc = proc;
                finishproc = saveProc + finishproc;
            } while (sum > payYear);

            System.out.println(Math.ceil(finishproc));
        }
    }
}
