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

WebUI.click(findTestObject('Cost Centers/Add User/a_more'))

WebUI.click(findTestObject('Cost Centers/Add User/a_Cost Centers'))

WebUI.click(findTestObject('Cost Centers/Add User/a_Katalon Test Center'))

WebUI.click(findTestObject('Cost Centers/Add User/div_Add User'))

WebUI.setText(findTestObject('Cost Centers/Add User/input_Search_studsearch'), 'SmoketestStudent')

WebUI.delay(2)

WebUI.click(findTestObject('Cost Centers/Add User/span_Student Smoketest (smoketestStudent  404142) (Smoketest Company)'))

WebUI.click(findTestObject('Cost Centers/Add User/a_OK'))

WebUI.verifyElementText(findTestObject('Cost Centers/Add User/div_Successfully added'), 'Successfully added.')

WebUI.click(findTestObject('Cost Centers/Add User/img'))

WebUI.click(findTestObject('Cost Centers/Add User/img_1'))

WebUI.closeBrowser()

