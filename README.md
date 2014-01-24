Spring 4.0 TypeResolver regression bug
===

How to test ?

* <code>git clone</code> the repository
* do <code>mvn package</code>

The module _spring-3.2-working-test_ will _SUCCEED_,

but the module _spring-4.0-failing-test_ will _FAIL_ with :

<pre>
Running org.springframework.format.support.SpringGenericTypeResolverTest
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.081 sec : FAILURE!
testType(org.springframework.format.support.SpringGenericTypeResolverTest)  Time elapsed: 0.045 sec  : ERROR!
java.lang.IllegalArgumentException: Type must not be null
	at org.springframework.util.Assert.notNull(Assert.java:112)
	at org.springframework.core.convert.TypeDescriptor.valueOf(TypeDescriptor.java:507)
	at org.springframework.format.support.FormattingConversionService$PrinterConverter.<init>(FormattingConversionService.java:123)
	at org.springframework.format.support.FormattingConversionService.addFormatterForFieldType(FormattingConversionService.java:80)
	at org.springframework.format.support.SpringGenericTypeResolverTest.register(SpringGenericTypeResolverTest.java:19)
	at org.springframework.format.support.SpringGenericTypeResolverTest.testType(SpringGenericTypeResolverTest.java:13)
</pre>
