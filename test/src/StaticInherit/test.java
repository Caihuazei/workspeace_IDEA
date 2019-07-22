package StaticInherit;

public class test {
    public static void main(String[] args) {
        manager m = new manager("张三",18,3000,1805);
        System.out.println(m.getMoney());
        System.out.println(m.getBonus());
    }

}
