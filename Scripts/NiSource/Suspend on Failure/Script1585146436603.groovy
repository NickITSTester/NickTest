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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.its-training.com/Login.aspx')

CustomKeywords.'customKeywords.CustomFunctions.loginAs'(GlobalVariable.QATester, GlobalVariable.QATesterPass)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/i_You are currently logged in as Tom Smith _4613b2'))

WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input'), 'Columbia Gas of Virginia')

WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/span_Columbia Gas of Virginia'))

WebUI.delay(3)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.CreateKnowledge)

WebUI.delay(1)

// UPLOAD FAILED WE'S FOR A WHOLE TASK LIST
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/proctor'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_(Industrial Training Services Inc)_2667'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Series_courseSearch'))

    CustomKeywords.'customKeywords.CustomFunctions.taskSearch'(findTestData('Nisource WE and Training Mapping').getValue(
            5, i))

    WebUI.delay(1)

    String path = ('//div[@id=\'cl' + findTestData('Nisource WE and Training Mapping').getValue(4, i)) + '\']'

    println(path)

    TestObject courseToClick = new TestObject('Me Course')

    courseToClick.addProperty('xpath', ConditionType.EQUALS, path)

    WebUI.click(courseToClick)

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studentSearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/span_NiSourceSuspendTest'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_PassFail'), '3', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_PaperOnline'), '1', true)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_I affirm that the records I am creati_2aac6c'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_Save'))

	if (WebUI.verifyElementText(findTestObject('NiSource/Suspend Tasks/div_success'), 'Records created successfully! See created records in the reports.') == false) {
		errorList << WebUI.concatenate(((['\nFailed to Upload Failed: ', findTestData('Nisource WE and Training Mapping').getValue(
						2, i)]) as String[]))
	}

	WebUI.click(findTestObject('NiSource/Suspend Tasks/imgmessage'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/img_1'))

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.CreateKnowledge)
}

WebUI.delay(2)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)

// VERIFY SUSPENSIONS FROM THE FAILED WE
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_UserFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studsearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectstudent'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_studOK'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_TaskFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_tsksearch'), findTestData('Nisource WE and Training Mapping').getValue(
            1, i))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectTask'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_tskOK'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_AllNot QualifiedQualifiedDisqualifie_0f3f17'), 
        '4', true)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_GoButton'))

    WebUI.delay(1)
	
	if (WebUI.verifyElementText(findTestObject('Object Repository/NiSource/Suspend Tasks/td_suspended'), 'Suspended') == false) {
		errorList << WebUI.concatenate(((['\nFailed WE did not suspend: ', findTestData('Nisource WE and Training Mapping').getValue(
						1, i)]) as String[]))
	}

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.CreateKnowledge)

// UPLOAD PASSED WE's FOR A WHOLE TASK LIST
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/proctor'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_(Industrial Training Services Inc)_2667'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Series_courseSearch'))

    CustomKeywords.'customKeywords.CustomFunctions.taskSearch'(findTestData('Nisource WE and Training Mapping').getValue(
            5, i))

    WebUI.delay(1)

    String path = ('//div[@id=\'cl' + findTestData('Nisource WE and Training Mapping').getValue(4, i)) + '\']'

    println(path)

    TestObject courseToClick = new TestObject('Me Course')

    courseToClick.addProperty('xpath', ConditionType.EQUALS, path)

    WebUI.click(courseToClick)

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studentSearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/span_NiSourceSuspendTest'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_PassFail'), '5', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_PaperOnline'), '1', true)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_I affirm that the records I am creati_2aac6c'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_Save'))
	
	if (WebUI.verifyElementText(findTestObject('NiSource/Suspend Tasks/div_success'), 'Records created successfully! See created records in the reports.') == false) {
		errorList << WebUI.concatenate(((['\nFailed to Upload Passed: ', findTestData('Nisource WE and Training Mapping').getValue(
						2, i)]) as String[]))
	}

    WebUI.click(findTestObject('NiSource/Suspend Tasks/imgmessage'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/img_1'))

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.CreateKnowledge)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)

// VERIFY SUSPENSION LIFTED
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_UserFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studsearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectstudent'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_studOK'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_TaskFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_tsksearch'), findTestData('Nisource WE and Training Mapping').getValue(
            1, i))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectTask'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_tskOK'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_AllNot QualifiedQualifiedDisqualifie_0f3f17'), 
        '1', true)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_GoButton'))

    WebUI.delay(1)
	
	if (WebUI.verifyElementText(findTestObject('Object Repository/NiSource/Suspend Tasks/td_suspended'), 'Qualified') == false) {
		errorList << WebUI.concatenate(((['\nPassed WE did not lift suspension for: ', findTestData('Nisource WE and Training Mapping').getValue(
						1, i)]) as String[]))
	}

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)

