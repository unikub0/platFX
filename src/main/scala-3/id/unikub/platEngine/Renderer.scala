package id.unikub.platEngine

import scalafx.scene.canvas.Canvas
import id.unikub.platEngine.objects.GameObject
import scalafx.stage.Screen
import id.unikub.platEngine.transform.Vector2

class Renderer(dim :Vector2) extends Canvas:
  width = dim.x
  height = dim.y
  val gc = graphicsContext2D