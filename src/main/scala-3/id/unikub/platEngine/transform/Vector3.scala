package id.unikub.platEngine.transform

open class Vector3(private var _x :Float, private var _y :Float, private var _z :Float) extends Vector2(_x, _y):
  def z = _z
  def z_= (newZ :Float) = _z = newZ

  override def toString = this.asInstanceOf[Vector2].toString + ", " + _z

  def this(_x :Double, _y :Double, _z :Double) =
    this(_x.toFloat, _y.toFloat, _z.toFloat)