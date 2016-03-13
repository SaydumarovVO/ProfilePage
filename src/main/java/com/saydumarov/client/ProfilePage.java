package com.saydumarov.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.paper.widget.PaperButton;

public class ProfilePage implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new PaperButton("button"));
    }

}
