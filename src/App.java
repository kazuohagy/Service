
// import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.Scanner;

import service.OnlinePaymentService;
import service.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter contract data:");
        System.out.print("Number:");
        // Integer contractData = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy):");
        // Date date = sdf.parse(sc.next());
        System.out.print("Contract value:");
        // Double value = sc.nextDouble();
        System.out.print("Enter number of installments:");
        // Integer installments = sc.nextInt();
        System.out.println("Installments:");
        OnlinePaymentService onlinePaymentService = new PaypalService();
        System.out.println(onlinePaymentService.interest(200.0, 3));
        sc.close();
    }
}
