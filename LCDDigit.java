public record LCDDigit(String upperLine, String middleLine, String lowerLine) {
    // Frage: Wir waren uns nicht sicher mit der Benennung für diesen Typ, und haben
    // auch überlegt z.B: "LCDDigitThreeLines" oder so, um klar zu machen, dass es
    // hier um die dreizeilige Einheitsgrößen-Digit geht

    public static LCDDigit from(String digit) {
        var lines = digit.split("\n");
        return new LCDDigit(lines[0], lines[1], lines[2]);
    }
}