package qademo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Methods {
	@Keyword
	def selectGender (String gender) {
		WebDriver driver = DriverFactory.getWebDriver()
		String xpathGenderRadio = "//label[contains(@for,'gender-radio')]"
		List<WebElement> genderRadios = driver.findElements(By.xpath(xpathGenderRadio))

		for (int i = 0; i < genderRadios.size(); i ++) {
			String genderValue = genderRadios[i].getText().trim().toLowerCase()
			if (gender.toLowerCase().equals(genderValue)) {
				genderRadios[i].click()
				return
			}
		}
	}

	@Keyword
	def verifyTable(List<String> actualInputs) {
		WebDriver driver = DriverFactory.getWebDriver()
		List<String> valueColumn = driver.findElements(By.xpath("//div[@class='modal-body']//td[2]"))

		// Verify elements on table
		for (int i = 0; i < actualInputs.size(); i++ ) {
			WebUI.verifyMatch(valueColumn[i].getText(), actualInputs[i], false)
			KeywordUtil.logInfo("Actual: " + valueColumn[i].getText() + " - Expected: " + actualInputs[i])
		}
	}
}
