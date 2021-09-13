package id.unikub.platFX.utils.gameObjects

import java.net.URL
import scalafx.scene.image.Image
import id.unikub.platFX.utils.transform.{Transform, Vector2}
import id.unikub.platFX.core.PlatRunnable
import scala.collection.mutable.ListBuffer

class GameObject(var transform :Transform = Transform(Vector2(0,0), 0, Vector2(0, 0)), _name :String = s"GameObject (${i})") extends PlatRunnable:
  private val _children = ListBuffer[GameObject]()
  def children = _children

  def awake = ()
  def loop = ()
  def destruct = ()

  def name = _name

  GameObject.i+=1
object GameObject:
  var i = 0