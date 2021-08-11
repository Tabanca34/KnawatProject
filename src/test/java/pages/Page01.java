package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;




    public class Page01 {
        public Page01() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "(//a[@class='login'])[1]")
        public WebElement singButonu;

        @FindBy(xpath = "(//input[@type='text'])[2]")
        public WebElement email;

        @FindBy(xpath = "(//button[@id='SubmitCreate'])[1]")
        public WebElement createButtonu;

        @FindBy(id = "uniform-id_gender1")
        public WebElement titleButonu;

        @FindBy(id = "customer_firstname")
        public WebElement firstName;

        @FindBy(id = "customer_lastname")
        public WebElement lastName;

        @FindBy(xpath = "(//input[@id='email'])[4]")
        public WebElement emailBox;


        @FindBy(xpath = "(//input[@id='passwd'])[3]")
        public WebElement passwordBox;

        @FindBy(id = "days")
        public WebElement dateOfDay;

        @FindBy(id = "months")
        public WebElement dateOfMonths;

        @FindBy(id = "years")
        public WebElement dateOfYears;

        @FindBy(id = "newsletter")
        public WebElement singUpBox;

        @FindBy(id = "optin")
        public WebElement receiveBox;

        @FindBy(id = "firstname")
        public WebElement addressNameBox;

        @FindBy(id = "lastname")
        public WebElement addressLastNameBox;

        @FindBy(id = "company")
        public WebElement companyBox;

        @FindBy(id = "address1")
        public WebElement address1Box;

        @FindBy(id = "(address2")
        public WebElement address2Box;

        @FindBy(id = "city")
        public WebElement cityBox;

        @FindBy(id = "id_state")
        public WebElement stateBox;

        @FindBy(id = "postcode")
        public WebElement postcodeBox;

        @FindBy(id = "id_country")
        public WebElement additionalBox;

        @FindBy(xpath = "(//textarea[@id='other'])")
        public WebElement getAddress1Box;

        @FindBy(id = "phone")
        public WebElement homePhoneBox;

        @FindBy(id = "phone_mobile")
        public WebElement mobilePhoneBox;

        @FindBy(id = "alias")
        public WebElement aliasAddressBox;

        @FindBy(linkText = "(//i[@class='icon-chevron-right right'])[3]")
        public WebElement registerButton;
    }
