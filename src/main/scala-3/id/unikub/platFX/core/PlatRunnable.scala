package id.unikub.platFX.core

trait PlatRunnable:
  def awake :Unit
  def loop :Unit
  def destruct :Unit