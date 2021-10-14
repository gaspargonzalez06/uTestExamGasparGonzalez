package co.com.choucair.certification.proyectobasegaspar.stepdefinitions;

import co.com.choucair.certification.proyectobasegaspar.model.uTestData;
import co.com.choucair.certification.proyectobasegaspar.questions.Answer;
import co.com.choucair.certification.proyectobasegaspar.tasks.Search;
import co.com.choucair.certification.proyectobasegaspar.tasks.OpenUp;
import co.com.choucair.certification.proyectobasegaspar.tasks.NewUser;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestExamStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^than Mark wants to create a new user for utest.com $")
    public void thanMarkWantsTocreateAnewUserForUtest(List<uTestData> uTestData) throws Exception  {
        OnStage.theActorCalled("Mark").wasAbleTo(OpenUp.thePage(), NewUser.onThePage(uTestData.get(0).getStrFirstName(),uTestData.get(0).getStrLastName(),uTestData.get(0).getStrEmailAddress(),uTestData.get(0).getStrBirthdayMonth(),uTestData.get(0).getStrBirthdayMonth(),uTestData.get(0).getStrBirthdayYear(),uTestData.get(0).getStrZip(),uTestData.get(0).getStrPassword(),uTestData.get(0).getStrConfirmPassword()));

    }

    @When("^he finish the form the system search the confirmation Page$")
    public void heFinishTheFormTheSystemSearchTheConfirmationPage(List<uTestData>uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(uTestData.get(0).getStrConfirmpage()));

    }

    @Then("^he finds the confirmation Page $")
    public void heFindsTheConfirmationPage(List<uTestData>uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrConfirmpage())));

    }

}
