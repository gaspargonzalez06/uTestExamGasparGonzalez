package co.com.choucair.certification.proyectobasegaspar.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;





public class SearchConfirmationPage extends PageObject {


    public static final Target COMPLETE_SETUP_BUTTON =Target.the("button that shows us the form for the 4 step into to the Login Creation").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Complete Setup')]"));
    public static final Target PAGE =Target.the("where do we write the user First Name").located(By.id("page"));


}