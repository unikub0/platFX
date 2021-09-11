package id.unikub.platFX.utils

import id.unikub.platFX.utils.Time

object Util:
  val UPDATE_RATE = 1.0/180
  def looper(unit :Unit, running :Boolean) =

    var unprocessedTime = 0.0

    while running do
      unprocessedTime += Time.deltaTime

      while unprocessedTime >= UPDATE_RATE do
        unprocessedTime -= UPDATE_RATE
        unit