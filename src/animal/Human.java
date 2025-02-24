package animal;

public class Human extends Animal implements Thinkable {

    //フィールド
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //コンストラクタ
    public Human() {
    }

    //名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用する
    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println(hobby + "について考えています。");
    }
}
