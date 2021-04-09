public class Monster {
    private String attack;
    private String defense;
    private String level;
    private String element;
    private String name;
    private String desc;

    public Monster(String name, String element, String desc, String level,
    String attack, String defense) {
        this.name = name;
        this.element = element;
        this.desc = desc;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAttack() {
        return this.attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return this.defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String toString() {
        return "Monster: " + this.getName() + ", Element: " +
        this.getElement() + ", " + this.getDesc() + ", Level: " +
        this.getLevel() + ", Attack: " + this.getAttack() + ", Defense: " +
        this.getDefense();
    }

}