package shop.application.engine;

import shop.application.engine.screens.BaseScreen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static shop.application.models.Constants.DEFAULT;

public class Application {

    private Map<String, BaseScreen> screenMap;
    private ScreenRenderer renderer;
    private String startScreen;
    private BaseScreen current;
    private Scanner scanner;
    private boolean stop;

    public Application() {
        screenMap = new HashMap<>();
        renderer = new ScreenRenderer();
        scanner = new Scanner(System.in);
    }

    public void initApplication() {
        BaseScreen defaultScreen = BaseScreen.builder()
                .header("Default Screen")
                .body("This is the default screen.")
                .addOption("This is an example option.")
                .waitForInput(true)
                .build();
        startScreen = DEFAULT;
        screenMap.put(DEFAULT, defaultScreen);
        stop = false;
        current = screenMap.get(startScreen);
    }

    public int run() {
        while(!stop) {
            renderer.render(current);
            if(current.isWaitForInput()) {
                processInput(scanner.nextLine());
            }
        }

        cleanUp();
        return 0;// exit code success
    }

    private void processInput(String input) {
        //for now, only exit
        Integer exitIndex = current.getOptions().size() - 1;
        String index = exitIndex.toString();

        if (input.equals(index)) stop = true;
        else current = screenMap.get(DEFAULT);
    }

    private void cleanUp() {
        System.out.println("Closing Application...");
        scanner.close();
    }

}
