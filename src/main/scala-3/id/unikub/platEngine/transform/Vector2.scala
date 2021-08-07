package id.unikub.platEngine.transform

open class Vector2(private var _x :Float, private var _y :Float):
  override def toString = s"${_x}, ${_y}"

  def x = _x; def x_= (newX :Float) = _x = newX
  def y = _y; def y_= (newY :Float) = _y = newY

  def this(_x :Double, _y :Double) =
    this(_x.toFloat, _y.toFloat)