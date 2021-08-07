package id.unikub.platEngine.objects

import scalafx.scene.image.Image
import id.unikub.platEngine.transform.{Transform, Vector2}
import java.net.URL
import scala.collection.mutable.ListBuffer

class GameObject(var transform :Transform = Transform(Vector2(0,0), 0, Vector2(0, 0)), name :String = "GameObject"):
  private val _children = ListBuffer[GameObject]()
  def children = _children

  def append(child :GameObject*)=
    _children ++= child