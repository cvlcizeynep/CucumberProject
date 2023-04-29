package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        monochrome = true,
        features = "src/test/resources/features/dbfeature",
        glue = {"stepdefinitions"},
        tags = "@US23DB",
        dryRun = false


)
public class RunnerZeynep {

}