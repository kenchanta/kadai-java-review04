package animal;

public class Review04 {

    public static void main(String[] args) {

        //インスタンス化
        Human tanaka = new Human();
        Human suzuki = new Human();
        Human sato = new Human();

        //メソッド
        tanaka.say("田中　太郎", 25);
        tanaka.think("電車");

        suzuki.say("鈴木　太郎", 30);
        suzuki.think("野球");

        sato.say("佐藤　花子", 20);
        sato.think("映画");

    }
}
