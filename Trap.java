public class Trap extends Card{
    private String trapType;

    public Trap(String name, String type, String desc, String trapType) {
        super(name, type, desc);
        this.trapType = trapType;
    }

    public String getTrapType() {
        return this.trapType;
    }

    public void setTrapType() {
        this.trapType = trapType;
    }
}
