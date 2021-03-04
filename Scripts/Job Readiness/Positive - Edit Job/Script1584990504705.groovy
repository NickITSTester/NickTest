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

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/a_more'))

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/a_Job Readiness'))

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/a_CreateEdit'))

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/div_Katalon Test JobThis is me test job'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Job Readiness/Edit Job/input_Title_jobTitle'), '^Edited Katalon Job')

WebUI.setText(findTestObject('Object Repository/Job Readiness/Edit Job/textarea_Description_Description'), 'Edited')

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/button_Save Changes'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Job Readiness/Edit Job/div_Changes saved successfully'), 'Changes saved successfully!')

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/button_Ok'))

WebUI.click(findTestObject('Object Repository/Job Readiness/Edit Job/img'))

WebUI.closeBrowser()

