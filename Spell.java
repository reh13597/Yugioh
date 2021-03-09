public class Spell extends Card{
    private String spellType;

    public Spell(String name, String type, String desc, String spellType) {
        super(name, type, desc);
        this.spellType = spellType;
    }

    public String getSpellType() {
        return this.spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }
}
