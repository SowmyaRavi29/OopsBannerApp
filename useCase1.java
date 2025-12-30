package oopsBannerApp;
/**
 * @author arumu
 * @version
 */
public class useCase1 {

    /* ================= INNER CLASS ================= */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character pattern data.
         *
         * @param character the character to be displayed
         * @param pattern the banner pattern representing the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern for the character.
         *
         * @return array of strings representing banner rows
         */
        public String[] getCharacterPattern() {
            return pattern;
        }
    }

    /* ================= RENDER LOGIC ================= */
    /**
     * Renders the banner row by row.
     *
     * @param patterns array of CharacterPatternMap objects
     */
    public static void renderBanner(CharacterPatternMap[] patterns) {

        int height = patterns[0].getCharacterPattern().length;

        for (int row = 0; row < height; row++) {
            String line = "";
            for (CharacterPatternMap cp : patterns) {
                line += cp.getCharacterPattern()[row] + "   ";
            }
            System.out.println(line);
        }
    }

    /* ================= PATTERN DATA ================= */
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "******",
                "*     *",
                "*     *",
                "******",
                "*",
                "*",
                "*"
        });
    }

    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }



    /* ================= MAIN METHOD ================= */
    public static void main(String[] args) {

        CharacterPatternMap[] bannerCharacters = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };

        renderBanner(bannerCharacters);
    }
}