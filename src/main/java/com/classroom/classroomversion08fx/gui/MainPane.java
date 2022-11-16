package com.classroom.classroomversion08fx.gui;

import javafx.scene.layout.StackPane;

import java.util.Map;


public class MainPane extends StackPane {


    public MainPane (Map<String, String> majorMap) {

        GraphicsPane graphicsPane = new GraphicsPane ();
        ControlPane controlPane = new ControlPane (majorMap, graphicsPane);


        this.getChildren ().add (controlPane);

    }

}
