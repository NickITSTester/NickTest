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

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Cost Centers/Cost Center Creation/input'), 'Smoketest Company')

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/span_Smoketest Company'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Users'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Manager Smoketest (smoketestCompanyManage_1aaf7f'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Permissions'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/input_EditCostCenters_CompanyPerms'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Save'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/i_Tom Smith_fa fa-caret-down'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestCompanyManager, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_more'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/a_Cost Centers'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/div_Add Cost Center'))

WebUI.setText(findTestObject('Cost Centers/Cost Center Creation/input_Name_ui-igedit-input ui-igvalidator-target'), '^Katalon Test Center')

WebUI.setText(findTestObject('Cost Centers/Cost Center Creation/input_Description_ui-igedit-input'), 'This is me test center')

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/span_Done'))

WebUI.verifyElementText(findTestObject('Cost Centers/Cost Center Creation/div_Successfully added'), 'Successfully added.')

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/img'))

WebUI.click(findTestObject('Cost Centers/Cost Center Creation/img_1'))

WebUI.closeBrowser()

