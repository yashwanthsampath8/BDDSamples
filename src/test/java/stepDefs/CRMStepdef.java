package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepdef {

	@Before(value = "@RegressionTest", order = 1)
	public void initiaizeChrome() {
		System.out.println("initiaizeChrome");
	}
	@Given("User must have logged in")
	public void user_must_have_logged_in() {
	    System.out.println("User must have logged in");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}
	
	@When("User view a contact details")
	public void user_view_a_contact_details() {
		System.out.println("User view a contact details");
	}
	
	@When("User edit a contact details")
	public void user_edit_a_contact_details() {
		System.out.println("User edit a contact details");
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}

	@When("User create a new deals")
	public void user_create_a_new_deals() {
		System.out.println("User create a new deals");
	}
	
	@When("User view a deals details")
	public void user_view_a_deals_details() {
		System.out.println("User view a deals details");
	}
	
	@When("User edit a deals details")
	public void user_edit_a_deals_details() {
		System.out.println("User edit a deals details");
	}

	@When("User delete a deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a deals");
	}

	@When("User create a new tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new tasks");
	}
	
	@When("User view a tasks details")
	public void user_view_a_tasks_details() {
		System.out.println("User view a tasks details");
	}
	
	@When("User edit a tasks details")
	public void user_edit_a_tasks_details() {
		System.out.println("User edit a tasks details");
	}

	@When("User delete a tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a tasks");
	}
}
