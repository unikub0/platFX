package id.unikub.platFX.core

import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.GameObject
import id.unikub.platFX.utils.Time
import id.unikub.platFX.core.PlatRunnable
import id.unikub.platFX.utils.Util
import scala.collection.mutable.ListBuffer
import id.unikub.platFX.frames.PlatApp

class PlatRunner(runnable :PlatRunnable, name :String = s"PlatFX Game Runner ${PlatRunner.i}") extends Thread(name):
  protected var running = false

  PlatRunner.i+=1
  PlatRunner._runner += this
  
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
object PlatRunner:
  private var i = 0
  private val _runner = ListBuffer[PlatRunner]()
  def runner() = _runner