public class NumberToLCDConverter {

    private static final String HORIZONTAL = "_";
    private static final String VERTICAL = "|";
    private static final String SPACE = " ";

    private record LCDDigit(String upperLine, String middleLine, String lowerLine) {
        private static LCDDigit from(String lcd3Lines) {
            var lines = lcd3Lines.split("\n");//System.lineSeparator());
            return new LCDDigit(lines[0], lines[1], lines[2]);
        }
    }

    private LCDDigit digit0 = LCDDigit.from("""
     _\s  
    | |
    |_|""");

    private LCDDigit digit1 = LCDDigit.from("""
    \s\s\s  
      |
      |""");

    private LCDDigit digit2 = LCDDigit.from("""
     _\s  
     _|
    |_\s""");

    private LCDDigit digit3 = LCDDigit.from("""
    \s_\s  
     _|
     _|""");

    private LCDDigit digit4 = LCDDigit.from("""
    \s\s\s  
    |_|
      |""");

    private LCDDigit digit5 = LCDDigit.from("""
     _\s  
    |_\s
     _|""");

    private LCDDigit digit6 = LCDDigit.from("""
     _\s  
    |_\s
    |_|""");

    private LCDDigit digit7 = LCDDigit.from("""
    \s_\s  
      |
      |""");

    private LCDDigit digit8 = LCDDigit.from("""
     _\s  
    |_|
    |_|""");

    private LCDDigit digit9 = LCDDigit.from("""
     _\s  
    |_|
     _|""");

    public String numberToLCD(int number) {
        String upperLine = "";
        String middleLine = "";
        String lowerLine = "";

        String digits = String.valueOf(number);
        for (int i = 0; i < digits.length(); i++) {
            LCDDigit lcd = digitToLCD(digits.charAt(i));
            upperLine += lcd.upperLine;
            middleLine += lcd.middleLine;
            lowerLine += lcd.lowerLine;
        }

        return upperLine + "\n" + middleLine + "\n" + lowerLine;
    }

    private LCDDigit digitToLCD(char digit) {
        return switch(digit) {
            case '0' -> digit0;
            case '1' -> digit1;
            case '2' -> digit2;
            case '3' -> digit3;
            case '4' -> digit4;
            case '5' -> digit5;
            case '6' -> digit6;
            case '7' -> digit7;
            case '8' -> digit8;
            case '9' -> digit9;
            default -> digit0;
        };
    }

}