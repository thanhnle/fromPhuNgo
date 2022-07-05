import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
//	@BeforeTestCase
//	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
//		String testCaseId = testCaseContext.getTestCaseId()
//		if(testCaseId.contains("Test Cases/Mobile/")) {
//			testCaseContext.skipThisTestCase()
//		}
//	}
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		String testCasePath = testCaseContext.getTestCaseId();
		if (testCasePath.contains("book") || testCasePath.contains("Test Cases/skip/")) {
			testCaseContext.skipThisTestCase();
		}
	}
	
	
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		String suiteId = testSuiteContext.getTestSuiteId()
		if (suiteId.contains("Test Suites/mb")) {
			println("This Suite is run on mobile")
			// Mobile.startApplication("kobiton-store:173407", false)
		} else {
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
		}
	}
	
	@AfterTestSuite
	def afterTestSuite (TestSuiteContext testSuiteContext) {
		String suiteId = testSuiteContext.getTestSuiteId()
		if (suiteId.contains("Test Suites/mb")) {
			Mobile.closeApplication()
			KeywordUtil.logInfo("This is the end of the Test Suite")
		} else {
			WebUI.closeBrowser()
		}
	}
}