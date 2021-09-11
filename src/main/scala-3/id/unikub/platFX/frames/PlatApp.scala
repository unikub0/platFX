package id.unikub.platFX.frames

import scalafx.application.JFXApp3
import scalafx.scene.image.Image
import scalafx.scene.{Scene, Node}
import scalafx.application.Platform
import scalafx.scene.text.Text
import scalafx.scene.layout.{StackPane, BorderPane, AnchorPane}
import scalafx.scene.control.Button
import scalafx.stage.Stage
import scala.collection.mutable.ListBuffer
import id.unikub.platFX.utils.Time

class PlatApp extends JFXApp3:
  
  private val _obj :ListBuffer[Node] = ListBuffer()
  def obj = _obj
  Time.update

  override def start():Unit=
    stage = new JFXApp3.PrimaryStage:
      title = "platFX"
      icons += Image(getClass.getResourceAsStream("/assets/platShot/icon/plat-Shot_icon.png"))
      onCloseRequest = _ -> {Platform.exit(); System.exit(0)}
      scene = new Scene:
        root = new StackPane:
          _obj += Button("Hello, platFX")
          _obj.map(children += _)