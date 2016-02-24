# serenitySample
 
 ##Documentation Reference is [here](http://thucydides.info/docs/serenity-staging/#_serenity_with_cucumber)
 
* **Step 1**: brew install gradle
* **Step 2**: clone project `https://github.com/vodQASG/serenitySample`
* **Step 3**: Run gradle command at command line
* **Step 4**: Open as gradle project

##Run Tests (CommandLine)
gradle clean test aggregate -Dserenity.properties=/test-properties/chrome.properties -Dcucumber.options="--tags @smoke"
