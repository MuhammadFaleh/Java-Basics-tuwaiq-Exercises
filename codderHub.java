import java.sql.Time;
import java.util.Locale;

public class codderHub {
    public static boolean isPalindrome(String s) {

        if(s.equalsIgnoreCase(String.valueOf(new StringBuilder(s).reverse()))){
            return true;
        }else {
            return false;
        }

    }


    static void main() {
        System.out.println(isPalindrome("121"));    }
}
