package models.store;

public class Store {
    /**
     * Store must track an inventory of items
     */
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
