// number 4
public class Box {
    float width;

    public Box(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public static void main(String[] args) {
        Box box= new Box(4.0f);
       
        System.out.println("Before updating:"+box.getWidth());
        box.setWidth(5.0f);
        System.out.println(box.getWidth());
  
    }
}
