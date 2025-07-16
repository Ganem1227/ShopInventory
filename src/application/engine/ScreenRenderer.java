package shop.application.engine;

import shop.application.engine.screens.BaseScreen;

import java.util.List;

import static shop.application.models.Constants.DIVIDER;

public class ScreenRenderer {

    public void render(BaseScreen screen) {
        if (screen != null) {
            if (screen.getGraphic() != null) System.out.println(screen.getGraphic());
            renderSplit();
            if (screen.getHeader() != null) System.out.println(screen.getHeader());
            renderSplit();
            if (screen.getBody() != null) System.out.println(screen.getBody());
            List<String> options = screen.getOptions();
            if (options != null && options.size() > 0) {
                System.out.println("Select a number, then press enter.");
                for (int index = 0; index < options.size(); index++) {
                    System.out.println("[" + index + "] " + options.get(index));
                }
            }
        }
    }

    public void renderSplit() {
        System.out.print(DIVIDER);
    }
}
