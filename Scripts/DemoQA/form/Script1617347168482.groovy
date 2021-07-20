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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordUtil.logInfo('User ID: ' + id)

KeywordUtil.logInfo("Params: Names: " + firstName + " "+ lastName + " - Email: " + email + " - Gender: " + gender 
	+ " - Phone number: " + userNumber)

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.waitForElementVisible(findTestObject("dQA/f")
	, GlobalVariable.DEFAULT_TIMEOUT)

WebUI.setText(findTestObject('dQA/fn'), firstName)

WebUI.setText(findTestObject('dQA/ln'), lastName)

WebUI.setText(findTestObject('dQA/em'), email)

CustomKeywords.'qademo.Methods.selectGender'(gender)

WebUI.setText(findTestObject('dQA/nb'), userNumber)

WebUI.click(findTestObject('dQA/dob'))

WebUI.click(findTestObject('dQA/d10'))

WebUI.scrollToElement(findTestObject('dQA/btnS'), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.click(findTestObject('dQA/btnS'))

List<String> inputs = [firstName + " " + lastName, email, gender, userNumber]

Thread.sleep(300)

CustomKeywords.'qademo.Methods.verifyTable'(inputs)

