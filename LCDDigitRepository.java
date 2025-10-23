import java.util.Map;
import java.util.HashMap;

public class LCDDigitRepository {
    private final Map<Character, LCDDigit> charToLCDDigit;
    private static LCDDigitRepository instance;

    public static LCDDigit get(char c) {
        // NOTE: Not thread safe
        if (instance == null) {
            instance = new LCDDigitRepository();
        }
        return instance.charToLCDDigit.get(c);
    }

    private LCDDigitRepository() {
        charToLCDDigit = new HashMap<>();
        initMap();
    }

    private void initMap() {

        charToLCDDigit.put('0', LCDDigit.from("""
                 _\s
                | |
                |_|"""));

        charToLCDDigit.put('1', LCDDigit.from("""
                \s\s\s
                  |
                  |"""));

        charToLCDDigit.put('2', LCDDigit.from("""
                 _\s
                 _|
                |_\s"""));

        charToLCDDigit.put('3', LCDDigit.from("""
                \s_\s
                 _|
                 _|"""));

        charToLCDDigit.put('4', LCDDigit.from("""
                \s\s\s
                |_|
                  |"""));

        charToLCDDigit.put('5', LCDDigit.from("""
                 _\s
                |_\s
                 _|"""));

        charToLCDDigit.put('6', LCDDigit.from("""
                 _\s
                |_\s
                |_|"""));

        charToLCDDigit.put('7', LCDDigit.from("""
                \s_\s
                  |
                  |"""));

        charToLCDDigit.put('8', LCDDigit.from("""
                 _\s
                |_|
                |_|"""));

        charToLCDDigit.put('9', LCDDigit.from("""
                 _\s
                |_|
                 _|"""));
    }
}
