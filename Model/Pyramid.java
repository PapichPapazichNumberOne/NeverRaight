
public class Pyramid extends Shapes {
    public int s;
    public int h;

    public void calculateTheVolume(int s, int h) {
        double v = (double) (s * h) /3;
        System.out.println("Объём пирамиды = " + v);
    }
}