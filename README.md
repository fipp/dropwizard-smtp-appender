# Dropwizard SMTP Appender

Allows logback's [SMTPAppender](http://logback.qos.ch/manual/appenders.html#SMTPAppender) to be
enabled and configured via a dropwizard yaml config file.

## Dropwizard Version Compatibility

* dropwizard 0.8.4 => dropwizard-logstash-encoder 1.0.0
* dropwizard 0.9.0 => dropwizard-logstash-encoder 1.1.0

## Install

    <dependency>
        <groupId>com.larrymyers</groupId>
        <artifactId>dropwizard-smtp-appender</artifactId>
        <version>1.1.0</version>
    <dependency>

## Usage

Below is an example of configuring the appender to send emails via a gmail account:

    logging:
      level: INFO
      appenders:
        - type: smtp
          host: smtp.gmail.com
          port: 587
          tls: true
          username: <your-gmail-or-google-apps-email>
          password: <your-account-password>
          to:
            - errors@my-application.com
            - pager_duty@my-company.org
          from: <your-gmail-or-google-apps-email>
          includeCallerData: true

