package Lista_Duplamente_Encadeada.ex_1;

public class ActionHistory {
    private ActionNode current;
    private ActionNode head;
    private ActionNode tail;

    public ActionHistory() {
        this.current = null;
        this.head = null;
        this.tail = null;
    }

    public void addAction(String action) {
        ActionNode newNode = new ActionNode(action);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        current = newNode;
    }

    public String undo() {
        if (current == null) {
            return "Nenhuma ação para desfazer.";
        }
        String undoneAction = current.action;
        current = current.previous;
        return undoneAction;
    }

    public String redo() {
        if (current == null || current.next == null) {
            return "Nenhuma ação para refazer.";
        }
        current = current.next;
        return current.action;
    }

    public void listActions() {
        ActionNode node = head;
        while (node != null) {
            System.out.println(node.action);
            node = node.next;
        }
    }
}
