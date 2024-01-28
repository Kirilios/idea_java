package OOPSeminars.Seminar4.model;

public class User {

    //поля приватные, что соотвествует принципу инкапсуляции
    //наследники зависят от user, а не наоборот соответсвуя DIP
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }


    public void setFirstName(String firstName) {

        if(isValidName(firstName)){
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("wrong first name");
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if(isValidName(secondName)){
            this.secondName = secondName;
        } else {
            throw new IllegalArgumentException("wrong second name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(isValidName(lastName)){
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("wrong last name");
        }
    }

    private boolean isValidName(String name){
        // добавил проверку на правильность имени, согласно принципу единой ответвенности, улучшив тестируемость
        return name != null && !name.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + getFirstName()+ '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
