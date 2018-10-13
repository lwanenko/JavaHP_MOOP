package lab4.B7;

import java.util.ArrayList;

public class Text {
    private ArrayList<ITextComponent> components;

    public TextParcer getParcer(){
        return new TextParcer(this);
    }

    public class TextParcer{
        private Text text;

        public TextParcer(Text text) {
            this.text = text;
        }

        public void parce(String inputText){
            text.components = new ArrayList<ITextComponent>();
        }

    }

    @Override
    public String toString(){
        if (components == null)
            throw new RuntimeException();
        String returnString = "";
        for (ITextComponent component: components){
            returnString += component.toString();
        }
        return returnString;
    }
}
