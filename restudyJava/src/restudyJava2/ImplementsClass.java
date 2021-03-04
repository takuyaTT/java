package restudyJava2;

public class ImplementsClass implements InterfaceClass {
  String name;
  int age;

  ImplementsClass(){
    this.name = "未定義";
    this.age = 100;
  }

  ImplementsClass(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void interMethod(){
    System.out.println("interMethodが呼ばれました");
  }

  public int returnAge(){
    return this.age;
  }

  public String returnName(){
    return this.name;
  }
}
