package co.com.choucair.certification.proyectobasegaspar.tasks;

import co.com.choucair.certification.proyectobasegaspar.userinterface.NewUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class NewUser implements Task {


    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strBirthdayMonth;
    private String strBirthdayDay;
    private String strBirthdayYear;

    private String strZip;

    private String strPassword;
    private String strConfirmPassword;


    public NewUser(String strFirstName, String strLastName, String strEmailAddress, String strBirthdayMonth, String strBirthdayDay, String strBirthdayYear, String strZip, String strPassword, String strConfirmPassword) {
        this.strFirstName=strFirstName;
        this.strLastName=strLastName;
        this.strEmailAddress=strEmailAddress;
        this.strBirthdayMonth=strBirthdayMonth;
        this.strBirthdayDay=strBirthdayDay;
        this.strBirthdayYear=strBirthdayYear;
        this.strZip=strZip;
        this.strPassword=strPassword;
        this.strConfirmPassword=strConfirmPassword;


    }

    public static NewUser onThePage(String strFirstName, String strLastName, String strEmailAddress, String strBirthdayMonth, String strBirthdayDay, String strBirthdayYear, String strZip, String strPassword, String strConfirmPassword) {

        return Tasks.instrumented(NewUser.class,strFirstName,strLastName,strEmailAddress,strBirthdayMonth,strBirthdayDay,strBirthdayYear, strZip,strPassword, strConfirmPassword);
    }
    @Override
    public <T extends Actor >void performAs (T actor){
        actor.attemptsTo(Click.on(NewUserPage.JOIN_TODAY_BUTTON),
            Enter.theValue(strFirstName).into(NewUserPage.FIRSTNAME),
            Enter.theValue(strLastName).into(NewUserPage.LASTNAME),
            Enter.theValue(strEmailAddress).into(NewUserPage.EMAILADDRESS),
            Enter.theValue(strBirthdayMonth).into(NewUserPage.BIRTHDAYRMONTH),
            Enter.theValue((strBirthdayDay)).into(NewUserPage.BIRTHDAYDAY),
            Enter.theValue((strBirthdayYear)).into(NewUserPage.BIRTHDAYYEAR),
            Click.on(NewUserPage.NEXT_LOCATION_BUTTON),
            Enter.theValue((strZip)).into(NewUserPage.ZIP),
            Click.on(NewUserPage.NEXT_DEVICE_BUTTON),
            Click.on(NewUserPage.NEXT_LAST_SETUP_BUTTON),
            Enter.theValue((strPassword)).into(NewUserPage.PASSWORD),
            Enter.theValue((strConfirmPassword)).into(NewUserPage.CONFIRMPASSWORD),
            Click.on(NewUserPage.TERMSOFUSE),
            Click.on(NewUserPage.PRIVACYPOLICITY)
                );
    }
}
