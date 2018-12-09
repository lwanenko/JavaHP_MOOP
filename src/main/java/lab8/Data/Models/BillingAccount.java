package lab8.Data.Models;

public class BillingAccount {
    private int id;
    private double sum;
    private boolean isBlocked;
    private User user;
    private CreditСard creditСard;

    public BillingAccount(int id, double sum, boolean isBlocked, User user, CreditСard creditСard) {
        this.id = id;
        this.sum = sum;
        this.isBlocked = isBlocked;
        this.user = user;
        this.creditСard = creditСard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CreditСard getCreditСard() {
        return creditСard;
    }

    public void setCreditСard(CreditСard creditСard) {
        this.creditСard = creditСard;
    }

    @Override
    public String toString() {
        return "BillingAccount{" +
                "id=" + id +
                ", sum=" + sum +
                ", isBlocked=" + isBlocked +
                ", user=" + user.getName() +
                ", creditСard=" + creditСard.getId() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillingAccount that = (BillingAccount) o;

        if (id != that.id) return false;
        if (Double.compare(that.sum, sum) != 0) return false;
        if (isBlocked != that.isBlocked) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return creditСard != null ? creditСard.equals(that.creditСard) : that.creditСard == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(sum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBlocked ? 1 : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (creditСard != null ? creditСard.hashCode() : 0);
        return result;
    }
}
