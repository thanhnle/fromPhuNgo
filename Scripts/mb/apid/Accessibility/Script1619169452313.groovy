import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('kobiton-store:172098', true)

//Mobile.tap(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - OK')
//	, GlobalVariable.DEFAULT_TIMEOUT, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - API Demos')
	, GlobalVariable.DEFAULT_TIMEOUT)

Mobile.tap(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - API Demos')
	, GlobalVariable.DEFAULT_TIMEOUT)

Mobile.waitForElementPresent(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Accessibility')
	, GlobalVariable.DEFAULT_TIMEOUT)

Mobile.tap(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Accessibility')
	, GlobalVariable.DEFAULT_TIMEOUT)

Mobile.waitForElementPresent(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Accessibility Node Querying')
	, GlobalVariable.DEFAULT_TIMEOUT)

String comp1String = Mobile.getText(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Accessibility Node Querying')
	, GlobalVariable.DEFAULT_TIMEOUT)

String comp2String = Mobile.getText(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Accessibility Service')
	, GlobalVariable.DEFAULT_TIMEOUT)

String comp3String = Mobile.getText(findTestObject('mb/API Demos/Accessibility/android.widget.TextView - Custom View'), 
    , GlobalVariable.DEFAULT_TIMEOUT)

Mobile.verifyMatch(comp1String, 'Accessibility Node Querying', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(comp2String, 'Accessibility Service 1001', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(comp3String, 'Custom View', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

