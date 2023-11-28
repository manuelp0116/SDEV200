package SDEV200.Exercise_14_01;


public class Main extends Application 
{ 
  
  @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
     try{
        // Create a pane to hold the images views
        GridPane pane = new GridPane();

        // Place nodes in the pane
        pane.add(new ImageView(new Image("images/china.gif")), 0, 0);
        pane.add(new ImageView(new Image("images/ca.gif")), 1, 0);
      
        pane.add(new ImageView(new Image("images/US flag.gif")), 0, 1);
      

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_01"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage.
     } catch(Exception e) {
       e.printStacktrace();
     }
  } 
  public static void main(String[] args) {
    launch(args);
  }
} 
