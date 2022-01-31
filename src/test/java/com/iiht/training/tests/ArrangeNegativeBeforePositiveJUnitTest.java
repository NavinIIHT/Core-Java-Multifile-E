package com.iiht.training.tests;

import static com.iiht.training.testutils.TestUtils.boundaryTestFile;
import static com.iiht.training.testutils.TestUtils.businessTestFile;
import static com.iiht.training.testutils.TestUtils.currentTest;
import static com.iiht.training.testutils.TestUtils.exceptionTestFile;
import static com.iiht.training.testutils.TestUtils.testReport;
import static com.iiht.training.testutils.TestUtils.yakshaAssert;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.iiht.training.negativefirst.ArrayNegativeBeforePositive;
import com.iiht.training.reflections.StringAlphabetReflection;

public class ArrangeNegativeBeforePositiveJUnitTest {

	public static ArrayNegativeBeforePositive negativeBeforePositive = null;

	@BeforeAll
	public static void beforeAll() {
		negativeBeforePositive = new ArrayNegativeBeforePositive();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testArrayNegativeBeforePositive() throws Exception {
		int[] arr = {1,-2,4,-1,6};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{-2,-1,1,4,6}) ? true : false, businessTestFile);
	}

	@Test
	public void testArrayNegativeBeforePositiveForExtremeMinimal() throws Exception {
		int[] arr = {1,-3};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{-3,1}) ? true : false, businessTestFile);
	}

	@Test
	public void testArrayNegativeBeforePositiveForExtremePositive() throws Exception {
		int[] arr = {1,2,-3,2,-9,-8,2,1,-12};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{-3,-9,-8,-12,1,2,2,2,1}) ? true : false, businessTestFile);
	}

	@Test
	public void testArrayNegativeBeforePositiveForInvalidDataInput() throws Exception {
		int[] arr = {0};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{0}) ? true : false, businessTestFile);
	}

	@Test
	public void testArrayNegativeBeforePositiveForNoValue() throws Exception {
		int[] arr = {};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{}) ? true : false, businessTestFile);
	}

	@Test
	public void testArrayNegativeBeforePositiveExceptionalValue() throws Exception {
		int[] arr = {1,2,3,4,5};
		int[] result = negativeBeforePositive.getNegativeFirst(arr);
		yakshaAssert(currentTest(), Arrays.equals(result, new int[]{1,2,3,4,5}) ? true : false, businessTestFile);
	}

}