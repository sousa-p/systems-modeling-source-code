public class ButtonWidget {
    private String label;
    private ButtonStyle style;

    public ButtonWidget(String label, ButtonStyle style) {
        this.label = label;
        this.style = style;
    }

    public void build() {
        System.out.println(
            "Building Button: " + label + " (" + style + ")"
        );
    }

    public void onClick() {
        System.out.println("Button clicked: " + label);
    }
}

public class Main {
    public static void main(String[] args) {
        ButtonWidget saveButton =
            new ButtonWidget("Save", ButtonStyle.PRIMARY);
        ButtonWidget cancelButton =
            new ButtonWidget("Cancel", ButtonStyle.SECONDARY);
        saveButton.build();
        cancelButton.build();
    }
}