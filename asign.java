

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class asign {
	
	

	 public static void main(String[] args)
	 {
	  WebDriver p = new FirefoxDriver();
	  p.get("http://www.kaymu.pk");
	  WebElement a = p.findElement(By.xpath("//[@*]"));
	  System.out.println(a);
	  p.close();
	 }
	}


