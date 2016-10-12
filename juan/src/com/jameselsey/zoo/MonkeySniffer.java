// You can make comments before the package statement if you wish
package com.jameselsey.zoo;

/*
    Import statements (if there are any) must come after the package
    and before the class declaration.
 */
import java.util.ArrayList;
import java.util.List;

public class MonkeySniffer
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();
        myList.add("Gibbon");
        System.out.println("I smell a " + myList.get(0));

        MonkeyInners monkeyInners = new MonkeyInners();
        System.out.println(monkeyInners.inners);
    }
}

class MonkeyInners
{
    String inners = "This is an inner!";
}