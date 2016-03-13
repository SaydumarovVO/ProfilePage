package ru.saydumarov.client.panels.north;

import com.google.gwt.user.client.ui.VerticalPanel;

public class NorthPanel extends VerticalPanel {
    private static volatile NorthPanel northPanel;

    private NorthPanel(){

    }

    public void addComposition(){
        northPanel.add(new HeaderPanelSample());
    }

    public static NorthPanel create(){
        NorthPanel localNorthPanel = northPanel;
        if (localNorthPanel == null){
            synchronized (NorthPanel.class){
                localNorthPanel = northPanel;
                if (localNorthPanel == null){
                    northPanel = localNorthPanel = new NorthPanel();
                }
            }
        }
        northPanel.addComposition();
        return localNorthPanel;
    }
}
