package com.kaberaClinics.pages;

public class DriverPage extends ExtendedPageObject {}
//    DriverDashboard driverDashboard;
//
//    public void clickOnTripHistoryLink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ripplelink.ng-tns-c9-2.ng-star-inserted")).get(5).click();
//        Thread.sleep(2999);
//    }
//
//    public String getPageTitile() throws InterruptedException {
//        waitForPageLoaded();
//        String title = getDriver().findElements(By.cssSelector(".section-title.m-b-20")).get(0).getText();
//        return title;
//    }
//
//    public String getSubHeading() throws InterruptedException {
//        waitForPageLoaded();
//        Thread.sleep(2999);
//        String subHeading = getDriver().findElements(By.className("col-lg-12")).get(0).getText();
//        System.out.println("subHeading " + subHeading);
//        return subHeading;
//    }
//
//    public void clickOnCurrentTrips() throws InterruptedException {
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[text()='Current Trips']"));
//        getDriver().findElement(By.xpath("//span[text()='Current Trips']")).click();
//    }
//
//    public void clickOnTripHistory() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElement(By.xpath("//span[@class=\"ui-tabview-title\" and text()='Trip History']")).click();
//    }
//
//    public String getSubHeading1() throws InterruptedException {
//        waitForPageLoaded();
//        String subHeading1 = getDriver().findElements(By.className("col-lg-12")).get(1).getText();
//        System.out.println("subHeading " + subHeading1);
//        return subHeading1;
//    }
//
//    public String getSubHeading2() throws InterruptedException {
//        waitForPageLoaded();
//        String subHeading2 = getDriver().findElements(By.className("col-lg-12")).get(2).getText();
//        System.out.println("subHeading " + subHeading2);
//        return subHeading2;
//    }
//
//    public void clickOnPersonalSettingsPage() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ripplelink.ng-tns-c9-2.ng-star-inserted")).get(3).click();
//        Thread.sleep(2999);
//    }
//
//    public void clickOnDocumentlink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(1).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnTripslink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(2).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnLimitationslink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(3).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnCalendarlink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(4).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnTrustlink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(5).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnTimeRecordlink() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElements(By.cssSelector(".ui-state-default.ui-corner-top.ng-star-inserted")).get(6).click();
//        Thread.sleep(1999);
//    }
//
//    public String getActiveTripStatus() throws InterruptedException {
//        waitForPageLoaded();
//        return getDriver().findElements(By.cssSelector(".card.card-w-title")).get(0).getText();
//    }
//
//    public void getFutureTripSection() throws InterruptedException {
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,250)");
//
//    }
//
//    public String getBookedTripStatus() throws InterruptedException {
//        waitForPageLoaded();
//        String str = getDriver().findElements(By.cssSelector(".card.card-w-title")).get(1).getText();
//        return str;
//    }
//
//    public void getCompletedTripSection() throws InterruptedException {
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,2500)");
//
//    }
//
//    public String getCompletedTripStatus() throws InterruptedException {
//        waitForPageLoaded();
//        String str = getDriver().findElements(By.cssSelector(".card.card-w-title")).get(2).getText();
//        return str;
//    }
//
//    public String getPreferList() throws InterruptedException {
//        waitForPageLoaded();
//        String str = getDriver().findElements(By.cssSelector(".card.card.card-w-title")).get(0).getText();
//        return str;
//    }
//
//    public String getBlockList() throws InterruptedException {
//        waitForPageLoaded();
//        String str = getDriver().findElements(By.cssSelector(".card.card.card-w-title")).get(1).getText();
//        return str;
//    }
//
//    public void clickOnLogoutButton() throws InterruptedException {
//        waitForPageLoaded();
//        getDriver().findElement(By.xpath("//*[@id=\"body\"]/app-root/div/app-layout/div/div/app-breadcrumb/div/div/a")).click();
//        Thread.sleep(2999);
//    }
//
//    public String getLoginPageText() throws InterruptedException {
//        waitForPageLoaded();
//        waitForPageLoaded();
////        String str = getDriver().findElements(By.cssSelector(".ng-untouched.ng-pristine.ng-invalid")).get(0).getText();
//        String str=getDriver().findElements(By.xpath("//h1")).get(0).getText();
//        return str;
//    }
//
//    public void personalSettings() throws InterruptedException{
//        waitForPageLoaded();
//        getDriver().findElement(By.xpath("//*[@id=\"body\"]/app-root/div/app-layout/div/app-menu/div/p-scrollpanel/div/div[1]/div/ul/li[4]/a")).click();
//        getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
//        waitForTextToAppear("Driver Profile");
//
//    }
//    public String getTripHistoryTitle() throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        waitForTextToAppear("Trip History");
//        Thread.sleep(1999);
//        String str=getDriver().findElement(By.xpath("//h1[text()='Trip History']")).getText();
//        return str;
//
//    }
//
//    @FindBy(xpath = "//span[text()='Driver']")
//    WebElementFacade driver_sublink;
//    public void clickOnDriverSubLink() throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[text()='Driver']"));
//        waitForPageLoaded();
//        Thread.sleep(2999);
//        driver_sublink.click();
//    }
//
//    @FindBy(xpath = "//span[text()='Add New Driver']")
//    WebElementFacade addNewDriver_btn;
//    public void clickOnAddNewDriverButton()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[text()='Add New Driver']"));
//        addNewDriver_btn.click();
//        Thread.sleep(2999);
//    }
//
//    public String getDriverPageTable() throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-table"));
//        JavascriptExecutor js=(JavascriptExecutor) getDriver();
//        String str=(String)js.executeScript("return document.getElementsByClassName('ui-table-thead')[0].innerText");
//        System.out.println("table is "+str);
//        return str;
//    }
//
//    @FindBy(xpath = "//*[@id='row-0']")
//    WebElementFacade driverRow;
//    @FindBy(xpath = "//thead[@class='ui-table-thead']")
//    WebElementFacade driverColumn;
//    public boolean isDriverListDisplayed() throws InterruptedException{
//        waitForPageLoaded();
//        if(driverRow.isPresent()){
//          return driverRow.isDisplayed();
//        }
//
//        else {
//            return driverColumn.isDisplayed();
//        }
//    }
//
//    @FindBy(xpath = "//div[3]//opr-input-text/span//input[@placeholder=\"First Name\"]")
//    WebElementFacade first_name;
//    @FindBy(xpath = "//div[4]//opr-input-text//span//input[@placeholder='Last Name']")
//    WebElementFacade last_name;
//    @FindBy(xpath = "//input[@placeholder='Username']")
//    WebElementFacade user_name;
//    @FindBy(xpath = "//input[@placeholder='Phone']")
//    WebElementFacade phone_number;
//    @FindBy(xpath = "//input[@placeholder='Email']")
//    WebElementFacade email;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElementFacade password;
//    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
//    WebElementFacade confirm_password;
//    @FindBy(xpath = "//input[@placeholder='Fleet Number']")
//    WebElementFacade fleet_number;
//    public void fillDriverInformationForm()throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        Random rand = new Random();
//        int vin=10000 + rand.nextInt(90000);
//        System.out.println("random number "+vin);
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        char c1 = (char) (rnd.nextInt(26) + 'a');
//        char c2 = (char) (rnd.nextInt(26) + 'a');
//        char c3 = (char) (rnd.nextInt(26) + 'a');
//        char c4 = (char) (rnd.nextInt(26) + 'a');
//        String str=c+""+c1+""+c2+""+c3+""+c4;
//        System.out.println("String is "+str);
//        String emailString="email"+str+"@abc.com";
//        Thread.sleep(2999);
//        String first="First"+str;
//        TestDataSetup.setDriverName(first);
//        String last="Last"+str;
//        JavascriptExecutor js=(JavascriptExecutor) getDriver();
//        driverDashboard.sendValueByPlaceHolder("First Name",first);
//        Thread.sleep(999);
//        driverDashboard.sendValueByPlaceHolder("Last Name",last);
//        Thread.sleep(999);
//        driverDashboard.sendValueByPlaceHolder("Email",emailString);
//        Thread.sleep(999);
//        driverDashboard.sendValueByPlaceHolder("Phone","8888888888");
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("(//div[2]/div[2]/opr-input-text/span/input)[3]")).sendKeys(str);
//        Thread.sleep(999);
//        driverDashboard.sendValueByPlaceHolder("Fleet Number",vin+"");
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("//div[2]/div[3]/div[1]/opr-input-text/span/input")).sendKeys("123456");
////        driverDashboard.sendValueByPlaceHolder("Password","123456");
//        Thread.sleep(999);
//        driverDashboard.sendValueByPlaceHolder("Confirm Password","123456");
//        Thread.sleep(999);
//        Thread.sleep(2999);
//        js.executeScript("window.scrollBy(0,1500);");
//        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//    }
//
//    @FindBy(className = "ui-growl-message")
//    WebElementFacade msg;
//    public String getMsg(){
//        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-growl-message"));
//        return msg.getText();
//    }
//
//    @FindBy(xpath = "//span[contains(text(),'Save')]")
//    WebElementFacade save_btn;
//    public void changeTheFleetNumberAndClickOnSaveBtn() throws InterruptedException{
//        Thread.sleep(1999);
//        Thread.sleep(1999);
//        save_btn.click();
//
//    }
//    @FindBy(className = "ui-dropdown-trigger-icon")
//    WebElementFacade dropdown_menu;
//    @FindBy(xpath = "//input[@placeholder='Enter Search']")
//    WebElementFacade inputSearchValueField;
//    public void selectSeartchTypeAndEnterValue(String searchType, String searchValue)throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-trigger-icon"));
//        Thread.sleep(2999);
//        getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-trigger-icon")).get(1).click();
//        int len= getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).size();
//        System.out.println("size "+len);
//        for(int i=0;i<len;i++){
//            String str=getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).get(i).getText();
//            System.out.println("search type for index "+i+" type "+str);
//            if(str.equals(searchType)){
//                System.out.println("in if condition with index ");
//                getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).get(i).click();
//                break;
//            }
//        }
//        Thread.sleep(999);
//        inputSearchValueField.sendKeys(searchValue);
//        Thread.sleep(999);
//        getDriver().findElements(org.openqa.selenium.By.className("ui-inputgroup-addon-right")).get(0).click();
//
//    }
//
//    @FindBy(xpath = "//span[text()='Save']")
//    WebElementFacade save_btn2;
//    public void fillDriverInformationFormAndClickOnSaveBtn()throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        Thread.sleep(2999);
//        Random rand = new Random();
//        int vin=10000 + rand.nextInt(90000);
//        System.out.println("random number "+vin);
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        char c1 = (char) (rnd.nextInt(26) + 'a');
//        char c2 = (char) (rnd.nextInt(26) + 'a');
//        char c3 = (char) (rnd.nextInt(26) + 'a');
//        char c4 = (char) (rnd.nextInt(26) + 'a');
//        String str=c+""+c1+""+c2+""+c3+""+c4;
//        System.out.println("String is "+str);
//        String emailString="email"+str+"@abc.com";
//        Thread.sleep(2999);
////        first_name.sendKeys("First");
//        String first="First"+str;
//        String last="Last"+str;
//        JavascriptExecutor js=(JavascriptExecutor) getDriver();
//        getDriver().findElements(By.className("ui-inputtext")).get(11).sendKeys(first);
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(12).sendKeys(last);
//        Thread.sleep(999);
//        js.executeScript("document.getElementsByClassName('ui-inputtext')[15].value='"+emailString+"'");
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(16).sendKeys("8888888888");
////        getDriver().findElements(By.className("ui-inputtext")).get(27).sendKeys(str);
//        Thread.sleep(999);
//        fleet_number.sendKeys(vin+"");
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(27).sendKeys("123456");
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(28).sendKeys("123456");
//        Thread.sleep(999);
//        getDriver().findElement(By.className("fa-calendar")).click();
//        driverDashboard.clickOnGivenDate("2");
////        getDriver().findElement(By.xpath("//input[@placeholder='Driver Percent']")).sendKeys("80");
////        getDriver().findElements(By.className("ui-inputtext")).get(33).sendKeys("80");
//        js.executeScript("document.getElementsByClassName('ui-inputtext')[33].value='80'");
//        Thread.sleep(2999);
////        js.executeScript("window.scrollBy(0,1500);");
////        Thread.sleep(60999);
//        getDriver().findElements(By.className("ui-inputtext")).get(26).sendKeys(str+"abc");
//        save_btn2.click();
//        Thread.sleep(1999);
//    }
//
//    @FindBy (xpath = "(//input[@placeholder='Email'])[2]")
//    WebElementFacade email_field;
//    public void editEmailAddressAndClickOnSaveButton() throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        Random rand = new Random();
//        int vin=100 + rand.nextInt(900);
//        System.out.println("random number "+vin);
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        char c1 = (char) (rnd.nextInt(26) + 'a');
//        char c2 = (char) (rnd.nextInt(26) + 'a');
//        char c3 = (char) (rnd.nextInt(26) + 'a');
//        char c4 = (char) (rnd.nextInt(26) + 'a');
//        String str=c+""+c1+""+c2+""+c3+""+c4+vin;
//        System.out.println("String is "+str);
//        String emailString="email"+str+"@abc.com";
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
//        email_field.clear();
//        Thread.sleep(999);
//        email_field.sendKeys(emailString);
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("(//div[2]/div[2]/opr-input-text/span/input)[3]")).clear();
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("(//div[2]/div[2]/opr-input-text/span/input)[3]")).sendKeys(str);
//        save_btn.click();
//    }
//
//    @FindBy(xpath = "(//input[@placeholder='First Name'])[2]")
//    WebElementFacade firstName;
//    @FindBy(xpath = "(//input[@placeholder='Last Name'])[2]")
//    WebElementFacade lastName;
//    @FindBy(xpath = "(//input[@placeholder='Email'])[2]")
//    WebElementFacade emailField;
//    @FindBy(xpath = "(//input[@placeholder='Phone'])[2]")
//    WebElementFacade phoneField;
//    @FindBy(xpath = "//input[@placeholder='Secondary Phone']")
//    WebElementFacade secondaryPhoneField;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElementFacade passwordField;
//    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
//    WebElementFacade confirmPasswordField;
//
//    public void fillDriverInformationFormWithInvalidDetails()throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        Random rand = new Random();
//        int vin=10000 + rand.nextInt(90000);
//        System.out.println("random number "+vin);
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        char c1 = (char) (rnd.nextInt(26) + 'a');
//        char c2 = (char) (rnd.nextInt(26) + 'a');
//        char c3 = (char) (rnd.nextInt(26) + 'a');
//        char c4 = (char) (rnd.nextInt(26) + 'a');
//        String str=c+""+c1+""+c2+""+c3+""+c4;
//        System.out.println("String is "+str);
//        Thread.sleep(2999);
//        String first="First"+str;
//        String last="Last"+str;
//        JavascriptExecutor js=(JavascriptExecutor) getDriver();
//        firstName.sendKeys(first);
//        Thread.sleep(999);
//        lastName.sendKeys(last);
//        Thread.sleep(999);
//        emailField.sendKeys("emailinvalid");
//        Thread.sleep(999);
//        phoneField.sendKeys("8888888888");
//        Thread.sleep(999);
//        secondaryPhoneField.sendKeys("8888888888");
//        Thread.sleep(999);
//        fleet_number.sendKeys(vin+"");
//        Thread.sleep(999);
//        passwordField.sendKeys("123");
//        Thread.sleep(999);
//        confirmPasswordField.sendKeys("123");
//        Thread.sleep(999);
//        Thread.sleep(2999);
//        js.executeScript("window.scrollBy(0,1500);");
//        Thread.sleep(1999);
//    }
//
//    public String getEmailErrorMsg(){
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".ui-message.ui-messages-error.ui-corner-all.ng-star-inserted"));
//        return getDriver().findElement(By.cssSelector(".ui-message.ui-messages-error.ui-corner-all.ng-star-inserted")).getText();
//    }
//    public void enterInvalidEmail(String email,String phone) throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.cssSelector(".ui-inputtext"));
////        getDriver().findElements(By.cssSelector(".ui-inputtext")).get(16).clear();
//        emailField.clear();
//        Thread.sleep(999);
//        emailField.sendKeys(email);
//        Thread.sleep(999);
//        phoneField.clear();
//        Thread.sleep(999);
//        phoneField.sendKeys(phone);
////        getDriver().findElements(By.cssSelector(".ui-inputtext")).get(16).sendKeys(phone);
////        getDriver().findElements(By.cssSelector(".ui-inputtext")).get(15).clear();
////        getDriver().findElements(By.cssSelector(".ui-inputtext")).get(15).sendKeys(email);
//    }
//
//    public void clickOnGivenButtonName(String buttonName)throws InterruptedException{
//        Thread.sleep(2999);
//        String xpathExpression="//button[text()='"+buttonName+"']";
//        getDriver().findElement(By.xpath(xpathExpression)).click();
//        Thread.sleep(1999);
//    }
//
//    public void clickOnProfileIcon() throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.className("profile-image-wrapper"));
//        getDriver().findElement(By.className("profile-image-wrapper")).click();
//        Thread.sleep(999);
//    }
//    public void fillDriverInformationFormAndClickOnSaveBtn2()throws InterruptedException{
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("section-title"));
//        Thread.sleep(2999);
//        Random rand = new Random();
//        int vin=100000 + rand.nextInt(900000);
//        int vin1=100 + rand.nextInt(9000);
//        System.out.println("random number "+vin);
//        Random rnd = new Random();
//        char c = (char) (rnd.nextInt(26) + 'a');
//        char c1 = (char) (rnd.nextInt(26) + 'a');
//        char c2 = (char) (rnd.nextInt(26) + 'a');
//        char c3 = (char) (rnd.nextInt(26) + 'a');
//        char c4 = (char) (rnd.nextInt(26) + 'a');
//        char c5 = (char) (rnd.nextInt(26) + 'c');
//        String usrname=c+""+c1+""+c2+""+c3+""+c4+""+c5;
//        String str=c+""+c1+""+c2+""+c3+""+c4;
//        System.out.println("String is "+str);
//        String emailString="email"+c3+""+c4+""+c4+""+vin1+"@xyz.com";
//        Thread.sleep(2999);
////        first_name.sendKeys("First");
//        String first="First"+str;
//        String last="Last"+str;
//        JavascriptExecutor js=(JavascriptExecutor) getDriver();
//        getDriver().findElements(By.className("ui-inputtext")).get(11).sendKeys(first);
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(12).sendKeys(last);
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("(//input[@placeholder=\"Email\"])[2]")).sendKeys(emailString);
////        js.executeScript("document.getElementsByClassName('ui-inputtext')[15].value='"+emailString+"'");
//        Thread.sleep(999);
//        getDriver().findElements(By.className("ui-inputtext")).get(26).sendKeys(usrname);
//        Thread.sleep(999);
////        getDriver().findElements(By.className("ui-inputtext")).get(16).sendKeys("8888888888");
//        getDriver().findElement(By.xpath("(//input[@placeholder='Phone'])[2]")).sendKeys("8888888888");
////        getDriver().findElements(By.className("ui-inputtext")).get(27).sendKeys(str);
//        Thread.sleep(999);
//        fleet_number.sendKeys(vin+"");
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
////        getDriver().findElements(By.className("ui-inputtext")).get(27).sendKeys("123456");
//        Thread.sleep(999);
//        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("123456");
////        getDriver().findElements(By.className("ui-inputtext")).get(28).sendKeys("123456");
//        Thread.sleep(999);
////        getDriver().findElement(By.className("fa-calendar")).click();
////        driverDashboard.clickOnGivenDate("2");
//        Thread.sleep(2999);
//        save_btn2.click();
//    }
//
//    @FindBy(xpath = "//label[text()='ACTIVE']")
//    WebElementFacade status_active;
//    @FindBy(xpath = "//opr-select-status/div/p-dropdown/div/div[3]/span")
//    WebElementFacade statusDropdown;
//
//    public void clickOnStatusDropDownMenu()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//opr-select-status/div/p-dropdown/div/div[3]/span"));
//         JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
//        Thread.sleep(1999);
//        statusDropdown.click();
//        Thread.sleep(1999);
//    }
//    @FindBy(xpath = "//label[text()='Select Duty Status']")
//    WebElementFacade select_duty_status;
//    public void selectDriverDutyStatus(){
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[text()='Add New Driver']"));
//        select_duty_status.click();
//    }
//
//    @FindBy(xpath = "//div/p-radiobutton[2]/div/div[2]")
//    WebElementFacade noRadioBtn;
//    public void clickOnNoBtn()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        noRadioBtn.click();
//    }
//
//    @FindBy(xpath = "//p-radiobutton[1]//label[text()='Yes']")
//    WebElementFacade yesRadioBtn;
//    public void clickOnYesBtn()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        yesRadioBtn.click();
////        JavascriptExecutor js = (JavascriptExecutor) getDriver();
////        js.executeScript("document.getElementsByClassName('ui-radiobutton-icon')[12].click();");
//    }
//
//    @FindBy(xpath = "//label[text()='LOG Verified']")
//    WebElementFacade logVerified;
//    @FindBy(xpath = "//input[@id='selectTimeRange']")
//    WebElementFacade logVerifiedDate;
//    @FindBy(xpath = "//span[text()='Today']")
//    WebElementFacade logVerifiedDateToday;
//    public void clickOnCheckLogVerified()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//label[text()='LOG Verified']"));
//
////        js.executeScript("document.getElementsByClassName('ui-chkbox-icon')[26].click();");
//        logVerified.click();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@id='selectTimeRange']"));
//        logVerifiedDate.click();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//span[text()='Today']"));
//        logVerifiedDateToday.click();
////        waitForPageLoaded();
////        js.executeScript("document.getElementsByClassName('fa fa-fw fa-calendar')[1].click();");
////        driverDashboard.clickPanel("Today");
//    }
//
//    @FindBy(xpath = "//opr-select-recurring-type/span/p-dropdown/div/div[3]/span")
//    WebElementFacade recurringDropDown;
//    public void selectRecurringTypeFees(String arg1)throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        recurringDropDown.click();
////        getDriver().findElements(By.cssSelector(".fa.fa-fw.fa-caret-down")).get(14).click();
//        waitForPageLoaded();
//        driverDashboard.clickPanel(arg1);
//    }
//
//    @FindBy(xpath = "//opr-driver-future-trip-table/div/div/div/p-table/div/div/table/tbody/tr[1]")
//    WebElementFacade tableRow;
//    @FindBy(xpath = "//*[contains(text(),'Current Trips')]")
//    WebElementFacade tripsHead;
//    public boolean isTripsDisplayed()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        if(tableRow.isPresent()){
//            return true;
//        }
//        else if (tripsHead.isPresent()){
//            return true;
//        }
//        return false;
//    }
//
//    @FindBy(xpath = "//span[text()='Trips']")
//    WebElementFacade trips;
////    @FindBy(xpath = "//h1[contains(text(),'Driver Profile ')]")
//    @FindBy(xpath = "//opr-driver-edit/p-tabview/div/ul")
//    WebElementFacade profile;
//    public void clickOnTrips()throws InterruptedException{
//        waitForPageLoaded();
//        Thread.sleep(2999);
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", profile);
//        Thread.sleep(1999);
//        driverDashboard.clickOnTab("Trips");
////        js.executeScript("document.getElementById('ui-tabpanel-41-label').click()");
//    }
//
//    public void clickOnLimitations()throws InterruptedException{
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", profile);
//        Thread.sleep(999);
//        driverDashboard.clickOnTab("Limitations");
//    }
//
//    public void clickOnDriverSetting()throws InterruptedException{
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", profile);
//        Thread.sleep(999);
//        driverDashboard.clickOnTab("Driver Setting");
//    }
//
//    public void clickOnTrustList()throws InterruptedException{
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", profile);
//        driverDashboard.clickOnTab("Trust List");
////        js.executeScript("document.getElementById('ui-tabpanel-12-label').click();");
//    }
//
//    @FindBy(xpath = "//input[@placeholder='Enter Polygon Name']")
//    WebElementFacade polygonName;
//    @FindBy(xpath = "//input[@formcontrolname='polygonName']")
//    WebElementFacade zoneName;
//    public void selectPolygon()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        withTimeoutOf(20, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//p-dropdown/div/div[3]/span)[2]"));
//        getDriver().findElement(By.xpath("(//p-dropdown/div/div[3]/span)[2]")).click();
////        getDriver().findElement(By.xpath("(//*[text()='Select One'])[2]")).click();
//        waitForPageLoaded();
//        polygonName.sendKeys("queen");
//        waitForPageLoaded();
//        Thread.sleep(1999);
//    }
//
//    public void enterZoneName()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
////        waitForTextToAppear("Driver Zone Management");
//        int random =10+(int)(Math.random()*91);
//        String zone = "Queens" + random;
//        zoneName.clear();
//        zoneName.sendKeys(zone);
//    }
//
//    public void clickOnCreateNewZoneBtn()throws InterruptedException{
//        waitForPageLoaded();
//        getDriver().findElements(By.xpath("//span[contains(text(),'Create New Zone')]")).get(1).click();
//    }
//
//    @FindBy(xpath = "//i[@class='fa fa-pencil']")
//    WebElementFacade editZone;
//    @FindBy(xpath = "//i[@class='fa fa-trash']")
//    WebElementFacade deleteZone;
//    public void clickOnEditZoneBtn()throws InterruptedException {
//        waitForPageLoaded();
//        waitForPageLoaded();
//        if (editZone.isPresent()) {
//            editZone.click();
//        } else {
//            driverDashboard.clickPanel("Create New Zone");
//            selectPolygon();
//            driverDashboard.clickPanel("Queens - County");
//            enterZoneName();
//            clickOnCreateNewZoneBtn();
//            waitForPageLoaded();
//            editZone.click();
//        }
//    }
//
//    public void clickOnDeleteZoneBtn()throws InterruptedException {
//        waitForPageLoaded();
//        waitForPageLoaded();
//        if (deleteZone.isPresent()) {
//            deleteZone.click();
//        } else {
//            driverDashboard.clickPanel("Create New Zone");
//            selectPolygon();
//            enterZoneName();
//            driverDashboard.clickPanel("Queens - County");
//            clickOnCreateNewZoneBtn();
//            waitForPageLoaded();
//            deleteZone.click();
//        }
//    }
//    @FindBy(xpath = "//input[@placeholder='Enter Name']")
//    WebElementFacade enterName;
//    @FindBy(xpath = "//label[contains(text(),'Add Customer to...')]")
//    WebElementFacade preferenceType;
//    public void enterCustomerName()throws InterruptedException{
//        waitForPageLoaded();
//        waitForTextToAppear("Driver Profile");
//        int random =10+(int)(Math.random()*91);
//        int random1 =10+(int)(Math.random()*91);
//        String name = "Melody Wu" + random + random1;
//        enterName.sendKeys(name);
//        waitForPageLoaded();
//        waitForPageLoaded();
//    }
//
//    public void clickOnPreferenceTypeDropDown()throws InterruptedException{
//        waitForPageLoaded();
//        preferenceType.click();
//    }
//
//    @FindBy(xpath = "//tr[1]/td[8]/button/span[1]")
//    WebElementFacade deleteTrust;
//    public void clickOnDeleteTrust()throws InterruptedException {
//        waitForPageLoaded();
//        if (deleteTrust.isPresent()) {
//            deleteTrust.click();
//        } else {
//            enterCustomerName();
//            clickOnPreferenceTypeDropDown();
//            driverDashboard.clickPanel("FAVORITE");
//            driverDashboard.clickPanel("Submit");
//            waitForPageLoaded();
//            deleteTrust.click();
//        }
//    }
//
//    @FindBy(xpath = "//label[contains(text(),'Select Duty Status')]")
//    WebElementFacade dutyStatusDropDown;
//    public void clickOnDutyStatusDropDown()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
////        getDriver().findElements(By.cssSelector(".fa.fa-close")).get(4).click();
//        dutyStatusDropDown.click();
//    }
//
//    public void selectStatusFromDropDown(String status)throws InterruptedException{
//        waitForPageLoaded();
//        String status1 = "//span[contains(text(),'"+status+"')]";
//        getDriver().findElement(By.xpath(status1)).click();
//    }
//
//    @FindBy(xpath = "//p-paginator/div//p-dropdown/div/label")
//    private WebElementFacade select_ContactLimit;
//    public void clickOnPaginationDropDown()throws InterruptedException {
//        waitForPageLoaded();
//        waitForPageLoaded();
//        if (select_ContactLimit.isPresent()) {
//            select_ContactLimit.click();
//        }
//    }
//
//    public void changeNoOfContactView(int limit)throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//        log.info("changeNoOfContactView : " + limit);
//        String xpathExpression="//span[text()='"+limit+"']";
//        int len = getDriver().findElements(By.xpath(xpathExpression)).size();
//        System.out.println("Size = "+len);
//        if (len>1){
//            int index = len - 1;
//            getDriver().findElements(By.xpath(xpathExpression)).get(index).click();
//        }
//        else{
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
//
//    }
//
//    public int getTotalRowDisplaying() throws InterruptedException{
//        waitForPageLoaded();
//        String xpathExpression = "//tr[@_ngcontent-c19]";
//        System.out.println("rows==" +xpathExpression);
//        int  size =  getDriver().findElements(By.xpath(xpathExpression)).size();
//        return size;
//    }
//    @FindBy(xpath = "//button[text()='Detail']")
//    WebElementFacade detail_button;
//    public void addNewCalendar()throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//button[text()='Detail']"));
//        detail_button.click();
//        Thread.sleep(1999);
//        WebElement from=getDriver().findElement(By.xpath("(//tr//td//td[@class='fc-widget-content'])[4]"));
//        WebElement to=getDriver().findElement(By.xpath("(//tr//td//td[@class='fc-widget-content'])[7]"));
//        Actions act=new Actions(getDriver());
//        act.dragAndDrop(from, to).build().perform();
//        System.out.println("action is done ");
//        Thread.sleep(3999);
//    }
//
//    public boolean isTrashButtonDispayed()throws InterruptedException{
//        waitForPageLoaded();
//        Thread.sleep(1999);
//        int len=getDriver().findElements(By.className("fa-trash")).size();
//        if(len>0){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public void editThecalendar()throws InterruptedException{
//        WebElement from=getDriver().findElement(By.xpath("(//tr//td//td[@class='fc-widget-content'])[7]"));
//        WebElement to=getDriver().findElement(By.xpath("(//tr//td//td[@class='fc-widget-content'])[9]"));
//        Actions act=new Actions(getDriver());
//        act.dragAndDrop(from, to).build().perform();
//        System.out.println("action is done ");
//        Thread.sleep(3999);
//    }
//
//    public void clickOnDeleteIcon(){
//        int len=getDriver().findElements(By.className("fa-trash")).size();
//        if(len>0){
//            WebElement element = getDriver().findElement(By.className("fa-trash"));
//            Actions actions = new Actions(getDriver());
//            actions.moveToElement(element).click().build().perform();
////            getDriver().findElement(By.xpath("//button[@class='tagCloseonSpecific btn btn-xs btn-danger']")).click();
//        }
//    }
//
//    @FindBy(xpath = "(//p-paginator/div//p-dropdown/div/label)[1]")
//    private WebElementFacade select_ContactLimit2;
//    public void changeNoOfContactView1(int limit) throws InterruptedException{
//        log.info("changeNoOfContactView : " + limit);
//        if (select_ContactLimit2.isPresent()) {
//            select_ContactLimit2.click();
//            withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//            String xpathExpression="(//p-paginator//p-dropdown//span[text()='"+limit+"'])[1]";
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
//    }
//    public int getTotalRowDisplaying1() throws InterruptedException{
//        waitForPageLoaded();
//        String xpathExpression = "//opr-driver-favorite-list//div//table//tbody//tr";
//        System.out.println("rows==" +xpathExpression);
//        int  size =  getDriver().findElements(By.xpath(xpathExpression)).size();
//        return size;
//    }
//
//    @FindBy(xpath = "(//p-paginator/div//p-dropdown/div/label)[2]")
//    private WebElementFacade select_ContactLimit3;
//    public void changeNoOfContactView2(int limit) throws InterruptedException{
//        log.info("changeNoOfContactView : " + limit);
//        if (select_ContactLimit3.isPresent()) {
//            select_ContactLimit3.click();
//            withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//            String xpathExpression="(//p-paginator//p-dropdown//span[text()='"+limit+"'])[2]";
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
//    }
//    public int getTotalRowDisplaying2() throws InterruptedException{
//        waitForPageLoaded();
//        String xpathExpression = "//opr-driver-prefer-list//table//tbody//tr";
//        System.out.println("rows==" +xpathExpression);
//        int  size =  getDriver().findElements(By.xpath(xpathExpression)).size();
//        return size;
//    }
//    @FindBy(xpath = "(//p-paginator/div//p-dropdown/div/label)[3]")
//    private WebElementFacade select_ContactLimit4;
//    public void changeNoOfContactView3(int limit) throws InterruptedException{
//        log.info("changeNoOfContactView : " + limit);
//        if (select_ContactLimit4.isPresent()) {
//            select_ContactLimit4.click();
//            withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//            String xpathExpression="(//p-paginator//p-dropdown//span[text()='"+limit+"'])[3]";
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
//    }
//    public int getTotalRowDisplaying3() throws InterruptedException{
//        waitForPageLoaded();
//        String xpathExpression = "//opr-driver-black-list//table//tbody//tr";
//        System.out.println("rows==" +xpathExpression);
//        int  size =  getDriver().findElements(By.xpath(xpathExpression)).size();
//        return size;
//    }
//
//    public void saveTheEmailAddress()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[contains(text(),'email')]"));
//        String email=getDriver().findElement(By.xpath("//span[contains(text(),'email')]")).getText();
//        System.out.println("Email is : "+email);
//        TestDataSetup.setLoginId(email);
//    }
//
//    @FindBy(xpath = "//input[@placeholder='Username/Email']")
//    WebElementFacade email_filed;
//    @FindBy(xpath = "//input[@type='password']")
//    WebElementFacade pass;
//    public boolean enterLoginIdAndInvalidPass() throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//input[@type='password']"));
//        getDriver().findElement(By.className("fa-caret-down")).click();
//        driverDashboard.clickPanel("Driver");
//        for(int i=0;i<20;i++){
//             email_filed.clear();
//             email_filed.sendKeys(TestDataSetup.getLoginId());
//             password.clear();
//            Random rnd = new Random();
//            int number = rnd.nextInt(999999);
//            if(number==123456){
//                password.sendKeys("1236745");
//            }
//            else{
//             password.sendKeys(number+"");
//            }
//             driverDashboard.clickOnTab("Login");
//             Thread.sleep(999);
//            int len=getDriver().findElements(By.className("text-danger")).size();
//            if(len>0){
//                String str=getDriver().findElement(By.className("text-danger")).getText();
//                if(str.equals("User is not active")||str.equals("User is locked for max failed login attempts")){
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    @FindBy(xpath = "//*[@id=\"body\"]/app-root/div/app-layout/div/div/div/opr-driver-edit/h1")
//    WebElementFacade element;
//    public void clickOnDriverSettingTab()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        waitForTextToAppear("Driver Setting");
//		driverDashboard.clickPanel("Driver Setting");
////        js.executeScript("document.getElementById('ui-tabpanel-23-label').click()");
////        getDriver().findElement(By.xpath("//*[@id='ui-tabpanel-23-label']")).click();
//    }
//
//    @FindBy(xpath = "//p-table/div/div[1]/table/thead/tr")
//    WebElementFacade driverColumns;
//    @FindBy(xpath = "(//h2)[1]")
//    WebElementFacade deviceInfoHead;
//
//    public String getDriverColumn()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", driverColumns);
//        String head = driverColumns.getText();
//        System.out.println(head);
//        return head;
//    }
//
//    public void clickOnDriverInfoIcon()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[@id='row-0']/td[15]"));
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.getElementsByClassName('fa fa-lg fa-info-circle')[0].click()");
//    }
//
//    public String getDeviceInformation()throws InterruptedException{
//        waitForPageLoaded();
//        return deviceInfoHead.getText();
//    }
//
//    public void clickOnDocumentTab()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", element);
//        waitForTextToAppear("Driver Setting");
//        driverDashboard.clickPanel("Document");
//    }
//
//    @FindBy(xpath = "//p-header[text()='Send Document(s)']")
//    WebElementFacade documentHead;
//
//    public String getDocumentPage()throws InterruptedException{
//        waitForPageLoaded();
//        return documentHead.getText();
//    }
//
//    @FindBy(xpath = "//span[text()='NY Driver License']")
//    WebElementFacade licenseHead;
//    @FindBy(xpath = "//opr-document-form/form/div/div[1]/div/input")
//    WebElementFacade licenseInput;
//    @FindBy(xpath = "(//span[text()='Save'])[2]")
//    WebElementFacade saveBtn;
//    public void editDriverDocument()throws InterruptedException{
//        waitForPageLoaded();
//        int random =10+(int)(Math.random()*91);
//        int random1 =10+(int)(Math.random()*91);
//        String licenseNumber = "License" + random + random1;
//        licenseInput.sendKeys(licenseNumber);
//    }
//
//    public void clickOnSaveBtn()throws InterruptedException{
//        waitForPageLoaded();
//        saveBtn.click();
//    }
//
//    public void clickOnTimeRecordsTab()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,-2000)");
////        js.executeScript("arguments[0].scrollIntoView();", element);
//        waitForTextToAppear("Time Records");
//        driverDashboard.clickPanel("Time Records");
//    }
//
//    @FindBy(xpath = "//h2[text()='Time Records']")
//    WebElementFacade timeRecordsPage;
//
//    public String getTimeRecordsPage()throws InterruptedException{
//        waitForPageLoaded();
//        return timeRecordsPage.getText();
//    }
//
//    @FindBy(xpath = "(//span[text()='Reset'])[2]")
//    WebElementFacade resetBtn;
//    @FindBy(xpath = "(//input[@placeholder='Password'])[2]")
//    WebElementFacade password1;
//    public void clickOnResetButtonAndResetPassword()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        waitForTextToAppear("Reset");
//        resetBtn.click();
//        waitForPageLoaded();
//        password1.clear();
//        password1.sendKeys("123456");
//        confirm_password.clear();
//        confirm_password.sendKeys("123456");
//    }
//
//    @FindBy(xpath = "//*[@id='row-6']/td[3]")
//    WebElementFacade driverFleetNumber;
//    public void clickOnDriverFleetNumber()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[@id='row-6']/td[3]"));
//        driverFleetNumber.click();
//        Thread.sleep(1999);
//    }
//
//
//    @FindBy(xpath = "//span[text()='Driver Payment']")
//    WebElementFacade driverPaymentBtn;
//    @FindBy(xpath = "//a[text()='Payment']")
//    WebElementFacade driverPaymentPage;
//    @FindBy(xpath = "//label[text()='Driver Payment Calculation Type']")
//    WebElementFacade driverPaymentCalculation;
//    public String getDriverPaymentPage()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        return driverPaymentPage.getText();
//    }
//
//    public String getDriverPaymentCalculationPage()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        return driverPaymentCalculation.getText();
//    }
//
//    public void clickOnDriverPaymentBtn()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", driverPaymentBtn);
//        driverDashboard.clickPanel("Driver Payment");
//    }
//
//    public void clickOnMessageIcon()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.getElementsByClassName('call-message')[0].click()");
//    }
//
//    @FindBy(xpath = "//label[text()='Choose']")
//    WebElementFacade chooseDriverDropdown;
//    @FindBy(xpath = "//div[2]/ul/li[1]/div/div[2]")
//    WebElementFacade driverCheckbox;
//    public void selectADriver()throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        chooseDriverDropdown.click();
//        waitForPageLoaded();
//        driverCheckbox.click();
//    }
//
//    @FindBy(xpath = "//div/div[3]/div/textarea")
//    WebElementFacade msgSection;
//    @FindBy(xpath = "//span[text()='Send']")
//    WebElementFacade sendButton;
//    public void enterAMEssage(String message)throws InterruptedException{
//        waitForPageLoaded();
//        msgSection.sendKeys(message);
//    }
//
//    public void clickOnSendButton()throws InterruptedException{
//        waitForPageLoaded();
//        sendButton.click();
//    }
//    public void clickOnSendButton1()throws InterruptedException{
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.getElementsByClassName('ui-button-text ui-clickable')[18].click()");
////        sendButton.click();
//    }
//
//    public boolean checkEleentDisplayed(String tabName)throws InterruptedException{
//        String xpathExpression="//*[text()='"+tabName+"']";
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
//        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(500);
//        int len=getDriver().findElements(By.xpath(xpathExpression)).size();
//        if(len>0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public boolean checkElementDisplayed(String tabName)throws InterruptedException{
//        String xpathExpression="//*[text()='"+tabName+"']";
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
//        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(500);
//        int len=getDriver().findElements(By.xpath(xpathExpression)).size();
//        if(len>0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public void clickOnYesOrNoButtonAndSaveButton(String btn1,String btn2){
//        String xpathExpression="//p-radiobutton//label[text()='"+btn1+"']";
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath(xpathExpression));
//        getDriver().findElement(By.xpath(xpathExpression)).click();
//        String xpathExpression2="//opr-driver-setting//span[text()='"+btn2+"']";
//        getDriver().findElement(By.xpath(xpathExpression2)).click();
//    }
//
//    public void clickOnDateRangeAndSelectAnOption(String dateRange) throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.cssSelector(".field-stretch.ui-inputtext"));
//        getDriver().findElement(By.cssSelector(".field-stretch.ui-inputtext")).click();
//        waitForPageLoaded();
//        Thread.sleep(1000);
//        String xpathExpression="//button[text()='"+dateRange+"']";
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath(xpathExpression));
//        Thread.sleep(1000);
//        getDriver().findElement(By.xpath(xpathExpression)).click();
//        waitForPageLoaded();
//        Thread.sleep(1000);
//    }
//
//    public int getTotalRowDisplayingInTripPage() throws InterruptedException{
//        waitForPageLoaded();
//        String xpathExpression = "//p-table//table//tbody//tr";
//        System.out.println("rows==" +xpathExpression);
//        int  size =  getDriver().findElements(By.xpath(xpathExpression)).size();
//        return size;
//    }
//
//    @FindBy(xpath = "(//opr-trip-table-history/opr-trip-search//p-dropdown//label)[2]")
//    WebElementFacade trip_status;
//    public void changesTripStatus(String tripStatus) throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("(//opr-trip-table-history/opr-trip-search//p-dropdown//label)[2]"));
//        trip_status.click();
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//        driverDashboard.clickPanel(tripStatus);
//        waitForPageLoaded();
//        Thread.sleep(2000);
//    }
//
//    public boolean isSelectedStatusDisplayed(String status)throws InterruptedException{
//        waitForPageLoaded();
//        String filterRowXpath="//table//tbody//tr//td[text()='"+status+"']";
//        int filterRowLen=getDriver().findElements(By.xpath(filterRowXpath)).size();
//        int totalRow=getDriver().findElements(By.xpath("//p-table//table//tbody//tr")).size();
//        if(filterRowLen==totalRow){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    @FindBy(xpath = "(//dri-banking//form//p-dropdown//label)[1]")
//    WebElementFacade select_card_type;
//    public void selectpaymentcard(String paymentcardType) throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("(//dri-banking//form//p-dropdown//label)[1]"));
//        select_card_type.click();
//        driverDashboard.clickPanel(paymentcardType);
//    }
//
//    @FindBy(xpath = "(//my-only-driver//form//p-dropdown//label)[2]")
//    WebElementFacade card_month;
//    public void enterCardNumberAndDetails(String cardNumber)throws InterruptedException{
//        driverDashboard.sendValueByPlaceHolder("Card Number",cardNumber);
//        Random random = new Random();
//        int cvc = random.nextInt(900) + 100;
//        driverDashboard.sendValueByPlaceHolder("CVC",cvc+"");
//        card_month.click();
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//        getDriver().findElements(By.className("ui-dropdown-item")).get(4).click();
//        driverDashboard.sendValueByPlaceHolder("Exp. Year","2021");
//        Thread.sleep(2999);
//    }
//
//    public void changeNoOfTriplistView(int limit)throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-item"));
//        log.info("changeNoOfContactView : " + limit);
//        String xpathExpression="//p-dropdown//ul//li//span[text()='"+limit+"']";
//        int len = getDriver().findElements(By.xpath(xpathExpression)).size();
//        System.out.println("Size = "+len);
//        if (len>1){
//            int index = len - 1;
//            getDriver().findElements(By.xpath(xpathExpression)).get(index).click();
//        }
//        else{
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
//
//    }
//    public boolean getMsg1(){
//        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-growl-message"));
//        String str=msg.getText();
//        if(str.equals("customer already existed in this group") || str.equals("Added Successfully.")) {
//            return true;
//        }
//
//        return false;
//    }
//
//    @FindBy(xpath ="//*[@id='row-0']/td[1]/ui-switch")
//    WebElementFacade firstList;
//
//    @FindBy(xpath ="//*[@id='row-0']/td[1]/i")
//    WebElementFacade firstRow;
//
//    public boolean getStatus(String arg1)throws InterruptedException{
//        waitForPageLoaded();
//        waitForPageLoaded();
//        waitForPageLoaded();
//        if(firstList.isPresent()) {
//            withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[@id='row-0']/td[1]/ui-switch"));
//            String status = firstList.getAttribute("ng-reflect-checked");
//            if(status.contains(arg1)){
//                return true;
//            }
//        }
//        else{
//            return false;
//        }
//        return true;
//    }
//
//    @FindBy(xpath = "//opr-input-text/span/div")
//    WebElementFacade inputFieldError;
//    public String getInputFieldError()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//opr-input-text/span/div"));
//        String errorMessage = inputFieldError.getText();
//        return errorMessage;
//    }
//
//    @FindBy(className = "switch checked switch-medium")
//    WebElementFacade statusToggleButton;
//    @FindBy(xpath = "//span[text()='Select the reason']")
//    WebElementFacade popupHeading;
//    public void clickOnStatusToggleButton()throws InterruptedException{
//        waitForPageLoaded();
//        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[@id='row-0']/td[1]"));
////        statusToggleButton.click();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.getElementsByClassName('switch switch-medium')[0].click()");
//    }
//
//    public String getReasonPopup()throws InterruptedException{
//        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        String str = popupHeading.getText();
////        String str=(String)js.executeScript("return document.getElementById('ui-dialog-13-label').innerText");
//        return str;
//    }
//
//    public void selectAReason(String reason)throws InterruptedException{
//        waitForPageLoaded();
//        int index = 1;
//        if( reason.equals("Driver no longer with company")){
//            index=2;
//        }
//        else if (reason.equals("")){
//            index =2;
//        }
//        String xpath = "//p-dialog[2]/div/div[2]/div/div["+index+"]/p-radiobutton/div/div[2]";
//        getDriver().findElement(By.xpath(xpath)).click();
//    }
//
//    public void enterValidDetails(String fieldName )throws InterruptedException{
//        waitForPageLoaded();
//        int random1 =10+(int)(Math.random()*91);
//        Random rand = new Random();
//        char c = (char) (rand.nextInt(26) + 'a');
//        int index = 0;
//        if(fieldName.equals("First Name")){
//            index = 2;
//            String firstName = "firstName" + c + c;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).clear();
//            Thread.sleep(999);
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(firstName);
//        }
//        else if(fieldName.equals("Last Name")){
//            index = 2;
//            String lastName = "lastName" + c + c;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).clear();
//            Thread.sleep(999);
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(lastName);
//        }
//        else if(fieldName.equals("Username")){
//            String userName = "username" + c + c + "_123";
//            String xpathExpression = "(//div[2]/div[2]/opr-input-text/span/input)[3]";
//            getDriver().findElement(By.xpath(xpathExpression)).clear();
//            Thread.sleep(999);
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(userName);
//
//        }
//        else if (fieldName.equals("Password")){
//            index = 2;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).clear();
//            Thread.sleep(999);
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys("123456");
//
//        }
//        else if (fieldName.equals("Email")){
//            index = 2;
//            String emailID = "testDriver" + c + random1 + "@gmail.com";
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).clear();
//            Thread.sleep(999);
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(emailID);
//        }
//    }
//
//    public void enterInValidDetails(String fieldName , String inputData)throws InterruptedException{
//        waitForPageLoaded();
//        int random1 =10+(int)(Math.random()*91);
//        Random rand = new Random();
//        char c = (char) (rand.nextInt(26) + 'a');
//        int index = 0;
//        if(fieldName.equals("First Name")){
//            index = 2;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(inputData);
//        }
//        else if(fieldName.equals("Last Name")){
//            index = 2;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(inputData);
//        }
//        else if(fieldName.equals("Username")){
//            String xpathExpression = "(//div[2]/div[2]/opr-input-text/span/input)[3]";
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(inputData);
//        }
//        else if (fieldName.equals("Password")){
//            String xpathExpression = "//div[2]/div[3]/div[1]/opr-input-text/span/input";
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(inputData);
//        }
//        else if (fieldName.equals("Email")){
//            index = 2;
//            String xpathExpression = "(//input[@placeholder='"+fieldName+"'])["+index+"]";
//            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(inputData);
//        }
//    }
//
//    @FindBy(xpath = "//div[2]/div[3]/div[1]/opr-input-text/span/input")
//    WebElementFacade inputPasswordField;
//    public void enterPassword(String pass)throws InterruptedException{
//        waitForPageLoaded();
//        inputPasswordField.clear();
//        Thread.sleep(999);
//        inputPasswordField.sendKeys(pass);
//    }
//
//    @FindBy(xpath = "(//input[@placeholder='Confirm Password'])[1]")
//    WebElementFacade inputConfirmPasswordField;
//    public void enterInValidConfirmPassword(String pass)throws InterruptedException{
//        waitForPageLoaded();
//        inputConfirmPasswordField.clear();
//        Thread.sleep(999);
//        inputConfirmPasswordField.sendKeys(pass);
//    }
//
//    public void enterValidConfirmPassword(String pass)throws InterruptedException{
//        waitForPageLoaded();
//        inputConfirmPasswordField.clear();
//        Thread.sleep(999);
//        inputConfirmPasswordField.sendKeys(pass);
//    }
//
//    public void selectSeartchTypeAndEnterValue1(String searchType)throws InterruptedException{
//        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.className("ui-dropdown-trigger-icon"));
//        Thread.sleep(2999);
//        getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-trigger-icon")).get(1).click();
//        int len= getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).size();
//        System.out.println("size "+len);
//        for(int i=0;i<len;i++){
//            String str=getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).get(i).getText();
//            System.out.println("search type for index "+i+" type "+str);
//            if(str.equals(searchType)){
//                System.out.println("in if condition with index ");
//                getDriver().findElements(org.openqa.selenium.By.className("ui-dropdown-item")).get(i).click();
//                break;
//            }
//        }
//        Thread.sleep(999);
//        String searchValue = TestDataSetup.getDriverName();
//        inputSearchValueField.sendKeys(searchValue);
//        Thread.sleep(999);
//        getDriver().findElements(org.openqa.selenium.By.className("ui-inputgroup-addon-right")).get(0).click();
//
//    }
//
//
//
//
//
//}
