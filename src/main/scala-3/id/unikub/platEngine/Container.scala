package id.unikub.platEngine

class Container(private val _game :GameRunner) extends Time, Runnable:
  var running = false
  val UPDATE_RATE = 1.0/180
  private var frames, fps = 0

  def start=
    Thread(this).start
    
  override def run=
    var render = false
    running = true
    var unprocessedTime, frameTime = 0.0

    while running do
      Time.update

      render = false

      unprocessedTime += Time.deltaTime
      frameTime += Time.deltaTime

      while unprocessedTime >= UPDATE_RATE do
        unprocessedTime -= UPDATE_RATE
        render = true

        _game.update

        if frameTime >= 1 then
          frameTime = 0
          fps = frames
          frames = 0
          println(fps)

      if render then
        frames+=1

      else try
        Thread.sleep(1)
      catch
        case ex: InterruptedException => ex.printStackTrace