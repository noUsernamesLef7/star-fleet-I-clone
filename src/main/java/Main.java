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

    public static void main(String[] args) {

        TileGrid tileGrid = SwingApplications.startTileGrid(Configuration.newAppConfig());

        MainMenu mainMenu = new MainMenu(tileGrid, Configuration.getTheme());
        mainMenu.dock();
    }
}