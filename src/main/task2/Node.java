package main.task2;

class Node
{
    int key, degree;
    Node parent;
    Node sibling;
    Node child;

    public Node(int k)
    {
        key = k;
        degree = 0;
        parent = null;
        sibling = null;
        child = null;
    }

    public Node reverse(Node sibl)
    {
        Node ret;
        if (sibling != null)
            ret = sibling.reverse(this);
        else
            ret = this;
        sibling = sibl;
        return ret;
    }

    public Node findMinNode()
    {
        Node x = this, y = this;
        int min = x.key;

        while (x != null) {
            if (x.key < min) {
                y = x;
                min = x.key;
            }
            x = x.sibling;
        }

        return y;
    }

    public Node findANodeWithKey(int value)
    {
        Node temp = this, node = null;

        while (temp != null)
        {
            if (temp.key == value)
            {
                node = temp;
                break;
            }
            if (temp.child == null)
                temp = temp.sibling;
            else
            {
                node = temp.child.findANodeWithKey(value);
                if (node == null)
                    temp = temp.sibling;
                else
                    break;
            }
        }

        return node;
    }
    /* Function to get size */
    public int getSize()
    {
        return (1 + ((child == null) ? 0 : child.getSize()) + ((sibling == null) ? 0 : sibling.getSize()));
    }
}
