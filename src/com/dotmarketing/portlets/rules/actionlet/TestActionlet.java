package com.dotmarketing.portlets.rules.actionlet;

import com.dotmarketing.portlets.rules.model.RuleActionParameter;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class TestActionlet extends RuleActionlet {
    public TestActionlet() {
        super("TestActionlet");
    }

    @Override
    public void executeAction(HttpServletRequest request, Map<String, RuleActionParameter> params) {
        //
    }
}
