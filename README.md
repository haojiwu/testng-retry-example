TestNG Retry Example
====================
This is an example to show how to write test with TestNG that will retry when test is failed.
It is useful when the behavior of tested code is not 100% consistent.

Test case that sepcified retryAnalyzer with MyRetryAnalyzer in the annotation will re-run test at most 3 times when test is failed.
Also, MyTestListenerAdapter will only keep last test result and re-write other test results to SKIP.
When generating report we don't want to count failed test case multiple times.

To run this project, just clone it and run
```
mvn clean test
```
