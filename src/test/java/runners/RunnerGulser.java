package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@edit",
        dryRun = false
        //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz

)
public class RunnerGulser {

}