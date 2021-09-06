package Practise2;

public class Author {
    private String name;
    private String email;
    private char gender;
    private String genderUpdated;


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        switch (gender) {
            case 'F':
                this.genderUpdated = "ms";
                break;
            case 'M':
                this.genderUpdated = "m";
                break;
            case 'U':
                this.genderUpdated = "Ns";
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + '('+genderUpdated+')' + " at " + email ;
    }
}
