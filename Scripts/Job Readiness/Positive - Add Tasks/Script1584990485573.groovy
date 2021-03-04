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

WebUI.click(findTestObject('Job Readiness/Add Tasks/a_more'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/a_Job Readiness'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/a_CreateEdit'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/div_Katalon Test JobThis is me test job'))

WebUI.delay(2)

WebUI.click(findTestObject('Job Readiness/Add Tasks/div_Add Tasks'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/div_E01E02 Welding on Steel Pipelines'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/button_Toggle Dropdown'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/a_NGA OQ'))

WebUI.delay(3)

WebUI.click(findTestObject('Job Readiness/Add Tasks/div_CT01-Inspecting for Shorted Casings'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/button_Add'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/button_Save Changes'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Job Readiness/Add Tasks/div_Changes saved successfully'), 'Changes saved successfully!')

WebUI.click(findTestObject('Job Readiness/Add Tasks/button_Ok'))

WebUI.click(findTestObject('Job Readiness/Add Tasks/img'))

WebUI.closeBrowser()

