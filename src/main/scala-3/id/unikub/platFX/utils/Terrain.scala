package id.unikub.platFX.utils

import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color
import scalafx.stage.Screen
import id.unikub.platFX.utils.gameObjects.GameObject
import id.unikub.platFX.utils.transform.{Vector2, Transform}

class Terrain extends GameObject():
  val backgroundColor = Color.Cyan