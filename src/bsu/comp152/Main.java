package bsu.comp152;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	var myList = new ArrayList<String>();

    myList.add("Tom");
    myList.add("John");
    myList.add("Zach");
    myList.add("Paul");
    myList.add("Tim");
    myList.add("James");
    myList.add("Brendan");

    var listTraverser = myList.iterator();
    while (listTraverser.hasNext()){
        var name = listTraverser.next();
        if (name.equals("John"))
            listTraverser.remove();
    }
    System.out.println(myList);

    
    }
}
