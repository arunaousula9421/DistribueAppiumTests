# DistribueAppiumTests
Uses AppiumTestDistribution library to run tests in Distribute/Parallel


# To run the tests
`Platform = android mvn -Dtest=Runner test`

# To test the changes prior to adding them to list

1. Extend test class with `BaseTest`
2. Change `AppiumDriverManager.getDriver()` in test class to `driver`
3. Launch Appium UI
