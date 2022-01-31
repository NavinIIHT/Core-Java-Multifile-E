package com.iiht.training.tests;

import static com.iiht.training.testutils.TestUtils.boundaryTestFile;
import static com.iiht.training.testutils.TestUtils.businessTestFile;
import static com.iiht.training.testutils.TestUtils.currentTest;
import static com.iiht.training.testutils.TestUtils.exceptionTestFile;
import static com.iiht.training.testutils.TestUtils.testReport;
import static com.iiht.training.testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.iiht.training.negativefirst.ArrayNegativeBeforePositive;
import com.iiht.training.reflections.StringAlphabetReflection;

public class StringAlphabetReflectionJUnitTest {
	
	public static StringAlphabetReflection reflectionObj = null;

	@BeforeAll
	public static void beforeAll() {
		reflectionObj = new StringAlphabetReflection();
	}
	
	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testStringAlphabetReflection() throws Exception {
		String str = "welcome";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("dvoxlnv") ? true : false, businessTestFile);
	}
	
	@Test
	public void testStringAlphabetReflectionForExtremeMinimal() throws Exception {
		String str = "ab9*c";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("zy9*x") ? true : false, businessTestFile);
	}
	@Test
	public void testStringAlphabetReflectionForExtremePositive() throws Exception {
		String str = "zyxw";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("abcd") ? true : false, businessTestFile);
	}
	
	@Test
	public void testStringAlphabetReflectionForInvalidDataInput() throws Exception {
		String str = "0";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("0") ? true : false, businessTestFile);
	}
	@Test
	public void testStringAlphabetReflectionNoValue() throws Exception {
		String str = "";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("") ? true : false, boundaryTestFile);
	}
	
	@Test
	public void testStringAlphabetReflectionExceptionalValue() throws Exception {
		String str = "hello";
		String reflection= reflectionObj.findReflection(str);
		yakshaAssert(currentTest(), reflection.contentEquals("svool") ? true : false, exceptionTestFile);
	}

}