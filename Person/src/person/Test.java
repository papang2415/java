/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author 2ndyrGroupB
 */
public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        Test te = new Test();
        Person p2 = te.change(p1);
        System.out.print(p2.pid + " " + p2.name + " " + p2.age + " ");
        System.out.print(p1.pid + " " + p1.name + " " + p1.age);
    }

    private Person change(Object o) {
        Person p2 = (Person) o;
        p2.age = 25;
        return p2;
    }
}
