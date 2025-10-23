public class NumberToLCDConverter {

    public String numberToLCD(int number) {
        String upperLine = "";
        String middleLine = "";
        String lowerLine = "";

        String digits = String.valueOf(number);

        for (int i = 0; i < digits.length(); i++) {
            LCDDigit lcd = LCDDigitRepository.get(digits.charAt(i));

            upperLine += lcd.upperLine();
            middleLine += lcd.middleLine();
            lowerLine += lcd.lowerLine();
        }

        return upperLine + "\n" + middleLine + "\n" + lowerLine;
    }


}