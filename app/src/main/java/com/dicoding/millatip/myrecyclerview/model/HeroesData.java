package com.dicoding.millatip.myrecyclerview.model;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Cut Nyak Dien", "Cut Nyak Dhien adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh", "https://upload.wikimedia.org/wikipedia/commons/2/2b/Tjoet_Nya%27_Dhien.jpg"},
            {"Ki Hajar Dewantara", "Raden Mas Soewardi Soerjaningrat adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda", "https://alchetron.com/cdn/ki-hajar-dewantara-03e08412-6150-4798-bc71-20d9fd7caa8-resize-750.jpeg"},
            {"Moh Yamin", "Prof. Mr. Mohammad Yamin, S.H. adalah sastrawan, sejarawan, budayawan, politikus, dan ahli hukum yang telah dihormati sebagai pahlawan nasional Indonesia", "https://lh3.googleusercontent.com/-xEYBu9EY_zk/WfSRPgh68YI/AAAAAAAAMnw/4B6n8YaJ9gMOFx5qKjIBcq2vNCCeYO7dwCHMYCw/s1600/images.jpg"},
            {"Patimura", "Patimura lahir di Haria, pulau Saparua, Maluku, 8 Juni 1783 – meninggal di Ambon, Maluku, 16 Desember 1817 pada umur 34 tahun, juga dikenal dengan name Kapitan Pattimura adalah Pahlawan nasional Indonesia dari Maluku", "http://1.bp.blogspot.com/-SI2izJM1lOE/UyXIZ83V9PI/AAAAAAAAAKg/BgyvPw-P6fw/s1600/kapitan+pattimura.jpg"},
            {"R A Kartini", "Raden Adjeng Kartini atau sebenarnya lebih tepat disebut Raden Ayu Kartini adalah seorang tokoh Jawa dan Pahlawan Nasional Indonesia", "http://raw.cdn.baca.co.id/ae9a8953-c8b7-49f3-aecb-61c50da7b7f9"},
            {"Sukarno", "Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967.", "http://civitasbook.com/_z_album_b/d2/m1/p/aaaaadmp89_pahlawan20140305333220.jpg"}
    };

    public static ArrayList<Heroes> getListData(){
        Heroes heroes = null;
        ArrayList<Heroes> list = new ArrayList<>();
        for (String[] aData : data) {
            heroes = new Heroes();
            heroes.setName(aData[0]);
            heroes.setRemarks(aData[1]);
            heroes.setPhoto(aData[2]);

            list.add(heroes);
        }

        return list;
    }
}
