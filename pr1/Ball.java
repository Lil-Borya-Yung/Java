public class Ball {
private String color;
private int size;
private String game;

public Ball(String c, int s, String g) {
    color = c;
    size = s;
    game = g;
}
public Ball(String c){
        color = c;
        size = 0;
}
public void SetColor(String color){
    this.color = color;
}
public void SetSize(int size){
    this.size = size;
}
public void SetGame(String game){
    this.game = game;
}
public String GetColor(String color){
    return color;
}
public int GetSize(int size){
        return size;
}
public String GG(String game){
        return game;
}
public void Print(){
    System.out.println("Type: "+game+"; Color: "+color+"; Size: "+size);
    }
}
