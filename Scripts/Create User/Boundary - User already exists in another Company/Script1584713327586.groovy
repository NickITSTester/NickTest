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

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/a_Users'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/a_Create New User'))

WebUI.setText(findTestObject('Object Repository/Create User/User exists in another Company/input_Name_fn'), 'Nick')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in another Company/input_Name_ln'), 'Sheehan')

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/a_Edit'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/div_NGA OQ'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/button_Save Changes'))

WebUI.setText(findTestObject('Object Repository/Create User/User exists in another Company/input_Username_un'), 'nsheehan@its-training.com')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in another Company/input_Password_pw'), 'ITSTester@123')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in another Company/input_Email_e'), 'no-reply@its-training.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create User/User exists in another Company/select_--Select Role--Katalon RoleCompany M_8bb9e8'), 
    '21854', true)

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/input_Notification_emailnotif'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User/User exists in another Company/div_Error'), 'Oops, there was a problem. [Oops, a user with that username already exists. Please choose another username.]')

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/img'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in another Company/img_1'))

WebUI.closeBrowser()

