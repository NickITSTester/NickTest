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

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Qualifications'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Detailed Module Report'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_More options'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Change'))

WebUI.setText(findTestObject('Edit Record/Edit to Suspended/input_Search_studsearch'), 'SmoketestStudent')

WebUI.delay(2)

WebUI.click(findTestObject('Edit Record/Edit to Suspended/input_S_404142'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_OK'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_CourseFilter'))

WebUI.setText(findTestObject('Edit Record/Edit to Suspended/input_Search_crssearch'), 'NGA-WE-03')

WebUI.delay(2)

WebUI.click(findTestObject('Edit Record/Edit to Suspended/input'))

WebUI.delay(2)

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_CourseOK'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Go'))

WebUI.delay(5)

WebUI.click(findTestObject('Edit Record/Edit to Suspended/Edit Check Box'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Edit Record'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/span_Qualification Status_caret'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/a_Suspended'))

WebUI.setText(findTestObject('Edit Record/Edit to Suspended/textarea_Comments_Description'), 'Testing Suspension')

WebUI.click(findTestObject('Edit Record/Edit to Suspended/button_Save Changes'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Edit Record/Edit to Suspended/div_Record successfully modified'), 'Record successfully modified!')

WebUI.click(findTestObject('Edit Record/Edit to Suspended/button_SuccessOK'))

WebUI.click(findTestObject('Edit Record/Edit to Suspended/img'))

WebUI.closeBrowser()

