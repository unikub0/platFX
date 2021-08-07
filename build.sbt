val scala3Version = "3.0.0"

lazy val javaFXModules = {
      // Determine OS version of JavaFX binaries
      lazy val osName = System.getProperty("os.name") match {
        case n if n.startsWith("Linux")   => "linux"
        case n if n.startsWith("Mac")     => "mac"
        case n if n.startsWith("Windows") => "win"
        case _                            => 
          throw new Exception("Unknown platform!")
      }
      // Create dependencies for JavaFX modules
      Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
        .map( m=> "org.openjfx" % s"javafx-$m" % "16" classifier osName)
    }
lazy val scalaFXModule = {
  "org.scalafx" %% "scalafx" % "16.0.0-R24"
}
lazy val root = project
  .in(file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "platShot",
    version := "0.1",

    scalaVersion := scala3Version,

    libraryDependencies ++= javaFXModules,
    libraryDependencies += scalaFXModule,
    Compile / mainClass := Some("id.unikub.platShot.Main")
  )