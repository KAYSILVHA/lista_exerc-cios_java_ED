package Lista_Duplamente_Encadeada.ex_2;

public class Hand {
    private CardNode head;
    private CardNode tail;

    public Hand() {
        this.head = null;
        this.tail = null;
    }

    public void addCard(String card) {
        CardNode newNode = new CardNode(card);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public boolean removeCard(String card) {
        CardNode current = head;
        while (current != null) {
            if (current.card.equals(card)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    tail = current.previous;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean moveCardToEnd(String card) {
        CardNode current = head;
        while (current != null) {
            if (current.card.equals(card)) {
                if (current == tail) {
                    return true;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                current.next = null;
                current.previous = tail;
                if (tail != null) {
                    tail.next = current;
                }
                tail = current;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void listCards() {
        CardNode current = head;
        while (current != null) {
            System.out.println(current.card);
            current = current.next;
        }
    }
}
