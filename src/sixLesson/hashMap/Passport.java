package sixLesson.hashMap;


import java.util.Objects;

public class Passport {

    private String pass;


    public Passport(String valuePass) {

        pass = valuePass;

    }

    String getPass() {
        return pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(pass, passport.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pass);
    }
}