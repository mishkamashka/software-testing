package main.task2;

public class BiQueue {
    private Node Nodes;
    private int size;

    private String heap;

    public BiQueue() {
        Nodes = null;
        size = 0;
    }

    public boolean isEmpty() {
        return Nodes == null;
    }

    public void clearHeap() {
        Nodes = null;
        size = 0;
    }

    public void insert(int value) {
        Node temp = new Node(value);
        if (Nodes == null) {
            Nodes = temp;
            size = 1;
        } else {
            uniteNodes(temp);
            size++;
        }
    }

    private void merge(Node binHeap) {
        Node temp1 = Nodes, temp2 = binHeap;

        while ((temp1 != null) && (temp2 != null)) {
            if (temp1.degree == temp2.degree) {
                Node tmp = temp2;
                temp2 = temp2.sibling;
                tmp.sibling = temp1.sibling;
                temp1.sibling = tmp;
                temp1 = tmp.sibling;
            } else
                if (temp1.degree < temp2.degree) {
                    if ((temp1.sibling == null) || (temp1.sibling.degree > temp2.degree)) {
                        Node tmp = temp2;
                        temp2 = temp2.sibling;
                        tmp.sibling = temp1.sibling;
                        temp1.sibling = tmp;
                        temp1 = tmp.sibling;
                    } else
                        temp1 = temp1.sibling;
                } else {
                    Node tmp = temp1;
                    temp1 = temp2;
                    temp2 = temp2.sibling;
                    temp1.sibling = tmp;
                    if (tmp == Nodes)
                        Nodes = temp1;
                }
        }
        if (temp1 == null) {
            temp1 = Nodes;
            while (temp1.sibling != null) {
                temp1 = temp1.sibling;
            }
            temp1.sibling = temp2;
        }
    }

    private void uniteNodes(Node binHeap) {
        merge(binHeap);

        Node prevTemp = null, temp = Nodes, nextTemp = Nodes.sibling;

        while (nextTemp != null) {
            if ((temp.degree != nextTemp.degree) || ((nextTemp.sibling != null) && (nextTemp.sibling.degree == temp.degree))) {
                prevTemp = temp;
                temp = nextTemp;
            } else
                if (temp.key <= nextTemp.key) {
                    temp.sibling = nextTemp.sibling;
                    nextTemp.parent = temp;
                    nextTemp.sibling = temp.child;
                    temp.child = nextTemp;
                    temp.degree++;
                } else {
                    if (prevTemp == null)
                        Nodes = nextTemp;
                    else
                        prevTemp.sibling = nextTemp;
                    temp.parent = nextTemp;
                    temp.sibling = nextTemp.child;
                    nextTemp.child = temp;
                    nextTemp.degree++;
                    temp = nextTemp;
                }
            nextTemp = temp.sibling;
        }
    }

    public int removeSmallest() {
        if (Nodes == null)
            return -1;

        Node temp = Nodes, prevTemp = null;
        Node minNode = Nodes.findMinNode();

        while (temp.key != minNode.key) {
            prevTemp = temp;
            temp = temp.sibling;
        }

        if (prevTemp == null)
            Nodes = temp.sibling;
        else
            prevTemp.sibling = temp.sibling;

        temp = temp.child;
        Node fakeNode = temp;

        while (temp != null) {
            temp.parent = null;
            temp = temp.sibling;
        }

        if ((Nodes == null) && (fakeNode == null))
            size = 0;
        else {
            if (Nodes == null)
                Nodes = fakeNode.reverse(null);
            else
                if (fakeNode != null)
                    uniteNodes(fakeNode.reverse(null));
            size = Nodes.getSize();
        }

        return minNode.key;
    }

    public String showHeap() {
        heap = "";
        showHeap(Nodes);
        return heap;
    }

    private void showHeap(Node r) {
        if (r != null) {
            showHeap(r.child);
            heap += r.key + " ";
            showHeap(r.sibling);
        }
    }
}
