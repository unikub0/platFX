package id.unikub.platEngine

import scalafx.application.JFXApp3.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.layout.StackPane

object PrimaryStageConfig:
  val stage = PrimaryStage()
  val scene = Scene(StackPane())
  stage.scene = this.scene