package com.mesaj.app.tasks;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.enums.Hobbie;
import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.SignUpServices;
import com.mesaj.app.util.RandomEmailGenerator;
import com.mesaj.app.util.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {

    @Autowired
    private SignUpServices signUp;

    public void withInfo(User user){

        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeAddress(user.getAddress());
        signUp.writeEmail(RandomEmailGenerator.get());
        signUp.selectGender(user.getGender());
        signUp.selectHobbie(user.getHobbie());
        signUp.writePhone(RandomNumberGenerator.get());
        signUp.selectSkill(user.getSkill());
        signUp.selectCountry(user.getCountry());
        signUp.selectBirthDay(user.getBirthDay());
        signUp.selectBirthMonth(user.getBirthMonth());
        signUp.selectBirthYear(user.getBirthYear());
        signUp.writePassword(user.getPassword());
        signUp.writeConfirmPassword(user.getPasswordConfirmation());

        //signUp.clickOnSubmit();
    }

}
