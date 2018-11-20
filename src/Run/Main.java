package Run;

import Animals.Cat;
import Animals.Dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Cat myCat = new Cat();
    myCat.setName("Red");
    myCat.setAge(3);
    myCat.setWeitgh(10);
    myCat.setStrange(4.25f);

    Dog myDog = new Dog();
    myDog.setName("Berta");
    myDog.setAge(2);
    myDog.setWeitgh(40);
    myDog.setStrange(3.5f);


    System.out.println("Введите имя кота: ");
    myCat.setName(br.readLine());
    System.out.println("Введите возвраст кота: ");
    myCat.setAge(Integer.parseInt(br.readLine()));
    System.out.println("Введите вес кота: ");
    myCat.setWeitgh(Integer.parseInt(br.readLine()));
    System.out.println("Введите силу кота: ");
    myCat.setStrange(Float.parseFloat(br.readLine()));


    System.out.println("Animal | Name | Age | Weight");
    System.out.println("Dog |" + myDog.getName() + " | " + myDog.getAge() + " | " + myDog.getWeitgh());
    System.out.println("Cat |" + myCat.getName() + " | " + myCat.getAge() + " | " + myCat.getWeitgh());

    if (myDog.getStrange() > myCat.getStrange()) {
      System.out.println("Dog winner !!!");
    } else System.out.println("Cat winner !!!");
  }
}