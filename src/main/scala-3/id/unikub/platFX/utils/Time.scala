package id.unikub.platFX.utils

object Time:
  private var _deltaTime, _time = 0.0
  private var _newTime = 0.0
  private var _trueTime = System.nanoTime/1000000000.0
  
  def deltaTime = _deltaTime
  def time = _time

  def update =
    _newTime = System.nanoTime/1000000000.0
    _deltaTime = _newTime - _trueTime
    _trueTime = _newTime
    _time += _deltaTime
class Time:
  protected def newTime = Time._newTime
  protected def newTime_=(t :Double) = Time._newTime = t
  protected def trueTime = Time._trueTime
  protected def trueTime_=(t :Double) = Time._trueTime = t
  protected def deltaTime = Time._deltaTime
  protected def deltaTime_=(t :Double) = Time._deltaTime = t
  protected def time = Time.time
  protected def time_=(t :Double) = Time._time = t