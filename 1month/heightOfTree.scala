import scala.io.StdIn._

class Node(var data: Int) {
    var left: Node = null
    var right: Node = null
}

class BinarySearchTree {
    var root: Node = null

    def insert(node: Node, data: Int): Node = {
        if (node == null) {
            return new Node(data)
        }
        if (data <= node.data) {
            node.left = insert(node.left, data)
        } else {
            node.right = insert(node.right, data)
        }
        node
    }
}

object Solution {
    
    def height(root: Node): Int = {
        if (root == null) return -1 
        
        val leftH = height(root.left)
        val rightH = height(root.right)

        1 + Math.max(leftH, rightH)
    }

    def main(args: Array[String]) {
        val n = readInt()
        val values = readLine().split(" ").map(_.toInt)

        val tree = new BinarySearchTree()
        
        for (v <- values) {
            tree.root = tree.insert(tree.root, v)
        }

        println(height(tree.root))
    }
}
