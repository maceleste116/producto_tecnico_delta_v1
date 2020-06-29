package qa.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;
import qa.conf.DriverConfig;

@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
public class ProductoTecnicoStepDefs {

    @Given("actuario quiere crear producto tecnico con datos requeridos")
    public void actuario_quiere_crear_producto_tecnico_con_datos_requeridos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("actuario ingresa datos producto tecnico requeridos")
    public void actuario_ingresa_datos_producto_tecnico_requeridos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("actuario tiene producto tecnico creado")
    public void actuario_tiene_producto_tecnico_creado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
