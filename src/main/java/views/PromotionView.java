package views;

import org.hexworks.zircon.api.Components;
import org.hexworks.zircon.api.component.ColorTheme;
import org.hexworks.zircon.api.component.Label;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.view.base.BaseView;
import org.jetbrains.annotations.NotNull;

public class PromotionView extends BaseView {

    public Label test = Components.label()
            .withText("Current standing towards promotion:")
            .build();

    public PromotionView(@NotNull TileGrid tileGrid, @NotNull ColorTheme theme) {
        super(tileGrid, theme);

        getScreen().addComponent(test);
    }
}
