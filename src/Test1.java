/**
 * 链表
 *
 */
public class Test1 {
    public static void main(String[] args) {

        NodeManger nm = new NodeManger();
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.print();

    }
}

class NodeManger {
    // 根节点
    private Node root;

    public void add(int data) {
        if (root==null) {
            root = new Node(data);
        } else {
            root.addNode(data);
        }
    }
    public void  del(int data) {

    }

    public void print() {
        if (root!=null) {
            System.out.println(root.getData()+"->");
            root.printNode();
            System.out.println();
        }
    }
    public boolean find() {
        return false;
    }
    public void update(int oldData, int data) {

    }

    private class Node {
        private int data;
        //把当前类型作为属性
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
        // 添加节点
        public void addNode(int data) {
            if (this.next==null) {
                this.next = new Node(data);
            } else {
                this.next.addNode(data);
            }
        }
        // 删除节点
        public void delNode(int data) {

        }
        // 输出所有节点
        public void printNode() {
            if (this.next!=null) {
                System.out.println(this.next.data+"->");
                this.next.printNode();
            }
        }
        public boolean findNode(int data) {
            return false;
        }
        // 修改节点
        public void updateNode(int oldData, int newData) {

        }
        public void insert(int index, int data) {

        }
        // 查找外部节点
    }
}

