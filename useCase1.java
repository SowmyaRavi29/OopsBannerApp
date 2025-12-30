package oopsBannerApp;
/**
 * @author arumu
 * @version
 */
public class useCase1 {
    public static void main(String[] args) {
        String[] banner = {
                " *****     *****    ******    *****",
                "*     *   *     *   *     *   *",
                "*     *   *     *   *     *   *",
                "*     *   *     *   ******    *****",
                "*     *   *     *   *             *",
                "*     *   *     *   *             *",
                " *****     *****    *         *****" 
        };
        for (String c: banner){
            System.out.println(c);
        }
    }
}