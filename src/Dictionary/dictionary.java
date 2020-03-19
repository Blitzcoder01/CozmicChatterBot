package Dictionary;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class dictionary {
    public void search_dictionary(){
        String url = "https://dictionary.cambridge.org";
        if(Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
