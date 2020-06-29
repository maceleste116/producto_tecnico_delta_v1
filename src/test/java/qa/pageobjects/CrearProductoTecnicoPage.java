package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CrearProductoTecnicoPage {

    @Autowired
    public CrearProductoTecnicoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="productos-tecnico-input-codigo")
    private WebElement inputCrearCodigo;

    @FindBy(id="productos-tecnico-input-descripcion")
    private WebElement inputCrearDescripcion;

    @FindBy(id="productos-tecnico-select-estado")
    private WebElement selectCrearEstado;

    @FindBy(id="productos-tecnico-input-nombre")
    private WebElement inputCrearNombre;

    @FindBy(id="productos-tecnico-select-ramo")
    private WebElement selectCrearRamo;

    @FindBy(id="producto-tecnico-boton-confirmar-producto-tecnico")
    private WebElement buttonCrearConfirmar;

    //Revisar
    @FindBy(css=".modal-body")
    private WebElement mensaje;


}
