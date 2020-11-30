package com.example.utspemrogramanmobile;



import android.content.Context;


import com.example.utspemrogramanmobile.model.HP;
import com.example.utspemrogramanmobile.model.Realme;
import com.example.utspemrogramanmobile.model.Redmi;
import com.example.utspemrogramanmobile.model.Samsung;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<HP> hps = new ArrayList<>();

    private static List<Realme> initDataRealme(Context ctx) {
        List<Realme> realmes = new ArrayList<>();
        realmes.add(new Realme("Realme 3 Pro", "Realme 3 pro secara resmi rilis di indonesia dengan varian RAM 4GB serta ROM 64GB. Ada juga varian tertinggi dengan konfigurasi ROM 128GB serta RAM 6GB. Dengan banderol harga mulai Rp 2 jutaan, memiliki keunggulan di sektor performa, kamera, tampilan serta kapasitas baterai yang besar. .",
                R.drawable.realme_3_pro));
        realmes.add(new Realme("Realme 5 Pro", "harga Realme 5 Pro memang sangat terjangkau dan sudah ditenagai chipset Qualcomm Snapdragon 712 yang memiliki performa lebih powerfull dibandingkan Snapdragon 710 yang dipakai Realme 3 Pro. Didalam chipset tersebut telah tertanam processor Octa-core (2×2.3 GHz Kryo 360 Gold & 6×1.7 GHz Kryo 360 Silver) dan GPU Adreno 616.",
                R.drawable.realme_5_pro));
        realmes.add(new Realme("Realme 6 Pro", "Realme 6 Pro memiliki spesifikasi dengan chipset Snapdragon 720, baterai 4.200 mAh dan empat kamera 64MP dengan harga mulai dari 3,2 jutaan.",
                R.drawable.realme_6_pro));
        realmes.add(new Realme("Realme 7 Pro", "Diluncurkan dengan slogan ‘65W Charging Evolution’, smartphone kedua realme yang membawa besaran angka cukup besar dalam hal pengisian daya. Ya, betul sekali, realme 7 Pro hadir membawa peningkatan yang cukup signifikan dibanding generasi sebelumnya. Desain baru, teknologi layar baru, serta performa pengecasan yang jauh lebih cepat.",
                R.drawable.realme_7_pro));
        realmes.add(new Realme("Realm Pro", "resmikan dalam sebuah pergelaran acara tahunan realme Fan Fest 2020, akhirnya realme Indonesia resmi memboyong smartphone terbaiknya yang telah rilis sejak awal 2020 yakni seri X50 Pro. Yup, spesifikasi dan harga realme X50 Pro 5G resmi hadir ke Indonesia sebagai smartphone flagship. Ini adalah perangkat dengan spesifikasi serba powerful, mulai dari penggunaan chipset Snapdragon 865 termasuk teknologi pengecasan Superdark.", R.drawable.realme_x50_pro));

        return realmes;
    }
    private static List<Redmi> initDataRedmi(Context ctx) {
        List<Redmi> redmis = new ArrayList<>();
        redmis.add(new Redmi("Redmi Note 5 Pro", "kembali merilis smartphone mereka pada 2018 ini. Smartphone dari vendor asal Cina ini hadir dengan spesifikasi yang mumpuni (seperti biasa). Dari prosessor Octa-core 1.8 GHz, RAM 6 GB hingga GPU Adreno 509.", R.drawable.redmi_note_5pro));
        redmis.add(new Redmi("Redmi Note 6 Pro", "Redmi note 6 pro di rilis oleh xiaomi secara resmi di indoensia sebagai penerus dari seri redmi note 5 yang terbilang sukses di pasaran. hadir dengan dua varian, mulai dari versi RAM 3GB + ROM 32GB serta versi RAM 4GB dengan ROM 64GB.", R.drawable.redmi_note_6pro));
        redmis.add(new Redmi("Redmi Note 7 Pro", "Xiaomi akhirnya resmi meluncurkan Redmi menjadi sebuah merek independent. Pada debut pertamanya sebagai brand independent, Redmi pun merilis ponsel terbaru dan pertama mereka yaitu Redmi Note 7 di China. Berbeda dengan android Xiaomi pendahulunya, Xiaomi Redmi Note 7 hadir dengan dibawkan bodi kaca sehingga mempunyai tampilan yang terlihat premium.",
                R.drawable.redmi_note_7pro));
        redmis.add(new Redmi("Redmi Note 8 Pro", "Redmi Note 8 Pro sesungguhnya masih berada di kisaran menengah.. Dengan chipset Mediatek Helip G90T yang ditujukan buat mobile gamer, baterai Note 8 Pro disesuaikan dengan kapasitas 4500 mAh yang bisa tahan seharian, relatif dengan kebiasaan pengguna.. Redmi Note 8 Pro adalah varian yang membawa sensor kamera 64MP pertama di Indonesia. ",
                R.drawable.redmi_note_8pro));
        redmis.add(new Redmi("Redmi Note 9 Pro", "Redmi Note 9 series desainnya sedikit berbeda dari sebelumnya, miliki frame kamera utama yang dibuat persegi dan simetris. Sementara sisi depannya sudah lebih modern, masing-masing gunakan DotDisplay yaitu kamera depan bermodel punch-hole. Xiaomi unggulkan performa, kapasitas baterai besar serta konektivitas yang lengkap.",
                R.drawable.redmi_note_9pro));

        return redmis;
    }

    private static List<Samsung> initDataSamsung(Context ctx) {
        List<Samsung> samsungs = new ArrayList<>();
        samsungs.add(new Samsung("Samsung A10", "Samsung Galaxy A10 kini turun harga menjadi Rp 1.699 juta diperkuat spesifikasi RAM 2GB memori internal berkapasitas 32GB. Bersama Samsung A20, kedua generasi terbaru Galaxy A Series ini akan bertarung di segmen hp entry-level.",
                R.drawable.samsung_a10));
        samsungs.add(new Samsung("Samsung A20", "Samsung A20 hadir dengan harga murah dan beragam spesifikasi unggul Meski dibandrol dengan harga yang cukup murah, smartphone ini dilengkapi dengan berbagai macam fitur dan spesifikasi yang unggul.",
                R.drawable.samsung_a20));
       samsungs.add(new Samsung("Samsung A30", "Samsung Galaxy A30 terbaru saat ini tahun 2020 di pasaran dijual pada kisaran harga Rp 2.7 juta semakin meramaikan persaingan smartphone di Indonesia.",
                R.drawable.samsung_a30));
        samsungs.add(new Samsung("Samsung A40", "Samsung Galaxy A40 menjadi sebuah samsung terbaru yang mewah dan memiliki beragham fitur nan canggih. Dengan spesifikasi Samsung Galaxy A40 yang cukup mempuni pastinya akan menjadi penawaran utama bagi Samsung dalam memasarkan produk Hp-nya ini. Apalagi Harga Samsung Galaxy A40 yang cukup terjangakau dibaningkan dengan harga Hp ram 4GB yang lainya.",
                R.drawable.samsung_a40));
        samsungs.add(new Samsung("Samsung A50", "Samsung Galaxy A50 terbaru saat ini pada tahun 2020 dijual dengan harga mulai Rp 3.3 juta hingga Rp 4 juta di pasaran. Berbekal spesifikasi RAM 4GB dan 6GB, generasi terbaru dari Galaxy A Series ini siap bertarung di kelas menengah dengan produk kompetitor.",
                R.drawable.samsung_a50));
        return samsungs;

    }

    private static void initAllHP(Context ctx) {
        hps.addAll(initDataRealme(ctx));
        hps.addAll(initDataRedmi(ctx));
        hps.addAll(initDataSamsung(ctx));

    }

    public static List<HP> getAllHP(Context ctx) {
        if (hps.size() == 0) {
            initAllHP(ctx);
        }
        return hps;
    }

    public static List<HP> getHpbytipe(Context ctx, String type) {
        List<HP> HPsByType = new ArrayList<>();
        if (hps.size() == 0) {
            initAllHP(ctx);
        }
        for (HP h : hps) {
            if (h.getMerk().equals(type)) {
              HPsByType.add(h);
            }
        }
        return HPsByType;
    }


    }
