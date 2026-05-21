public class Customer {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String password;

    public Customer(int id, String name, int age, String gender, String phone, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }


}
