import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame{

    public Tree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer");
        DefaultMutableTreeNode node1= new DefaultMutableTreeNode("Hardware");
        DefaultMutableTreeNode node2= new DefaultMutableTreeNode("Software");
        DefaultMutableTreeNode Mtb= new DefaultMutableTreeNode("Motherboard");
        DefaultMutableTreeNode node3= new DefaultMutableTreeNode("Operating System");
        DefaultMutableTreeNode node4= new DefaultMutableTreeNode("Microsoft Windows 10");
        DefaultMutableTreeNode node5= new DefaultMutableTreeNode("64 bit");
        DefaultMutableTreeNode node6= new DefaultMutableTreeNode("Processor");
        DefaultMutableTreeNode node7= new DefaultMutableTreeNode("CPU Cores 8");
        DefaultMutableTreeNode node8= new DefaultMutableTreeNode("4.4GHz");
        DefaultMutableTreeNode node9= new DefaultMutableTreeNode("AMD Ryzen™ 7");
        DefaultMutableTreeNode node10= new DefaultMutableTreeNode("Monitor");
        DefaultMutableTreeNode node11= new DefaultMutableTreeNode("Asus Rog Strix");
        root.add(node1);
        root.add(node2);
        node3.add(node4);
        node3.add(node5);
        node3.add(node6);
        node1.add(node6);
        node1.add(node10);
        node6.add(node9);
        node6.add(node7);
        node6.add(node8);
        JTree tree = new JTree(root);
        add(tree);
        this.setTitle("JTree Sample");
        this.setSize(300,300);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new Tree();
        System.out.println("Node 1");
    }
}