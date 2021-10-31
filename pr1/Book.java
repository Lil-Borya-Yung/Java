public class Book {
    private String name;
    private int pages;

    public Book(String n, int p){
        name = n;
        pages = p;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book(){
        name = "Your Book";
        pages = 0;
    }
    public void SetPages(int pages){
        this.pages = pages;
    }
    public void SetName(String name){
        this.name = name;
    }
    public String GetName(String name){
        return name;
    }
    public int GetPages(){
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }
    public void Print(){
        System.out.println("'"+name+"' has "+pages+" pages");
    }
}
