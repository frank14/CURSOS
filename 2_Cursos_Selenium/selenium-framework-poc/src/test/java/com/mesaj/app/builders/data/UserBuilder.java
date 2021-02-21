package com.mesaj.app.builders.data;

import com.mesaj.app.models.User;

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
                .username("admin")
                .password("admin")
                .build();
        return this;
    }

    public User build() {
        return this.user;
    }

}
