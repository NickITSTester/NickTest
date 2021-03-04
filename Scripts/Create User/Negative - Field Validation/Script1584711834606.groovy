import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://learn.its-training.com/Login.aspx')

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestCompanyManager, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/a_Users'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/a_Create New User'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/input_Notification_emailnotif'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Marked fields cannot be blank'), 
    'Marked fields cannot be blank.')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Ok'))

WebUI.setText(findTestObject('Object Repository/Create User/Field Validation/input_Name_fn'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Create User/Field Validation/input_Name_ln'), 'Test')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Marked fields cannot be blank'), 
    'Marked fields cannot be blank.')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Ok'))

WebUI.setText(findTestObject('Object Repository/Create User/Field Validation/input_Username_un'), GlobalVariable.NewUser2)

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Marked fields cannot be blank'), 
    'Marked fields cannot be blank.')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Ok'))

WebUI.setText(findTestObject('Object Repository/Create User/Field Validation/input_Password_pw'), 'ITSTester@123')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Marked fields cannot be blank'), 
    'Marked fields cannot be blank.')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Ok'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/div_Name                            Middle _4caca4'))

WebUI.setText(findTestObject('Object Repository/Create User/Field Validation/input_Email_e'), 'no-reply@its-training.com')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Oops there was a problem User must be assigned a role'), 
    'Oops, there was a problem. [User must be assigned a role!]')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/img-error'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create User/Field Validation/select_--Select Role--Katalon RoleCompany M_8bb9e8'), 
    '21854', true)

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/Field Validation/div_Oops there was a problem User must be assigned a role'), 
    'Oops, there was a problem. [Must select a series]')

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/img-error'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/a_Edit'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/div_NGA OQ'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Save'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Create User/User Creation/a_User created successfully )'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/button_Ok_1'))

WebUI.click(findTestObject('Object Repository/Create User/Field Validation/img'))

WebUI.closeBrowser()

