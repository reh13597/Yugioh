public class Monster extends Card {
    private int attack;
    private int defense;
    private int level;
    private String species;

    public Monster(String name, String type, String desc, String species, int level, int attack, int defense) {
        super(name, type, desc);
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.species = species;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}