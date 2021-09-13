package id.unikub.platFX.utils.transform

open class Vector2(private var _x :Double, private var _y :Double):
  override def toString = s"${_x}, ${_y}"

  def x = _x; def x_=(newX :Double) = _x = newX
  def y = _y; def y_=(newY :Double) = _y = newY