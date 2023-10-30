# Automated Selenium Test Framework

## Requirements

- Java openjdk (version 11.0.17)
- Apache Maven (version 3.6.3)

## Setup 

To use this test framework the following steps must be taken:

1. Import project into IDE of choice as a maven project 
2. Within the package `nz.ac.wgtn.veracity.drivers.setup` is the `SeleniumSetup.java` file
3. Line 103 in this file contains `URL url = new URL("https://example.com");`. Change this to the URL of the webpage you want to test
4. The package `nz.ac.wgtn.veracity.drivers.tests` is where you write the tests. The file `ExampleTests` within this package shows how the test classes should be setup along with each individual test
5. It is important to note that all test classes must end with Tests e.g exampleTests.

## Writing Tests

- To begin writing automated Selenium Tests I recommend using the [SeleniumIDE](https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd). From here you can record your interactions on a webpage then export them as JUnit tests which you can copy and paste into the program. Otherwise refer to [Selenium WebDriver Commands](https://www.javatpoint.com/selenium-webdriver-commands) to begin writing tests manually. Example of what tests may look like can be seen [here](https://github.com/veracitylab/alfresco-test-harness/tree/main/test/seleniumtest/src/test/java/nz/ac/wgtn/veracity/drivers/alfresco/tests).

## Running Tests

- Within the scripts folder contains a `runtests.sh` script. On the command line run this script using `./runtests.sh`. Additionally you can run the test in headless mode with the command `runtest.sh headless`. Running this script without making changes will currently direct you to `https://example.com`. Refer to the previous sections to begin to setup for your specified URL and on how to write tests.


## TroubleShooting

- It is possible that your web browser may not be compatible with the version of chromedriver which comes with this framework. To fix this go to [Chromium Webdrivers](https://chromedriver.chromium.org/downloads) and install the chromedriver which corresponds with your chrome version. Then go to `src/test/resources` and replace the chromedriver file located in here. Ensure that you change the name of the new chromedriver to `chromedriver_linux` or `chromedriver_mac` depensing on which type you download.

- If you have created new packages for the tests ensure you change the path located in `runtests.sh` to the location where the tests are e.g `-Dtest=nz.ac.wgtn.veracity.drivers.tests.*Tests`.






