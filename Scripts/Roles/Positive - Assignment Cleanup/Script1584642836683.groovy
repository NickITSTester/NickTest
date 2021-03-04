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

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/Roles/Assignment Cleanup/input'), 'Smoketest Company')

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/span_Smoketest Company'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Users'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Student Smoketest (smoketestStudent  404142)'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_View Enrolled Courses'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Change'))

WebUI.setText(findTestObject('Object Repository/Roles/Assignment Cleanup/input_Search_crssearch'), 'F03 EXAM (INITIAL) Joining or Capping of Polyethylene Pipe with Heat Fusion')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/input_1'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Go'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/img'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Roles/Assignment Cleanup/div_Assignment removed'), 'Assignment removed successfully')

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/img_1'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Users'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Student Smoketest (smoketestStudent  404142)'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_View Enrolled Courses'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Change'))

WebUI.setText(findTestObject('Object Repository/Roles/Assignment Cleanup/input_Search_crssearch'), '02-07')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/input_1'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/a_Go'))

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/img'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Roles/Assignment Cleanup/div_Assignment removed'), 'Assignment removed successfully')

WebUI.click(findTestObject('Object Repository/Roles/Assignment Cleanup/img_1'))

WebUI.closeBrowser()

