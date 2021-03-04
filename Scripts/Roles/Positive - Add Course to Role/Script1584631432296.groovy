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

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Roles'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Katalon Role'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Courses'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Add Courses'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/input_F03 COURSE Joining or Capping of Poly_11018d'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/input_Force Assignments_rolemailnotif'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Add'))

WebUI.verifyElementVisible(findTestObject('Roles/Add Course/div_Course added successfully'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/button_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/img'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Smoketest Manager'))

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestStudent, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Object Repository/Roles/Add Course/a_My Assignments'))

WebUI.verifyTextPresent('F03 EXAM (INITIAL) Joining or Capping of Polyethylene Pipe with Heat Fusion', false)

WebUI.click(findTestObject('Object Repository/Roles/Add Course/img'))

WebUI.closeBrowser()

