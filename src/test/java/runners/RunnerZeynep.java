package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar

        features = "src/test/resources/features/uifeature",
        glue = {"stepdefinitions", "hooks",
        },
        tags = "@US063",
        dryRun =false
        //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz

)
public class RunnerZeynep {

}