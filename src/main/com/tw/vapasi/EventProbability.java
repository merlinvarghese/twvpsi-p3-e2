package com.tw.vapasi;

class EventProbability {
    private double occurrence;

    EventProbability(double occurrence) {
        this.occurrence = occurrence;
    }

    public boolean equals(Object event) {
        if (!(event instanceof EventProbability))
            return false;
        return (this.occurrence == ((EventProbability)event).occurrence);
    }



}
