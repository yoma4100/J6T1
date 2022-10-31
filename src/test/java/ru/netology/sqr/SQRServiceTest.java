package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRServiceTestParameters.csv")

    public void shouldFindSqr(int lowerRangeLimit, int higherRangeLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrfinder(lowerRangeLimit, higherRangeLimit);

        Assertions.assertEquals(expected, actual);
    }
}
