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

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/a_more'))

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/a_Work Locations'))

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/img'))

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_Name_ui-igedit-input ui-igvalidator-target'), 
    '^Edited Katalon Location')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_Description_ui-igedit-input'), 
    'Edited')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_City_ui-igedit-input'), 'Akron')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_State_ui-igedit-input'), 'OH')

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/span_Done'))

WebUI.verifyElementText(findTestObject('Object Repository/Work Locations/Edit Work Location/div_Successfully saved'), 'Successfully saved!')

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/img_1'))

WebUI.click(findTestObject('Object Repository/Work Locations/Edit Work Location/img_1_2'))

WebUI.closeBrowser()

