package pharmacy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<MedicineComponent> {

    public List<MedicineComponent> components;
    public int index;
    private final String name;

    public Medicine2(String name) {
        this.components = new ArrayList<>();
        this.index = 0;
        this.name = name;
    }
    
    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public String getName() {
        return name;
    }

    //    @Override
//    public boolean hasNext(){
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedicineComponent next() {
////        return components.iterator().next();
//        return components.get(index++);
//    }
    @Override
    public String toString() {
        return "Medicine: " + name + components.toString() + "\n";
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return name.length() - o.getName().length();
    }
}