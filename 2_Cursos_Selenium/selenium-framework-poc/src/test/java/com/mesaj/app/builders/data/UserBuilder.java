package com.mesaj.app.builders.data;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.enums.Hobbie;
import com.mesaj.app.models.User;
import com.mesaj.app.util.RandomEmailGenerator;
import com.mesaj.app.util.RandomNumberGenerator;

public class UserBuilder {

    private User user;

    private UserBuilder() {
        user = User.builder().build();
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder but() {
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo() {
        this.user = User.builder()
                .firstName("Francisco")
                .lastName("Cabezas")
                .address("Barrio Nuevo Bosque Conjunto residencial Nuevo Bosque Casa 9c")
                .email(RandomEmailGenerator.get())
                .phone(RandomNumberGenerator.get())
                .gender(Gender.male)
                .hobbie(Hobbie.cricket)
                .hobbie(Hobbie.movies)
                .skill("SQL")
                .country("Colombia")
                .birthDay("14")
                .birthMonth("January")
                .birthYear("1994")
                .password("P@ssw0rd")
                .passwordConfirmation("P@ssw0rd")
                .build();
        return this;
    }

    public UserBuilder withoutBirthDay() {
        user.setBirthDay("");
        return this;
    }

    public User build() {
        return this.user;
    }

}
