package practice.state.vendinmachine;

public class Item {
    int code;
    int price;
    String name;

    public Item(int code, int price, String name) {
        this.code = code;
        this.price = price;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
