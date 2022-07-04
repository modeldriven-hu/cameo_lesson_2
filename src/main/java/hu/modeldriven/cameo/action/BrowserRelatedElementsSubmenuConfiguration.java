package hu.modeldriven.cameo.action;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsID;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.ui.browser.Tree;

public class BrowserRelatedElementsSubmenuConfiguration implements BrowserContextAMConfigurator {

    private final BrowserAction browserAction;

    public BrowserRelatedElementsSubmenuConfiguration(BrowserAction browserAction) {
        this.browserAction = browserAction;
    }

    @Override
    public void configure(ActionsManager actionsManager, Tree tree) {
        var category = (ActionsCategory) actionsManager.getActionFor(ActionsID.RELATED_ELEMENTS_SUBMENU);

        if (category != null) {
            category.addAction(browserAction);
        }
    }

    @Override
    public int getPriority() {
        return HIGH_PRIORITY;
    }
}
