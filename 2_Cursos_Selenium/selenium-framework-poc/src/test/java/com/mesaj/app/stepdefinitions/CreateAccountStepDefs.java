package com.mesaj.app.stepdefinitions;

import com.mesaj.app.pageactions.CreateAccountActions.ProgramaDeInteresActions;
import com.mesaj.app.pageactions.LoginActions;
import com.mesaj.app.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateAccountStepDefs {

    @Autowired
    private LoginActions loginActions;

    @Autowired
    private ProgramaDeInteresActions programaDeInteresActions;

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private WebDriver driver;

    @Given("un usuario aspirante que quiere crear su cuenta en la plataforma TRONOS-EIGHT")
    public void un_usuario_aspirante_que_quiere_crear_su_cuenta_en_la_plataforma_TRONOS_EIGHT() {
        navigate.loginPage();
    }

    @When("el usuario ingrese al formulario")
    public void el_usuario_ingrese_al_formulario() {
        loginActions.clickOnRegister();
    }

    @When("el usuario seleccione su programa de interes")
    public void el_usuario_seleccione_su_programa_de_interes() {
        programaDeInteresActions.clickOnTypeInscriptionSelect();
    }

}
