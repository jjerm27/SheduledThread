package ru.quote;

public class Quote {
    private String type;
    Value ValueObject;

    public Quote(){}

    public Quote(String type, Value valueObject) {
        this.type = type;
        ValueObject = valueObject;
    }

    // Getter Methods

    public String getType() {
        return type;
    }

    public Value getValue() {
        return ValueObject;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Value valueObject) {
        this.ValueObject = valueObject;
    }
}
