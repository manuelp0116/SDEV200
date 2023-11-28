import java.awt.Color;

public class Main extends Application {
  protected Text text = new Text("Show Colors");
  protected Slider Red = new Slider();
  protected Slider Green = new Slider();
  protected Slider Blue = new Slider();
  protected Slider Opacity = new Slider();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a stack pane for text
    StackPane paneForText = new StackPane(text);
    paneForText.setPadding(new Insets(10, 10, 5, 10));

    // Set slider properties
    Red.setMin(0.0);
    Red.setMax(1.0);
    Green.setMin(0.0);
    Green.setMax(1.0);
    Blue.setMin(0.0);
    Blue.setMax(1.0);
    Opacity.setMin(0.0);
    Opacity.setMax(1.0);

    // Create listeners
    Red.valueProperty().addListener(ov -> setColor());
    Green.valueProperty().addListener(ov -> setColor());
    Blue.valueProperty().addListener(ov -> setColor());
    Opacity.valueProperty().addListener(ov -> setColor());
    Opacity.setValue(1);


    // Create a grid pane for labeled sliders
    GridPane paneForSliders = new GridPane();
    paneForSliders.setAlignment(Pos.CENTER);
    paneForSliders.setVgap(5);
    paneForSliders.setHgap(5);
    paneForSliders.add(new Label("Red"), 0, 0);
    paneForSliders.add(Red, 1, 0);
    paneForSliders.add(new Label("Green"), 0, 1);
    paneForSliders.add(Green, 1, 1);
    paneForSliders.add(new Label("Blue"), 0, 2);
    paneForSliders.add(Blue, 1, 2);
    paneForSliders.add(new Label("Opacity"), 0, 3);
    paneForSliders.add(Opacity, 1, 3);

    // Place nodes in a border pane
    BorderPane pane = new BorderPane();
    pane.setTop(paneForText);
    pane.setCenter(paneForSliders);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 150);
    primaryStage.setTitle("Exercise_16_17"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /** Set the text color */
  private void setColor() {
    text.setFill(new Color(Red.getValue(), Green.getValue(), 
        Blue.getValue(), Opacity.getValue()));
  }
}