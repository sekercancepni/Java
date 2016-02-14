
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.push(90);
        tree.push(92);
        tree.push(25);
        tree.push(70);
        tree.push(65);
        tree.push(50);
        tree.push(95);
        tree.push(80);
        tree.push(85);
        tree.push(93);

        System.out.println("PreOrder");
        tree.print_preorder(tree.root);

        System.out.println("PostOrder");
        tree.print_postorder(tree.root);

        System.out.println("InOrder");
        tree.print_inorder(tree.root);
    }
}