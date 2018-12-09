package lab1;

import lab1.A.Customer;
import lab1.A.CustomerBuilder;
import lab1.A.CustomersSort;
import lab1.B.Complex;
import lab1.C.Line;
import lab1.C.RationalNumber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[ ] args) {
        System.out.println("MOOP Lab 1 Viacheslav Ivamemko Var 2");
        partA();
        partB();
        partC();
    }

    public static void partA(){
        System.out.println("A:");
        try {
            Customer customer1 = new CustomerBuilder()
                    .setFullName("Viacheslav", "Ivanenko", "Anatoliyovich")
                    .setAddress("6 Sechenova Street Kiev Ukraine")
                    .setId("BH605609")
                    .setCreditCardNumber(new BigInteger("1234123412341234"))
                    .setBankAccountNumber(new BigInteger("1234123412341234"))
                    .Build();

            Customer customer2 = new CustomerBuilder()
                    .setFullName("Maxim", "Moskalchuk", "Yirovich")
                    .setAddress("XZ")
                    .setId("BH123456")
                    .setCreditCardNumber(new BigInteger("2345234523452345"))
                    .setBankAccountNumber(new BigInteger("2345234523452345"))
                    .Build();

            Customer customer3 = new CustomerBuilder()
                    .setFullName("Max", "Osipiyonok", "Nickolaevich")
                    .setAddress("6 Sechenova Street Kiev Ukraine")
                    .setId("BH605609")
                    .setCreditCardNumber(new BigInteger("3456345634563456"))
                    .setBankAccountNumber(new BigInteger("3456345634563456"))
                    .Build();

            Customer [] customers = {customer1, customer2, customer3};

            for (Customer customer: CustomersSort.sortByNameInAbcOrder(customers)){
                System.out.println(customer);
            }
            for (Customer customer: CustomersSort.getCustomersInCCnRange(customers,new BigInteger("0"), new BigInteger("1323232323232345"))){
                System.out.println(customer);
            }

        } catch (Exception e) {
            System.err.println("Error of creating customer " + e);
        }
    }

    public static void partB(){
        System.out.println("B:");
        ArrayList<Complex> list = new ArrayList<Complex>();
        list.add(new Complex(1, 2));
        list.add(new Complex(1, 2));
        list.add(new Complex(1, 2));
        list.add(new Complex(1, 2));
        System.out.println(Complex.addList(list));
    }

    public static void partC(){
        System.out.println("C:");
        Set<Line> list = new HashSet<Line>();
        list.add(new Line(new RationalNumber(1,2), new RationalNumber(1,1)));
        list.add(new Line(new RationalNumber(1,3), new RationalNumber(1,1)));
        list.add(new Line(new RationalNumber(2,4), new RationalNumber(1,2)));
        list.add(new Line(new RationalNumber(1,4), new RationalNumber(1,1)));

        for (Line line :list) {

            System.out.println("Group:");
            System.out.println(line);
            for (Line element : line.parallelLines(list))
                System.out.println(line);
        }
    }
}