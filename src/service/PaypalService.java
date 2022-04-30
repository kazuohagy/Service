package service;

public class PaypalService implements OnlinePaymentService {
    public static final double FIXED_FEE = 0.02;
    public static final double MONTHLY_INTEREST = 0.01;

    public Double paymentFee(Double amount) {
        return amount * FIXED_FEE;
    }

    public Double interest(Double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
