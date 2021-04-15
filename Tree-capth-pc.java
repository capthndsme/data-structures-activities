import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame{

    public Tree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Storage Devices");
        DefaultMutableTreeNode priroot = new DefaultMutableTreeNode("Primary");
        DefaultMutableTreeNode secroot = new DefaultMutableTreeNode("Secondary");
        DefaultMutableTreeNode ramprim = new DefaultMutableTreeNode("DDR4 32GB RAM");
        DefaultMutableTreeNode stor1 = new DefaultMutableTreeNode("NVME SSD 1TB");
        DefaultMutableTreeNode stor2 = new DefaultMutableTreeNode("16TB HDD");
        
        root.add(priroot);
        root.add(secroot);
        priroot.add(ramprim);
        secroot.add(stor1);
        secroot.add(stor2);
         
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