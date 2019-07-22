package StaticInherit;

public class manager extends employee{
    private int bonus;

    public manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
    @Override
    public int getMoney(){
        return getsalary()+getBonus();
    }

}
