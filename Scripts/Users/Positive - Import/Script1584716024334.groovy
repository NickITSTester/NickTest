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

WebUI.click(findTestObject('Users/Import User/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Users/Import User/input'), 'Smoketest Company Client')

WebUI.click(findTestObject('Users/Import User/span_Smoketest Company Client'))

WebUI.click(findTestObject('Users/Import User/a_Users'))

WebUI.click(findTestObject('Users/Import User/a_Import User'))

WebUI.click(findTestObject('Users/Import User/div_NGA OQ'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.setText(findTestObject('Users/Import User/input_Series_searchUsers'), GlobalVariable.NewUser)

WebUI.click(findTestObject('Users/Import User/button_Series_searchUserButton'))

WebUI.click(findTestObject('Users/Import User/div_Tester Auto R (KatalonTester001)'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.click(findTestObject('Users/Import User/div_Student'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.click(findTestObject('Users/Import User/button_Import'))

WebUI.click(findTestObject('Users/Import User/button_Yes'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Users/Import User/div_StatusMessage'), 'User imported successfully!')

WebUI.click(findTestObject('Users/Import User/span_'))

WebUI.click(findTestObject('Users/Import User/a_Import User'))

WebUI.click(findTestObject('Users/Import User/div_NGA OQ'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.setText(findTestObject('Users/Import User/input_Series_searchUsers'), GlobalVariable.NewUser2)

WebUI.click(findTestObject('Users/Import User/button_Series_searchUserButton'))

WebUI.click(findTestObject('Users/Import User/div_Test Katalon (SampleKatalonTester001)'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.click(findTestObject('Users/Import User/div_Student'))

WebUI.click(findTestObject('Users/Import User/button_Next'))

WebUI.click(findTestObject('Users/Import User/button_Import'))

WebUI.click(findTestObject('Users/Import User/button_Yes'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Users/Import User/div_StatusMessage'), 'User imported successfully!')

WebUI.click(findTestObject('Users/Import User/span_'))

WebUI.click(findTestObject('Users/Import User/img'))

WebUI.closeBrowser()

