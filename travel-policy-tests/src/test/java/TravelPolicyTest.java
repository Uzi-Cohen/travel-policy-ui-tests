import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;

public class TravelPolicyTest extends BaseTest {
    @Test
    public void openTravelPolicyPage() {
        //פתח את כתובת האתר בדפדפן כרום -  https://digital.harel-group.co.il/travel-policy
        driver.get("https://digital.harel-group.co.il/travel-policy");
        //לחץ על כפתור "לרכישה בפעם הראשונה"
        driver.findElement(By.className("jss11")).click();
        //בחר אחת מהיבשות
        driver.findElement(By.id("destination-6")).click();
        //לחץ על כפתור "הלאה לבחירת תאריכי הנסיעה"
        driver.findElement(By.className("MuiButton-label")).click();
        //בחר תאריך יציאה של שבעה ימים מהיום (בחירה משתנה בהתאם לתאריך העכשווי)
        //תאריך חזרה 30 יום מתאריך היציאה (השתמש ב (date Picker
        //USED XPATH there was no ids and we cannot use multiple class names.
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/button")).click();
        //וודא שסה"כ ימים מופיע באופן תקין
        assert driver.findElement(By.className("jss219")).isDisplayed();
        //לחץ כפתור "הלאה לפרטי הנוסעים"
        driver.findElement(By.id("nextButton")).click();
        //וודא שהדף נפתח
        assert Objects.equals(driver.getCurrentUrl(), "https://digital.harel-group.co.il/travel-policy/wizard/travelers");
    }

}
