package login

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
	def verifyBlankTooltip(String username, String password) {
		WebDriver driver = DriverFactory.getWebDriver()
		String errorMessageXpath = "//i[contains(@class, 'icon-error')]"

		if (username.equals("") && password.equals("")) {

			List<WebElement> iconList = driver.findElements(By.xpath(errorMessageXpath))
			assert iconList.size() == 2 : "There should be 2 icons, 1 for blank username, 1 for blank password"

			String tooltipUsername = iconList.get(0).getAttribute("title")
			String tooltipPassword = iconList.get(1).getAttribute("title")

			WebUI.verifyMatch(tooltipUsername, "Username is required", false)
			WebUI.verifyMatch(tooltipPassword, "Password is required", false)
		} else if (username.equals("")) {

			List<WebElement> iconList = driver.findElements(By.xpath(errorMessageXpath))
			assert iconList.size() == 1 : "There should be 1 error icon for username"

			String tooltipUsername = iconList.get(0).getAttribute("title")
			WebUI.verifyMatch(tooltipUsername, "Username is required", false)
		} else if (password.equals("")) {
			List<WebElement> iconList = driver.findElements(By.xpath(errorMessageXpath))
			assert iconList.size() == 1 : "There should be 1 error icon for password"

			String tooltipPassword = iconList.get(0).getAttribute("title")
			WebUI.verifyMatch(tooltipPassword, "Password is required", false)
		} else {
			KeywordUtil.logInfo("Username and Password is not blank")
		}
	}
}
