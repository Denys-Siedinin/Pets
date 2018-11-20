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
    myCat.setAge(Float.parseFloat(br.readLine()));
    System.out.println("Введите вес кота: ");
    myCat.setWeitgh(Float.parseFloat(br.readLine()));
    System.out.println("Введите силу кота: ");
    myCat.setStrange(Float.parseFloat(br.readLine()));

    System.out.println("Введите имя собаки: ");
    myDog.setName(br.readLine());
    System.out.println("Введите возвраст собаки: ");
    myDog.setAge(Float.parseFloat(br.readLine()));
    System.out.println("Введите вес собаки: ");
    myDog.setWeitgh(Float.parseFloat(br.readLine()));
    System.out.println("Введите силу собаки: ");
    myDog.setStrange(Float.parseFloat(br.readLine()));

    System.out.println("Dog |" + myDog.getName() + " | " + myDog.getAge() + " years | " + myDog.getWeitgh() + " kg |");
    System.out.println("Cat |" + myCat.getName() + " | " + myCat.getAge() + " years | " + myCat.getWeitgh() + " kg |");

    if (myDog.getStrange() > myCat.getStrange()) {
      System.out.println("Dog winner !!!");
    } else System.out.println("Cat winner !!!");
  }
}