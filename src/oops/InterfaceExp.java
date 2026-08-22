package oops;

//webdriver interface declaration
interface WebDriver{
    void get();
    void getTitle();
}

//chromedriver class implementing webdriver methods
class ChromeDriver implements WebDriver{
	@Override
    public void get(){
        System.out.println("get method of chromedriver");
    }
	
	@Override
    public void getTitle(){
        System.out.println("getTitle method of chromedriver");
    }
}

//edgedriver class implementing webdriver methods
class EdgeDriver implements WebDriver{
	@Override
    public void get(){
        System.out.println("get method of edgedriver");
    }
	
	@Override
    public void getTitle(){
        System.out.println("getTitle method of edgedriver");
    }
}

public class InterfaceExp {
	public static void main (String[] args) {
		//creating reference variable of webdriver and assigning chromedriver instance
        WebDriver driver = new ChromeDriver();
        
        driver.get();      //accessing chromedriver implemented methods
        driver.getTitle();        
    }
}
