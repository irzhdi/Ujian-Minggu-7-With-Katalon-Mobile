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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.chad.financialrecord')

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.ImageView'), 0)

Mobile.closeApplication()

Mobile.startExistingApplication('com.chad.financialrecord')

Mobile.switchToPortrait()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.TextView - Pemasukan'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.TextView - 09 Apr 2022'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.view.View - 7'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.TextView - Gaji'), 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.TextView - Penjualan'), 0)

Mobile.setText(findTestObject('Object Repository/Pemasukan/android.widget.EditText'), '20000000', 0)

Mobile.setText(findTestObject('Object Repository/Pemasukan/android.widget.EditText (1)'), 'Penjualan 1000gram Meth', 0)

Mobile.tap(findTestObject('Object Repository/Pemasukan/android.widget.Button - SIMPAN'), 0)

Mobile.closeApplication()

