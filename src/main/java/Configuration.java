import org.hexworks.zircon.api.CP437TilesetResources;
import org.hexworks.zircon.api.ColorThemes;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.component.ColorTheme;
import org.hexworks.zircon.api.data.Size;
import org.hexworks.zircon.api.resource.TilesetResource;

public class Configuration {

    private static final int screenWidth = 80;
    private static final int screenHeight = 24;
    private static final TilesetResource tiles = CP437TilesetResources.curses24x24();
    private static final boolean debugEnabled = true;
    private static final String windowTitle = "Star Fleet I: The War Begins!";
    private static final ColorTheme theme = ColorThemes.tron();

   static AppConfig newAppConfig() {
        return AppConfig.newBuilder()
                .withSize(Size.create(screenWidth,screenHeight))
                .withDebugMode(debugEnabled)
                .withTitle(windowTitle)
                .withDefaultTileset(tiles)
                .build();
    }

    static ColorTheme getTheme(){
       return theme;
    }
}
