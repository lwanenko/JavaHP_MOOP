package lab4.B7;

import java.util.ArrayList;

public class Sentence implements ITextComponent {

    private ArrayList<ISentenceComponent> components;

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
