public class ExpressionEval {

    public int eval(String expression) {

        boolean isValidExpression = expression.matches("[0-9]");
        System.out.printf("expression %s valid? %s", expression, isValidExpression);
        return 0;

    }

    public int evalOld(String expression) {

        String[] tokens = expression.split("\\s");
        if (tokens.length == 1 && tokens[0].contains("[0-9]")) {
            return Integer.parseInt(expression);
        }
        else {
            if (tokens.length == 2 && tokens[0].contains("+-") && tokens[1].contains("[0-9]")) {
                if ("+".equalsIgnoreCase(tokens[0])) {
                    return Integer.parseInt(tokens[1]);
                }
                else {
                    return -1 * Integer.parseInt(tokens[1]);
                }
            }
            else {

                if ("+".equalsIgnoreCase(tokens[1])) {
                    return Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
                }
                else {
                    if ("-".equalsIgnoreCase(tokens[1])) {
                        return Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
                    }
                    else {
                        throw new IllegalArgumentException("invalid expression");
                    }
                }

            }
        }

    }
}
