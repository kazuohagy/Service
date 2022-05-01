
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.print("Number:");
        Integer contractData = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy):");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value:");
        Double value = sc.nextDouble();

        Contract contract = new Contract(contractData, date, value);

        ContractService contractService = new ContractService(new PaypalService());

        System.out.print("Enter number of installments:");
        Integer installments = sc.nextInt();

        contractService.processContract(contract, installments);

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}
