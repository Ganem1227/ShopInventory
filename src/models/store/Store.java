package models.store;

public class Store {
    private String name;

    public Store(String name) {
        this.name = name;
    }

    public Store() {
        this.name = "Default Store";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
