public class Employees {
    private String name; //имя сотрудника
    private String post; //должность сотрудника
    private String email;//почта сотрудника
    private String telephone;//телефон сотрудника
    private int salary; //зарплата сотрудника
    private int age; //возраст сотрудника

    public Employees(String name, String post, String email, String telephone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("Имя сотрудника: " + name);
        System.out.println("должность: " + post);
        System.out.println("почта: " + email);
        System.out.println("телефон: " + telephone);
        System.out.println("зарплата: " + salary);
        System.out.println("возраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
