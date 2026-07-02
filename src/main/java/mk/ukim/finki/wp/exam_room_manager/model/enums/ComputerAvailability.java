package mk.ukim.finki.wp.exam_room_manager.model.enums;

public enum ComputerAvailability {
    WITH_COMPUTERS("Со Компјутери"),
    WITHOUT_COMPUTERS("Без Компјутери");

    private final String label;

    ComputerAvailability(String label)
    {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
