package com.larrymyers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("gmail")
public class GmailAppenderFactory extends SMTPAppenderFactory {

    @JsonCreator
    public GmailAppenderFactory(String username, String password, List<String> to) {
        setHost("smtp.gmail.com");
        setPort(587);
        setTls(true);
        setSsl(false);
        setUsername(username);
        setPassword(password);
        setTo(to);
        setFrom(username);
    }

}
