package sem6;

import java.util.*;

/*  public class BlockWorld {

    public static void main(String[] args) {
        int numBlocks = 5;
        int numLocations = 3;

        // Define the problem variables
        int[] state = new int[numBlocks];
        int[] location = new int[numBlocks];
        boolean[][] onTopOf = new boolean[numBlocks][numBlocks];

        // Define the initial state
        state[0] = 0;    //some random 3,2,1 can be put to show if goal state cannot be reached.
        state[1] = 2;
        state[2] = 1;
        state[3] = 0;
        state[4] = 3;

        // Define the goal state
        int[] goalState = new int[numBlocks];
        goalState[0] = 0;
        goalState[1] = 0;
        goalState[2] = 0;
        goalState[3] = 0;
        goalState[4] = 0;

        // Define the constraints
        boolean constraintsSatisfied = false;
        while (!constraintsSatisfied) {
            constraintsSatisfied = true;

            // Each block must be in a unique location
            for (int i = 0; i < numBlocks; i++) {
                for (int j = i + 1; j < numBlocks; j++) {
                    if (location[i] == location[j] && state[i] != 0 && state[j] != 0) {
                        location[j]++;
                        constraintsSatisfied = false;
                    }
                }
            }

            // Block 1 must be on top of Block 0
            if (!onTopOf[state[1]][state[0]]) {
                state[1] = state[0];
                onTopOf[state[1]][state[0]] = true;
                constraintsSatisfied = false;
            }

            // Block 2 must be on top of Block 1
            if (!onTopOf[state[2]][state[1]]) {
                state[2] = state[1];
                onTopOf[state[2]][state[1]] = true;
                constraintsSatisfied = false;
            }

            // Block 4 must be on top of Block 3
            if (!onTopOf[state[4]][state[3]]) {
                state[4] = state[3];
                onTopOf[state[4]][state[3]] = true;
                constraintsSatisfied = false;
            }
        }

        // Check if the goal state has been reached
        boolean goalReached = true;
        for (int i = 0; i < numBlocks; i++) {
            if (state[i] != goalState[i]) {
                goalReached = false;
                break;
            }
        }

        // Print the solution
        if (goalReached) {
            System.out.println("Goal state reached:");
            for (int i = 0; i < numBlocks; i++) {
                System.out.println("Block " + i + " is at location " + location[i] + " and on top of block " + state[i]);
            }
        } else {
            System.out.println("No solution found.");
        }
    }

*/





//
//public class BlockWorld {
//    private Map<String, Block> blocks;
//
//    private class Block {
//        String name;
//        Block on;
//        boolean clear;
//
//        public Block(String name) {
//            this.name = name;
//            this.clear = true;
//        }
//    }
//
//    public BlockWorld(String[] blockNames) {
//        blocks = new HashMap<>();
//        for (String blockName : blockNames) {
//            blocks.put(blockName, new Block(blockName));
//        }
//    }
//
//    public void stack(String blockName, String onBlockName) throws Exception {
//        Block block = blocks.get(blockName);
//        Block onBlock = blocks.get(onBlockName);
//        if (!block.clear) {
//            throw new Exception("Block " + blockName + " is not clear.");
//        }
//        if (onBlock == null) {
//            throw new Exception("Block " + onBlockName + " does not exist.");
//        }
//        if (block.on != null) {
//            throw new Exception("Block " + blockName + " is already on another block.");
//        }
//        block.on = onBlock;
//        block.clear = false;
//        onBlock.clear = false;
//    }
//
//    public void unstack(String blockName) throws Exception {
//        Block block = blocks.get(blockName);
//        if (block == null) {
//            throw new Exception("Block " + blockName + " does not exist.");
//        }
//        if (block.on == null) {
//            throw new Exception("Block " + blockName + " is not on any block.");
//        }
//        Block onBlock = block.on;
//        block.on = null;
//        block.clear = true;
//        onBlock.clear = true;
//    }
//
//    public void move(String blockName, String onBlockName) throws Exception {
//        unstack(blockName);
//        stack(blockName, onBlockName);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Block block : blocks.values()) {
//            sb.append(block.name).append(" on ");
//            if (block.on != null) {
//                sb.append(block.on.name).append(" ");
//            } else {
//                sb.append("table ");
//            }
//            sb.append(block.clear ? "clear" : "not clear").append("\n");
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        BlockWorld blockWorld = new BlockWorld(new String[]{"A", "B", "C"});
//        try {
//            blockWorld.stack("A", "B");
//            blockWorld.stack("B", "C");
//            System.out.println(blockWorld);
//            blockWorld.move("A", "B");
//            System.out.println(blockWorld);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}


public class Block {
    String name;
    Block on;
    boolean clear;

    public Block(String name) {
        this.name = name;
        this.clear = true;
    }

    public void putOn(Block b) {
        this.on = b;
        this.clear = false;
        b.clear = true;
    }

    public void removeFrom(Block b) {
        this.on = null;
        this.clear = true;
        b.clear = false;
    }

    public String toString() {
        return this.name;
    }
}

