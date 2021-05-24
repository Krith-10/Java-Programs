/*
SIMPLE FIX: (Add JUnit 5 Library)

INSTRUCTIONS:

Right click on project -> Build Path -> Configure Build Path
In the pop-up -> Add Library -> JUnit -> JUnit 5 -> Finish -> Apply
You should see the JUnit 5 Library (and its jars) added to your project
Right click on project -> Maven -> Update Project -> OK

*/

package com.krith;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@EnabledOnOs(OS.WINDOWS)
//@EnabledOnJre(JRE.JAVA_8)
class MathOpsTest {

	MathOps mathOps;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathOps = new MathOps();
		//testReporter.publishEntry("Running "+testInfo.getDisplayName()+" of tag "+testInfo.getTags());
	}
	
	/*@AfterEach
	void cleanUp() {
		System.out.println("Bye");
	}*/
	
	@Test
	@DisplayName("Adding integers")
	@Tag("Math")
	void test() {
		//MathOps mathOps = new MathOps();
		//assumeTrue(true);
		int expected=2;
		int actual=mathOps.add(1, 1);
		assertEquals(expected, actual,"The add method should add two numbers correctly");
	}
	
	@Nested
	@DisplayName("Contains sub test")
	@Tag("Math")
	class SubTest {
		
		@Test
		@DisplayName("Subtracting positive no")
		void subPositiveTest() {
			assertEquals(2,mathOps.sub(4, 2),"Subtraction");
		}
		
		@Test
		@DisplayName("Subtracting negative no")
		void subNegativeTest() {
			assertEquals(-2,mathOps.sub(-4, -2),"Subtraction");
		}
		
	}
	
	@Test
	@DisplayName("Multiply test method")
	@Tag("Math")
	void testMultiply() {
		assertAll(
				() -> assertEquals(-2, mathOps.multiply(-1, 2)),
				() -> assertEquals(2, mathOps.multiply(2, 1)),
				() -> assertEquals(0, mathOps.multiply(0, 2))
				);
		//testReporter.publishEntry("Running "+ testInfo.getDisplayName());
	}
	
	@Test
	@DisplayName("Divide test")
	@EnabledOnOs(OS.WINDOWS)
	void divideTest() {
		//MathOps mathOps = new MathOps();
		assertThrows(ArithmeticException.class, () -> mathOps.divide(1, 0), "Divide by zero should throw arithmetic expression");
	}

	@Test
	@DisplayName("Computing Circle area")
	@Tag("Circle")
	void testComputeCircleArea() {
		//MathOps mathOps = new MathOps();
		assertEquals(314.1592653589793, mathOps.computeCircleArea(10),"Should return the area of the circle");
	}
}

