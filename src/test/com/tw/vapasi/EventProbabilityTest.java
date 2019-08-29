package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EventProbabilityTest {

    @Test
    void expectFalseWhenHeadForCoinWithSpadeForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.25);

        Assertions.assertFalse(coinHeadEvent.equals(cardSpadeEvent));
    }
    @Test
    void expectTrueWhenHeadForCoinWithSpadeAndHeartsForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.5);

        Assertions.assertTrue(coinHeadEvent.equals(cardSpadeEvent));
    }
}
