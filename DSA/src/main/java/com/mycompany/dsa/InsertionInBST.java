class InsertionInBST 
{
   static class TreeNode 
   {
      int val;
      TreeNode left;
      TreeNode right;
      public TreeNode(int val)
      {
          this.val=val;
      }
   }
    public static TreeNode insertIntoBST(TreeNode root, int val) 
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if(val>root.val)
        {
            root.right=insertIntoBST(root.right,val);
        }
        if(val<root.val)
        {
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }
    public static void inorderRec(TreeNode root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }
    public static void main(String args[])
    {
        TreeNode root=insertIntoBST(null,10);
        insertIntoBST(root,30);
        insertIntoBST(root,20);
        insertIntoBST(root,5);
        insertIntoBST(root,50);
        insertIntoBST(root,40);
        inorderRec(root);
    }    
}