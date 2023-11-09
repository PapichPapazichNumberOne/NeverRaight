
public class Ball extends Shapes {
    public int r;

    public void calculateTheVolume(int r) {
        double v = (4/3) * Math.PI * Math.pow(r,3);
        System.out.println("Объём шара = " + v);
    }
}