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

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/a_Users'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/a_Create New User'))

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Name_fn'), 'Already')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Name_ln'), 'Existing')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Name_mn'), 'R')

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/a_Edit'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/div_NGA OQ'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/button_Save Changes'))

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Username_un'), 'SmoketestStudent')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Password_pw'), 'AlreadyHere123')

WebUI.setText(findTestObject('Object Repository/Create User/User exists in Company/input_Email_e'), 'no-reply@its-training.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create User/User exists in Company/select_--Select Role--Company ManagerEvalua_de2d05'), 
    '21854', true)

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/input_Notification_emailnotif'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/button_Save'))

WebUI.verifyElementText(findTestObject('Create User/User exists in Company/div_error message'), 'Oops, there was a problem. [Oops, a user with that username already exists. Please choose another username.]')

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/img'))

WebUI.click(findTestObject('Object Repository/Create User/User exists in Company/img_1'))

WebUI.closeBrowser()

