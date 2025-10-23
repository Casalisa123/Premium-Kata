public record LCDDigit(String upperLine, String middleLine, String lowerLine) {

    public static LCDDigit from(String lcd3Lines) {
        var lines = lcd3Lines.split("\n");
        return new LCDDigit(lines[0], lines[1], lines[2]);
    }
}