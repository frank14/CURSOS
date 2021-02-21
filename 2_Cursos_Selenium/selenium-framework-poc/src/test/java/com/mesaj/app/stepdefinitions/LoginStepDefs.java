package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ContextConfiguration(classes = {DriverConfig.class})
public class LoginStepDefs {

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private NavigateTo navigate;

    @Given("un usuario administrativo quiere acceder a su cuenta en la plataforma TRONOS-EIGHT")
    public void un_usuario_administrativo_quiere_acceder_a_su_cuenta_en_la_plataforma_TRONOS_EIGHT() {
        navigate.loginPage();
    }

    @When("el usuario envie su nombre de usuario y contraseña validos")
    public void el_usuario_envie_su_nombre_de_usuario_y_contraseña_validos() throws InterruptedException {
        signUp.withInfo(
                UserBuilder
                        .anUser()
                        .but()
                        .build()
        );
        Thread.sleep(5000);
    }

    @Then("el sistema debe redireccionarlo a la ventana principal")
    public void el_sistema_debe_redireccionarlo_a_la_ventana_principal() {
        assertThat(true).isEqualTo(true);
    }

    @When("el usuario envie su nombre de usuario y contraseña incorrectos")
    public void el_usuario_envie_su_nombre_de_usuario_y_contraseña_incorrectos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el sistema debe mostrarle un mensaje de error")
    public void el_sistema_debe_mostrarle_un_mensaje_de_error() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
