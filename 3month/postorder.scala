import scala.io.StdIn

class Node(var data: Int) {
    var left: Node = null
    var right: Node = null
}

object Solution {

    def postOrder(root: Node): Unit = {
        if (root == null) return
        
        postOrder(root.left)
        postOrder(root.right)
        print(root.data + " ")
    }

    def insert(root: Node, data: Int): Node = {
        if (root == null) return new Node(data)

        if (data <= root.data)
            root.left = insert(root.left, data)
        else
            root.right = insert(root.right, data)

        root
    }

    def main(args: Array[String]) {
        val n = StdIn.readInt()
        val arr = StdIn.readLine().split(" ").map(_.toInt)

        var root: Node = null
        for (x <- arr) {
            root = insert(root, x)
        }

        postOrder(root)
    }
}
