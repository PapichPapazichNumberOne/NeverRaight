
public class Cylinder extends Shapes {

    public int r;
    public int h;


    public void calculateTheVolume(int r, int h) {
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Объём цилиндра = " + v);
    }
}