package com.objectrepository;

import org.openqa.selenium.By;

//Locators
public class Locators {

	// public final By pageName_attributeName_TypeofAttribute = By.xpath("asdfds");
	// Registration
	public final By openCart_Register_submenu = By.linkText("Register");
	public final By openCartRegister_firstname_editbox = By.name("firstname");
	public final By openCartRegister_lastname_editbox = By.name("lastname");
	public final By openCartRegister_email_editbox = By.id("input-email");
	public final By openCartRegister_telephone_editbox = By.id("input-telephone");
	public final By openCartRegister_password_editbox = By.id("input-password");
	public final By openCartRegister_confirmpassword_editbox = By.id("input-confirm");
	public final By openCartRegister_newsletter_Yes_radioButton = By.name("newsletter");
	public final By openCartRegister_newsletter_No_radioButton = By.xpath("(//input[@name='newsletter'])[2]");
	public final By openCartRegister_Agree_Checkbox = By.name("agree");
	public final By openCartRegister_Continue_button = By.xpath("//input[@value='Continue']");

	

	// Login page
	public final By openCart_MyAccount_menu = By.linkText("My Account");
	public final By openCart_Login_subMenu = By.linkText("Login");
	public final By openCartLogin_Email_editbox = By.id("input-email");
	public final By openCartLogin_Password_editbox = By.id("input-password");
	public final By openCartLogin_Submit_button = By.xpath("//input[@type='submit']");
	public final By openCartLogin_Logout_link = By.linkText("Logout");
	public final By openCartLogin_Warning_message = By.xpath("	//*[text()=' Warning: No match for E-Mail Address and/or Password.']");

	//Purchase I-phone
	public final By openCart_AddToCart_button =By.xpath("(//span[text()='Add to Cart'])[2]");
	public final By opencart_cartTotal_button=By.id("cart-total");
	public final By opencart_ViewCart_button=By.linkText("View Cart");
	public final By opencart_Checkout_link=By.linkText("Checkout");
	public final By opencart_GuestAccount_RadioButton =By.xpath("(//input[@name='account'])[2]");
	public final By opencart_button_Account=By.id("button-account");
	public final By opencart_Firstname_Editbox=By.id("input-payment-firstname");
	public final By opencart_Lastname_Editbox=By.id("input-payment-lastname");
	public final By opencart_Email_Editbox=By.id("input-payment-email");
	public final By opencart_telephone_EditBox=By.id("input-payment-telephone");
	public final By opencart_paymentCompany_Editbox=By.id("input-payment-company");
	public final By opencart_Address_1_Editbox=By.id("input-payment-address-1");
	public final By opencart_Address_2_Editbox=By.id("input-payment-address-2");
	public final By opencart_PaymentCity_Editbox=By.id("input-payment-city");
	public final By opencart_PaymentPostCode_Editobox=By.id("input-payment-postcode");
	public final By opencart_PaymentCountry_Editbox=By.id("input-payment-country");
	public final By opencart_PaymentZone_Editbox=By.id("input-payment-zone");
	public final By opencart_Button_guest=By.id("button-guest");
	public final By opencart_Button_ShippingMethod=By.id("button-shipping-method");
	public final By opencart_checkbox_button=By.xpath("(//input[@type='checkbox'])[2]");
	public final By opencart_Button_PaymentMethod=By.id("button-payment-method");
	public final By opencart_Button_Confirm=By.id("button-confirm");
	
	
	//Book the Mac desktop
	public final By opencartBooking_Desktops_menu=By.linkText("Desktops");
	public final By opencartBooking_Mac_submenu=By.xpath("//a[contains(text(),'Mac ')]");
	public final By opencartBooking_AddtoCart_button=By.xpath("//span[text()='Add to Cart']");
	public final By opencartBooking_Success_message=By.xpath("//*[contains(text(),'Success: You have added')]");
	public final By opencartBooking_Continue_button_paymentaddress = By.id("button-payment-address");
	public final By opencartBooking_Continue_button_shippingaddress = By.id("button-shipping-address");
	public final By opencartBooking_OrderPlaced_message=By.xpath("//*[contains(text(),'Your order has been placed!')]");
	public final By openCartSuccessPage_Continue_button = By.xpath("//*[text()='Continue']");
	public final By opencartBooking_checkbox_button=By.xpath("//input[@type='checkbox']");
	

	
	
	

	
	
}
