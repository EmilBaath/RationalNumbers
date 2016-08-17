package se.academy;

public class Main {

    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(2,3);
        RationalNumber b = new RationalNumber(4,7);
        System.out.println(a.equal(b));
    }
}
