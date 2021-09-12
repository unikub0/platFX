package id.unikub.platFX.utils

import id.unikub.platFX.utils.transform.{Transform, Vector2}
import scalafx.scene.paint.Color
import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.Renderable
import id.unikub.platFX.utils.Terrain
import id.unikub.platFX.core.renderer.PlatRenderer

class Camera(transform :Transform, terrain :Terrain, var dim :Vector2) extends Canvas:
  width = dim.x
  height = dim.y
  
  private val gc = graphicsContext2D
  
  gc.beginPath()
  PlatRenderer.renderBuffer += this

  def render =
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