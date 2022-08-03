package ru.netology.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(2000);
        int expected = 10;
        Assertions.assertEquals(expected, actual,"Результат теста:");
    }


}