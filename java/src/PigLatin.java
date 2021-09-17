public class PigLatin {
    public static String pigIt(String str) {
      
      String newStr = "";
      String strExclude = str = str.replaceAll("[,!?.]+", "");
      String[] strArr = strExclude.split(" ");

      for (int i = 0; i < strArr.length - 1; i++) {
        
        newStr += strArr[i].substring(1);
        newStr += strArr[i].substring(0, 1) + "ay";

        newStr += " ";
        
      }

      newStr += strArr[strArr.length - 1].substring(1);
      newStr += strArr[strArr.length - 1].substring(0, 1) + "ay";

      return newStr;
      
    }
}