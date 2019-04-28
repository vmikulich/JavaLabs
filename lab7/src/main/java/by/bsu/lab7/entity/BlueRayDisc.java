package by.bsu.lab7.entity;

import java.util.HashMap;
import java.util.Map;

public class BlueRayDisc {

    private int capacity;

    private Menu menu;

    public BlueRayDisc(int capacity) {

        this.capacity = capacity;
        this.menu = new Menu();
    }

    public int getCapacity() {
        return capacity;
    }

    public class Menu {
        Map<String, Map<String, String>> menu;

        public Menu() {
            menu = new HashMap<>();
        }

        public Map<String, Map<String, String>> getMenu() {
            return menu;
        }

        public void setMenu(Map<String, Map<String, String>> menu) {
            this.menu = menu;
        }

        public void addInfo(String name, String type, String info) {
            Map<String, String> map = this.menu.get(name);
            if (map == null) {
                map = new HashMap<>();
                map.put("type", type);
                map.put("info", info);
                this.menu.put(name, map);
            }
        }
    }

    public Map<String, Map<String, String>> getMenu() {
        return menu.getMenu();
    }

    public void addInfoInMenu(String name, String type, String info) {
        this.menu.addInfo(name, type, info);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlueRayDisc that = (BlueRayDisc) o;

        if (capacity != that.capacity) return false;
        return menu != null ? menu.equals(that.menu) : that.menu == null;
    }

    @Override
    public int hashCode() {
        int result = capacity;
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BlueRayDisc{" +
                "capacity=" + capacity +
                '}';
    }

//    public static void main(String[] args) {
//        BlueRayDisc disc = new BlueRayDisc(200);
//        disc.addInfoInMenu("author", "category", "Jack");
//        System.out.println(disc.getMenu());
//    }

}


