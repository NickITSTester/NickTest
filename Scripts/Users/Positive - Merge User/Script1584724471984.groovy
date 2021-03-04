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

WebUI.click(findTestObject('Object Repository/Users/Merge User/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/Users/Merge User/input'), 'Smoketest Company Client')

WebUI.click(findTestObject('Object Repository/Users/Merge User/span_Smoketest Company Client'))

WebUI.click(findTestObject('Object Repository/Users/Merge User/a_Users'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Users/Merge User/input_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Users/Merge User/checkbox'))

WebUI.click(findTestObject('Object Repository/Users/Merge User/a_Merge Users'))

WebUI.click(findTestObject('Object Repository/Users/Merge User/a_Merge User'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Users/Merge User/img'))

WebUI.closeBrowser()

