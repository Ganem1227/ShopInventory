package models.engine;

import models.engine.graphic.BaseGraphic;
import models.engine.screens.BaseScreen;

import java.util.List;

public class ScreenRenderer {

    public void render(BaseScreen screen) {
        System.out.println(screen.getHeader());
        System.out.println(screen.getBody());
    }

    public void render(BaseGraphic graphic) {
        System.out.println(graphic.getGraphic());
    }

    public void renderOptions(List<String> options) {
        System.out.println("Select a number, then press enter.");
        for (int index = 0; index < options.size(); index++) {
            System.out.println("[" + index + "] " + options.get(index));
        }
    }
}
