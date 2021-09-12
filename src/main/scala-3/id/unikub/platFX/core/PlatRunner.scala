package id.unikub.platFX.core

import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.GameObject
import id.unikub.platFX.utils.Time
import id.unikub.platFX.core.PlatRunnable
import id.unikub.platFX.utils.Util

class PlatRunner(runnable :PlatRunnable) extends Thread("PlatFX Game Runner"):
  protected var running = false
  
  override def run =
    running = true
    runnable.awake
    update

  def update =
    var unprocessedTime = 0.0

    while running do
      unprocessedTime += Time.deltaTime

      while unprocessedTime >= Util.UPDATE_RATE do
        unprocessedTime -= Util.UPDATE_RATE
        runnable.loop
        println("dari runner")
  
  def destroy =
    running = false
    runnable.destruct