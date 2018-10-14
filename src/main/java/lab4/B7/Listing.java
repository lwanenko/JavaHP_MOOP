package lab4.B7;

public class Listing  implements  ITextComponent{

    private String value;

    @Override
    public void create(String s) {
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
