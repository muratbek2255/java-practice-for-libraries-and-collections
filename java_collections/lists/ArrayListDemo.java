package lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер класса: "+ al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add(1, "R");
        System.out.println("Размер after add: " + al.size());

        al.remove("C");
        al.remove(5);
        System.out.println("Размер afted remove: " + al.size());
    }
}


class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("al :" + al);

        Integer ai[] = new Integer[al.size()];
        ai = al.toArray(ai);

        int sum = 0;

        for (int i: ai) {
            sum += i;
        }

        System.out.println("summa: " + sum);
    }
}


class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("A");
        l1.add("B");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.add(1, "R");

        System.out.println("l1: " + l1);

        l1.removeFirst();
        l1.removeLast();

        System.out.println("l1: " + l1);
    }
}


class Address {
    private String name;
    private String state;
    private String address;
    private String city;

    Address(String name, String state, String address, String city) {
        this.name  = name;
        this.state = state;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + "\n" + state + "\n" + address + "\n" + city;
    }
}


class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addr = new LinkedList<Address>();

        addr.add(new Address("ADD", "JBD", "GFHG", "vdhsagh"));
        addr.add(new Address("NDB", "njbj", "hdvs", "dghashj"));

        for (Address i: addr) {
            System.out.println("i: " + i);
        }
    }
}