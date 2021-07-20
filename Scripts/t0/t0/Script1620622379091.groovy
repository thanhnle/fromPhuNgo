import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Rectangle as Rectangle
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.navigateToUrl('https://analytics.katalon.com')

WebUI.setText(findTestObject('t0/un'), 'phu.ngo@katalon.com')

WebUI.setText(findTestObject('t0/pw'), 'Abcd@1234')

WebUI.click(findTestObject('t0/sm'))

WebUI.waitForElementVisible(findTestObject('t0/t1'), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.takeElementScreenshotAsCheckpoint('Progress Bar 1', findTestObject('t0/t1'))

WebUI.navigateToUrl('https://analytics.katalon.com/team/104750/project/119966')

WebUI.waitForElementVisible(findTestObject('t0/t2'), GlobalVariable.DEFAULT_TIMEOUT)

//WebUI.takeElementScreenshotAsCheckpoint('Progress Bar 2', findTestObject('t0/t2'))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Horizontal 1', new Rectangle(0, 0, 1, 200))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Horizontal 2', new Rectangle(0, 0, 2, 200))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Horizontal 3', new Rectangle(0, 0, 3, 200))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Vertical 1', new Rectangle(20, 0, 200, 1))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Vertical 2', new Rectangle(0, 0, 200, 2))

WebUI.takeAreaScreenshotAsCheckpoint('Thin Vertical 3', new Rectangle(0, 0, 200, 3))

