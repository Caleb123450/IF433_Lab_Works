package M2ClassA_teori

class Jagoan {
    var nama: String = "gatau";
    var hp: Int = 100;

    init {
        println("halo nama saya chriss");
        this.nama = "udin";
        this.hp = 120;
    }

    constructor(darahhero: Int=250){
        println("ini constructor kedua");
        this.hp = darahhero;
    }

    fun jalan() {
        println("Hero jalan kaki ke pasar");
    }
    fun serang(){
        println("Hero serang dengan life: $hp");
    }
}

fun main() {
    val hero = Jagoan();
    println("darah hero : ${hero.hp}");
    hero.nama = "iwan";
    hero.jalan();
    hero.serang();
    println("nama si hero :" + hero.nama)
//println("hello world");//
}

