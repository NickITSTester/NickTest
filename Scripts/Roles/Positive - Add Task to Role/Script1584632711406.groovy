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

WebUI.click(findTestObject('Object Repository/Roles/Add Task/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/Roles/Add Task/input'), 'Smoketest Company')

WebUI.click(findTestObject('Object Repository/Roles/Add Task/span_Smoketest Company'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Series'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/label_ViewEdit'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/input_Allow failed skills to associated to _0f7bd5'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/button_Save'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/i_Tom Smith_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Sign out'))

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestCompanyManager, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Roles'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Katalon Role'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Add Tasks'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Roles/Add Task/select_NGA OQNiSourcePGE'), '43', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Roles/Add Task/input_concat(0205 PIPE SQUEEZE - PLASTIC 12_3394d4'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/input_Force Assignments_rolemailnotif'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Roles/Add Task/div_Task added successfully'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/button_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/i_Assignable Task_fa fa-code-fork icon-rotate-90'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Add Mapping'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Roles/Add Task/select_NGA OQNiSourcePGE'), '43', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Roles/Add Task/input__courseAdd'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/input_Force Assignments_rolemailnotif'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Add'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/button_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/img'))

WebUI.waitForAlert(10)

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Roles/Add Task/div_Task added successfully'), 'Task(s) removed from role')

WebUI.click(findTestObject('Object Repository/Roles/Add Task/button_OK'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/span_Task Role Mapping_ui-igdialog-close-ic_35be36'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/i_Tom Smith_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_Sign out'))

WebUI.delay(60)

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.SmoketestStudent, GlobalVariable.SmoketestPass)

WebUI.click(findTestObject('Object Repository/Roles/Add Task/a_My Assignments'))

WebUI.verifyTextPresent('PG&E EXAM 02-07 Pipeline Replacement', false)

WebUI.click(findTestObject('Object Repository/Roles/Add Task/img_1'))

WebUI.closeBrowser()

