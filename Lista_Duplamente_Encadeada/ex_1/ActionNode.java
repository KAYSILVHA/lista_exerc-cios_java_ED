package Lista_Duplamente_Encadeada.ex_1;

public class ActionNode {
    String action;
    ActionNode previous;
    ActionNode next;

    public ActionNode(String action) {
        this.action = action;
        this.previous = null;
        this.next = null;
    }
}
