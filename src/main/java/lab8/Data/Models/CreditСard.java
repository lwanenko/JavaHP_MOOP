package lab8.Data.Models;

import java.math.BigInteger;

public class CreditСard {
    private BigInteger id ;
    private int PIN;
    private BillingAccount billingAccount;
    private User user;

    public CreditСard(BigInteger id, int PIN, BillingAccount billingAccount, User user) {
        this.id = id;
        this.PIN = PIN;
        this.billingAccount = billingAccount;
        this.user = user;
    }

    public BigInteger getId() {
        return id;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CreditСard{" +
                "id=" + id +
                ", billingAccount=" + billingAccount +
                ", user=" + user.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditСard that = (CreditСard) o;

        if (PIN != that.PIN) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (billingAccount != null ? !billingAccount.equals(that.billingAccount) : that.billingAccount != null)
            return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + PIN;
        result = 31 * result + (billingAccount != null ? billingAccount.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
