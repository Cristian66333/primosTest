import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RunTest {
    
    @ParameterizedTest
    @CsvFileSource(resources = "csv/primos.csv", numLinesToSkip = 1)
    void esPrimotest(int numero, String expected){
        boolean expectedBoolean = Boolean.parseBoolean(expected);
        assertEquals(expectedBoolean, Run.esPrimo(numero));
    }
}
