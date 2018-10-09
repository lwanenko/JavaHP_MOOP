package lab1.A;

import lab1.A.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class CustomersSort {

    public static ArrayList<Customer> sortByNameInAbcOrder(Customer[] customers) {
        ArrayList<Customer> list = new ArrayList<Customer>();
        for (int i = 0; i < customers.length; i++)
            list.add(customers[i]);
        Collections.sort(list);
        return list;
    }

    public static ArrayList<Customer> getCustomersInCCnRange(Customer[] customers, BigInteger fromCCN, BigInteger toCCN) {
        ArrayList<Customer> list = new ArrayList<Customer>();
        for (int i = 0; i < customers.length; i++) {
            BigInteger ccn = customers[i].getCreditCardNumber();
            if(ccn.compareTo(fromCCN)!=-1 && ccn.compareTo(toCCN)!=1)
                list.add(customers[i]);
        }
        return list;
    }
}

