import org.hexworks.zircon.api.CP437TilesetResources;
import org.hexworks.zircon.api.ColorThemes;
import org.hexworks.zircon.api.SwingApplications;
import org.hexworks.zircon.api.application.AppConfig;
import org.hexworks.zircon.api.component.ColorTheme;
import org.hexworks.zircon.api.data.Size;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.resource.TilesetResource;
import views.MainMenu;

public class Main {

    private static final int screenWidth = 80;
    private static final int screenHeight = 24;
    private static final TilesetResource tiles = CP437TilesetResources.curses24x24();
    private static final boolean debugEnabled = true;
    private static final String windowTitle = "Star Fleet I: The War Begins!";
    private static final ColorTheme theme = ColorThemes.tron();

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications.startTileGrid(
                AppConfig.newBuilder()
                .withSize(Size.create(screenWidth,screenHeight))
                .withDebugMode(debugEnabled)
                .withTitle(windowTitle)
                .withDefaultTileset(tiles)
                .build());

        MainMenu mainMenu = new MainMenu(tileGrid, theme);
        mainMenu.dock();
    }
}