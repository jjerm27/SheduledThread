package ru.quote;

public class Value {
    private float id;
    private String quote;

    public Value(){}

    public Value(float id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    // Getter Methods

    public float getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
