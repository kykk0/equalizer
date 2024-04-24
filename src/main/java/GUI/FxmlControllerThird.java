package GUI;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.*;
import javafx.stage.Stage;
import player.AudioPlayerThird;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class FxmlControllerThird implements Initializable {

    private AudioPlayerThird audioPlayer;
    private Thread playThread;
    @FXML
    private Slider Slider0;
    @FXML
    private Label Label0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listenSliders();
//        this.gainFromSlider();
    }

    @FXML
    private void open() {
        //Выбор файлов формата wav
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Audio Files", "*.wav"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile == null) return;

        this.audioPlayer = new AudioPlayerThird(selectedFile);
        playThread = new Thread(() -> {
            System.out.println("PLAY");
            this.resetSliders();
            this.audioPlayer.play();
        });
        playThread.start();
    }

    @FXML
    private void play() {
        System.out.println("PLAY");
        if (this.audioPlayer != null) {
            if (this.audioPlayer.getStopStatus()) {
                playThread = new Thread(() -> {
                    this.audioPlayer.play();
                });
                playThread.start();
            } else
                this.audioPlayer.setPauseStatus(false);
        }
    }

    @FXML
    private void pause() {
        System.out.println("PAUSE");
        if (this.audioPlayer != null)
            this.audioPlayer.setPauseStatus(true);
    }

    @FXML
    private void stop() {
        System.out.println("STOP");
        if (this.audioPlayer != null)
            this.audioPlayer.setStopStatus(true);
        resetSliders();
    }

    @FXML
    private void clickClose() {
        if (this.audioPlayer != null) {
            if (this.playThread != null)
                this.playThread.interrupt();
            this.audioPlayer.close();
        }

        System.exit(0);
    }

    private void resetSliders() {
        Platform.runLater(() -> {
            Slider0.setValue(1);
        });
    }

    private void listenSliders() {
        Slider0.valueProperty().addListener((observable, oldValue, newValue) -> {
            String str = String.format("%.3f", (newValue.doubleValue()));
            Label0.setText(str);
            audioPlayer.getEqualizer().getFilter(0).setGain(newValue.doubleValue());
        });


    }
}
