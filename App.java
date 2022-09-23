import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // this info is up to date as of. please tpye in your income.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your income before tax:");
        double income = input.nextDouble();

        double IncomeTaxBill = 0;
        double personalAllowance = 12570;

        if (income <= personalAllowance) {
            IncomeTaxBill = 0;
        } else if (income <= 50270){
            IncomeTaxBill = ((income - personalAllowance) * 0.2);
        } else if (income <= 150000){
            IncomeTaxBill = ((income - 50270) * 0.4) + ((50270 - personalAllowance) * 0.2);
        } else {
            IncomeTaxBill = ((income - 15000) * 0.45) + ((income - 50270) * 0.4) + ((50270 - personalAllowance) * 0.2);
        }

        System.out.println("Yearly tax bill:");
        System.out.println(IncomeTaxBill);









    }
}
