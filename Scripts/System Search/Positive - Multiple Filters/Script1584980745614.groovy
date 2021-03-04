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

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/a_Users'))

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/a_System Search'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/System Search/Multiple Filters/select_-- Select --ActiveInActive'), 
    '1', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/System Search/Multiple Filters/select_-- Select --EnabledDisabled'), 
    '1', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/a_Change'))

WebUI.doubleClick(findTestObject('Object Repository/System Search/Multiple Filters/div_Search Refresh list'))

WebUI.setText(findTestObject('Object Repository/System Search/Multiple Filters/input_Search_cmpsearch'), 'Industrial Training Services')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/input'))

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/a_OK'))

WebUI.setText(findTestObject('Object Repository/System Search/Multiple Filters/input_Email_emailfil'), 'no-reply@its-training.com')

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/a_Go'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/System Search/Multiple Filters/td_no-replyits-trainingcom'),'no-reply@its-training.com')

WebUI.verifyElementText(findTestObject('Object Repository/System Search/Multiple Filters/td_Industrial Training Services Inc'),'Industrial Training Services, Inc.')

WebUI.verifyElementText(findTestObject('Object Repository/System Search/Multiple Filters/td_Active'),'Active')

WebUI.verifyElementText(findTestObject('Object Repository/System Search/Multiple Filters/td_Enabled'),'Enabled')

WebUI.click(findTestObject('Object Repository/System Search/Multiple Filters/img'))

WebUI.closeBrowser()

