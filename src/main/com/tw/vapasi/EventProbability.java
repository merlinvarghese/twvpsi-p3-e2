package com.tw.vapasi;

//Compare the occurrence of 2 independent events
class EventProbability {
    private double occurrence;

    EventProbability(double occurrence) {
        this.occurrence = occurrence;
    }
@Override
    public boolean equals(Object event) {
       if ((event==null) || (event.getClass()!=this.getClass()))
        return false;

        return this.occurrence == ((EventProbability)event).occurrence;
    }
}
