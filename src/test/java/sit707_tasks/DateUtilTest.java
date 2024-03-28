package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;



public class DateUtilTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s224143611";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Akshar";
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
		  Assert.assertEquals(1, date.getMonth());	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// January min boundary: min-1
		  DateUtil date = new DateUtil(1, 1, 2024);
		  System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
		  date.decrement();
		  System.out.println(date);
		  Assert.assertEquals(31, date.getDay());
		  Assert.assertEquals(12, date.getMonth()); // December
		  Assert.assertEquals(2023, date.getYear()); // Same year 
	}

	@Test
	public void testMaxFebruary29LeapYearShouldIncrementToMarch1() {
	    // February max boundary (leap year): max+1
	    DateUtil date = new DateUtil(29, 2, 2024); // Leap year
	    System.out.println("testMaxFebruary29LeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxFebruary28NonLeapYearShouldDecrementToFebruary27() {
	    // February max boundary (non-leap year): max-1
	    DateUtil date = new DateUtil(28, 2, 2023); // Non-leap year
	    System.out.println("testMaxFebruary28NonLeapYearShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary29LeapYearShouldDecrementToFebruary28() {
	    // February max boundary (leap year): max-1
	    DateUtil date = new DateUtil(29, 2, 2024); // Leap year
	    System.out.println("testMaxFebruary29LeapYearShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    // March max boundary: max+1
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("testMaxMarch31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    // March max boundary: max-1
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("testMaxMarch31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    // April max boundary: max+1
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("testMaxApril30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
	    // April max boundary: max-1
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("testMaxApril30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("testNominalApril > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(4, date.getMonth());
	}
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    // May max boundary: max+1
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("testMaxMay31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
	    // May max boundary: max-1
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("testMaxMay31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testNominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("testNominalMay > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(5, date	.getMonth());
	}
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    // June max boundary: max+1
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("testMaxJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    // June max boundary: max-1
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("testMaxJune30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testNominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("testNominalJune > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    // July max boundary: max+1
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("testMaxJuly31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
	    // July max boundary: max-1
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("testMaxJuly31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testNominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("testNominalJuly > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(7, date.getMonth());
	}
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    // August max boundary: max+1
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("testMaxAugust31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
	    // August max boundary: max-1
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("testMaxAugust31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("testNominalAugust > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(8, date.getMonth());
	}
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    // September max boundary: max+1
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("testMaxSeptember30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
	    // September max boundary: max-1
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("testMaxSeptember30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testNominalSeptember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
	    System.out.println("testNominalSeptember > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(9, date.getMonth());
	}
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    // October max boundary: max+1
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("testMaxOctober31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
	    // October max boundary: max-1
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("testMaxOctober31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testNominalOctober() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
	    System.out.println("testNominalOctober > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(10, date.getMonth());
	}
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    // November max boundary: max+1
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("testMaxNovember30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
	    // November max boundary: max-1
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("testMaxNovember30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalNovember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(31); 
	    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
	    System.out.println("testNominalNovember > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1() {
	  // December max boundary: max+1
	  DateUtil date = new DateUtil(31, 12, 2024);
	  System.out.println("testMaxDecember31ShouldIncrementToJanuary1 > " + date);
	  date.increment();
	  System.out.println(date);
	  Assert.assertEquals(1, date.getMonth());
	  Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	  // December max boundary: max-1
	  DateUtil date = new DateUtil(31, 12, 2024);
	  System.out.println("testMaxDecember31ShouldDecrementToDecember30 > " + date);
	  date.decrement();
	  System.out.println(date);
	  Assert.assertEquals(30, date.getDay());
	  Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testNominalDecember() {
	  int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	  DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
	  System.out.println("testNominalDecember > " + date);
	  date.increment();
	  System.out.println(date);
	  Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	  Assert.assertEquals(12, date.getMonth());
	} 

	 @Test
	//1B Test case
	  public void testIncrementJanuary1st2024() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("testIncrementJanuary1st2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//2B Test case
	 @Test
	  public void testIncrementJune2nd1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("testIncrementJune2nd1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//3B Test case
	 @Test
	  public void testIncrementJune30th1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("testIncrementJune30th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//4B Test case
	 @Test
	  public void testIncrementJune31th1994() {
	    DateUtil date = new DateUtil(29, 6, 1994);
	    System.out.println("testIncrementJune31th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear()); 
	  }
	//5B Test case
	 @Test
	  public void testIncrementJan15th1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("testIncrementJan15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//6B Test case
	 @Test
	  public void testIncrementFab15th1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("testIncrementFab15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//7B Test case
	 @Test
	  public void testIncrementDec15th1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("testIncrementDec15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	//8B Test case
	 @Test
	  public void testIncrementJune15th1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("testIncrementJune15th1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	  }
	//9B Test case
	 @Test
	  public void testIncrementJune15th1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("testIncrementJune15th1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	  }
	//10B Test case
	 @Test
	  public void testIncrementJune15th2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("testIncrementJune15th2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	  }
	//11B Test case
	 @Test
	  public void testIncrementNov28th2022() {
	    DateUtil date = new DateUtil(28, 11, 2022);
	    System.out.println("testIncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2022, date.getYear());
	  }
	//12B Test case
	 @Test
	  public void testIncrementFab28th2020() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    System.out.println("testIncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	  }
	//13B Test case
	 @Test
	  public void testIncrementJune15th2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("testIncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	 }
	 // leap year Test
	 @Test
	  public void testIncrementJune28th2016() {
	    DateUtil date = new DateUtil(29, 2, 2016);
	    System.out.println("testIncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2016, date.getYear());
	 }
	 //No Leap Year Test
	 @Test
	  public void testIncrementJune27th2017() {
	    DateUtil date = new DateUtil(28, 2, 2017);
	    System.out.println("testIncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2017, date.getYear());
	 }
	 
	
}
