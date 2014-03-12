package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTrial {
    public static void main(String[] args) {
        searchForValue();
        replaceValues();
    }

    private static void searchForValue() {
        String regexText = "Search123String";

        Pattern pattern = Pattern.compile(".123(\\D+)");
        Matcher matcher = pattern.matcher(regexText);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    private static void replaceValues() {
        String thoughtWorksTest = "FindThe?Question Mark?!";
        Pattern pattern = Pattern.compile("(.)");
        Matcher matcher = pattern.matcher(thoughtWorksTest);
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
