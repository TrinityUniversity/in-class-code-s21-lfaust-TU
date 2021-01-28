package basics

import scalafx.application.JFXApp
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas

object HelloGraphics extends JFXApp {
  stage = new JFXApp.PrimaryStage {
    title = "Rectangle"
    scene = new Scene(800, 600) {
      val canvas = new Canvas(800, 600)
      content = canvas
      val gc = canvas.graphicsContext2D
      gc.fillRect(100, 100, 200, 200)
    }
  }
}