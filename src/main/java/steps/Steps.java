package steps;


import Araclar.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import token.BearerToken;
import token.BearerTokenV2;


public class Steps extends Base {
    BearerTokenV2 requestSender = new BearerTokenV2();

    public static String text1;
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";


    @Before
    public void open() throws MalformedURLException {
        setUp();
        requestSender = new BearerTokenV2();
    }

    @Given("^Uygulamayı ac$")
    public void uygulamayı_ac() throws IOException, InterruptedException {
        try {
            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/logo")));
            System.out.println(GREEN + "      (Doğrulama)Ana sayfada olduğu görüldü" + RESET);

            System.out.println("Acildi");
            requestSender.changeResultt("UP-2", true);
        } catch (Exception e) {
            requestSender.changeResultt("UP-2", false);
            tearDown();
            System.exit(0);
        }
    }


    @Given("^Kategoriye tiklanir$")
    public void kategoriye_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(4);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")).click();
            TimeUnit.SECONDS.sleep(2);

            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));
            System.out.println(GREEN + "      (Doğrulama) Kategori sayfasında olduğu görüldü" + RESET);

            System.out.println("Kategoriye tikladi");
            requestSender.changeResultt("UP-4", true);
        } catch (Exception e) {
            requestSender.changeResultt("UP-4", false);
            tearDown();
            System.exit(0);

        }
    }

    @Given("^Giyim tekstil tiklanir$")
    public void giyim_tekstil_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]")).click();

            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
            System.out.println(GREEN + "      (Doğrulama) Giyim tekstil sayfasında olduğu görüldü" + RESET);

            System.out.println("Giyim tekstil tikladi");
            requestSender.changeResultt("UP-5", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-5", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Bebek coraplari tiklanir$")
    public void bebek_coraplari_tiklanir() throws Throwable {
        try {

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(2);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvTitle")).getText();
            Assert.assertEquals(text1, "Bebek Çorapları");
            System.out.println(GREEN + "      (Doğrulama) bebek çoraplarına tıkladığı görüldü" + RESET);
            requestSender.changeResultt("UP-6", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-6", false);
            System.out.println(e.getMessage());
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Filtrelere tiklanir$")
    public void filtrelere_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(2);

            //hata almak için id yi değiştirdim
            //driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_Pror")).click();

            //calısıyor
            driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_ProductFilter")).click();

            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")));
            System.out.println(GREEN + "      (Doğrulama) Filtreler sayfasında olduğu görüldü" + RESET);

            System.out.println("Filtrelere tikladi");
            requestSender.changeResultt("UP-7", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-7", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Filtrele tiklanir$")
    public void filtrele_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(4);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout")).click();

            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/tvFacetsTitle")));
            System.out.println(GREEN + "      (Doğrulama) Filtrele sayfasında olduğu görüldü" + RESET);

            System.out.println("Filtrele tikladi");
            requestSender.changeResultt("UP-8", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-8", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Stoktakilere tiklanir$")
    public void stoktakilere_tiklanir() throws Throwable {
        try {
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.CheckBox")).click();
            System.out.println("Stoktakilere tikladi");
            requestSender.changeResultt("UP-9", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-9", false);
            tearDown();
            System.exit(0);
        }
    }

    @Given("^Uygulaya tiklanir$")
    public void uygulaya_tiklanir() throws Throwable {
        try {
            driver.findElement(By.id("com.solidict.ebebek:id/btApplyFilter")).click();

            //ASSERTION
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/tvFiltersDesc")));
            System.out.println(GREEN + "      (Doğrulama) Stoktakilere tıkladığı görüldü" + RESET);

            System.out.println("Uygula tikladi");

            //ASSERTION
            WebDriverWait waitt = new WebDriverWait(driver, 10);
            WebElement elementt = waitt.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/tvClearFilters")));
            System.out.println(GREEN + "      (Doğrulama) Filtreleme olduğu görüldü" + RESET);
            requestSender.changeResultt("UP-10", true);
        }catch(Exception e){
            requestSender.changeResultt("UP-10", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Urunleri gor tiklanir$")
    public void urunleri_gor_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(4);
            driver.findElement(By.id("com.solidict.ebebek:id/btApplyFilter")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(2);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvTitle")).getText();
            Assert.assertEquals(text1, "Bebek Çorapları");
            System.out.println(GREEN + "        (Doğrulama) bebek çoraplarına tıkladığı olduğu görüldü" + RESET);

            System.out.println("Urunleri gor tikladi");
            requestSender.changeResultt("UP-11", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-11", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Ilk urune tiklanir$")
    public void ilk_urune_tiklanir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]")).click();
            //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[1]")).click();

            /*//ASSERTION
            TimeUnit.SECONDS.sleep(2);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/btAddToCart_")).getText();
            Assert.assertEquals(text1, "Sepete Ekle");
            System.out.println(GREEN + "        (Doğrulama) İlk ürüne tıklandığı görüldü" + RESET);
            //System.out.println(text1);*/

            //ASSERTION
            WebDriverWait waitt = new WebDriverWait(driver, 10);
            WebElement elementt = waitt.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/lytShare")));
            System.out.println(GREEN + "      (Doğrulama) İlk ürüne tıklandığı görüldü" + RESET);

            System.out.println("Ilk urune tikladi");
            requestSender.changeResultt("UP-12", true);
        }catch(Exception e){
            requestSender.changeResultt("UP-12", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Ilk beden secilip sepete eklenir$")
    public void ilk_beden_secilip_sepete_eklenir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(2);

            TouchAction swipe = new TouchAction<>(driver)
                    .press(PointOption.point(726, 1722))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(686, 306))
                    .release()
                    .perform();

            //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("com.solidict.ebebek:id/btAddToCart_")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(5);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvQuantity")).getText();
            Assert.assertEquals(text1, "1");
            System.out.println(GREEN + "    (Doğrulama) Sepete eklediği görüldü" + RESET);

        /*//ASSERTION
        WebDriverWait waitt = new WebDriverWait(driver, 10);
        WebElement elementt = waitt.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/btAddToCart_")));
        System.out.println(GREEN+"      (Doğrulama) İlk ürüne tıklandığı görüldü"+RESET);*/


            System.out.println("Ilk beden secilip sepete eklendi");
            requestSender.changeResultt("UP-13", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-13", false);
            tearDown();
            System.exit(0);

        }


    }

    @Given("^Urun sayisi bir arttirilir$")
    public void urun_sayisi_bir_arttirilir() throws Throwable {
        try {

            TimeUnit.SECONDS.sleep(4);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(4);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvQuantity")).getText();
            Assert.assertEquals(text1, "2");
            System.out.println(GREEN + "    (Doğrulama) + simgesine tıkladığı görüldü" + RESET);

            System.out.println("urun sayisi bir arttirildi");
            requestSender.changeResultt("UP-14", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-14", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("^Sepete gidilir$")
    public void sepete_gidilir() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"ebebek\"]/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout\n")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim, 2 yeni bildirim\"]/android.widget.ImageView")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(4);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvMyCart")).getText();
            Assert.assertEquals(text1, "Sepetim (2)");
            System.out.println(GREEN + "    (Doğrulama) sepetim sayfasında olduğu görüldü" + RESET);

            System.out.println("Sepete gidildi");
            requestSender.changeResultt("UP-15", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-15", false);
            tearDown();
            System.exit(0);

        }


    }

    @Given("^Urun sayisi bir arttitilirr$")
    public void urun_sayisi_bir_arttitilirr() throws Throwable {
        try {
            TimeUnit.SECONDS.sleep(4);
            //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
            driver.findElement(By.id("com.solidict.ebebek:id/lytPlusQuantity")).click();

            //ASSERTION
            TimeUnit.SECONDS.sleep(4);
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/editText_CartProduct_Quantity")).getText();
            Assert.assertEquals(text1, "3");
            System.out.println(GREEN + "    (Doğrulama) + simgesine tıkladığı görüldü" + RESET);

            System.out.println("Urun sayisi bir arttirildi");
            requestSender.changeResultt("UP-16", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-16", false);
            tearDown();
            System.exit(0);
        }

    }

    @Given("^Alisverisi tamamlaya tiklanir$")
    public void alisverisi_tamamlaya_tiklanir() throws Throwable {
        try {

            driver.findElement(By.id("com.solidict.ebebek:id/tvCompleteOrder")).click();

            //ASSERTION
            Steps.text1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")).getText();
            Assert.assertEquals(text1, "Üye Girişi");
            System.out.println(GREEN + "    (Doğrulama) üye girişi sayfasında olduğu görüldü" + RESET);

            System.out.println("Alisverisi tamamla tiklandi");
            requestSender.changeResultt("UP-17", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-17", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("Uyeliksiz alisverise gidip bilgiler doldurulur")
    public void uyeliksiz_alisverise_gidip_bilgiler_doldurulur() throws Throwable {
        try {

            TimeUnit.SECONDS.sleep(1);

            TouchAction swipeiki = new TouchAction<>(driver)
                    .press(PointOption.point(755, 1974))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(722, 252))
                    .release()
                    .perform();

            driver.findElement(By.id("com.solidict.ebebek:id/ivGuestArrow")).click();
            driver.findElement(By.id("com.solidict.ebebek:id/etPhoneGuest")).sendKeys("443047734");
            driver.findElement(By.id("com.solidict.ebebek:id/etMailGuest")).sendKeys("grknk.22@gmail.com");
            TimeUnit.SECONDS.sleep(2);

            TouchAction swipeuc = new TouchAction<>(driver)
                    .press(PointOption.point(737, 1656))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(711, 1131))
                    .release()
                    .perform();

            //ASSERTION
            Steps.text1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")).getText();
            Assert.assertEquals(text1, "Güvenli Alışveriş");
            System.out.println(GREEN + "    (Doğrulama) güvenli alışveriş yazısı görüldü" + RESET);

            System.out.println("Uyeliksiz alisverise gidip bilgiler dolduruldu");
            requestSender.changeResultt("UP-18", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-18", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("uye olmadan devam et tiklanir")
    public void uye_olmadan_devam_et_tiklanir() throws InterruptedException {
        try {

            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("com.solidict.ebebek:id/tvCheckoutLogin")).click();
            TimeUnit.SECONDS.sleep(2);

            //ASSERTION
            Steps.text1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")).getText();
            Assert.assertEquals(text1, "Teslimat Adresi");
            System.out.println(GREEN + "    (Doğrulama) Teslimat Adresi yazısı görüldü" + RESET);

            System.out.println("uye olmadan devam et tikladi");
            requestSender.changeResultt("UP-19", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-19", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("Yeni adres ekleye tiklanir")
    public void yeni_adres_ekleye_tiklanir() throws InterruptedException {
        try {

            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_AddDeliveryAddress")).click();

            //ASSERTION
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/tvAddNewAdressTitle1")).getText();
            Assert.assertEquals(text1, "Yeni Adres Ekle");
            System.out.println(GREEN + "    (Doğrulama) Yeni Adres Ekle yazısı görüldü" + RESET);

            System.out.println("Yeni adres ekleye tiklandi");
            requestSender.changeResultt("UP-20", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-20", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("Adres bilgileri girilir kaydedilir")
    public void adres_bilgileri_girilir_kaydedilir() throws InterruptedException {
        try {
            driver.findElement(By.id("com.solidict.ebebek:id/etFirstName")).sendKeys("Gürkan"); //isim
            driver.findElement(By.id("com.solidict.ebebek:id/etLastName")).sendKeys("Korkmaz"); //soyisim
            driver.findElement(By.id("com.solidict.ebebek:id/etCellphone")).sendKeys("443047734"); //telefon
            driver.findElement(By.id("com.solidict.ebebek:id/etTitle")).sendKeys("Ev"); //adres adı
            driver.findElement(By.id("com.solidict.ebebek:id/tvCity")).click(); //şehir
            driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("Edirne"); //şehir adı yazma
            driver.findElement(By.id("com.solidict.ebebek:id/tvLocationName")).click(); //aranan şehre tıklama
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("com.solidict.ebebek:id/tvCounty")).click(); //ilçe tıklama
            driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("Merkez"); //ilçe adı yazma
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup")).click(); // aranan ilçe tıklama

            TouchAction swipedort = new TouchAction<>(driver)
                    .press(PointOption.point(675, 1726))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(701, 708))
                    .release()
                    .perform();

            driver.findElement(By.id("com.solidict.ebebek:id/tvNeighbourhood")).click(); //mahalle tıklama
            driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("ıstasyon"); //mahalle adı
            driver.findElement(By.id("com.solidict.ebebek:id/tvLocationName")).click(); //aranan mahalleye tıklama

            driver.findElement(By.id("com.solidict.ebebek:id/etLine1")).sendKeys("İstasyon mahallesi hanımeli sokak no:5");
            driver.findElement(By.id("com.solidict.ebebek:id/btSave")).click();

            //ASSERTION
            WebDriverWait waitt = new WebDriverWait(driver, 10);
            WebElement elementt = waitt.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/imageView_SelectedAddress")));
            System.out.println(GREEN + "      (Doğrulama) Girilen adres görüldü" + RESET);

            System.out.println("Adres bilgileri girilir kaydedildi");
            requestSender.changeResultt("UP-21", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-21", false);
            tearDown();
            System.exit(0);

        }

    }

    @Given("Faturami teslimat adresine gondere tiklanip devam et tiklanir")
    public void faturami_teslimat_adresine_gondere_tiklanip_devam_et_tiklanir() throws InterruptedException {
        try {

            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("com.solidict.ebebek:id/checkBox_SendPaymentToDeliveryAddress")).click();
            TimeUnit.SECONDS.sleep(2);

            TouchAction swipebes = new TouchAction<>(driver)
                    .press(PointOption.point(894, 1667))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(930, 774))
                    .release()
                    .perform();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("com.solidict.ebebek:id/tvContinue")).click();

            //ASSERTION
            Steps.text1 = driver.findElement(By.id("com.solidict.ebebek:id/checkBox_SendPaymentToDeliveryAddress")).getText();
            Assert.assertEquals(text1, "Faturamı teslimat adresime gönder");
            System.out.println(GREEN + "    (Doğrulama) Kutucuğun işaretlendiği görüldü" + RESET);

            System.out.println("Faturami teslimat adresine gondere tiklanip devam et tiklandi");
            requestSender.changeResultt("UP-22", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-22", false);
            System.out.println(e.getMessage());
            tearDown();
            System.exit(0);

        }

    }

    @When("Odeme bilgileri girilir")
    public void odeme_bilgileri_girilir() throws InterruptedException {
        try {

            //ASSERTION
            Steps.text1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")).getText();
            Assert.assertEquals(text1, "Ödeme Yöntemleri");
            System.out.println(GREEN + "    (Doğrulama) ödeme yöntemleri yazısı görüldü" + RESET);

            driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_CreditATMCardTitle")).click(); //kredi kartı banka kartı tıklama
            TimeUnit.SECONDS.sleep(1);


            //int myInteger = 5262890024259547;
            //driver.findElement(By.id("com.solidict.ebebek:id/etCardNumber")).sendKeys(Integer.toString(myInteger)); //kart numarası
            driver.findElement(By.id("com.solidict.ebebek:id/etCardNumber")).click(); //kart numarası

            // adb key command--> https://stackoverflow.com/questions/7789826/adb-shell-input-events
            //kart bilgilerini girme
            String command1 = "adb shell input keyevent 12";
            String command2 = "adb shell input keyevent 9";
            String command3 = "adb shell input keyevent 13";
            String command4 = "adb shell input keyevent 9";
            String command5 = "adb shell input keyevent 15";
            String command6 = "adb shell input keyevent 16";
            String command7 = "adb shell input keyevent 7";
            String command8 = "adb shell input keyevent 7";
            String command9 = "adb shell input keyevent 9";
            String command10 = "adb shell input keyevent 11";
            String command11 = "adb shell input keyevent 9";
            String command12 = "adb shell input keyevent 12";
            String command13 = "adb shell input keyevent 16";
            String command14 = "adb shell input keyevent 12";
            String command15 = "adb shell input keyevent 11";
            String command16 = "adb shell input keyevent 14";

            try {
                Process process = Runtime.getRuntime().exec(command1);
                process.waitFor();
                process = Runtime.getRuntime().exec(command2);
                process.waitFor();
                process = Runtime.getRuntime().exec(command3);
                process.waitFor();
                process = Runtime.getRuntime().exec(command4);
                process.waitFor();
                process = Runtime.getRuntime().exec(command5);
                process.waitFor();
                process = Runtime.getRuntime().exec(command6);
                process.waitFor();
                process = Runtime.getRuntime().exec(command7);
                process.waitFor();
                process = Runtime.getRuntime().exec(command8);
                process.waitFor();
                process = Runtime.getRuntime().exec(command9);
                process.waitFor();
                process = Runtime.getRuntime().exec(command10);
                process.waitFor();
                process = Runtime.getRuntime().exec(command11);
                process.waitFor();
                process = Runtime.getRuntime().exec(command12);
                process.waitFor();
                process = Runtime.getRuntime().exec(command13);
                process.waitFor();
                process = Runtime.getRuntime().exec(command14);
                process.waitFor();
                process = Runtime.getRuntime().exec(command15);
                process.waitFor();
                process = Runtime.getRuntime().exec(command16);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }


            //telefonda geri gitme kodu
            TimeUnit.SECONDS.sleep(1);
            String commandgeri = "adb shell input keyevent 4";
            try {
                Process process = Runtime.getRuntime().exec(commandgeri);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }


            driver.findElement(By.id("com.solidict.ebebek:id/editText_NameOnCard")).sendKeys("Gürkan Korkmaz"); //karttakı ad soyad
            //driver.findElement(By.id("com.solidict.ebebek:id/editText_CardExpiryMonthAndYear")).sendKeys("02/26");
            //driver.findElement(By.id("com.solidict.ebebek:id/editText_CardExpiryMonthAndYear")).click();
            driver.findElement(By.id("com.solidict.ebebek:id/editText_CardExpiryMonthAndYear")).click(); //kartın son kullanma tarihi

            //son kullanma tarihi girme 0226

            String t1 = "adb shell input keyevent 7";
            String t2 = "adb shell input keyevent 9";
            String t3 = "adb shell input keyevent 9";
            String t4 = "adb shell input keyevent 13";

            try {
                Process process = Runtime.getRuntime().exec(t1);
                process.waitFor();
                //TimeUnit.SECONDS.sleep(2);
                process = Runtime.getRuntime().exec(t2);
                TimeUnit.SECONDS.sleep(2);
                process.waitFor();
                process = Runtime.getRuntime().exec(t3);
                process.waitFor();
                process = Runtime.getRuntime().exec(t4);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            //telefonda geri gitme
            TimeUnit.SECONDS.sleep(1);
            String commandgeri2 = "adb shell input keyevent 4";
            try {
                Process process = Runtime.getRuntime().exec(commandgeri2);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }


            //driver.findElement(By.id("com.solidict.ebebek:id/editText_CardSecurityCode")).sendKeys("323"); //güvenlik kodu
            driver.findElement(By.id("com.solidict.ebebek:id/editText_CardSecurityCode")).click();
            TimeUnit.SECONDS.sleep(1);

            //güvenlik kodu girme
            String commandbir = "adb shell input keyevent 10";
            String commandiki = "adb shell input keyevent 9";
            String commanduc = "adb shell input keyevent 10";
            try {
                Process process = Runtime.getRuntime().exec(commandbir);
                process.waitFor();
                process = Runtime.getRuntime().exec(commandiki);
                process.waitFor();
                process = Runtime.getRuntime().exec(commanduc);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            //telefonda geri gitme
            TimeUnit.SECONDS.sleep(1);
            String commandgeri3 = "adb shell input keyevent 4";
            try {
                Process process = Runtime.getRuntime().exec(commandgeri3);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            //ASSERTION
            WebDriverWait waitt = new WebDriverWait(driver, 10);
            WebElement elementt = waitt.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("com.solidict.ebebek:id/checkBox_InstallmentItem")));
            System.out.println(GREEN + "      (Doğrulama) Taksit seçeneklerindeki tik işareti görüldü" + RESET);


            System.out.println("Odeme bilgileri girildi");
            requestSender.changeResultt("UP-23", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-23", false);
            tearDown();
            System.exit(0);

        }

        //"5262890024259547" //kart numarası
    }

    @Then("sozlesme kabul et tiklanir")
    public void sozlesme_kabul_et_tiklanir() {
        try {

            TouchAction swipealti = new TouchAction<>(driver)
                    .press(PointOption.point(881, 1816))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                    .moveTo(PointOption.point(887, 459))
                    .release()
                    .perform();

            driver.findElement(By.id("com.solidict.ebebek:id/cbAgreement")).click();

            System.out.println("sozlesme kabul et tikladi");
            requestSender.changeResultt("UP-24", true);
        }catch (Exception e){
            requestSender.changeResultt("UP-24", false);
            tearDown();
            System.exit(0);

        }

    }

    @After
    public void tearDown() {
        // Close the driver and send test results
        if (driver != null) {
            driver.quit();
        }
        try {
            requestSender.sendTestResults();
        } catch (IOException e) {
            System.out.println("Error sending test results: " + e.getMessage());
        }

    }
}
// kısa adb
/*driver.findElement(By.id("com.solidict.ebebek:id/etCardNumber")).click();
        String command = "adb shell input text '4242 4242 4242 4242'";
        try {
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//dogrulama

/*loginTest.text2 = driver.findElement(By.id("com.solidict.ebebek:id/tvTitle")).getText();

        Assert.assertEquals(text2, "Bebek Çorapları");
        System.out.println("Doğru sayfa (Bebek çorapları)");*/
