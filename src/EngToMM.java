import java.util.ArrayList;
import java.util.List;

public class EngToMM {
    static String mmNumber = "";


    public static void main(String[] args) {
        System.out.println(getMMDigit("1232324223273384"));
    }

    public static String getMMDigit(String engDigit) {
        char[] charArray = engDigit.toCharArray();
        List<Character> mmNumList = convertEngNumToMMnum(charArray);
        mmNumList.forEach(mmNum -> {
            mmNumber = mmNumber + mmNum;
        });
        return mmNumber;
    }

    static List<Character> convertEngNumToMMnum(char[] data) throws NumberFormatException {
        List<Character> characterList = new ArrayList<>();
        try {
            for (char i : data) {
                characterList.add((char) ((int) i + 4112));
            }
        } catch (NumberFormatException e) {
            return null;
        }
        return characterList;
    }
}
