package hu.modeldriven.cameo;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.plugins.Plugin;
import hu.modeldriven.cameo.action.*;

public class Lesson2Plugin extends Plugin {

    @Override
    public void init() {
        createMainMenuAction();
        createBrowserAction();
        createDiagramAction();
    }


    private void createMainMenuAction() {
        var action = new MainMenuAction("Lesson2MainMenuAction", "Lesson 2 Main Menu action");
        var configurator = new MainMenuConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addMainMenuConfigurator(configurator);
    }

    private void createBrowserAction() {
        var action = new BrowserAction("Lesson2BrowserAction", "Lesson 2 Browser action");
        var browserConfiguration = new BrowserConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addContainmentBrowserContextConfigurator(browserConfiguration);

        var browserToolConfiguration = new BrowserRelatedElementsSubmenuConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addContainmentBrowserContextConfigurator(browserToolConfiguration);
    }

    private void createDiagramAction() {
        var action = new DiagramAction("Lesson2DiagramAction", "Lesson 2 Diagram action");
        var configurator = new DiagramConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addAnyDiagramCommandBarConfigurator(configurator);
    }

    @Override
    public boolean close() {
        return true;
    }

    @Override
    public boolean isSupported() {
        return true;
    }
}
