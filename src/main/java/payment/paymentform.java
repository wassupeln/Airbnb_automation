package payment;

public class paymentform {
    public class PaymentProcessor {

        public static void main(String[] args) {
            paymentform payment = new paymentform();
            payment.processPayment("VISA", 250.75);
        }

        public void processPayment(String method, double amount) {
            System.out.println("Processing payment...");
            System.out.println("Payment method: " + method);
            System.out.println("Amount: $" + amount);

            // Simulate success/failure logic
            if (amount > 0) {
                System.out.println("✅ Payment successful!");
            } else {
                System.out.println("❌ Payment failed. Invalid amount.");
            }
        }
    }

    private void processPayment(String visa, double v) {
    }
}