package belajar2;

public class Main{
    public static void main(String[] args){
        System.out.println("nama saya adalah suhendri");

        System.out.print("satu \n");
        System.out.println("dua");
        System.out.printf("wiro sableng kampak naga geni %d", 212);
        System.out.println("===========================");

        //variabel
        int a = 22; //asigment
        System.out.println("Umur saya sekarang =" + a);

        int b; //deklarasi
        b = 7;
        System.out.println("Angka Kesukaan Saya =" + b);

        /*tipe data primitif

        integer, byte, char, float ,bolean*/

        //integer

        int i = 10;
        System.out.println("=======Integer======");
        System.out.println("nilai integer i =" + i );
        System.out.println("Nilai max =" + Integer.MAX_VALUE);
        System.out.println("Nilai min =" + Integer.MIN_VALUE);

        //Byte

        byte by = 10;
        System.out.println("=======BYTE======");
        System.out.println("nilai BYTE i =" + by );
        System.out.println("Nilai max =" + Byte.MAX_VALUE);
        System.out.println("Nilai min =" + Byte.MIN_VALUE);

        //Char

        char c = 'z';
        System.out.println("=======Char======");
        System.out.println("nilai BYTE i =" + c );
        System.out.println("Nilai max =" + Character.MAX_VALUE);
        System.out.println("Nilai min =" + Character.MIN_VALUE);

        //operator aritmatika

        /*
        1. penjumlahan
        2. pengurangan
        3. perkalian
        4. pembagian
        5. modulus (sisa bagi)
         */

        //penjumlahan

        int variabel1 = 10;
        int variabel2 = 5;

        int hasil;

        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + "+" + variabel2 + "=" + hasil);

        //pengurangan

        hasil = variabel1 - variabel2;
        System.out.printf(" %d - %d = %d \n",variabel1,variabel2,hasil);

        //perkalian

        hasil = variabel1 * variabel2;
        System.out.printf(" %d * %d = %d \n",variabel1,variabel2,hasil);

        //pembagian

        float variabel3 = 10;
        float variabel4 = 9;
        float hasilfloat =variabel3/variabel4;

        hasilfloat = variabel3 / variabel4;
        System.out.println(variabel3 + "/" + variabel4 + "=" + hasilfloat);

        //Modulus

        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d\n",variabel1,variabel2,hasil);

        //konversi bilangan

        int NilaiInt = 450;
        System.out.println("Nilai Integer =" + NilaiInt);

        //memperluas rentan tipe data ke lebih besar
        long NilaiLng = NilaiInt;
        System.out.println("Nilai Long =" + NilaiLng);

        // memperluas rentan tipe data ke lebih kecil
        byte Nilaibyt = (byte)NilaiInt;
        System.out.println("Nilai byte =" + NilaiInt);

        //casting pembagian

        int j = 10;
        int k = 4;
        float jumlah = (float)j/k;
        System.out.printf("%d / %d = %f \n",j,k,jumlah);

        //casting pengurangan
        long m = 255;
        long n = 10;
        float o = (float)m-n;
        System.out.printf("%d - %d = %f \n",m,n,o);

        //Unary adalah operasi yang dilakukan pada satu pariabel

        //unary + dan -
        int aa = 10;
        System.out.printf("ini adalah nilai unary plus %d = %d \n",aa,+aa);
        System.out.printf("ini adalan unary minus %d = %d \n",aa,-aa);

        //unary dengan increment dan decrement

        int bb = 10;
        ++bb; //++ didepan
        System.out.printf("unary dengan '++ didepan' akan menjadi %d = %d \n",bb,++bb);
        System.out.printf("unary dengan '++ dibelakang' akan menjadi %d = %d \n",bb,bb++);

        int cc = 10;
        cc++; //++dibelakang
        System.out.printf("unary dengan '++ didepan' akan menjadi %d = %d \n",cc,cc++);
        System.out.printf("unary dengan '++ dibelakang' akan menjadi %d =%d \n",cc,++cc);

        int ddd = 10;
        --ddd; //didepan
        System.out.printf("unary dengan '-- didepan' akan menjadi %d = %d \n",ddd,--ddd);
        System.out.printf("unary dengan '-- dibelakang' akan menjadi %d =%d \n",ddd,ddd--);

        ddd--; //dibelakang
        System.out.printf("unary dengan '-- didepan' akan menjadi %d = %d \n",ddd,--ddd);
        System.out.printf("unary dengan '-- dibelakang' akan menjadi %d =%d \n",ddd,ddd--);

        //Operator Assigment

        //operator assigment penjumlahan
        int a1 = 1;
        a1 += 10;
        System.out.println("nilai a1 adalah =" + a1);

        //operator assigment pengurangan
        int a2 = 10;
        a2 -= 9;
        System.out.println("nilai a2 adalah =" + a2);

        //operator assigment perkalian
        int a3 = 10;
        a3 *= 2;
        System.out.println("nilai a3 adalah =" + a3);

        //operator assigment pembagian
        int a4 = 100;
        a4 /= 2;
        System.out.println("nilai a4 adalah =" + a4);

        //operator assigment modulus
        int a5 =100;
        a5 %= 75;
        System.out.println("nilai a5 adalah =" + a5);

        //Operator Komparasi (Ini Akan Menghasilkan Nilai DAlam Bentuk Boolean

        int b1,b2;
        boolean HasilKomparasi;
        System.out.println("------PERSAMAAN------");
        b1 = 10;
        b2 = 10;
        HasilKomparasi = (b1 == b2);
        System.out.printf("%d == %d --> %s \n",b1,b2,HasilKomparasi);

        int b3,b4;
        b3 = 10;
        b4 = 11;
        HasilKomparasi = (b3 != b4);
        System.out.printf("%d != %d --> %s \n",b3,b4,HasilKomparasi);

        int b5,b6;
        b5 = 10;
        b6 = 10;
        HasilKomparasi = (b5 > b6);
        System.out.printf("%d > %d --> %s \n",b5,b6,HasilKomparasi);

        int b7,b8;
        b7 = 10;
        b8 = 11;
        HasilKomparasi = (b7 < b8);
        System.out.printf("%d < %d --> %s \n",b7,b8,HasilKomparasi);

        int b9,b10;
        b9 = 10;
        b10 = 10;
        HasilKomparasi = (b9 >= b10);
        System.out.printf("%d => %d --> %s \n",b9,b10,HasilKomparasi);

        b5 = 10;
        b6 = 11;
        HasilKomparasi = (b5 <= b6);
        System.out.printf("%d <= %d --> %s \n",b5,b6,HasilKomparasi);


    }
}
