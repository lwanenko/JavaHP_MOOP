package lab4.A7;

public class StringNumerator {

    private String inputText;

    public StringNumerator(String inputText) {
        this.inputText = inputText;
    }

    public String parse(){
        String _result  = new String(inputText);

         return _result.replace(" ", "   ")
                 .replace("A", "1  ")
                 .replace("B", "2  ")
                 .replace("C", "3  ")
                 .replace("D", "4  ")
                 .replace("E", "5  ")
                 .replace("F", "6  ")
                 .replace("G", "7  ")
                 .replace("H", "8  ")
                 .replace("I", "9  ")
                 .replace("J", "10 ")
                 .replace("K", "11 ")
                 .replace("L", "12 ")
                 .replace("M", "13 ")
                 .replace("N", "14 ")
                 .replace("O", "15 ")
                 .replace("P", "16 ")
                 .replace("Q", "17 ")
                 .replace("R", "18 ")
                 .replace("S", "19 ")
                 .replace("T", "20 ")
                 .replace("U", "21 ")
                 .replace("V", "22 ")
                 .replace("W", "23 ")
                 .replace("X", "24 ")
                 .replace("Y", "25 ")
                 .replace("Z", "26 ");
    }

    public void consolePrint(){
        System.out.println();
        for (int i = 0; i < inputText.length(); i++) {
            System.out.print(inputText.charAt(i) + "  ");
        }
        System.out.println();
        System.out.println(parse());
    }

}
