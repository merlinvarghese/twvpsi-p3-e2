package com.tw.vapasi;

class EventProbability {
    private double occurrence;

    EventProbability(double occurrence) {
        this.occurrence = occurrence;
    }

    public boolean equals(Object event) {
        return (this.occurrence == ((EventProbability)event).occurrence);
    }



}
