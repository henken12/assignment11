package Assignment11;
// question no 1
public class NativeUnicode {
    public static void main(String[] args) {
        System.out.println("hi\t\uD83D\uDC4B, my name is\t\"\u1204\u1296\u12AD\"");
        // B size of the string

        String str= "hi\t\uD83D\uDC4B, my name is\t\"\u1204\u1296\u12AD\"";
        System.out.println(str.length());
        // the size of the string is 23 when i count the length. character is counting as 1,emojis 2 and single unicode as 1
        //but suplementary unicode can vary ex ሄኖክ or \u1204\u1296\u12AD can be counted as 3.
    }
}
