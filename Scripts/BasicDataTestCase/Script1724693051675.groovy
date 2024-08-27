import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testng.keyword.JUnitRunnerResult as JUnitRunnerResult
import org.example.BasicDataTest

// Create a list of JUnit test classes to run
List junitTestClasses = [BasicDataTest.class]

// Run the test classes using Katalon's TestNG framework, continue on failure
JUnitRunnerResult junitResult = TestNGKW.runJUnitTestClasses(junitTestClasses, FailureHandling.CONTINUE_ON_FAILURE)

// Print the number of tests that were executed
println(junitResult.getJUnitResult().getRunCount())