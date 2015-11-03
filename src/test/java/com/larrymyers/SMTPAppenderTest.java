package com.larrymyers;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.SMTPAppender;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SMTPAppenderTest {

    private SMTPAppenderFactory factory;

    @Before
    public void setup() {
        ArrayList<String> toAddresses = new ArrayList<>();
        toAddresses.add("foo@bar.com");

        factory = new SMTPAppenderFactory();
        factory.setTo(toAddresses);
    }

    @Test
    public void should_use_SSL_over_TLS() {
        factory.setTls(true);
        factory.setSsl(true);

        SMTPAppender appender = (SMTPAppender) factory.build(new LoggerContext(), "testapp", null);

        assertFalse(appender.isSTARTTLS());
        assertTrue(appender.isSSL());
    }

}
