package StepDefinitionFiles.NYFaculty;

import NauWebProject.Base;
import PageObjects.FacultyStaff;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NYFaculty extends Base {

    @Given("^User navigates to the main page \"([^\"]*)\"$")
    public void user_navigates_to_the_main_page(String arg1) throws Throwable {
        seleniumUtil.goToPage(arg1);
    }

    @When("^User hover over on Faculty&Staff button on menu$")
    public void user_hover_over_on_Faculty_Staff_button_on_menu() throws Throwable {
        new FacultyStaff().hoverOver();
    }

    @Then("^Button color changes$")
    public void button_color_changes() throws Throwable {
        new FacultyStaff().verifyColorChange();
    }

    @Then("^Button is clickable$")
    public void button_is_clickable() throws Throwable {
        new FacultyStaff().isButtonClickable();
    }

    @When("^User hover over Faculty&Staff button on menu$")
    public void user_hover_over_Faculty_Staff_button_on_menu() throws Throwable {
        new FacultyStaff().hoverOver();
    }

    @Then("^Dropdown menu is visible$")
    public void dropdown_menu_is_visible() throws Throwable {
        new FacultyStaff().isDropdownVisible();
    }

    @When("^User clicks Faculty&Staff button on menu$")
    public void user_clicks_Faculty_Staff_button_on_menu() throws Throwable {

    }

    @Then("^User navigates to respective page$")
    public void user_navigates_to_respective_page() throws Throwable {

    }

}
