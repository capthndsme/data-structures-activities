import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class HtmlTree extends JFrame{
    JTree tree;
    public HtmlTree() {
        // Root 
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("html");
        // Contains head nodes
        DefaultMutableTreeNode headNode = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode metaNode = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode titleNode = new DefaultMutableTreeNode("title");
        // Contains Body nodes
        DefaultMutableTreeNode bodyNode = new DefaultMutableTreeNode("body");
        DefaultMutableTreeNode ulNode = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode h1Node = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2Node = new DefaultMutableTreeNode("h2");
        DefaultMutableTreeNode li1Node = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode li2Node = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode aNode = new DefaultMutableTreeNode("a");
        root.add(headNode);
        root.add(bodyNode);
        headNode.add(metaNode);
        headNode.add(titleNode);
        bodyNode.add(ulNode);
        bodyNode.add(h1Node);
        bodyNode.add(h2Node);
        ulNode.add(li1Node);
        ulNode.add(li2Node);
        h2Node.add(aNode);
        tree = new JTree(root);
        add(tree);
        this.setTitle("JTree Example");
        this.setSize(300,300);
        this.setVisible(true);
        System.out.println("                         Root Node: html");
        System.out.println("                      Parent Nodes: head, body, u1, h2");
        System.out.println("                          Siblings: head & body\tmeta & title\tul, h1, & h2\tli & li\ta");
        System.out.println("                One-level subtrees: html [head, body]\thead [meta, title]\tbody [h1,h2,u1]\tul [li, li]\t h2 [a]");
        System.out.println("                   Nodes per level: 0: html");
        System.out.println("                                    1: head, body");
        System.out.println("                                    2: meta, title, ul, h1, h2");
        System.out.println("                                    3: li, li, a");
        System.out.println("                             Depth: 3");
        System.out.println("  Degree of each one-level subtree: ");
        System.out.println("                                    html: 2");
        System.out.println("                                    head: 2");
        System.out.println("                                    body: 3");
        System.out.println("                                    ul: 2");
        System.out.println("                                    h2: 1");
    }
    public static void main(String[] args)
    {
        new HtmlTree();
    }
}
