package id.unikub.platFX.core.renderer

import id.unikub.platFX.utils.{Util,Time,Camera}
import scala.collection.mutable.ListBuffer

object PlatRenderer extends Thread:
  var running = false
  var fps = 0
  val renderBuffer :ListBuffer[Camera]= ListBuffer()
  override def run =
    running = true
    var unprocessedTime, frameTime = 0.0
    var frames = 0
    var canRender = false

    while running do
      Time.update
      
      canRender = false

      unprocessedTime += Time.deltaTime
      frameTime += Time.deltaTime


      while unprocessedTime >= Util.UPDATE_RATE do
        unprocessedTime -= Util.UPDATE_RATE
        canRender = true

      if canRender then
        frames +=1
        renderBuffer.map(_.render)

      else try
        Thread.sleep(1)
      catch
        case e :InterruptedException => e.printStackTrace