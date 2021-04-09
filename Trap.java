public class Trap {
    private String trapType;
    private String name;
    private String desc;

    public Trap(String name,String trapType, String desc) {
        this.name = name;
        this.trapType = trapType;
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTrapType() {
        return this.trapType;
    }

    public void setTrapType(String trapType) {
        this.trapType = trapType;
    }

    public String toString() {
        return "Trap: " + this.getName() + ", " + "Trap type: " +
        this.getTrapType() + ", " + this.getDesc();
    }
}
