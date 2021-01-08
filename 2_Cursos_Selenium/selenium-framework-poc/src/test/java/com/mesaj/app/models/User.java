package com.mesaj.app.models;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.enums.Hobbie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private Gender gender;
    private Hobbie hobbie;
    private String skill;
    private String country;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String password;
    private String passwordConfirmation;

}
