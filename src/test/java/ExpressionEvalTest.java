import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ExpressionEvalTest {

    private ExpressionEval expressionEval = new ExpressionEval();;

    @Test
    public void evaluateSingeNumber() {
        assertThat(expressionEval.eval("0"), is(equalTo(0)));
    }

    @Test
    public void evaluateOtherSingeNumber() {
        assertThat(expressionEval.eval("1"), is(equalTo(1)));
    }

    @Test
    public void evaluateAddTwoNumbers() {
        assertThat(expressionEval.eval("1 + 1"), is(equalTo(2)));
    }

    @Test
    public void evaluateSimpleSubtract() {
        assertThat(expressionEval.eval("1 - 1"), is(equalTo(0)));
    }

    @Test
    public void evaluateSimpleSubtractWithNegativeResult() {
        assertThat(expressionEval.eval("1 - 2"), is(equalTo(-1)));
    }

    @Test
    public void evaluateSingleNegativeNumber() {
        assertThat(expressionEval.eval("- 2"), is(equalTo(-2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidOperatorShouldThrowException() {
        expressionEval.eval("1 * 1");
    }
    //TODO
    //invalid operator
    //missing operator 1 (which is valid and = -1 * value 2,  or +1 * value 2, depending on operator)
    //introduce brackets

    @Test
    public void regexTest() {
        String regex = "(\\d)?(\\s)*([\\-\\+])?(\\s)*\\d";
        String[] validExpressions = { "9", "0", "1" ,"-1", "+9", "+ 4", "-  8", " + 3" } ;
        for (int i = 0; i < validExpressions.length; i++) {
            System.out.println("valid expression: " + validExpressions[i] + ", is valid? " + validExpressions[i].matches(regex));
            assertTrue(validExpressions[i].matches(regex));
        }
        String[] invalidExpressions = { "", "11", "A", "A8", "*5", "--4" };
        for (int i = 0; i < invalidExpressions.length; i++) {
            System.out.println("invalid expression: " + invalidExpressions[i] + ", is valid? " + invalidExpressions[i].matches(regex));
            assertFalse(invalidExpressions[i].matches(regex));
        }

    }
    //maybe regex is too clever
    //each token being parsed (except for whitespace) is of length 1
    //
    //

    @Test
    public void regexTes2t() {
        String x = "-9";
        //assertTrue(x.matches("(\s)*[0-9]"));
    }
}