import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        /*stack = LIFO data structure. Last-In First-Out
         *        Stores objects into a sort of "vertical tower"
         *        push() to add to the top.
         *        pop() to remove from the top.
        */

        // Stack data structure
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());


        // Trying to add stacks of video games.
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        // check 
        System.out.println(stack.empty());
        System.out.println(stack);

        // remove top-most item
        stack.pop();
        
        System.out.println(stack);

        // Store the popped data into a string
        String myFavGame = stack.pop(); // Borderlands
        System.out.println(myFavGame);

        // Take a peek of the object on the top of the stack.
        // (Without removing it)
        System.out.println(stack.peek());

        // Finds the position of the item in the stack
        System.out.println(stack.search("Skyrim"));

        // What if the item is not in the stack?
        System.out.println(stack.search("Elden Ring"));  // should print out -1. 

        // adding a few stacks of a same item
        for (int i = 0; i < 1000000; i++) {
            stack.push("fallout76");
        }

    }  
}