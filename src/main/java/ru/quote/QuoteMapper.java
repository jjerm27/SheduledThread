package ru.quote;

import org.json.JSONObject;

public class QuoteMapper {

    public Quote map(JSONObject jsonObject)
    {
        float  id = jsonObject.getJSONObject("value").getFloat("id");
        String mapQuote = jsonObject.getJSONObject("value").getString("quote");
        String type = jsonObject.getString("type");

        Quote quote = new Quote(type,new Value(id,mapQuote));
        return quote;
    }
}
