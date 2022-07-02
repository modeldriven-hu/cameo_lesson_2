package hu.modeldriven.cameo;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.plugins.Plugin;
import hu.modeldriven.cameo.action.MainMenuAction;
import hu.modeldriven.cameo.action.MainMenuConfiguration;

public class Lesson2Plugin extends Plugin {

    @Override
    public void init() {
        createMainMenuAction();
    }

    private void createMainMenuAction(){
        var action = new MainMenuAction("Lesson2MainMenuAction", "Lesson 2 Main Menu action");
        var configurator = new MainMenuConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addMainMenuConfigurator(configurator);
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
