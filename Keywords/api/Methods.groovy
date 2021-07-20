package api

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.JsonSlurper
import internal.GlobalVariable

public class Methods {
	@Keyword
	def toJson(ResponseObject ro) {
		JsonSlurper jsonSlurper = new JsonSlurper()
		Map jsonBody = jsonSlurper.parseText(ro.getResponseBodyContent())
		return jsonBody
	}
	
	@Keyword
	def verifyJsonProperties(ResponseObject ro, List<String> propertiesList) {
		JsonSlurper jsonSlurper = new JsonSlurper()
		ArrayList jsonBody = jsonSlurper.parseText(ro.getResponseBodyContent())
		for(int i = 0; i < jsonBody.size(); i ++) {
			Map item = jsonBody[i]
			for (int j = 0 ; j < propertiesList.size() ; j ++) {
				String key = propertiesList[j]
				String value = item.getAt(key)
				assert value != null : "The property is not null"
			}
		}
	}
}
