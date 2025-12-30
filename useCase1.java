package oopsBannerApp;
/**
 * @author arumu
 * @version
 */
public class useCase1 {

    public static void main(String[] args) {
        String[] banner = getResult();

        for (String pattern : banner) {
            System.out.println(pattern);
        }
    }

    public static String[] getResult() {
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] result = new String[7];

        for (int i = 0; i < 7; i++) {
            result[i] = o[i] + "   " + o[i] + "    " + p[i] + "    " + s[i];
        }
        return result;
    }

    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "******",
                "*     *",
                "*     *",
                "******",
                "*     ",
                "*     ",
                "*     "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }
}
