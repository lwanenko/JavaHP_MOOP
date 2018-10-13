package lab4.B7;

public abstract class Symbol {

    private char value;

    public Symbol(char value) {
        setValue(value);
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "" + getValue();
    }
}
