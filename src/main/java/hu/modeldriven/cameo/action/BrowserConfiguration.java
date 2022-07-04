package hu.modeldriven.cameo.action;

import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.ui.browser.Tree;

public class BrowserConfiguration implements BrowserContextAMConfigurator {

    private final BrowserAction browserAction;

    public BrowserConfiguration(BrowserAction browserAction) {
        this.browserAction = browserAction;
    }

    @Override
    public void configure(ActionsManager actionsManager, Tree tree) {
        var category = new MDActionsCategory("", "");
        category.addAction(browserAction);
        actionsManager.addCategory(category);
    }

    @Override
    public int getPriority() {
        return LOW_PRIORITY;
    }
}
