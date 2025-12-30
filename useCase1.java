package oopsBannerApp;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App UseCase 5 - OOPS Banner Display Application
 *
 * Demonstrates pattern lookup using HashMap and
 * efficient banner construction using StringBuilder.
 *
 * @author arumu
 * @version 
 */
public class useCase1 {

    /**
     * Builds and returns a map of character patterns.
     *
     * @return Map containing character as key and banner pattern as value
     */
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "***** ",
                "*     ",
                "*     ",
                "***** ",
                "     *",
                "     *",
                "***** "
        });

        return patternMap;
    }

    /**
     * Renders the banner by composing patterns row by row.
     *
     * @param word the word to be displayed
     * @param patternMap map of character patterns
     */
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.values().iterator().next().length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> characterPatterns = buildCharacterPatternMap();
        renderBanner("OOPS", characterPatterns);
    }
}
