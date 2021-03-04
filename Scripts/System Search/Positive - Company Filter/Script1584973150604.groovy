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

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPassProd)

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/a_Users'))

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/a_System Search'))

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/a_Change'))

WebUI.setText(findTestObject('Object Repository/System Search/Company Filter/input_Search_cmpsearch'), 'Industrial Training Services')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/input'))

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/a_OK'))

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/a_Go'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/System Search/Company Filter/td_Industrial Training Services Inc'), 
    'Industrial Training Services, Inc.')

WebUI.click(findTestObject('Object Repository/System Search/Company Filter/img'))

WebUI.closeBrowser()

