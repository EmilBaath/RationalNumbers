package se.academy;

public class Main {

    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(2,2);
        System.out.println(a);
        RationalNumber b = RationalNumber.parseRationalNumber("7/8");
    }
}
