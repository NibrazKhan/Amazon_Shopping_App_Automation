# Amazon_Shopping_App_Automation

### An [Amazon Shopping App](https://play.google.com/store/apps/details?id=com.amazon.mShop.android.shopping) is automated by implementing test cases for launching amazon app,searching for a product,adding to cart and proceed to check-out page with an authenticated user .Appium is utilized on an emulated device powered by Android Studio.
Here the following tasks are done:
- Amazon e-commerce Shopping App extracted from [Amazon Shopping App](https://play.google.com/store/apps/details?id=com.amazon.mShop.android.shopping) is automated by extracting its apk.
- Login Module is implemented including various negative scenarios.
- Searched product named "TV" and choose a product after scrolling down.
- Checked Price and size of the product,finally Added to cart.
- Proceeded to checkout for final payment by credit card or bank cheque.
- Screenshot taken for Success and failed test case,saved in folder.
### Technology: </br>
- Tool: Selenium Webdriver
- Test_Runner: Appium
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java

### Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

### Project Run

#### Appium and Android Studio
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:

```
  "deviceName": "My Device",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.amazon.mShop.android.shopping",
  "appActivity": "com.amazon.mShop.splashscreen.StartupActivity"

```
- Click **Start Server**.

#### Java IDE

- Clone the repo.

#### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
