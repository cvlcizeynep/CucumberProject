package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/g1g2g3g4.html"},
       monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Dean",
        dryRun = false
        //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz

)

public class RunnerHayriye {
    /* 1.git add .
    2.git commit -m"versionismi"
    3.git push yapmaliyiz calisma yaparken yeni eklenenler olmustur diyede 3. adimdan sonra
    4.git checkout master
    5.git pull
    6.git checkout branchimiin ismi 7.git merge master yapiyoruz
     */



}
