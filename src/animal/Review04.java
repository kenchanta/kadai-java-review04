package animal;

public class Review04 {

    public static void main(String[] args) {

        //インスタンス化
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

        //名前・年齢・趣味の各情報は、コンストラクタで初期化するようにしてください
         class Human{
             //フィールド
             String name;
             int age;
             String hobby;

             //コンストラクタ
             public Human(String name, int age, String hobby) {
                this.name = name;
                this.age = age;
                this.hobby = hobby;
             }
         }

        tanaka.say();
        tanaka.think();

        suzuki.say();
        suzuki.think();

        sato.say();
        sato.think();


    }
}
