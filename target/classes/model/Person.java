package resources.model;

public class Person {
    private String name;
    private int age;

    public ConstructorOfPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("こんにちは、私の名前は" + name +  "です。年齢は" + age + "歳です。");
    }

    public String getNsame() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

