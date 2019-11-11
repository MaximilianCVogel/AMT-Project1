package amt.project1.model;

public class Person {

    private Long id;
    private String name;
    private String password;
    private String address;
    private String telephone;
    private String email;

    public Person(long id, String name, String password, String address, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
