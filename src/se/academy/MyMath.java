package se.academy;

/**
 * Created by Emil Båth on 2016-08-17.
 */
public class MyMath {
    public static int greatestCommonDivider(int m, int n) {
        do {
            int r = m % n;
            if (r == 0) {
                return n;
            }
            m = n;
            n = r;
        } while (true);
    }
}
