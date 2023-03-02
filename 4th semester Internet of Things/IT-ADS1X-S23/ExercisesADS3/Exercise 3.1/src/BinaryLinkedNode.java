public class BinaryLinkedNode {
    private int value;
    private BinaryLinkedNode left;
    private BinaryLinkedNode right;
    public BinaryLinkedNode(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public BinaryLinkedNode getLeft() {
        return left;
    }
    public void setLeft(BinaryLinkedNode left) {
        this.left = left;
    }
    public BinaryLinkedNode getRight() {
        return right;
    }
    public void setRight(BinaryLinkedNode right) {
        this.right = right;
    }
}
