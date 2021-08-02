package id.unikub.platEngine

import scalafx.application.JFXApp3
import scalafx.scene.image.Image
import scalafx.scene.Scene
import scalafx.application.Platform
import scalafx.scene.text.Text
import scalafx.scene.layout.StackPane
import scalafx.scene.layout.BorderPane
import scalafx.scene.layout.AnchorPane
import scalafx.scene.control.Button
import scalafx.stage.Stage


class App extends JFXApp3:
  override def start():Unit=
    stage = new JFXApp3.PrimaryStage:
      title = "plat-Engine"
      icons += Image(getClass.getResourceAsStream("/assets/platShot/icon/plat-Shot_icon.png"))
      onCloseRequest = _ -> {Platform.exit(); System.exit(0)}

      scene = new Scene:
        root = new StackPane:
          children = new Button("this is default scene")