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
public class HomeProductoTecnicoPage {

    @Autowired
    public HomeProductoTecnicoPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="nabvar-burguer-menu-boton-desplegar")
    private WebElement menuPrincipal;

    @FindBy(id="nabvar-burguer-menu-boton-productos-tecnicos")
    private WebElement menuProductoTecnico;

    //Revisar
    @FindBy(id="atributos-tabla-boton-mostrar-acciones-0")
    private WebElement tablaMostrarAccion;

    @FindBy(id="productos-tecnicos-boton-crear-producto-tecnico")
    private WebElement buttonCrear;

    //Revisar
    @FindBy(id="atributos-tabla-boton-editar-0")
    private WebElement tablaButtonEditar;

    //Revisar
    @FindBy(id="atributos-tabla-boton-eliminar-0")
    private WebElement tablaButtonEliminar;

}
