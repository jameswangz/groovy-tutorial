package evaluator;

import groovy.util.Eval;
import org.junit.Test;
import static junit.framework.Assert.*;


public class EvalGroovyTest {

    @Test
    public void eval() {
        assertEquals("Hello from Groovy", Eval.me("def language = 'Groovy'; \"Hello from $language\""));
    }

}
