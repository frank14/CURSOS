package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.pageactions.HomeActions;
import com.mesaj.app.pageactions.LoginActions;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class LoginStepDefs {

    @Autowired
    private UserLogin login;

    @Autowired
    private HomeActions homeActions;

    @Autowired
    private LoginActions loginActions;

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private WebDriver driver;

    @Given("un usuario administrativo quiere acceder a su cuenta en la plataforma TRONOS-EIGHT")
    public void un_usuario_administrativo_quiere_acceder_a_su_cuenta_en_la_plataforma_TRONOS_EIGHT() {
        navigate.loginPage();
    }

    @When("el usuario envie su nombre de usuario y password validos")
    public void el_usuario_envie_su_nombre_de_usuario_y_password_validos() {
        login.withInfo(
                UserBuilder
                        .anUser()
                        .but()
                        .build()
        );
    }

    @Then("el sistema debe redireccionarlo a la ventana principal")
    public void el_sistema_debe_redireccionarlo_a_la_ventana_principal() {
        homeActions.clickOnProfileButton();
    }

    @And("el usuario cierra sesion")
    public void el_usuario_cierra_sesion() {
        homeActions.clickOnLogOutButton();
    }

    @When("el usuario envie su nombre de usuario y password incorrectos")
    public void el_usuario_envie_su_nombre_de_usuario_y_password_incorrectos() {
        login.withInfo(
                UserBuilder
                        .anUser()
                        .but()
                        .changeUsername()
                        .build()
        );
    }

    @Then("el sistema debe mostrarle un mensaje de error")
    public void el_sistema_debe_mostrarle_un_mensaje_de_error() {
        loginActions.alertErrorMessage();
    }

}
