package com.mesaj.app.tasks;

import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {

    @Autowired
    private LoginServices signUp;

    public void withInfo(User user){
        signUp.writeUserName(user.getUsername());
        signUp.writePassword(user.getPassword());
        signUp.clickOnSubmit();
    }

}
