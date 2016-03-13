package ru.saydumarov.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.*;
import ru.saydumarov.client.panels.north.HeaderPanelSample;

public class ProfilePage implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get("getsome").add(new HeaderPanelSample());
    }
}
