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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.its-training.com/Login.aspx')

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPass)

WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input'), 'gas of virginia')

WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/span_Gas of Virginia'))

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)

// UPLOADS FAILED PE's FOR A TASK LIST

for (int i = 1; i <= findTestData('Nisource PE').getRowNumbers(); i++) {
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Options_currentEval'))
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_(Industrial Training Services Inc)_2667'))
	
	WebUI.selectOptionByValue(findTestObject('NiSource/Suspend Tasks/NisourceSkills/select_Choose Method  Performance on the jo_cb8ebd'),
		'3', true)
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Override workflow_overwkf'))
	
	WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Series_courseSearch'),findTestData('Nisource PE').getValue(2,i))
	
	WebUI.delay(1)
	
	String path = '//div[@id=\'skillName' + findTestData('Nisource PE').getValue(1, i) + '\']'

    println(path)

    TestObject courseToClick = new TestObject('Me Course')

    courseToClick.addProperty('xpath', ConditionType.EQUALS, path)

    WebUI.click(courseToClick)
	
	WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Search_studentSearch'), 'nisourcesus')
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/span_NiSourceSus'))
	
	WebUI.selectOptionByValue(findTestObject('NiSource/Suspend Tasks/NisourceSkills/select_Choose statusPassFail'), '3', true)
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Attestation_agree'))
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/a_Save'))
	
	WebUI.verifyElementText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/div_Records created successfully See create_a2365c'),'Records created successfully! See created records in the reports.')
			
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/button_OK'))
	
	CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)
}

WebUI.closeBrowser()

