public class Rasional{
    private int pembilang, penyebut;
    public Rasional(){
        pembilang = 0;
        penyebut = 1;//no1
}
    public Rasional(int pbl, int pyb){
        pembilang = pbl;
        penyebut = pyb;
}//mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
    return (penyebut!= 0);
}
    //menyederhanakan bilangan rasional
    public void Sederhana(){
        if (penyebut == 0)return; //no 1

        int a = Math.abs(pembilang);
        int b = Math.abs(penyebut);
        int temp;

        for (; b != 0;){//no3
            temp = a%b;
            a = b;
            b = temp;
        }

        pembilang /= a;
        penyebut /= a;

        
}
public double Cast(){
    return (penyebut == 0) ? 0.0 : (double)pembilang / (double)penyebut;//no 1
}
//oprator >
public boolean moreThan (Rasional A){
    return (pembilang * A.penyebut > penyebut * A.pembilang);
}
//operator Unary- ---> A = -A
public void negasi(){
    pembilang = - pembilang;
}
//operator unary += \
public void unaryPlus(Rasional A){
    pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
    penyebut *= A.penyebut;
    Sederhana(); //no 1
}
public void cetak(){

    if (!isRasional()){
        System.out.println("bukan bilangan rasional");
    }else{
    System.out.println(pembilang + "/" + penyebut);
    }
    //no 1
}


    public boolean lessThan(Rasional A){
    return (pembilang * A.penyebut < penyebut * A.pembilang);
}//no 2

public boolean lessEqual(Rasional A){
    return (pembilang * A.penyebut <= penyebut * A.pembilang);
}//no2

public boolean moreEqual(Rasional A){
    return (pembilang * A.penyebut >= penyebut * A.pembilang);
}//no2


public void minus(Rasional A){
    pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
    penyebut = penyebut * A.penyebut;
    Sederhana();//no4
}

public void kali(Rasional A){
    pembilang = pembilang * A.pembilang;
    penyebut = penyebut * A.penyebut;
    Sederhana();//no4
}

public void bagi(Rasional A){
    pembilang = pembilang * A.penyebut;
    penyebut = penyebut * A.pembilang;
    Sederhana();//no4
}
}