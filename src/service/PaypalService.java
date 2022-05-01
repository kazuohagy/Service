package service;

public class PaypalService implements OnlinePaymentService {
    public static final double FIXED_FEE = 0.02;
    public static final double MONTHLY_INTEREST = 0.01;

    public double paymentFee(double amount) {
        return amount * FIXED_FEE;
    }

    public double interest(double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
