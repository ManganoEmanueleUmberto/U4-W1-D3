package Exercise_3;

import java.util.Random;

public class Cliente {
    private String customerCode;
    private String name;
    private String surname;
    private String email;
    private String registrationDate;

    public Cliente(String name, String surname, String email, String registrationDate) {
        Random rndm = new Random();
        int idCode = rndm.nextInt(100000, 900000);
        customerCode = String.valueOf(idCode);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
