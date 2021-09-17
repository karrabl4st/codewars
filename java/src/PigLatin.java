public class PigLatin {
    public static String pigIt(String str) {
      
      String newStr = "";
      String[] strArr = str.split("\\w[^ ]");
      String[] strExcludeArr = str.split("[^\\w]+");

      for (int i = 0; i < strExcludeArr.length - 1; i++) {
        
        newStr += strExcludeArr[i].substring(1);
        newStr += strExcludeArr[i].substring(0, 1) + "ay";
        newStr += strArr[i].replaceAll("[^,!?.\\[\\]]", "");

        newStr += " ";
        
      }

      newStr += strExcludeArr[strExcludeArr.length - 1].substring(1);
      newStr += strExcludeArr[strExcludeArr.length - 1].substring(0, 1) + "ay";
      newStr += strArr[strArr.length - 1].replaceAll("[^,!?.\\[\\]]", "");

      return newStr;
      
    }
}