import java.util.Scanner

class Node(var data: Int) {
    var left: Node = null
    var right: Node = null
}

object Solution {

    
    def lca(root: Node, v1: Int, v2: Int): Node = {
        
        if (root == null) return null

        if (v1 < root.data && v2 < root.data) {
            return lca(root.left, v1, v2)
        }

        else if (v1 > root.data && v2 > root.data) {
            return lca(root.right, v1, v2)
        }

        else {
            return root
        }
    }

  
    def insert(root: Node, data: Int): Node = {
        if (root == null) {
            return new Node(data)
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data)
            } else {
                root.right = insert(root.right, data)
            }
            return root
        }
    }

    def main(args: Array[String]) {
        val scan = new Scanner(System.in)
        
      
        var t = scan.nextInt()
        
        var root: Node = null
        
      
        while (t > 0) {
            val data = scan.nextInt()
            root = insert(root, data)
            t -= 1
        }
        
        // Read v1 and v2
        val v1 = scan.nextInt()
        val v2 = scan.nextInt()
        
        // Find the LCA
        val ans = lca(root, v1, v2)
        
        // Print the data of the LCA node
        if (ans != null) {
            println(ans.data)
        }
    }
}
