package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SuppressWarnings("ALL")
class EventProbabilityTest {

    @Test
    void expectFalseWhenIsHeadForCoinWithSpadeForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.25);
        assertFalse(coinHeadEvent.equals(cardSpadeEvent));
    }
    @Test
    void expectTrueWhenIsHeadForCoinWithSpadeAndHeartsForCards() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeEvent = new EventProbability(0.5);
        assertTrue(coinHeadEvent.equals(cardSpadeEvent));
    }
    @Test
    void expectFalseWhenArgumentEventProbabilityisNull() {
        EventProbability coinHeadEvent = null;
        EventProbability cardSpadeHeartEvent = new EventProbability(0.5);
        assertFalse(cardSpadeHeartEvent.equals(coinHeadEvent));
    }
    @Test
    void expectFalseWhenArgumentIsNotEventProbability() {
        String stringObject = new String("check");
        EventProbability cardSpadeHeartEvent = new EventProbability(0.5);
        assertFalse(cardSpadeHeartEvent.equals(stringObject));
    }
    @Test
    void expectTrueWhenArgumentIsEventProbabilityContentsMatch() {
        EventProbability coinHeadEvent = new EventProbability(0.5);
        EventProbability cardSpadeHeartEvent = new EventProbability(0.5);
        assertTrue(cardSpadeHeartEvent.equals(coinHeadEvent));
    }
}
