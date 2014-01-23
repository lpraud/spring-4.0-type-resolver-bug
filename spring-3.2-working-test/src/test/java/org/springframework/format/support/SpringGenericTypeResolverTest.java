package org.springframework.format.support;

import org.junit.Test;

import java.util.Date;
import java.util.Locale;

public class SpringGenericTypeResolverTest {

    @Test
    public void testType() {
        register(Date.class, new Date());
    }

    private static final FormattingConversionService CONVERSION = new FormattingConversionService();

    private static <T> void register(final Class<T> clazz, final T defaultValue) {
        CONVERSION.addFormatterForFieldType(clazz, new org.springframework.format.Formatter<T>() {

            public T parse(String text, Locale locale) throws java.text.ParseException {
                return defaultValue;
            }

            public String print(T t, Locale locale) {
                return defaultValue.toString();
            }

            public String toString() {
                return defaultValue.toString();
            }

        });
    }

}
