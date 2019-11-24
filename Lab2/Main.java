package Lab2;



public class Main {
    public static void main(String[] args) {

        Box[] boxes = new Box[3];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box();
            boxes[i] = new Box(2);
        }
        for (int i = 0; i < boxes.length; i++) {
                    System.out.println("Parametrs of box " + i + ": height " + boxes[i].height + " width " + boxes[i].width + " depth " + boxes[i].depth + " ");
        }
        Box box1 = new Box(1,2,3);
        Box box2 = new Box(8,5,6);

        double area = box1.calculateSurfaceArea();
        System.out.println("Area of the box = "  + area);
        double volume = box1.calculateVolume();
        System.out.println("Volume of the box = " + volume);
    }
}
