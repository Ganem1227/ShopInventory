package models.engine.screens;

import models.engine.graphic.BaseGraphic;

import java.util.ArrayList;
import java.util.List;

public class BaseScreen {
    private String header;
    private String body;
    private BaseGraphic graphic;
    private List<String> options;
    private boolean waitForInput;

    public BaseScreen(String header, String body, List<String> options, BaseGraphic graphic, boolean waitForInput) {
        this.header = header;
        this.body = body;
        this.options = options;
        this.options.add("Exit.");
        this.waitForInput = waitForInput;
    }

    public String getHeader() {
        return this.header;
    }

    public String getBody() {
        return this.body;
    }

    public List<String> getOptions() {
        return this.options;
    }

    public boolean isWaitForInput() {
        return this.waitForInput;
    }

    public BaseGraphic getGraphic() {
        return this.graphic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void addOption(String option) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(option);
    }

    public static class Builder {
        private String header;
        private String body;
        private BaseGraphic graphic;
        private List<String> options;
        private boolean waitForInput;

        public BaseScreen build() {
            return new BaseScreen(header, body, options, graphic, waitForInput);
        }

        public Builder header(String header) {
            this.header = header;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder options(List<String> options) {
            this.options = options;
            return this;
        }

        public Builder graphic(BaseGraphic graphic) {
            this.graphic = graphic;
            return this;
        }

        public Builder addOption(String option) {
            if (this.options == null) {
                this.options = new ArrayList<>();
            }
            this.options.add(option);
            return this;
        }

        public Builder waitForInput(boolean waitForInput) {
            this.waitForInput = waitForInput;
            return this;
        }
    }
}
