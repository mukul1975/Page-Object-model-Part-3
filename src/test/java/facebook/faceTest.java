package facebook;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class faceTest extends browserDtails{
	
	@Test(dataProvider="getdata")
	public void browsers(String em,String pa,String first,String last,String en,String epass) throws IOException
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
		
		data dt=new data(driver);
		
		dt.email1(em);
		dt.pass1(pa);
		dt.firstname1(first);
		dt.lastname1(last);
		dt.mnumber1(en);
		dt.npassword1(epass);
		dt.month();
		dt.day();
		dt.year();
		dt.radio();
		dt.footer();
		driver.close();
			
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][6];
		data[0][0]="aman@kaman";
		data[0][1]="12345";
		data[0][2]="mukul";
		data[0][3]="diba";
		data[0][4]="54321";
		data[0][5]="amin8765";
		data[1][0]="amanam@kaman";
		data[1][1]="am12345";
		data[1][2]="ammukul";
		data[1][3]="amdiba";
		data[1][4]="am54321";
		data[1][5]="amamin8765";
		data[2][0]="amanam@kaman";
		data[2][1]="am12345";
		data[2][2]="ammukul";
		data[2][3]="amdiba";
		data[2][4]="am54321";
		data[2][5]="amamin8765";
		return data;
		
	}
	
//	@Test
//	public void amam() throws IOException
//	{
//		driver=browser();
//		driver.get("https://facebook.com");
//		driver.manage().window().maximize();
//		data dt=new data(driver);
//		dt.email1("akaham2rafik");
//		dt.pass1("hgshasgahas");
//		driver.close();
//			
//		}
}
