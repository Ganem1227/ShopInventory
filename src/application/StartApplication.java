package application;

import shop.application.engine.Application;

public class StartApplication {

    public static void main(String[] args) {
        Application application = new Application();
        application.initApplication();
        application.run();
    }

}
