package Lista_Simplesmente_encadeada.ex_3;

public class UndoHistory {
    private ActionNode head;

    public UndoHistory() {
        this.head = null;
    }

    public void addAction(String action) {
        ActionNode newNode = new ActionNode(action);
        newNode.next = head;
        head = newNode;
    }

    public String undo() {
        if (head == null) {
            return "Nenhuma ação para desfazer.";
        }
        String undoneAction = head.action;
        head = head.next;
        return undoneAction;
    }

    public void listActions() {
        ActionNode current = head;
        while (current != null) {
            System.out.println(current.action);
            current = current.next;
        }
    }
}
