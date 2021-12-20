package Assignment1;

public class Arhematic {
    private int first;
    private int second;
//    constructor
    Arhematic(int first,int second){
        this.first = first;
        this.second = second;
    }
    public int getFirst(){
        return first;
    }
    public  int getSecond(){
        return second;
    }
    public int add(){
        return first + second;

    }
}
