package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Methods {
	@Keyword
	def greetings(int hour) {
		if (hour >= 13) {
			return "Good afternoon"
		} else if (0 <= hour && hour <= 12) {
			return "Good morning"
		}
	}

	@Keyword
	def waitUntilCondition (Boolean condition) {
		WebDriver driver =
				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds)
	}
	
	@Keyword
	def setUpObjectIds (String id) {
		Map<String, String> objectIds = new HashMap()
		objectIds.put("firstNameId", findTestObject('dQA/fn').objectId + id)
		objectIds.put("lastNameId", findTestObject('dQA/ln').objectId + id)
		objectIds.put("emailId", findTestObject('dQA/em').objectId + id)
		objectIds.put("userNumberId", findTestObject('dQA/nb').objectId + id)
		objectIds.put("dobId", findTestObject('dQA/dob').objectId + id)
		objectIds.put("submitId", findTestObject('dQA/btnS').objectId + id)
		objectIds.put("resultId", findTestObject("dQA/pu/rs").objectId + id)
		objectIds.put("formId", "form" + id)
		objectIds.put("screenResultId", "screenResult" + id)
		return objectIds
	}
}
