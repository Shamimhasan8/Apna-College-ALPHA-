public class StringCompression {
    // String compression ---> Amazon interview question
    public static String compressString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length();i++){
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(1+i)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count;
            }
        }
        return newStr;
    }
    public static void main(String[] args){
        String str = "aaabbccddeee";
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressString(str));
    }
}
