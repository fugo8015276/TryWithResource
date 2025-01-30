public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;

        // 不変条件の確認
        assert this.name != null : "name is null";
        assert this.price > 0 : "invalid price: " + price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        // 事前条件の確認
        assert name != null : "name is null";
        this.name = name;
    }

    public void setPrice(int price) {
        // 事前条件の確認
        assert price > 0 : "invalid price: " + price;
        this.price = price;
    }
}
