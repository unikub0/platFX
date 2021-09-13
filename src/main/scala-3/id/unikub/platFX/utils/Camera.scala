package id.unikub.platFX.utils

import id.unikub.platFX.utils.transform.{Transform, Vector2}
import scalafx.scene.paint.Color
import scalafx.scene.canvas.Canvas
import id.unikub.platFX.utils.gameObjects.Renderable
import id.unikub.platFX.utils.Terrain
import id.unikub.platFX.core.renderer.PlatRenderer
import id.unikub.platFX.utils.gameObjects.GameObject

class Camera(transform :Transform, terrain :Terrain, var dim :Vector2) extends Canvas:
  width = dim.x
  height = dim.y
  
  private val gc = graphicsContext2D
  
  gc.beginPath()
  PlatRenderer.renderBuffer += this

  def render =
    //Background of Terrain
    gc.fill = (terrain.backgroundColor)
    gc.fillRect(0, 0, dim.x, dim.y)
    
    for
      i <- terrain.gameObjects()
      if i.isInstanceOf[Renderable]
    do
      val obj = i.asInstanceOf[Renderable]
      gc.drawImage(
        obj.sprites,
        this.width.value/2 + (i.transform.pos.x-(obj.sprites.width.value/2)) - transform.pos.x,
        this.height.value-obj.sprites.height.value - (this.height.value/2 + (i.transform.pos.y-(obj.sprites.height.value/2)) - transform.pos.y)
      )