import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) 
    {
        Pattern p=Pattern.compile("^(3[01]|[1-9]|[12][0-9]|0[1-9])[- /.]([1-9]|0[1-9]|1[012])[- /.](19|20)?[0-9][0-9]$");
        return p.matcher(dateString);
    }
}
