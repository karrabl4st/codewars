public class PigLatin {
    public static String pigIt(String str) {
      
      String newStr = "";
      String[] strArr = str.split(" &[^!.?,]");

      for (int i = 0; i < strArr.length - 1; i++) {
        
        newStr += strArr[i].substring(1);
        newStr += strArr[i].substring(0, 1);

        newStr += " ";
        
      }

      newStr += strArr[strArr.length - 1].substring(1);
      newStr += strArr[strArr.length - 1].substring(0, 1);

      return newStr;
      
    }
}