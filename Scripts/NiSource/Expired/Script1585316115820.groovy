import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.its-training.com/Login.aspx')

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPass)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NiSource/Expired/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/NiSource/Expired/input'), 'Columbia Gas of Virginia')

WebUI.click(findTestObject('Object Repository/NiSource/Expired/span_Columbia Gas of Virginia'))

WebUI.delay(3)

for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++){
	
		CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/a_UserFilter'))
	
		WebUI.setText(findTestObject('Object Repository/NiSource/Expired/input_Search_studsearch'), GlobalVariable.TaskListTester)
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/input_selectstudent'))
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/a_studOK'))
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/a_TaskFilter'))
	
		WebUI.setText(findTestObject('Object Repository/NiSource/Expired/input_Search_tsksearch'), findTestData('Nisource WE and Training Mapping').getValue(
				1, i))
		
		WebUI.delay(2)
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/input_selectTask'))
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/a_tskOK'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Expired/select_AllNot QualifiedQualifiedDisqualifie_0f3f17'),
			'3', true)
	
		WebUI.click(findTestObject('Object Repository/NiSource/Expired/a_GoButton'))
	
		WebUI.delay(1)
		
		if (WebUI.verifyElementText(findTestObject('Object Repository/NiSource/Expired/td_suspended'), 'Expired') == false) {
			errorList << WebUI.concatenate(((['\nNot showing expired: ', findTestData('Nisource WE and Training Mapping').getValue(
							1, i)]) as String[]))
		}
	
		CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
	}
	
WebUI.closeBrowser()

KeywordUtil.logInfo(errorList.toString())
	

