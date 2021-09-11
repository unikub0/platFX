package id.unikub.platFX.core

import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.GameObject
import id.unikub.platFX.utils.Time

class GameObjectRunner(obj :GameObject) extends Thread:
  var running = false
  

  override def run =
    running = true
    obj.awake

    