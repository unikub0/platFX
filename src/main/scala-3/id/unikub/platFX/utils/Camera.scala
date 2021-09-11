package id.unikub.platFX.utils

import id.unikub.platFX.utils.transform.{Transform, Vector2}
import scalafx.scene.paint.Color
import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.Renderable
import id.unikub.platFX.utils.Terrain
import id.unikub.platFX.core.PlatRunnable
import id.unikub.platFX.core.PlatRunner

class Camera(transform :Transform, terrain :Terrain, var dim :Vector2) extends Canvas, PlatRunnable:
  width = dim.x
  height = dim.y

  private val gc = graphicsContext2D
  
  override def awake = gc.beginPath()
  override def loop =
    gc.clearRect(0, 0, dim.x, dim.y)

    //Background of Terrain
    gc.fill = (terrain.backgroundColor)
    gc.fillRect(0, 0, dim.x, dim.y)
    /*
    for
      i <- terrain.children
      if i.isInstanceOf[Renderable]
    do
      gc.drawImage(
        i.asInstanceOf[Renderable].sprites,
        i.transform.pos.x,
        dim.y-i.transform.pos.y,
        i.asInstanceOf[Renderable].sprites.width.value*i.transform.scl.x,
        dim.y-i.asInstanceOf[Renderable].sprites.height.value*i.transform.scl.y
      )
      */
  override def destruct = {}

  PlatRunner(this).start