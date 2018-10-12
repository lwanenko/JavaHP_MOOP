package lab3;

import lab3.A5.Payment;
import lab3.A5.Product;
import lab3.A6.Entrant;
import lab3.A6.StudentParticipant;

public class Runner {

    public static void main(String[ ] args) {
        System.out.println("MOOP Lab 3 Viacheslav Ivamemko BI-1 Var 2");
        partA5();
        partA6();
    }

    public static void partA5(){
        System.out.println("A5:");
        Product p  = new Product(12, "Батон");
        Payment payment = new Payment(p);
        payment.getCreator()
                .addProduct(p)
                .addProduct(p)
                .addProduct(p);
        payment.getCreator()
                .addProduct(p)
                .addProduct(p)
                .addProduct(p)
                .addProduct(p).AxpaHaATMeHa()
                .addProduct(p)
                .addProduct(p);

        System.out.println(payment);
    }

    public static void partA6(){
        System.out.println("A6:");
        Entrant student = new StudentParticipant("Viacheslav Ivanenko", "123456789");
        student.Study();
    }

}
