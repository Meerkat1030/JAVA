package sec03.chap05;
class Point2{
    private int x,y;
    public Point2(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;

    }
    public int getY(){
        return y;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Colorpoint extends Point2{
    private String color;
    public Colorpoint(int x, int y, String color) {
        super(x,y);
        this.color=color;
    }
    private void setColor(String color) {
        this.color = color;
    }

    private void show() {
        System.out.println(color+"색으로("+getX()+","+getY()+")");
    }

    private void setPoint(int x, int y) {
        super.move(x,y);
    }

    public static void main(String[] args) {
        Colorpoint cp = new Colorpoint(5,5,"YELLOW");
        cp.setPoint(10,20);
        cp.setColor("GREEN");
        cp.show();
    }


}
