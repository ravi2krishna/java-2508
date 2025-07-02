package tweleve_inheritance;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class VideoAdmin {

    // watch video
    // actual watchVideos() code
   public void watchVideos() {
      System.out.println("Can Watch Videos");
      System.out.println("Opening video in browser...");
      try {
          // Check if Desktop API is supported
          if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
              Desktop.getDesktop().browse(new URI("https://vimeo.com/449787858"));
          } else {
              System.out.println("Desktop not supported. Cannot open browser.");
          }
      } catch (IOException | URISyntaxException e) {
          System.out.println("Error: " + e.getMessage());
      }
    }

    // add video
    public void addVideos() {
        System.out.println("Can Add Videos");
    }

}
