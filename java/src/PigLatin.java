import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {

      final Pattern pattern = Pattern.compile("\\W+");
      final Matcher matcher = pattern.matcher(str);

      ArrayList<String> list = new ArrayList<>();

      while (matcher.find()) {
        for (int i = 0; i <= matcher.groupCount(); i++) {
          list.add(matcher.group(i));
        }
      }
      
      String newStr = "";
      final String[] strArr = str.split("\\W+");

      for (int i = 0; i < strArr.length - 1; i++) {
        
        newStr += strArr[i].substring(1);
        newStr += strArr[i].substring(0, 1) + "ay";
        newStr += list.get(i);
        
      }

      newStr += strArr[strArr.length - 1].substring(1);
      newStr += strArr[strArr.length - 1].substring(0, 1) + "ay";
      newStr += list.get(list.size() - 1);

      return newStr;
      
    }
}