package views;

import org.hexworks.zircon.api.Components;
import org.hexworks.zircon.api.component.Button;
import org.hexworks.zircon.api.component.ColorTheme;
import org.hexworks.zircon.api.component.Header;
import org.hexworks.zircon.api.component.Label;
import org.hexworks.zircon.api.graphics.Symbols;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.view.base.BaseView;
import org.jetbrains.annotations.NotNull;

public class MainMenu extends BaseView {

    public Header optionHeader = Components.header()
            .withText("OPTION")
            .withPosition(1,1)
            .build();

    public Header purposeHeader = Components.header()
            .withText("PURPOSE")
            .withPosition(20, 1)
            .build();

    public Label headerLine = Components.label()
            .withText(String.valueOf(Symbols.SINGLE_LINE_HORIZONTAL).repeat(60))
            .withPosition(1,2)
            .build();

    public Button newButton = Components.button()
            .withText("C")
            .withPosition(3, 3)
            .build();

    public Label newLabel = Components.label()
            .withText("- continue on to a new mission")
            .withPosition(8, 3)
            .build();

    // Not implemented yet
    public Button serviceButton = Components.button()
            .withText("S")
            .withPosition(3,4)
            .build();

    public Label serviceLabel = Components.label()
            .withText("- view your Service Record")
            .withPosition(8, 4)
            .build();

    // Not implemented yet
    public Button promotionButton = Components.button()
            .withText("P")
            .withPosition(3, 5)
            .build();

    public Label promotionLabel = Components.label()
            .withText("- obtain your current standing towards promotion")
            .withPosition(8, 5)
            .build();

    // Not implemented yet
    public Button personnelButton = Components.button()
            .withText("F")
            .withPosition(3, 6)
            .build();

    public Label personnelLabel = Components.label()
            .withText("- list status of Star Fleet personnel")
            .withPosition(8, 6)
            .build();

    // Not implemented yet
    public Button otherButton = Components.button()
            .withText("A")
            .withPosition(3, 7)
            .build();

    public Label otherLabel = Components.label()
            .withText("- view another officer's Service Record")
            .withPosition(8, 7)
            .build();

    // Not implemented yet
    public Button universeButton = Components.button()
            .withText("T")
            .withPosition(3,8)
            .build();

    public Label universeLabel = Components.label()
            .withText("- play theme of universe creation")
            .withPosition(8, 8)
            .build();

    public Button resumeButton = Components.button()
            .withText("R")
            .withPosition(3, 9)
            .build();

    public Label resumeLabel = Components.label()
            .withText("- resume a previously saved mission")
            .withPosition(8, 9)
            .build();

    // Not implemented yet
    public Button maintenanceButton = Components.button()
            .withText("M")
            .withPosition(3, 10)
            .build();

    public Label maintenanceLabel = Components.label()
            .withText("- maintenance of data files")
            .withPosition(8, 10)
            .build();

    public Button exitButton = Components.button()
            .withText("X")
            .withPosition(3, 11)
            .build();

    public Label exitLabel = Components.label()
            .withText("- exit back to operating system")
            .withPosition(8, 11)
            .build();

    public MainMenu(@NotNull TileGrid tileGrid, @NotNull ColorTheme theme) {
        super(tileGrid, theme);
        getScreen().addComponent(optionHeader);
        getScreen().addComponent(purposeHeader);
        getScreen().addComponent(headerLine);
        getScreen().addComponent(newButton);
        getScreen().addComponent(newLabel);
        getScreen().addComponent(serviceButton);
        getScreen().addComponent(serviceLabel);
        getScreen().addComponent(promotionButton);
        getScreen().addComponent(promotionLabel);
        getScreen().addComponent(personnelButton);
        getScreen().addComponent(personnelLabel);
        getScreen().addComponent(otherButton);
        getScreen().addComponent(otherLabel);
        getScreen().addComponent(universeButton);
        getScreen().addComponent(universeLabel);
        getScreen().addComponent(resumeButton);
        getScreen().addComponent(resumeLabel);
        getScreen().addComponent(maintenanceButton);
        getScreen().addComponent(maintenanceLabel);
        getScreen().addComponent(exitButton);
        getScreen().addComponent(exitLabel);
    }
}
