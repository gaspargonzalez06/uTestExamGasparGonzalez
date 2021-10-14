package co.com.choucair.certification.proyectobasegaspar.tasks;

import co.com.choucair.certification.proyectobasegaspar.userinterface.SearchConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {
    private String Confirmpage;

    public Search(String Confirmpage) {
        this.Confirmpage=Confirmpage;
    }

    public static Search the(String Confirmpage) {return Tasks.instrumented(Search.class,Confirmpage);}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(SearchConfirmationPage.COMPLETE_SETUP_BUTTON)

        );


    }
}