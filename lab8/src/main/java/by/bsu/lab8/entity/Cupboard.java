package by.bsu.lab8.entity;

public abstract class Cupboard implements Furniture {
    @Override
    public boolean isWooden(String material) {
        return material == "wood" ? true : false;
    }

    abstract boolean isThisFirm(String firm);
}
