public class Tree {
    public Node root;

    public Tree() {
        this.root = null;
    }

    public void push(int number) {
        this.root = this.push_tree(number, this.root);
    }

    private Node push_tree(int number, Node current_node) {
        if (current_node == null) {
            current_node = new Node(number);
        } else if (number < current_node.number) {
            current_node.left = this.push_tree(number, current_node.left);
        } else {
            current_node.right = this.push_tree(number, current_node.right);
        }

        return current_node;
    }

    public void print_preorder(Node current_node) {
        if (current_node != null) {
            System.out.println(current_node.number);
            this.print_preorder(current_node.left);
            this.print_preorder(current_node.right);
        }
    }

    public void print_postorder(Node current_node) {
        if (current_node != null) {
            this.print_postorder(current_node.left);
            this.print_postorder(current_node.right);
            System.out.println(current_node.number);
        }
    }

    public void print_inorder(Node current_node) {
        if (current_node != null) {
            this.print_inorder(current_node.left);
            System.out.println(current_node.number);
            this.print_inorder(current_node.right);
        }
    }
}