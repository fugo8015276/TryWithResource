public class Sample {
    public static void main(String[] args) {
        Item item = new Item("apple", 100);
        item.setPrice(-1);
        System.out.println(item.getName() + ": " + item.getPrice());
    }
}
