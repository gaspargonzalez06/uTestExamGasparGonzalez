package co.com.choucair.certification.proyectobasegaspar.userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewUserPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON =Target.the("button that shows us the form to Login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Ingresar')]"));

    public static final Target FIRSTNAME =Target.the("where do we write the user First Name").located(By.id("fisrtname"));
    public static final Target LASTNAME =Target.the("where do we write the User Last Name ").located(By.id("lastname"));
    public static final Target EMAILADDRESS = Target.the("where do we write the Email address").located(By.id("emaliladdress"));
    public static final Target BIRTHDAYRMONTH = Target.the("where do we write the Birthday Month").located(By.id("birthdaymonth"));
    public static final Target BIRTHDAYDAY= Target.the("where do we write the Birthday Day").located(By.id("birthdayday"));
    public static final Target BIRTHDAYYEAR = Target.the("where do we write the Birthday Year").located(By.id("birthdayyear"));

    public static final Target NEXT_LOCATION_BUTTON =Target.the("button that shows us the form for the 2 step into to the Login Creation").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Location')]"));

    public static final Target ZIP =Target.the("where do we write the user ZIP").located(By.id("ZIP"));
    public static final Target NEXT_DEVICE_BUTTON =Target.the("button that shows us the form for the 3 step into to the Login Creation").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Device')]"));

    public static final Target NEXT_LAST_SETUP_BUTTON =Target.the("button that shows us the form for the 4 step into to the Login Creation").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Last Setup')]"));
    public static final Target PASSWORD =Target.the("where do we write the user password").located(By.id("Password"));
    public static final Target CONFIRMPASSWORD =Target.the("where do we write the user Confirm password").located(By.id("ConfirmPassword"));
    public static final Target TERMSOFUSE =Target.the(" Where do we Select  for accept the terms of use").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Last Setup')]"));
    public static final Target PRIVACYPOLICITY =Target.the("Where do we Select  for accept the Privacy policity").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Next:Last Setup')]"));




}