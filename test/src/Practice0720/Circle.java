package Practice0720;

public class Circle {
    private int r;
    public void Circle(int r){
        this.r = r;
    }
    double Perimeter(){
        return  2 * Math.PI * r;
    }
    double mj (){
        return (Math.PI * r * r) / 2;
    }
}

