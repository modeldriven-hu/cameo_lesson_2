package hu.modeldriven.cameo.action;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsID;

public class MainMenuConfiguration implements AMConfigurator {

    private final MainMenuAction mainMenuAction;

    public MainMenuConfiguration(MainMenuAction action) {
        this.mainMenuAction = action;
    }

    @Override
    public void configure(ActionsManager actionsManager) {
        var newProjectAction = actionsManager.getActionFor(ActionsID.NEW_PROJECT);

        if (newProjectAction != null) {
            var category = (ActionsCategory) actionsManager.getActionParent(newProjectAction);
            var actionsInCategory = category.getActions();
            actionsInCategory.add(mainMenuAction);
            category.setActions(actionsInCategory);
        }
    }
}
