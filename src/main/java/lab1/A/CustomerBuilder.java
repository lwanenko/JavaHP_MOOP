package lab1.A;

import java.math.BigInteger;

public class CustomerBuilder {

    private Customer customer;

    public CustomerBuilder()
    {
        customer = new Customer();
    }
    public CustomerBuilder(Customer customer)
    {
        this.customer = customer;
    }

    public CustomerBuilder setId(String id){
        customer.id = id;
        return this;
    }
    public CustomerBuilder setFullName(String name, String surname, String patronymic){
        customer.name = name;
        customer.surname = surname;
        customer.patronymic = patronymic;
        return  this;
    }
    public CustomerBuilder setAddress(String address){
        customer.address = address;
        return this;
    }
    public CustomerBuilder setCreditCardNumber(BigInteger creditCardNumber){
        customer.creditCardNumber = creditCardNumber;
        return this;
    }
    public CustomerBuilder setBankAccountNumber(BigInteger bankAccountNumber){
        customer.bankAccountNumber = bankAccountNumber;
        return this;
    }

    public Customer Build(){
        return customer;
    }
}
