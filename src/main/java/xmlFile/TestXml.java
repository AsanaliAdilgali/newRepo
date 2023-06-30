package xmlFile;


import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.ServiceLoader;

public class TestXml {
    public static void main(String[] args) throws NullPointerException, FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\w2\\Downloads\\document (1).xml"));

        System.out.println(bf);

    }
}


        // DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        // Enumeration<DefaultMutableTreeNode> en = root.preorderEnumeration();
        //while(en.hasMoreElements()){
        //  DefaultMutableTreeNode node = en.nextElement();
        // if(node.getUserObject().toString().equalsIgnoreCase("$")){
        //   DefaultMutableTreeNode parent = (DefaultMutableTreeNode)node.getParent();
        //   parent.remove(node);
        //  model.reload(parent);
        //  deleteNodeIsNameType();
        //  private static void deleteNodeIsNameType() {