package Lab2;

public class Box {
    double height;
    double width;
    double depth;

    public Box (){
       this.height = 1;
       this.width = 1;
       this.depth = 1;
    }

    public Box(double parameter) {
        this.depth = parameter;
        this.width = parameter;
        this.height = parameter;
    }

    public Box (double depth, double width, double height) {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    double calculateSurfaceArea() {
        //System.out.println(2.0d * this.height * this.depth + 2.0d * this.height * this.width + 2.0d * this.width * this.depth);
        return 2.0d * this.height * this.depth + 2.0d * this.height * this.width + 2.0d * this.width * this.depth;
    }
    double calculateVolume() {
        //System.out.println(this.height * this.depth * this.width);
        return this.height * this.depth * this.width;
    }
}
