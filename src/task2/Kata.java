package task2;

public class Kata {

    public static String createPhoneNumber(int ... ints) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for(int i = 0; i < 3; i++)
            builder.append(ints[i]);
        builder.append(")").append(" ");
        for(int i = 3; i < 6; i++)
            builder.append(ints[i]);
        builder.append("-");
        for(int i = 6; i < 10; i++)
            builder.append(ints[i]);
        return builder.toString();
    }
}
