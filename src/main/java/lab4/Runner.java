package lab4;

import lab4.A7.StringNumerator;
import lab4.B7.Text;
import lab4.C7.MaxSubstrWithEqualsFirstLastChar;

public class Runner {

    public static void main(String[ ] args) {
        System.out.println("MOOP Lab 4 Viacheslav Ivamemko BI-1 Var 2");
        partA7();
        partB7();
        partC7();

        partA8();
        partB8();
        partC8();
    }

    public static void partA7(){
        System.out.println("A7:");
        StringNumerator numerator = new StringNumerator("MAMA SHILA MNE SHTANI");
        numerator.consolePrint();
    }

    public static void partA8(){
        System.out.println("A8:");

    }

    public static void partB7(){
        System.out.println("B7:");
        Text text = new Text();
        text.parce("1234567890.12345679```134```1234455");
        System.out.println(text);

    }

    public static void partB8(){
        System.out.println("B8:");

    }

    public static void partC7(){
        System.out.println("C7:");
        MaxSubstrWithEqualsFirstLastChar maxSubstr = new MaxSubstrWithEqualsFirstLastChar("fewertttfffffgttttttttttttqwr");
        System.out.println(maxSubstr.deleteMaxSubstring());
    }

    public static void partC8(){
        System.out.println("C8:");

    }
}
