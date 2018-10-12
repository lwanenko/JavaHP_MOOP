package lab3.A5;

public class Payment {
    private Product product;
    private Payment nextPayment;

    public Payment(Product product) {
        this.product = product;
    }

    public Product getProduct(){
        return product;
    }

    private void setNextPayment(Product p){
        nextPayment = new Payment(p);
    }

    public double getPrice(){
        Payment curPayment = this;
        double sum = 0;
        while (curPayment != null){
            sum += curPayment.getProduct().getPrice();
            curPayment = curPayment.nextPayment;
        }
        return sum;
    }

    public PaymentCreator getCreator(){
        return new PaymentCreator(this);
    }

    @Override
    public String toString() {
        String _return = "Payment: \n";
        Payment curPayment = this;
        double sum = 0;
        while (curPayment != null){
            _return += curPayment.product;
            curPayment = curPayment.nextPayment;
        }
        return _return + "Total:     " + getPrice() + "грн";
    }

    public class PaymentCreator{

        Payment payment;
        Payment lastPayment;

        private PaymentCreator(Payment payment){
            this.payment = payment;
        }

        public PaymentCreator addProduct( Product p){
            if(payment == null ) {
                payment = new Payment(p) ;
                return this;
            }
            Payment curPayment = lastPayment;
            if (lastPayment == null)
                curPayment = payment;
            while (curPayment.nextPayment != null){
                curPayment = curPayment.nextPayment;
            }
            curPayment.setNextPayment(p);
            lastPayment = curPayment.nextPayment;
            return this;
        }

        public PaymentCreator AxpaHaATMeHa(){
            Payment curPayment = payment;
            if(curPayment.nextPayment == null)
                payment = null;
            while(curPayment.nextPayment.nextPayment != null){
                curPayment = curPayment.nextPayment;
            }
            curPayment.nextPayment = null;
            lastPayment = null;
            return this;
        }

    }
}
