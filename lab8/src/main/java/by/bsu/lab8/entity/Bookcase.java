package by.bsu.lab8.entity;

public class Bookcase extends Cupboard {

    private String material;
    private int numberOfShelves;
    private String firm;

    public Bookcase(String material, int numberOfShelves, String firm) {
        this.material = material;
        this.numberOfShelves = numberOfShelves;
        this.firm = firm;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public boolean isThisFirm(String firm) {
        return firm == this.firm ? true : false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bookcase bookcase = (Bookcase) o;

        if (numberOfShelves != bookcase.numberOfShelves) return false;
        if (material != null ? !material.equals(bookcase.material) : bookcase.material != null) return false;
        return firm != null ? firm.equals(bookcase.firm) : bookcase.firm == null;
    }

    @Override
    public int hashCode() {
        int result = material != null ? material.hashCode() : 0;
        result = 31 * result + numberOfShelves;
        result = 31 * result + (firm != null ? firm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "material='" + material + '\'' +
                ", numberOfShelves=" + numberOfShelves +
                ", firm='" + firm + '\'' +
                '}';
    }
}