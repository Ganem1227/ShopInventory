package models.screens;

import java.util.ArrayList;
import java.util.List;

public class BaseScreen {
    private String header;
    private String body;
    private List<String> options;

    public BaseScreen(String header, String body, List<String> options) {
        this.header = header;
        this.body = body;
        this.options = options;
    }

    public static class Builder {
        private String header;
        private String body;
        private List<String> options;

        public BaseScreen build() {
            return new BaseScreen(header, body, options);
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

        public Builder addOption(String option) {
            if (this.options == null) {
                this.options = new ArrayList<>();
            }
            this.options.add(option);
            return this;
        }
    }
}
