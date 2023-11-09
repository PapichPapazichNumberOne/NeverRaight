public class Cube extends Shapes {
    public int a;


    public void calculateTheVolume(int a) {
       double v = Math.pow(a,3);
        System.out.println("Объём куба = " + v);
    }
}