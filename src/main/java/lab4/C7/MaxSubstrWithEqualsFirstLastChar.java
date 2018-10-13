package lab4.C7;

import javafx.util.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxSubstrWithEqualsFirstLastChar {

    public String inputString;

    public MaxSubstrWithEqualsFirstLastChar(String inputString) {
        this.inputString = inputString;
    }


    public String searchMaxSubstr(){
        Map<Character, Pair<Integer, Integer>> map = new HashMap<Character, Pair<Integer, Integer>>();

        for(int i = 0; i< inputString.length(); i++){
            char inputString_i = inputString.charAt(i);
            if(!map.containsKey(inputString_i)){
                map.put(inputString_i, new Pair<Integer, Integer>( i , posFirstCharFromEnd(inputString_i, i)));
            }
        }
        Pair<Integer, Integer> maxDeltaPair = searchMaxDeltaPair(map);
        return inputString.substring(maxDeltaPair.getKey(), maxDeltaPair.getValue() + 1);
    }

    private Pair<Integer, Integer> searchMaxDeltaPair(Map<Character, Pair<Integer, Integer>> map ){

        int lastDelta = -1;
        Map.Entry<Character, Pair<Integer, Integer>>  max = null;
        for(Map.Entry<Character, Pair<Integer, Integer>>  cur : map.entrySet()){
            int curDelta = cur.getValue().getValue() - cur.getValue().getKey();
            if (lastDelta < curDelta ) {
                lastDelta = curDelta;
                max = cur;
            }
        }
        return  max.getValue();
    }

    private int posFirstCharFromEnd(char c, int i ){
        for(int ii = inputString.length()-1; ii > i; ii-- ){
            if (inputString.charAt(ii) == c)
                return ii;
        }
        return i;
    }


    public String deleteMaxSubstring(){

        return inputString.replaceFirst(searchMaxSubstr(), "");
    }
}
