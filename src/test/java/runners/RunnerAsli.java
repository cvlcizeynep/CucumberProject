package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@ApiUs17Test01",
        dryRun = false


)
public class RunnerAsli {

}