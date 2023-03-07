package sem6;

import java.util.HashMap;
import java.util.Map;
import sem6.Block;
public class BlockWorld {
    Map<String, Block> blocks;

    public BlockWorld(String[] blockNames) {
        this.blocks = new HashMap<>();
        for (String name : blockNames) {
            Block b = new Block(name);
            this.blocks.put(name, b);
        }
    }

    public void putOn(String a, String b) {
        Block blockA = this.blocks.get(a);
        Block blockB = this.blocks.get(b);
        blockA.putOn(blockB);
    }

    public void removeFrom(String a, String b) {
        Block blockA = this.blocks.get(a);
        Block blockB = this.blocks.get(b);
        blockA.removeFrom(blockB);
    }

    public void printState() {
        for (Block b : this.blocks.values()) {
            System.out.print(b.name + " on ");
            System.out.print((b.on != null) ? b.on.name : "table");
            System.out.print((b.clear) ? " clear\n" : " not clear\n");
        }
    }

    public static void main(String[] args) {
        String[] blockNames = {"A", "B", "C", "D"};
        BlockWorld world = new BlockWorld(blockNames);

        world.putOn("A", "B");
        world.putOn("B", "C");
        world.printState();

        world.removeFrom("A", "B");
        world.putOn("A", "D");
        world.printState();
    }
}

