import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 */
public class OOPSBannerApp {

    // Part 1 – Main Class: Define the data structure for character patterns
    static class BannerCharacter {
        String[] pattern;

        BannerCharacter(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {
        // Part 3 – Main Method: Assemble and display the banner
        Map<Character, BannerCharacter> patternMap = buildPatternMap();
        String message = "OOPS";
        
        displayBanner(message, patternMap);
    }

    // Part 2 – Utility Static Methods
    
    /**
     * Builds a HashMap storing ASCII art patterns for characters.
     */
    private static Map<Character, BannerCharacter> buildPatternMap() {
        Map<Character, BannerCharacter> map = new HashMap<>();

        String[] patternO = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };

        String[] patternP = {
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] patternS = {
            " ****  ",
            "*      ",
            "*      ",
            " ****  ",
            "     * ",
            "     * ",
            " ****  "
        };

        map.put('O', new BannerCharacter(patternO));
        map.put('P', new BannerCharacter(patternP));
        map.put('S', new BannerCharacter(patternS));

        return map;
    }

    /**
     * Renders the message in banner format using StringBuilder and Nested Loops.
     */
    private static void displayBanner(String message, Map<Character, BannerCharacter> map) {
        int rows = 7; // Standard height for all patterns

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toUpperCase().toCharArray()) {
                if (map.containsKey(c)) {
                    sb.append(map.get(c).pattern[i]).append("  "); // Add spacing between letters
                }
            }
            System.out.println(sb.toString());
        }
    }
}
