package models.engine;

import models.engine.screens.BaseScreen;

import java.util.Map;

import static models.Constants.DEFAULT;

public class Application {

    private Map<String, BaseScreen> screenMap;
    private ScreenRenderer renderer;
    private String currentScreen;

    public Application() {
        BaseScreen defaultScreen = BaseScreen.builder()
                .header("Default Screen")
                .body("This is the default screen.")
                .addOption("This is an example option.")
                .build();

        currentScreen = DEFAULT;

        screenMap.put(DEFAULT, defaultScreen);

        renderer = new ScreenRenderer();
    }

    public int run() {
        boolean stop = false;
        while(!stop) {
            renderer.render(screenMap.get(currentScreen));
        }
        return 0;// exit code success
    }

}
