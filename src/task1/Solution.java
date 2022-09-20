package task1;

public class Solution {
    private static final String PATTERN_NOONE = "no one likes this";
    private static final String PATTERN_ONE = "%s likes this";
    private static final String PATTERN_TWO = "%s and %s like this";
    private static final String PATTERN_THREE = "%s, %s and %s like this";
    private static final String PATTERN_MORE = "%s, %s and %s others like this";

    public static String whoLikesIt(String[] args) {
        String result;
        switch(args.length) {
            case 0:
                result = PATTERN_NOONE;
                break;
            case 1:
                result = String.format(PATTERN_ONE, args);
                break;
            case 2:
                result = String.format(PATTERN_TWO, args);
                break;
            case 3:
                result = String.format(PATTERN_THREE, args);
                break;
            default:
                result = String.format(PATTERN_MORE, args[0], args[1], args.length - 2);
                break;
        }

        return result;
    }
}