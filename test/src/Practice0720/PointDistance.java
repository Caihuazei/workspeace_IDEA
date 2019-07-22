package Practice0720;

public class PointDistance {
        private int x, y;
        public   PointDistance(int a, int b){
            x = a;
            y = b;
        }
        PointDistance P = new PointDistance(5,6);

        public double distance(PointDistance p){
            return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
        }
    }




