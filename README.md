# JavaFX Tutorial
JavaFX Tutorial

## Instillation and Setup
This tutorial uses [IntelliJ IDEA](https://www.jetbrains.com/idea/) and Java SE 8.

### Setting up JDK

#### Mac

1. Download [Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) website and click on JDK download button, this will take you to next page.
2. Under *Java SE Development Kit*, read and accept the licence (like we all do ;p). Once accepted, download JDK for *Mac OS X x64* and follow the instructions on the scree.

### Setting up Scene Builder 2.0

1. Download [JavaFX Scene Builder 2.0](http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html) for Max OS X.
2. Open the *.dmg file and move the scene builder to Applications folder.
3. That's it!

### Setting up IntelliJ IDEA

#### Mac

##### Installing IDE

1. Go to [IntelliJ IDEA](https://www.jetbrains.com/idea/) and download the IDE.
2. Open the *.dmg file and move IntelliJ IDEA to Applications folder.
3. Open now moved application from Applications folder. If you have previously installed IDEA on your system import the settings of it else click on ok.
4. Set your default UI.
5. Select your keymap.
6. if you want to tune your IDE you can do in this step else click on Next.
7. Install these plugins IF you want to. Click on Start using IntelliJ

##### Setting up IDE to use JDK
Note: JDK is located in `/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/bin/java`

1. Once you open the IDE, click on `Create New Project`.
2. If Project SDK (top of the application) is empty, click on `New` and click on JDK. Browse to the JDK location `/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/` and click on choose.
3. Then click on Cancel to close this pane.

##### Setting up IDE to use JavaFX Scene Builder
1. Once you open the IDE, on the bottom left of the pane click on `Configure > Preferences`.
2. On the left side of the pane, search for `Languages & Frameworks > JavaFX`, this will open JavaFX setting on the right pane.
3. In the blank space type in `/Applications/JavaFX Scene Builder 2.0.app` or use `...` to browse to the application.
4. Once done click on Ok.

### Structure
<pre>
JavaFX
|
+-- src
|   |
|   +-- HelloWorld_1
|   |   |
|   |   `-- main.java
|   +-- HelloWorldSceneBuilder_2
|   |   |
|   |   +-- g-4.jpg
|   |   +-- main.java
|   |   `-- Main.fxml
|   +-- ButtonsEvents_3
|   |   |
|   |   +-- README.md
|   |   +-- ButtonsEvents_3_1
|   |   |   |
|   |   |   +-- README.md
|   |   |   +-- controller.java
|   |   |   +-- main.java
|   |   |   `-- Main.fxml
|   |   +-- ButtonsEvents_3_2
|   |   |   |
|   |   |   +-- README.md
|   |   |   +-- controller.java
|   |   |   +-- main.java
|   |   |   `-- Main.fxml
</pre>