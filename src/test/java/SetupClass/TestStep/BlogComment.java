package SetupClass.TestStep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Date;
import java.sql.Driver;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;

import SetupClass.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class BlogComment extends Setup {

	
	@Given("^user is already on blog form$")
	public void user_is_already_on_blog_form() throws Throwable {
		Thread.sleep(1000);
		driver.get("https://www.slideteam.net/blog/using-these-smart-goals-can-increase-your-impact-as-a-marketer/");
		Thread.sleep(1000);
	}

	@Then("^user enter name on blog form$") 
	public void user_enter_name_on_blog_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("author")).sendKeys("SlideTeam Testing");
		Thread.sleep(1000);
	}

	@Then("^user enter email on blog form$")
	public void user_enter_email_on_blog_form() throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("slidetech.qa@gmail.com");
		Thread.sleep(1000);
	}
	
	@Then("^user enter comment on blog form$")
	public void user_enter_comment_on_blog_form()throws Throwable {
		Thread.sleep(1000);
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z"); 
	    Date date = new Date(System.currentTimeMillis());  
	    message_write_time=formatter.format(date);
	    System.out.println(Button_Click_Time);  
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore."+ "\n"+ ""+""+
								"Page URL is:-> https://www.slideteam.net/blog/using-these-smart-goals-can-increase-your-impact-as-a-marketer/"+"\n"+ ""+""+
								"Current Time is:->"+message_write_time);		
		Thread.sleep(1000);
	}

	@Then("^user click on Submit button on blog form$")
	public void user_click_on_Submit_button_on_blog_form()throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("post-the-comment")).submit();
		Thread.sleep(1000);
		System.out.print("form is submitted at:->> ");
	    //System.out.println(System.currentTimeMillis()/1000);
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z"); 
	    Date date = new Date(System.currentTimeMillis());  
	    Button_Click_Time=formatter.format(date);
	    System.out.println(Button_Click_Time);  
	    Thread.sleep(1000);
		
	}
	
	
}
