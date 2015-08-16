This example tutorial uses lambda based handlers for the button to print out *Hello World!* on the GUI.

### Coding controller.java

See controller.java

### Preparing the UI

1. Open the scene builder and do the following:
  1. First drag and drop the Anchor pane.
  2. Next drag and drop Border pane.
  3. Next search for MenuBar and drag it on BorderPane where `insert TOP` is written (under Document -> Hierarchy).
  4. Next search for MenuItem and drag it under MenuBar.
  4. Lastly drag and drop a Label text to border pane.
2. On the left bottom side of the scene builder (under Document) click on Controller.
3. In that type in the controller class. For example: `Menu_6.controller`
4. Click on the MenuBar under BorderPane and give it an ID. For example `myMenuBar`
5. Click on each of the menu item and give it an ID. For example `printConsole` `printGui` and `quit`