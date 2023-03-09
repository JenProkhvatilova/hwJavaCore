package javaCoreHW.hw9;

public enum Size {
    S("S", 50, 60),
    M("M", 60, 70),
    XL("XL", 70, 80);

    private final String abbreviation;
    private final int width;
    private final int length;

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
