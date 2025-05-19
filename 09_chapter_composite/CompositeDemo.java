public class ButtonWidget implements Widget {
    private String label;
    private ButtonStyle style;

    public ButtonWidget(String label, ButtonStyle style) {
        this.label = label;
        this.style = style;
    }

    @Override
    public void build() {
        System.out.println("Building Button: "
            + label + " (" + style + ")");
    }

    @Override
    public void add(Widget child) {
        throw new UnsupportedOperationException(
            "ButtonWidget is a leaf."
        );
    }

    @Override
    public void remove(Widget child) {
        throw new UnsupportedOperationException(
            "ButtonWidget is a leaf."
        );
    }

    @Override
    public Widget getChild(int index) {
        throw new UnsupportedOperationException(
            "ButtonWidget is a leaf."
        );
    }

    public void onClick() {
        System.out.println("Button clicked: " + label);
    }
}

public class App implements Widget {
    private List<Widget> children = new ArrayList<>();

    @Override
    public void build() {
        System.out.println("Building App...");
        for (Widget child : children) {
            child.build();
        }
    }

    @Override
    public void add(Widget child) {
        children.add(child);
    }

    @Override
    public void remove(Widget child) {
        children.remove(child);
    }

    @Override
    public Widget getChild(int index) {
        return children.get(index);
    }
}

public class Main {
    public static void main(String[] args) {
        Widget saveButton =
            new ButtonWidget("Save", ButtonStyle.PRIMARY);
        Widget cancelButton =
            new ButtonWidget("Cancel", ButtonStyle.SECONDARY);

        Widget app1 = new App();
        app1.add(saveButton);

        Widget app2 = new App();
        app2.add(cancelButton);
        app2.add(app1);

        app2.build();
    }
}