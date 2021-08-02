package id.unikub.platEngine

import scalafx.scene.canvas.Canvas

trait GameRunner:
  def start :Unit
  def update :Unit
  def render :Unit
  def stop :Unit