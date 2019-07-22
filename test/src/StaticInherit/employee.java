package StaticInherit;

public abstract class employee {
    private String name;
    private int age;
    private int salary;
//更改信息
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    //获取信息
    public int getAge() {
        return age;
    }

    public int getsalary() {
        return salary;
    }
//初始化
    public employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //计算工资

   public abstract int getMoney();


}
