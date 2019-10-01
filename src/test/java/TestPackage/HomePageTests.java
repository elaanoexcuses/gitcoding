package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectPckage.HomePageObjects;

public class HomePageTests {
	
	HomePageObjects homePageObj;
	
	public HomePageTests()
	{
		homePageObj = new HomePageObjects();
	}
	
   @Test
	
	public void womentabpresenttest()
	{
		Assert.assertEquals(true, homePageObj.iswomentabpresent(),"women tab is not present");
		
	}
   
   @Test
	
	public void dressestabpresenttest()
	{
		Assert.assertEquals(true, homePageObj.isdresstabpresent(),"dresses tab is not present");
		
	}
   
   @Test
	
	public void tshirttabpresenttest()
	{
		Assert.assertEquals(true, homePageObj.istshirtstabpresent(),"tshirt tab is not present");
		
	}
   
   @Test
   
   public void womentabnvigatedtest()
   {
	  Assert.assertEquals("Women", homePageObj.womentabnavigated(),"women tab is not navigated"); 
   }
   
   @Test
   
   public void dressestabnvigatedtest()
   {
	  Assert.assertEquals("Dresses", homePageObj.dressestabnavigated(),"dresses tab is not navigated"); 
   }
   
   @Test
   
   public void tshirttabnvigatedtest()
   {
	  Assert.assertEquals("T-shirts", homePageObj.tshirttabnavigated(),"tshirt tab is not navigated"); 
   }

  @Test
   public void emailverificationtest()
   {
	homePageObj.emailverification();
   }
  
 /*  @Test
  public void emailverificationsuccesstest()
  {
	  Assert.assertEquals(true, homePageObj.emailverificationsuccess(),"Subscription message is not displayed");
  }
  
   /*@Test
   public void emailverificationsuccesstest()
   {
	   Assert.assertEquals(" Newsletter : You have successfully subscribed to this newsletter.", homePageObj.emailverificationsuccess(),"not success");
   }
  
  @Test
  public void sizeboxsdisplaytest()
  {
	  Assert.assertEquals(true, homePageObj.sizeboxsdisplay(),"size box s is not display");
  }
  
/*  @Test
  public void sizeboxmdisplaytest()
  {
	  Assert.assertEquals(true, homePageObj.sizeboxmdisplay(),"size box m is not display");
  }
  @Test
  public void sizeboxldisplay()
  {
	Assert.assertEquals(true, homePageObj.sizeboxldisplay(),"size box l is not display");  
  }*/





   

}
