package lab4.B7;

public class Letter extends Symbol {
    public Letter(char value) {
        super(value);
    }

    @Override
    public void setValue(char value){
        if(isLatter(value))
            super.setValue(value);
    }

    public static boolean isLatter(char c)
    {
        return true;
    }

}
