
package cn.edu.zju.acm.mvc.control;

import org.junit.Before;
import org.junit.Test;

import cn.edu.zju.acm.mvc.control.action.PropertyAction;

public class ActionExecutorPrimitiveInitializationTest extends ActionExecutorTestBase {

    private ActionExecutor actionExecutor;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        this.actionExecutor = this.build(PropertyAction.class);
    }

    @Test
    public void test() {
        // this.actionExecutor.execute(req, resp, forward);
    }
}