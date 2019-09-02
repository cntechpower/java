public class Item {
    private String name;

    private Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Item i = (Item) obj;
        return name.equals(i.name);

    }

    public static void main(String[] args) {
        System.out.println("main");
        Item i1 = new Item("dujinyang");
        Item i2 = new Item("dujinyang");
        System.out.println(i1.equals(i2));
    }
}
