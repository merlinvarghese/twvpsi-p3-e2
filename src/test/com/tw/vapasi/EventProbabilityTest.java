package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EventProbabilityTest {

    @Test
    void expectFalseWhenHeadForCoinWithSpadeForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.25);
        Assertions.assertNotEquals(coinHeadEvent, cardSpadeEvent);
    }
    @Test
    void expectTrueWhenHeadForCoinWithSpadeAndHeartsForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.5);
        Assertions.assertEquals(coinHeadEvent, cardSpadeEvent);
    }
}
