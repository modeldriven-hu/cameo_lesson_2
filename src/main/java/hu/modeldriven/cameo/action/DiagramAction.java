package hu.modeldriven.cameo.action;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.ui.ScalableImageIcon;

import java.awt.event.ActionEvent;

public class DiagramAction extends DefaultDiagramAction {
    public DiagramAction(String id, String name) {
        super(id, name, null, null);

        var url = getClass().getResource("/icon.png");
        setSmallIcon(new ScalableImageIcon(url));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        var presentationElements = getSelected();

        if (presentationElements != null && presentationElements.size() > 0) {
            var presentationElement = presentationElements.get(0);

            var name = presentationElement.getElement().getHumanName();

            Application.getInstance().getGUILog().showMessage("Selected element: " + name);
        }
    }
}
