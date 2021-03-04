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

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_Roles'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_Katalon Role'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/img'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Roles/Remove Task/div_removed message'), 'Task(s) removed from role')

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/button_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/img_1'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/i_Smoketest Manager_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPassProd)

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/Roles/Remove Task/input'), 'Smoketest Company')

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/span_Smoketest Company'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/a_Series'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/label_ViewEdit'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/input_Allow failed skills to associated to _0f7bd5'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/button_Save'))

WebUI.click(findTestObject('Object Repository/Roles/Remove Task/img_1'))

WebUI.closeBrowser()

