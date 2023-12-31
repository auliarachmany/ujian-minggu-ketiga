package com.ujianmingguketiga;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.ujianmingguketiga.pages.AddCart;
import com.ujianmingguketiga.pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddCart {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private AddCart addCart = new AddCart();

    private Search search = new Search();

    public TestAddCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click product dress item")
    public void user_click_product_dress_item() {
        addCart.clickDressItem();
        extentTest.log(LogStatus.PASS,"User click product dress item");
    }

    @And("User choose product dress color")
    public void user_choose_product_dress_color() {
        addCart.chooseColor("black");
        extentTest.log(LogStatus.PASS,"User choose product dress color");
    }

    @And("User choose product dress size")
    public void user_choose_product_dress_size() {
        addCart.chooseSize("large");
        extentTest.log(LogStatus.PASS, "User choose product dress size");
    }

    @And("User click button add cart on dress product")
    public void user_click_button_add_cart_on_dress_product() {
        addCart.clickBtnAddCart();
        extentTest.log(LogStatus.PASS,"User click button add cart on dress product");
    }

    @And("User click icon cart for dress view")
    public void user_click_icon_cart_for_dress_view() {
        addCart.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click icon cart for dress view");
    }

    @Then("Showing dress product after add cart")
    public void showing_dress_product_after_add_cart() {
        Assert.assertTrue(addCart.getTxtDressProductItem().contains("DRESS"));
        extentTest.log(LogStatus.PASS,"Showing dress product after add cart");
    }

}
