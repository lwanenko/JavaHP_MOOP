package lab4.B7;

import java.util.ArrayList;

public class Text {
    private ArrayList<ITextComponent> components = new ArrayList<ITextComponent>();


    public void parce(String input){


        for(int i =0; i < input.length(); i++){
            if(chackListingStart(input, i)){
                Listing listing = new Listing();
                int ii = chackListingEnd(input, i);
                listing.create(input.substring(i, ii+1));
                i = ii;
                components.add(listing);
            }
            else {
                Sentence sentence = new Sentence();
                int ii = chackSentenceEnd(input, i) ;
                sentence.create(input.substring(i, ii+1));
                i = ii;
                components.add(sentence);
            }

        }
    }

    private boolean chackListingStart(String input, int i){
        if (input.length() < i + 5) return false;
        if (input.charAt(i) == '`'&& input.charAt(i+1) == '`'&& input.charAt(i+2) == '`')
            return  true;
        return false;
    }

    private int chackListingEnd(String input, int i){
        for(int ii = i+5; ii <input.length(); ii++ )
            if (input.charAt(ii) == '`'&& input.charAt(ii - 1) == '`'&& input.charAt(ii - 2) == '`')
                return  ii;
        throw new RuntimeException();
    }

    private int chackSentenceEnd(String input, int i){
        for(int ii = i+1; ii <input.length(); ii++ ){
            if (input.charAt(ii) == '.'|| input.charAt(ii) == '!'|| input.charAt(ii) == '?')
                return  ii;
            if (chackListingStart(input, ii))
                return ii-1;
        }
        return input.length()-1;
    }

    @Override
    public String toString(){
        if (components == null)
            throw new RuntimeException();
        String returnString = "";
        for (ITextComponent component: components){
            returnString += component.toString()+"|";
        }
        return returnString;
    }
}
