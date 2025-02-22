package animal;

public class Animal {

    //名前と年齢を格納するフィールド
    private String name;
    private int age;

    //コンストラクタ　名前・年齢の各フィールドを引数の情報で初期化
    public Animal() {
    }

    public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public void say(String name, int age) {
        System.out.println(name + "です。" + age + "歳です。");
    }

    //カプセル化→GetterSette
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
