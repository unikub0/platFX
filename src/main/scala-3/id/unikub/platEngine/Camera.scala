package id.unikub.platEngine

import id.unikub.platEngine.transform.{Transform, Vector2}
import scalafx.scene.paint.Color
import scalafx.scene.canvas.Canvas
import id.unikub.platEngine.objects.Renderable

class Camera(transform :Transform, terrain :Terrain, var dim :Vector2) extends Canvas:
  width = dim.x
  height = dim.y
  var i =0
  private val gc = graphicsContext2D
  gc.beginPath()
  def render :Unit =
    gc.clearRect(0, 0, dim.x, dim.y)
    //
    gc.fill = (terrain.backgroundColor)
    gc.fillRect(0, 0, dim.x, dim.y)
    gc.fill = Color.Red
    gc.fillRect(0, 0, 30, 30)
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