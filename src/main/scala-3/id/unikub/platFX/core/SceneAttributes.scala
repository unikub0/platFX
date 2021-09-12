package id.unikub.platFX.core

import scalafx.scene.Scene
import scalafx.scene.text.Text
import scalafx.scene.layout.StackPane

object SceneAtributes:
  val scene = Scene(StackPane())
  val defaultText = Text("Hello, platFX!")
  scene.getChildren += defaultText