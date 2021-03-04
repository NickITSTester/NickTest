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

WebUI.click(findTestObject('Work Locations/Work Location Creation/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Work Locations/Work Location Creation/input'), 'Smoketest Company')

WebUI.click(findTestObject('Work Locations/Work Location Creation/span_Smoketest Company'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Users'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Manager Smoketest (smoketestCompanyManage_1aaf7f'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Permissions'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/input_EditWorkLocations_CompanyPerms'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Save'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/img'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/i_Tom Smith_fa fa-caret-down'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestCompanyManager, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_more'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/a_Work Locations'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/div_Add Work Location'))

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_Name_ui-igedit-input ui-igvalidator-target'), 
    '^Katalon Test Location')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_Description_ui-igedit-input'), 
    'This me test Location')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_City_ui-igedit-input'), 'Murray')

WebUI.setText(findTestObject('Object Repository/Work Locations/Work Location Creation/input_State_ui-igedit-input'), 'KY')

WebUI.click(findTestObject('Work Locations/Work Location Creation/span_Done'))

WebUI.verifyElementText(findTestObject('Object Repository/Work Locations/Work Location Creation/div_Successfully added'), 
    'Successfully added.')

WebUI.click(findTestObject('Work Locations/Work Location Creation/img_1'))

WebUI.click(findTestObject('Work Locations/Work Location Creation/img'))

WebUI.closeBrowser()

