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

WebUI.click(findTestObject('Create User/User Creation/a_Users'))

WebUI.click(findTestObject('Create User/User Creation/a_Create New User'))

WebUI.setText(findTestObject('Create User/User Creation/input_Name_fn'), 'Auto')

WebUI.setText(findTestObject('Create User/User Creation/input_Name_ln'), 'Tester')

WebUI.setText(findTestObject('Create User/User Creation/input_Name_mn'), 'R')

WebUI.click(findTestObject('Create User/User Creation/a_Edit'))

WebUI.click(findTestObject('Create User/User Creation/div_NGA OQ'))

WebUI.click(findTestObject('Create User/User Creation/button_Save Changes'))

WebUI.setText(findTestObject('Create User/User Creation/input_Username_un'), GlobalVariable.NewUser)

WebUI.click(findTestObject('Create User/User Creation/div_Name                            Middle _978ef8'))

WebUI.setText(findTestObject('Create User/User Creation/input_Password_pw'), 'ITSTester@123')

WebUI.setText(findTestObject('Create User/User Creation/input_Email_e'), 'no-reply@its-training.com')

WebUI.selectOptionByValue(findTestObject('Create User/User Creation/select_--Select Role--Company ManagerEvalua_de2d05'), 
    '21854', true)

WebUI.click(findTestObject('Create User/User Creation/input_Notification_emailnotif'))

WebUI.click(findTestObject('Create User/User Creation/button_Save'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Create User/User Creation/a_User created successfully )'))

WebUI.click(findTestObject('Create User/User Creation/button_Ok'))

WebUI.click(findTestObject('Create User/User Creation/img'))

WebUI.click(findTestObject('Create User/User Creation/a_Users'))

WebUI.setText(findTestObject('Create User/User Creation/input_SearchStatus_studentsearch'), GlobalVariable.NewUser)

WebUI.closeBrowser()

