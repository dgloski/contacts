enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    DangerLevel(int level) {
        this.level = level;
    }

    private int level;

    public int getLevel() {
        return level;
    }
}
