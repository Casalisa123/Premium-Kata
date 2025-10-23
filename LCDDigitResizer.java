import java.util.ArrayList;

public class LCDDigitResizer {

    public static int getResizedLineCount(int height) {
        return height * 2 + 1;
    }

    public static String[] resize(LCDDigit digit, int width, int height) {
        var resized = new ArrayList<String>();

        resized.add(buildBaseLine(digit.upperLine(), width));
        resized.addAll(resizeCompleteLine(digit.middleLine(), width, height));
        resized.addAll(resizeCompleteLine(digit.lowerLine(), width, height));

        return resized.toArray(new String[0]);
    }

    private static ArrayList<String> resizeCompleteLine(String line, int width, int height) {
        var resized = new ArrayList<String>();

        var nonBaseLine = buildNonBaseLine(line, width);
        for (int i = 0; i < height - 1; i++) {
            resized.add(nonBaseLine);
        }
        resized.add(buildBaseLine(line, width));

        return resized;
    }

    private static String buildBaseLine(String line, int width) {
        return line.charAt(0) + String.valueOf(line.charAt(1)).repeat(width) + line.charAt(2);
    }

    private static String buildNonBaseLine(String line, int width) {
        return line.charAt(0) + " ".repeat(width) + line.charAt(2);
    }
}
