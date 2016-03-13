package ru.saydumarov.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import ru.saydumarov.client.panels.north.NorthPanel;

/**
 * Created by Валера on 11.03.2016.
 */
public class ProfilePageComposition extends Composite{
    private DockPanel dockPanel = new DockPanel();
    private NorthPanel northPanel = NorthPanel.create();

    public ProfilePageComposition(){
        initWidget(dockPanel);

        addComposition();
    }

    void addComposition(){
        dockPanel.add(northPanel, DockPanel.NORTH);
    }
}
