package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223676061";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "DHRUV";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	 @Test
	    public void testMinJanuary1ShouldIncrementToJanuary2() {
	        DateUtil date = new DateUtil(1, 1, 2024);
	        System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(1, date.getMonth());
	    }
	    
	    @Test
	    public void testMinJanuary1ShouldDecrementToDecember31() {
	        DateUtil date = new DateUtil(1, 1, 2024);
	        System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	        date.decrement();
	        System.out.println(date);
	        Assert.assertEquals(31, date.getDay());
	        Assert.assertEquals(12, date.getMonth());
	        Assert.assertEquals(2023, date.getYear());
	    }
	    
	    @Test
	    public void testMaxFebruary29ShouldIncrementToMarch1InLeapYear() {
	        // Leap year: divisible by 4 and not divisible by 100 unless also divisible by 400
	        DateUtil date = new DateUtil(29, 2, 2024);
	        System.out.println("testMaxFebruary29ShouldIncrementToMarch1InLeapYear > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	    }
	    
	    @Test
	    public void testMaxFebruary28ShouldIncrementToMarch1InNonLeapYear() {
	        // Non-leap year
	        DateUtil date = new DateUtil(28, 2, 2023);
	        System.out.println("testMaxFebruary28ShouldIncrementToMarch1InNonLeapYear > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	    }

	    @Test
	    public void testMaxFebruary28ShouldIncrementToFebruary29InLeapYear() {
	        // Leap year: divisible by 4 and not divisible by 100 unless also divisible by 400
	        DateUtil date = new DateUtil(28, 2, 2024);
	        System.out.println("testMaxFebruary28ShouldIncrementToFebruary29InLeapYear > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(29, date.getDay());
	        Assert.assertEquals(2, date.getMonth());
	    }

	    @Test
	    public void testMaxFebruary29ShouldDecrementToFebruary28InLeapYear() {
	        // Leap year: divisible by 4 and not divisible by 100 unless also divisible by 400
	        DateUtil date = new DateUtil(29, 2, 2024);
	        System.out.println("testMaxFebruary29ShouldDecrementToFebruary28InLeapYear > " + date);
	        date.decrement();
	        System.out.println(date);
	        Assert.assertEquals(28, date.getDay());
	        Assert.assertEquals(2, date.getMonth());
	    }

	    @Test
	    public void testMaxMarch31ShouldIncrementToApril1() {
	        DateUtil date = new DateUtil(31, 3, 2024);
	        System.out.println("testMaxMarch31ShouldIncrementToApril1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
	    }
	    
	    @Test
	    public void testMaxApril30ShouldIncrementToMay1() {
	        DateUtil date = new DateUtil(30, 4, 2024);
	        System.out.println("testMaxApril30ShouldIncrementToMay1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(5, date.getMonth());
	    }

	    @Test
	    public void testMaxMay31ShouldIncrementToJune1() {
	        DateUtil date = new DateUtil(31, 5, 2024);
	        System.out.println("testMaxMay31ShouldIncrementToJune1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	    }

	    @Test
	    public void testMaxJune30ShouldIncrementToJuly1() {
	        DateUtil date = new DateUtil(30, 6, 2024);
	        System.out.println("testMaxJune30ShouldIncrementToJuly1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(7, date.getMonth());
	    }

	    @Test
	    public void testMaxJuly31ShouldIncrementToAugust1() {
	        DateUtil date = new DateUtil(31, 7, 2024);
	        System.out.println("testMaxJuly31ShouldIncrementToAugust1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(8, date.getMonth());
	    }

	    @Test
	    public void testMaxAugust31ShouldIncrementToSeptember1() {
	        DateUtil date = new DateUtil(31, 8, 2024);
	        System.out.println("testMaxAugust31ShouldIncrementToSeptember1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(9, date.getMonth());
	    }

	    @Test
	    public void testMaxSeptember30ShouldIncrementToOctober1() {
	        DateUtil date = new DateUtil(30, 9, 2024);
	        System.out.println("testMaxSeptember30ShouldIncrementToOctober1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(10, date.getMonth());
	    }

	    @Test
	    public void testMaxOctober31ShouldIncrementToNovember1() {
	        DateUtil date = new DateUtil(31, 10, 2024);
	        System.out.println("testMaxOctober31ShouldIncrementToNovember1 > " + date);
	        date.increment();
	       
	    }
}
