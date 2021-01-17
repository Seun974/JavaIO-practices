package se.lexicon.samuel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Owner_register implements Serializable {

    private UUID ownerId;
    private String name;
    private LocalDate birthday;

    public Owner_register(String name, LocalDate birthday) {
        this.ownerId = UUID.randomUUID();
        this.name = name;
        this.birthday = birthday;
    }
    Owner_register(){

    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Owner_register{" +
                "ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner_register that = (Owner_register) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, name, birthday);
    }
}
