package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SauceDemo {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Saya mau Open URL")
	def Saya_mau_Open_URL() {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/Navigate'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Saya mau Login")
	def Saya_mau_Login() {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Saya mau Verify")
	def Saya_mau_Verify() {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/Button Login and Verify'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Saya salah Login(.*)")
	def Saya_salah_Login(String name) {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/Login Fail'), [:], FailureHandling.STOP_ON_FAILURE)
		println name
	}

	@Given("Saya ingin menambahkan barang")
	def Saya_ingin_menambahkan_barang() {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/add to cart'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("Setelah saya selesai saya ingin log out")
	def Setelah_saya_selesai_saya_ingin_log_out() {
		WebUI.callTestCase(findTestCase('Test Cases/Test Sauce/Logout'), [:], FailureHandling.STOP_ON_FAILURE)


	}
}