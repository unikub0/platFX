package id.unikub.platFX.utils

import scalafx.scene.canvas.Canvas
import scalafx.scene.paint.Color
import scalafx.stage.Screen
import id.unikub.platFX.utils.gameObjects.GameObject
import id.unikub.platFX.utils.transform.{Vector2, Transform}
import id.unikub.platFX.core.PlatRunner
import scala.collection.mutable.ListBuffer
import scalafx.scene.image.Image

class Terrain(name :String = "Terrain"):
  var backgroundColor = Color.Cyan
  var backgroundImage :Image = null
  private val _gameObjectThreads = ListBuffer[PlatRunner]()
  private val _gameObjects = ListBuffer[GameObject]()
  def gameObjects() = _gameObjects

  def appendGameObject(obj :GameObject) =
    _gameObjects += obj
    _gameObjectThreads += PlatRunner(obj, obj.name)
    _gameObjectThreads.last.start