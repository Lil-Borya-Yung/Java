public class TestBook {
    public static void main(String[] args) {
        Book Book1 = new Book("War and Peace I", 300);
        Book Book2 = new Book(" ", 200);
        Book Book3 = new Book("1984");
        Book3.SetPages(350);
        Book2.SetName("Fahrenheit 451");
        Book1.Print();
        Book2.Print();
        Book3.Print();
    }
}
