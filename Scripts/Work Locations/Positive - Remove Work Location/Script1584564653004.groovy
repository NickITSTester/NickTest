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

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_more'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Work Locations'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/img'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Work Locations/Remove Work Location/div_Successfully deleted'), 
    'Successfully deleted.')

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/img_1'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/i_Smoketest Manager_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPassProd)

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/Work Locations/Remove Work Location/input'), 'Smoketest Company')

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/span_Smoketest Company'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Users'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Manager Smoketest (smoketestCompanyManage_1aaf7f'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Permissions'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/input_EditWorkLocations_CompanyPerms'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/a_Save'))

WebUI.click(findTestObject('Object Repository/Work Locations/Remove Work Location/img_1'))

WebUI.closeBrowser()

