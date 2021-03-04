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

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/a_more'))

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/a_Roles'))

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/img'))

WebUI.setText(findTestObject('Object Repository/Roles/Edit Role/input_Name_roleName1'), '^Edited Katalon Role')

WebUI.setText(findTestObject('Object Repository/Roles/Edit Role/textarea_Description_roleDesc1'), 'Edited')

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/a_Save'))

WebUI.verifyElementText(findTestObject('Roles/Edit Role/div_Successfully edited'), 'Role Edited successfully!')

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/img_1'))

WebUI.click(findTestObject('Object Repository/Roles/Edit Role/img_1_2'))

WebUI.closeBrowser()

