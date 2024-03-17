package Seminar_04;

import Seminar_04.gb_collections.GbList;
import Seminar_04.gb_collections.lists.GbArrayList;
import Seminar_04.gb_collections.lists.GbLinkedList;

public class main {
    
    public static void main(String[] args) {

        // GbList<Integer> list = new GbArrayList<>();
        // list.add(1);
        // list.add(15);
        // list.add(32);
        // list.add(5);
        
        // System.out.println(list.size());
        // System.out.println(list);
        // list.removeByIndex(1);
        // list.remove(32);
        // System.out.println(list);  
        
        GbLinkedList<String> ll = new GbLinkedList<>();
        ll.add("14");
        ll.add("16");
        ll.add("28");
        ll.add("35");
        ll.add("43");
        System.out.println(ll);
        ll.add(1, "89");
        System.out.println(ll);
        ll.add(5, "234");
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.get(5));
        ll.removeByIndex(6);
        System.out.println(ll);
        ll.removeByIndex(3);
        System.out.println(ll);
        ll.add(5, "234");
        System.out.println(ll);


        
    }
    
}
