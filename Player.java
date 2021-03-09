public class Player {
    private Deck deck;
    private String name;
    private int lifePoints;
    private Card[] cardsInHand;
    private Card[] graveyard;
    private Card[] monstersOnField;
    private Card[] spellsOnField;
    private Card[] trapsOnField;

    // FIX ALL OF BELOW TO MATCH ABOVE INSTANCE VARIABLES

    public Player(Deck deck, Card[] cardsInHand, Card[] graveyard, String name, Card[] monstersOnField, Card[] spellsOnField, Card[] trapsOnField, int lifePoints) {
        this.lifePoints = lifePoints;
        this.cardsInHand = cardsInHand;
        this.graveyard = graveyard;
        this.deck = deck;
        this.name = name;
        this.monstersOnField = monstersOnField;
        this.spellsOnField = spellsOnField;
        this.trapsOnField = trapsOnField;
    }

    public Deck getDecK() {
        return this.deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getMonstersOnField() {
        return this.monstersOnField;
    }

    public void setMonstersOnField(Card[] monstersOnField) {
        this.monstersOnField = monstersOnField;
    }

    public Card[] getSpellsOnField() {
        return this.spellsOnField;
    }

    public void setSpellsOnField(Card[] spellsOnField) {
        this.spellsOnField = spellsOnField;
    }

    public Card[] getTrapsOnField() {
        return this.trapsOnField;
    }

    public void setTrapsOnField(Card[] trapsOnField) {
        this.trapsOnField = trapsOnField;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Card[] getCardsInHand() {
        return this.cardsInHand;
    }

    public void setCardsInHand(Card[] cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public Card[] getGraveyard() {
        return this.graveyard;
    }

    public void setGraveyard(Card[] graveyard) {
        this.graveyard = graveyard;
    }
}
