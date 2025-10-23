public class Main {
    public static void main(String[] args) {
            NumberToLCDConverter numberToLCDConverter = new NumberToLCDConverter();
            System.out.println(numberToLCDConverter.numberToLCD(1234567890, 1, 1));
            System.out.println(numberToLCDConverter.numberToLCD(1234567890, 1, 3));
            System.out.println(numberToLCDConverter.numberToLCD(1234567890, 3, 1));
            System.out.println(numberToLCDConverter.numberToLCD(1234567890, 5, 5));
            System.out.println(numberToLCDConverter.numberToLCD(1234567890, 1, 1));
    }
}