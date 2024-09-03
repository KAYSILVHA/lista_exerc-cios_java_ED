package Lista_Duplamente_Encadeada.ex_2;

public class CardNode {
    String card;
    CardNode previous;
    CardNode next;

    public CardNode(String card) {
        this.card = card;
        this.previous = null;
        this.next = null;
    }
}
