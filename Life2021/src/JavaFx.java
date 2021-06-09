import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;


public class JavaFx extends Application implements EventHandler<MouseEvent> {
    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //控件
        Button button= new Button("按钮");

        button.setOnMouseClicked(this);

        //布局
        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(button);

        Scene  scene  = new Scene(stackPane, 400, 400);

        scene.setOnMousePressed(new MySceneMouseEvent());

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(MouseEvent event) {
        System.out.println("这是按钮");
    }

    public static void main(String[] args) {
        launch(args);
    }
}