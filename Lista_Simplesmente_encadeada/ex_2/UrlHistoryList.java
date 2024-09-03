package Lista_Simplesmente_encadeada.ex_2;

public class UrlHistoryList {
    private UrlNode head;
    private int size;
    private final int maxSize;

    public UrlHistoryList(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void addUrl(String url) {
        UrlNode newNode = new UrlNode(url);
        if (head == null) {
            head = newNode;
        } else {
            UrlNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;

        if (size > maxSize) {
            removeOldest();
        }
    }

    private void removeOldest() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void listUrls() {
        UrlNode current = head;
        while (current != null) {
            System.out.println(current.url);
            current = current.next;
        }
    }
}
