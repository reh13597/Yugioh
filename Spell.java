public class Spell {
    private String spellType;
    private String name;
    private String desc;

    public Spell(String name,String spellType, String desc) {
        this.name = name;
        this.spellType = spellType;
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

    public String getSpellType() {
        return this.spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public String toString() {
        return "Spell: " + this.getName() + ", " + "Spell type: " +
        this.getSpellType() + ", " + this.getDesc();
    }
}
