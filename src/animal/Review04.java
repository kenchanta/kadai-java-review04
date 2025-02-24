package animal;

public class Review04 {

    public static void main(String[] args) {

        //インスタンス化
        Human tanaka = new Human();
        Human suzuki = new Human();
        Human sato = new Human();

        tanaka.setName("田中 太郎");
        tanaka.setAge(25);
        tanaka.setHobby("電車");
        tanaka.say();
        tanaka.think();

        suzuki.setName("鈴木 次郎");
        suzuki.setAge(30);
        suzuki.setHobby("野球");
        suzuki.say();
        suzuki.think();

        sato.setName("佐藤 花子");
        sato.setAge(20);
        sato.setHobby("映画");
        sato.say();
        sato.think();

    }
}
