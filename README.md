# serenitySample

## Pre Requisite
 Download Gradle, jdk 1.8 and chromedriver

 **Setup Gradle and JAVA_HOME**
 
 **On Windows**

 * **Step 1**: Unzip the Gradle download to the folder to which you would like to install Gradle, eg. “C:\Program Files”. The subdirectory gradle-x.x will be created from the archive, where x.x is the version.
 * **Step 2**: Add location of your Gradle “bin” folder to your path. Open the system properties (WinKey + Pause), select the “Advanced” tab, and the “Environment Variables” button, then add “C:\Program Files\gradle-x.x\bin” (or wherever you unzipped Gradle) to the end of your “Path” variable under System Properties. Be sure to omit any quotation marks around the path even if it contains spaces. Also make sure you separated from previous PATH entries with a semicolon “;”.
 * **Step 3**: In the same dialog, make sure that JAVA_HOME exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_06 and that %JAVA_HOME%\bin is in your Path environment variable.
 * **Step 4**: Open a new command prompt (type cmd in Start menu) and run gradle –version to verify that it is correctly installed.
 * **Step 5**: Download chromedriver from [here](http://chromedriver.storage.googleapis.com/index.html), unzip and add it to path

**On Mac/Linux**

 * **Step 1**: Extract the distribution archive, i.e. gradle-x.x-bin.tar.gz to the directory you wish to install Gradle. These instructions assume you chose /usr/local/gradle. The subdirectory gradle-x.x will be created from the archive.
 * **Step 2**: In a command terminal, add Gradle to your PATH variable: export PATH=/usr/local/gradle/gradle-x.x/bin:$PATH
 * **Step 3**: Make sure that JAVA_HOME is set to the location of your JDK, e.g. export JAVA_HOME=/usr/java/jdk1.7.0_06 and that $JAVA_HOME/bin is in your PATH environment variable.
 * **Step 4**: Run gradle –version to verify that it is correctly installed.
 * **Step 5**: Download chromedriver from [here](http://chromedriver.storage.googleapis.com/index.html), unzip and add it to path
 
**On Mac using Brew**

  Same steps as previous except for Steps 1 & 2
* **Step 1**: brew install gradle
* **Step 2**: Taken care by Brew, the symlink '/usr/local/bin/gradle' would have been created already 
* **Step 3**: [Follow STEP 3 of previous section]
* **Step 4**: [Follow STEP 4 of previous section]
* **Step 5**: brew install chromedriver

## Clone and Import the Sample
* **Step 1**: clone project `https://github.com/vodQASG/serenitySample`
* **Step 2**: Run gradle command at command line
* **Step 3**: Open as gradle project

##Run Tests (CommandLine)
gradle clean test aggregate -Dserenity.properties=test-properties/chrome.properties -Dcucumber.options="--tags @smoke"

**The Serenity Reference Manual is [here](http://thucydides.info/docs/serenity-staging/#_serenity_with_cucumber)**
