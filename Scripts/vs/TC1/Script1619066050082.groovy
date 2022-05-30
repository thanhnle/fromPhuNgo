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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordUtil.logInfo('User ID: ' + id)

KeywordUtil.logInfo("Params: Names: " + firstName + " "+ lastName + " - Email: " + email + " - Gender: " + gender
	+ " - Phone number: " + userNumber)

String directory = "/Users/phuhuyngo/Katalon Studio/Sample Project 001/Screenshots/"

String fileExtension = null

String suiteName = lastName

Map<String, String> objectIds = CustomKeywords.'general.Methods.setUpObjectIds'(id)

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

// WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject("dQA/f")
	, GlobalVariable.DEFAULT_TIMEOUT)

CustomKeywords.'utils.WebHelper.hideElement'("#fixedban")

CustomKeywords.'utils.WebHelper.hideElement'("footer")

Thread.sleep(2000)

WebUI.takeScreenshotAsCheckpoint("form" + id + suiteName)//directory + objectIds.get("formId") + fileExtension)

WebUI.setText(findTestObject('dQA/fn'), firstName)

WebUI.takeElementScreenshotAsCheckpoint("firstName" + id + suiteName, findTestObject('dQA/fn'))//directory + objectIds.get("firstNameId") + fileExtension, findTestObject('dQA/fn'))

WebUI.setText(findTestObject('dQA/ln'), lastName)

WebUI.takeElementScreenshotAsCheckpoint("lastName" + id + suiteName, findTestObject('dQA/ln'))//directory + objectIds.get("lastNameId") + fileExtension, findTestObject('dQA/ln'))

WebUI.setText(findTestObject('dQA/em'), email)

WebUI.takeElementScreenshotAsCheckpoint("email" + id + suiteName, findTestObject('dQA/em'))//directory + objectIds.get("emailId") + fileExtension, findTestObject('dQA/em'))

CustomKeywords.'qademo.Methods.selectGender'(gender)

WebUI.setText(findTestObject('dQA/nb'), userNumber)

WebUI.takeElementScreenshotAsCheckpoint("userNumber" + id + suiteName, findTestObject('dQA/nb'))//directory + objectIds.get("userNumberId") + fileExtension, findTestObject('dQA/nb'))

WebUI.click(findTestObject('dQA/dob'))

WebUI.takeElementScreenshotAsCheckpoint("dob" + id + suiteName, findTestObject('dQA/dob'))//directory + objectIds.get("dobId") + fileExtension, findTestObject('dQA/dob'))

WebUI.click(findTestObject('dQA/d10'))

WebUI.scrollToElement(findTestObject('dQA/btnS'), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.takeElementScreenshotAsCheckpoint("submit" + id + suiteName, findTestObject('dQA/btnS'))//directory + objectIds.get("submitId") + fileExtension, findTestObject('dQA/nb'))

WebUI.click(findTestObject('dQA/btnS'))

WebUI.waitForElementVisible(findTestObject("dQA/pu/rs"), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.takeScreenshotAsCheckpoint("resultScreen" + id + suiteName)

WebUI.takeElementScreenshotAsCheckpoint("result" + id + suiteName, findTestObject("dQA/pu/rs"))//directory + objectIds.get("resultId") + fileExtension, findTestObject("dQA/pu/rs"))

