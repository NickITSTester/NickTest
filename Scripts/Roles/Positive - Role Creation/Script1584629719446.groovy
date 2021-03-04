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

WebUI.click(findTestObject('Roles/Role Creation/a_more'))

WebUI.click(findTestObject('Roles/Role Creation/a_Roles'))

WebUI.click(findTestObject('Roles/Role Creation/div_Add Role'))

WebUI.setText(findTestObject('Roles/Role Creation/input_Name_roleName'), '^Katalon Role')

WebUI.setText(findTestObject('Roles/Role Creation/textarea_Description_roleDesc'), 'This is me Role')

WebUI.click(findTestObject('Roles/Role Creation/a_Save'))

WebUI.verifyElementText(findTestObject('Roles/Role Creation/div_Successfully created'), 'Successfully created role')

WebUI.click(findTestObject('Roles/Role Creation/img'))

WebUI.click(findTestObject('Roles/Role Creation/img_1'))

WebUI.closeBrowser()

