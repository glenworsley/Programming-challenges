public class Calculator implements ICalculator {

    public int eval(String expression) {

        String withoutSpaces = expression.replaceAll("\\s","");
        int result = 0;
        String prevOp = "+";
        for (int i = 0; i < withoutSpaces.length(); i++) {
            if (withoutSpaces.substring(i, i + 1).matches("\\d")) {
                int currentInt = Integer.parseInt(withoutSpaces.substring(i, i + 1));
                if ("+".equalsIgnoreCase(prevOp)) result = result + currentInt;
                else result = result - currentInt;
            }
            else if (withoutSpaces.substring(i, i + 1).matches("[\\+\\-]")) {
                prevOp = withoutSpaces.substring(i, i + 1);
            }
            else //must be a bracket
            {
                //if left bracket, starting another expression, so
                  //put current result onto the stack
                  //reset current result to zero
                //if right bracket, end of an expression,  so

                //get expression within the brackets
                String subExpression = getExpressionWithinBrackets(withoutSpaces.substring(i));
                //evaluate it
                System.out.println(subExpression);
                int currentInt = eval(subExpression);
                //apply it to the result (based on prevOp) - like above
                if ("+".equalsIgnoreCase(prevOp)) result = result + currentInt;
                else result = result - currentInt;
            }
        }
        return result;
    }

    protected String getExpressionWithinBrackets(String expressionStartingWithBrackets) {

        String expression = "";
        int leftBracketCount = 1;
        int rightBracketCount = 0;
        for (int i = 1; i < expressionStartingWithBrackets.length(); i++) {
            if (expressionStartingWithBrackets.substring(i, i + 1).equalsIgnoreCase("("))
                leftBracketCount++;
            if (expressionStartingWithBrackets.substring(i, i + 1).equalsIgnoreCase(")")) {
                if (leftBracketCount == rightBracketCount + 1) {
                    //at end of expression
                    return expression;
                }
                else {
                    rightBracketCount++;
                    expression = expression + expressionStartingWithBrackets.substring(i, i + 1);

                }
            }
            else {
                expression = expression + expressionStartingWithBrackets.substring(i, i + 1);
            }
        }
        return expression;
        //int indexOfNextRightBracket = expressionStartingWithBracket.indexOf(")");
        //return expressionStartingWithBracket.substring(1, indexOfNextRightBracket);
    }


}
