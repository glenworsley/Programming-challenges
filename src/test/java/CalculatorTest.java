import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void simpleExpression() {
        assertThat(calculator.eval("0"), is(equalTo(0)));
    }

    @Test
    public void simpleExpression2() {
        assertThat(calculator.eval("9"), is(equalTo(9)));
    }

    @Test
    public void simpleExpression3() {
        assertThat(calculator.eval("9 + 1"), is(equalTo(10)));
    }

    @Test
    public void simpleExpression4() {
        assertThat(calculator.eval("9 - 1"), is(equalTo(8)));
    }

    @Test
    public void simpleExpression5() {
        assertThat(calculator.eval("9 + 1 + 2"), is(equalTo(12)));
    }

    @Test
    public void simpleExpression6() {
        assertThat(calculator.eval("9 + 1 + 2  + 9"), is(equalTo(21)));
    }

    @Test
    public void simpleExpression7() {
        assertThat(calculator.eval("9 + 1 - 2  - 9"), is(equalTo(-1)));
    }

    @Test
    public void simpleExpression8() {
        assertThat(calculator.eval("- 9 + 1 - 2  - 9"), is(equalTo(-19)));
    }

    @Test
    public void simpleExpression9() {
        assertThat(calculator.eval("- 9"), is(equalTo(-9)));
    }

    @Test
    public void expressionWithBrackets() {
        assertThat(calculator.eval("( 1 + 1)"), is(equalTo(2)));
    }

    @Test
    public void getExpressionWithinBrackets() {
        assertThat(calculator.getExpressionWithinBrackets("(3+4)"), is(equalTo("3+4")));
    }

    @Test
    public void getExpressionWithinMultipleBrackets() {
        assertThat(calculator.getExpressionWithinBrackets("((3+4-1)+1)"), is(equalTo("(3+4-1)+1")));
    }
}