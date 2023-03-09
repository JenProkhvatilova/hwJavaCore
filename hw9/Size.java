package javaCoreHW.hw9;

public enum Size {
    S("S", 165, 84, 66, 92),
    M("M", 170, 88, 72, 96),
    L("L", 175, 92, 78, 100);

    private final String abbreviation;
    private final int height;
    private final int chestGirth;
    private final int waistGirth;
    private final int hipGirth;


    Size(String abbreviation, int height, int chestGirth, int waistGirth, int hipGirth) {
        this.abbreviation = abbreviation;
        this.height = height;
        this.chestGirth = chestGirth;
        this.waistGirth = waistGirth;
        this.hipGirth = hipGirth;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return height;
    }

    public int getChestGirth() {
        return chestGirth;
    }
    public int getWaistGirth() {
        return waistGirth;
    }
    public int getHipGirth() {
        return hipGirth;
    }
}
