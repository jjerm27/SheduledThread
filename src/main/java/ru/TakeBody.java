package ru;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.json.JSONObject;
import ru.quote.Quote;
import ru.quote.QuoteMapper;

import java.io.IOException;


public class TakeBody {
    private String url;

    public TakeBody(String url) {
        this.url = url;
    }

    public String get() {
        String responseBodyAsString = null;
        Quote quote = null;
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(this.url);

        try {
            client.executeMethod(getMethod);
            responseBodyAsString = getMethod.getResponseBodyAsString();

            JSONObject jsonObject = new JSONObject(responseBodyAsString);
            QuoteMapper mapper = new QuoteMapper();
            quote =  mapper.map(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (quote != null)
            return quote.getValue().getQuote();
        else
            return " ";
    }
}
