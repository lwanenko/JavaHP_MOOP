package lab1.A;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Customer implements Comparable<Customer> {

    protected String id;
    protected String surname;
    protected String name;
    protected String patronymic;
    protected String address;
    protected BigInteger creditCardNumber;//CCN
    protected BigInteger bankAccountNumber;//BAN

    public Customer(){
        this.id = "" + Math.random();
    }

    public String getId(){return id;}
    public String getName(){return name;}
    public String getSurname(){return  surname;}
    public String getPatronymic(){return patronymic;}
    public String getFullName(){return name + " " + surname + " " + patronymic;}
    public String getAddress(){return address;}
    public BigInteger getCreditCardNumber(){return creditCardNumber;}
    public BigInteger getBankAccountNumber(){return bankAccountNumber;}

    public CustomerBuilder getBuilder(){
        return new CustomerBuilder(this);
    }

    @Override
    public String toString(){
        return this.getFullName();
    }

    @Override
    public int compareTo(@NotNull Customer o) {
        return o.getFullName().compareTo(this.getFullName());
    }
}
