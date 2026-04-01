/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omen_Gamer
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. DatePicker (selector de fecha moderno)
        DatePicker datePicker = new DatePicker();

        // 2. Slider (control deslizante con valores)
        Slider slider = new Slider(0, 100, 50);

        // 3. ProgressBar (barra de progreso vinculada al slider)
        ProgressBar progressBar = new ProgressBar(0);
        slider.valueProperty().addListener((obs, oldVal, newVal) -> {
            progressBar.setProgress(newVal.doubleValue() / 100);
        });

        // 4. PieChart (gráfico circular integrado)
        PieChart pieChart = new PieChart();
        pieChart.getData().add(new PieChart.Data("JavaFX", 40));
        pieChart.getData().add(new PieChart.Data("Swing", 30));
        pieChart.getData().add(new PieChart.Data("Otros", 30));


        // Layout vertical
        VBox root = new VBox(10);
        root.getChildren().addAll(datePicker, slider, progressBar, pieChart);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Ventana JavaFX con 5 elementos característicos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}