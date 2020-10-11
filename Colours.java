public enum Colours {
    BLUE("colour is blue"),
    GREEN("colour is green"),
    PINK("colour is pink"),
    RED("colour is red"),
    YELLOW("colour is yellow");

    private String value;

    private Colours(String c) {
        value = c;
    }

    public String getColours() {
        return value;
    }
}
