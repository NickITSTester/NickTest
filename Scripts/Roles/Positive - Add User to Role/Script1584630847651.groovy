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

WebUI.click(findTestObject('Roles/Add User/a_more'))

WebUI.click(findTestObject('Roles/Add User/a_Roles'))

WebUI.click(findTestObject('Roles/Add User/a_Katalon Role'))

WebUI.click(findTestObject('Roles/Add User/a_Add Users'))

WebUI.setText(findTestObject('Roles/Add User/input_Search_prsearch'), 'SmoketestStudent')

WebUI.delay(2)

WebUI.click(findTestObject('Roles/Add User/input_Total 1_userAdd'))

WebUI.click(findTestObject('Roles/Add User/a_Add'))

WebUI.verifyElementText(findTestObject('Object Repository/Roles/Add User/div_User(s) added successfully'), 'User(s) added successfully.')

WebUI.click(findTestObject('Roles/Add User/button_OK'))

WebUI.click(findTestObject('Roles/Add User/img_1'))

WebUI.closeBrowser()

