public class NumberToLCDConverter {

    public String numberToLCD(int number, int width, int height) {
        String[] lines = new String[LCDDigitResizer.getResizedLineCount(height)];
        java.util.Arrays.fill(lines, "");

        String digits = String.valueOf(number);

        for (int i = 0; i < digits.length(); i++) {
            String[] resized = getResizedDigit(digits.charAt(i), width, height);
            for (int lineId = 0; lineId < resized.length; lineId++) {
                lines[lineId] += resized[lineId];
            }
        }

        return String.join("\n", lines);
    }

    private String[] getResizedDigit(char c, int width, int height) {
            LCDDigit lcd = LCDDigitRepository.get(c);
            return LCDDigitResizer.resize(lcd, width, height);
    }
}