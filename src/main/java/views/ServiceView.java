package views;

import org.hexworks.zircon.api.Components;
import org.hexworks.zircon.api.component.ColorTheme;
import org.hexworks.zircon.api.component.Label;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.view.base.BaseView;
import org.jetbrains.annotations.NotNull;

public class ServiceView extends BaseView {

    public Label test = Components.label()
            .withText("Service Record")
            .build();

    public ServiceView(@NotNull TileGrid tileGrid, @NotNull ColorTheme theme) {
        super(tileGrid, theme);

        getScreen().addComponent(test);
    }
}
