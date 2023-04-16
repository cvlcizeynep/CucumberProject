package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        //plugin = {"html:src/test/resources/reports/g1g2g3g4.html"},
        //monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@US21_Pozitif",
        dryRun = false
        //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz

)
public class RunnerFatmanur {

}