// UPLOADS FAILED PE's FOR A TASK LIST
for (int i = 1; i <= findTestData('Nisource PE').getRowNumbers(); i++) {
    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Options_currentEval'))

    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_(Industrial Training Services Inc)_2667'))

    WebUI.selectOptionByValue(findTestObject('NiSource/Suspend Tasks/NisourceSkills/select_Choose Method  Performance on the jo_cb8ebd'), 
        '3', true)

    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Override workflow_overwkf'))

    WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Series_courseSearch'), findTestData('Nisource PE').getValue(
            2, i))

    WebUI.delay(1)

    String path = ('//div[@id=\'skillName' + findTestData('Nisource PE').getValue(1, i)) + '\']'

    println(path)

    TestObject courseToClick = new TestObject('Me Course')

    courseToClick.addProperty('xpath', ConditionType.EQUALS, path)

    WebUI.click(courseToClick)

    WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Search_studentSearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/NisourceSkills/div_Suspend NiSource R (NiSourceSuspendTest2)'))

    WebUI.selectOptionByValue(findTestObject('NiSource/Suspend Tasks/NisourceSkills/select_Choose statusPassFail'), '3', true)

    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Attestation_agree'))

    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/a_Save'))
	
	if (WebUI.verifyElementText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/div_Records created successfully See create_a2365c'), 
        'Records created successfully! See created records in the reports.') == false) {
		errorList << WebUI.concatenate(((['\nFailed to Upload Failed: ', findTestData('Nisource PE').getValue(
						2, i)]) as String[]))
	}

    WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/button_OK'))

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)

// VERIFY SUSPENSIONS DUE TO FAILED PE
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_UserFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studsearch'), GlobalVariable.TaskListTester)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectstudent'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_studOK'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_TaskFilter'))

    WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_tsksearch'), findTestData('Nisource WE and Training Mapping').getValue(
            1, i))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectTask'))

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_tskOK'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_AllNot QualifiedQualifiedDisqualifie_0f3f17'), 
        '4', true)

    WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_GoButton'))

    WebUI.delay(1)
	
	if (WebUI.verifyElementText(findTestObject('Object Repository/NiSource/Suspend Tasks/td_suspended'), 'Suspended') == false) {
		errorList << WebUI.concatenate(((['\nFailed PE did not suspend: ', findTestData('Nisource WE and Training Mapping').getValue(
						1, i)]) as String[]))
	}

    CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)

// UPLOADS PASSED PE's FOR A TASK LIST

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
	
	WebUI.setText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Search_studentSearch'), GlobalVariable.TaskListTester)
	
	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/NisourceSkills/div_Suspend NiSource R (NiSourceSuspendTest2)'))
	
	WebUI.selectOptionByValue(findTestObject('NiSource/Suspend Tasks/NisourceSkills/select_Choose statusPassFail'), '5', true)
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/input_Attestation_agree'))
	
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/a_Save'))
	
	if (WebUI.verifyElementText(findTestObject('NiSource/Suspend Tasks/NisourceSkills/div_Records created successfully See create_a2365c'),
		'Records created successfully! See created records in the reports.') == false) {
		errorList << WebUI.concatenate(((['\nFailed to Upload Passed: ', findTestData('Nisource PE').getValue(
						2, i)]) as String[]))
	}
			
	WebUI.click(findTestObject('NiSource/Suspend Tasks/NisourceSkills/button_OK'))
	
	CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.UploadSkill)
}

WebUI.delay(1)

CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)

// VERIFY SUSPENSIONS LIFTED
for (int i = 1; i <= findTestData('Nisource WE and Training Mapping').getRowNumbers(); i++) {
	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_UserFilter'))

	WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_studsearch'), GlobalVariable.TaskListTester)

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectstudent'))

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_studOK'))

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_TaskFilter'))

	WebUI.setText(findTestObject('Object Repository/NiSource/Suspend Tasks/input_Search_tsksearch'), findTestData('Nisource WE and Training Mapping').getValue(
			1, i))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/input_selectTask'))

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_tskOK'))

	WebUI.selectOptionByValue(findTestObject('Object Repository/NiSource/Suspend Tasks/select_AllNot QualifiedQualifiedDisqualifie_0f3f17'),
		'1', true)

	WebUI.click(findTestObject('Object Repository/NiSource/Suspend Tasks/a_GoButton'))

	WebUI.delay(1)
	
	if (WebUI.verifyElementText(findTestObject('Object Repository/NiSource/Suspend Tasks/td_suspended'), 'Qualified') == false) {
		errorList << WebUI.concatenate(((['\nPassed PE did not lift suspension for: ', findTestData('Nisource WE and Training Mapping').getValue(
						1, i)]) as String[]))
	}

	CustomKeywords.'customKeywords.CustomFunctions.gotoPage'(GlobalVariable.DetailedModule)
}

WebUI.closeBrowser()

KeywordUtil.logInfo(errorList.toString())

