package com.example.recyclerviewv2;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] makananNames = {
            "Buko Mangga",
            "Nagasari Nangka",
            "Es Kuwut",
            "Pudding Lumut",
            "Es Teler",
            "Jagung Susu",
            "Ketan Susu",
            "Bubur Mutiara",
            "Es Jeruk Kelapa",
            "Risoles Mayo"
    };

    private static String[] makananDetails = {
            "Bahan-bahan:\n" +
                    "15 gr jelly bubuk mangga\n" +
                    "150 gr gula pasir\n" +
                    "600 ml air\n" +
                    "250 gr mangga\n" +
                    "250 gr nata de coco\n" +
                    "200 ml whipping cream cair\n" +
                    "120 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "70 gr keju parut\n" +
                    "¼ sdt garam\n" +
                    "150 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Campur air, jelly mangga, gula, aduk, masak hingga mendidih\n" +
                    "Tuang adonan jelly ke cetakan, diamkan hingga beku\n" +
                    "Potong jelly sesuai selera\n" +
                    "Campur whipping cream, garam dalam wadah\n" +
                    "Tambahkan Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "Tuang jelly, potongan mangga, nata de coco, aduk rata\n" +
                    "Tambahkan keju parut",
            "Bahan-bahan:\n" +
                    "250 gr nangka\n" +
                    "220 gr tepung beras\n" +
                    "150 gr tepung tapioka\n" +
                    "450 ml santan\n" +
                    "½ sdt garam\n" +
                    "500 ml air\n" +
                    "100 gr gula pasir\n" +
                    "3 lembar pandan\n" +
                    "100 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "Daun pisang, secukupnya\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Potong nangka sesuai selera\n" +
                    "Campur tepung beras, tepung tapioka, garam, aduk\n" +
                    "Tambahkan gula pasir, santan, dan air\n" +
                    "Tambahkan Frisian Flag Kental Manis Full Cream Gold yang Nikmat, aduk\n" +
                    "Masak adonan dalam wajan dengan api kecil sambil diaduk, tambahkan pandan dan nangka\n" +
                    "Siapkan daun pisang, tuang adonan, bungkus\n" +
                    "Kukus selama 15 menit",
            "Bahan-bahan:\n" +
                    "250 gr melon\n" +
                    "2 buah jeruk nipis iris tipis\n" +
                    "500 ml air kelapa\n" +
                    "150 ml sirup melon\n" +
                    "150 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "150 gr kelapa muda\n" +
                    "Es batu secukupnya\n" +
                    "1 sdm selasih\n" +
                    "200 ml air\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Rendam selasih dengan air hingga mengembang\n" +
                    "Serut melon\n" +
                    "Iris jeruk nipis\n" +
                    "Campur air kelapa, sirup melon\n" +
                    "Tambahkan Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "Tambahkah kelapa muda, melon, jeruk nipis, dan biji selasih\n" +
                    "Tuang es batu ke gelas secukupnya, tambahkan campuran melon",
            "Bahan-bahan:\n" +
                    "3 butir telur\n" +
                    "200 ml air pandan\n" +
                    "500 ml santan kental\n" +
                    "½ sdt pasta pandan\n" +
                    "300 ml air\n" +
                    "7 gr agar bubuk\n" +
                    "10 gr jelly bubuk\n" +
                    "¾’sdt garam\n" +
                    "150 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "200 gr Gula Pasir\n" +
                    "150 gr gula merah\n" +
                    "100 ml air\n" +
                    "2 lembar daun pandan\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Campurkan santan, air, air pandan, pasta pandan aduk\n" +
                    "Tambahkan telur dan gula pasir\n" +
                    "Tambahkan Frisian Flag Kental Manis Full Cream Gold yang Nikmat, agar bubuk, jelly bubuk, aduk rata\n" +
                    "Saring adonan\n" +
                    "Masak adonan aduk sesekali hingga mendidih dan pecah\n" +
                    "Tuang adonan puding ke cetakan\n" +
                    "Dinginkan pada suhu ruang hingga beku",
            "Bahan-bahan:\n" +
                    "150 gr kolang kaling\n" +
                    "100 gr kelapa muda\n" +
                    "150 gr nangka\n" +
                    "150 gr alpukat\n" +
                    "100 gr gula pasir\n" +
                    "100 ml air\n" +
                    "2 lembar daun pandan\n" +
                    "½ sdt garam\n" +
                    "50 ml santan\n" +
                    "Es serut secukupnya\n" +
                    "30 ml Frisian Flag Bendera Kental Manis yang Nikmat atau sesuai selera per gelas\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Rebus kolang kaling hingga empuk\n" +
                    "Masak air dan gula pasir, tambahkan daun pandan dan garam\n" +
                    "Potong-potong nangka\n" +
                    "Belah alpukat, potong sesuai selera\n" +
                    "Tuang kolang kaling, nangka, kelapa, dan alpukat ke gelas saji\n" +
                    "Tambahkan santan, gula cair, dan es serut\n" +
                    "Tambahkan Frisian Flag Bendera Kental Manis yang Nikmat",
            "Bahan-bahan:\n" +
                    "500 gr jagung pipil\n" +
                    "100 gr keju parut\n" +
                    "20 ml Frisian Flag Bendera Kental Manis yang Nikmat\n" +
                    "1 sdm margarin per cup\n" +
                    "Garam, sesuai selera\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Parut keju\n" +
                    "Tuang air ke dalam kukusan\n" +
                    "Kukus jagung hingga matang\n" +
                    "Campurkan jagung dengan mentega dan sedikit garam selagi panas\n" +
                    "Tuang jagung ke dalam cup\n" +
                    "Tambahkan Frisian Flag Bendera Kental Manis yang Nikmat\n" +
                    "Taburkan keju parut",
            "Bahan-bahan:\n" +
                    "500 gr beras ketan \n" +
                    "3 lembar daun pandan\n" +
                    "350 ml santan\n" +
                    "1 sdt garam\n" +
                    "Frisian Flag Bendera Kental Manis yang Nikmat, secukupnya (20 ml per porsi)\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Rendam beras ketan selama 2 jam\n" +
                    "Panaskan kukusan, kukur beras ketan 15 menit\n" +
                    "Panaskan santan, pandan, dan garam dalam panci, masak hingga mendidih\n" +
                    "Angkat ketan setengah matang, tambahkan santan\n" +
                    "Kukus kembali selama 20 menit atau hingga empuk\n" +
                    "Cetak ketan dalam mangkuk\n" +
                    "Sajikan dengan Frisian Flag Bendera Kental Manis yang Nikmat",
            "Bahan-bahan:\n" +
                    "200 gr sagu mutiara\n" +
                    "80 gr gula pasir\n" +
                    "700 ml air\n" +
                    "2 lembar daun pandan\n" +
                    "500 ml santan\n" +
                    "½ sdt garam\n" +
                    "150 ml Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Panaskan air hingga mendidih\n" +
                    "Rebus sagu mutiara hingga air menyusut, aduk sesekali\n" +
                    "Tambahkan gula pasir\n" +
                    "Tutup panci, diamkan selama 15 menit\n" +
                    "Masak santan,pandan, dan garam\n" +
                    "Tambahkan Frisian Flag Kental Manis Full Cream Gold yang Nikmat\n" +
                    "Sajikan bubur mutiara dengan kuah santan",
            "Bahan-bahan:\n" +
                    "5 buah jeruk peras\n" +
                    "80 gr kelapa muda\n" +
                    "50 ml Frisian Flag Bendera Kental Manis yang Nikmat\n" +
                    "Es batu secukupnya\n" +
                    "\n" +
                    "Langkah Memasak:\n" +
                    "Potong jeruk\n" +
                    "Peras jeruk\n" +
                    "Saring air jeruk dari bijinya\n" +
                    "Tambahkan Frisian Flag Bendera Kental Manis yang Nikmat, aduk\n" +
                    "Tuang es batu secukupnya\n" +
                    "Tuang jeruk susu ke dalam gelas berisi es\n" +
                    "Tambahkan kelapa muda, sajikan",

                    "Bahan Adonan Kulit Risoles:\n" +
                    "250 gr tepung terigu\n" +
                    "2 sdm tepung tapioka\n" +
                    "1 sdt garam\n" +
                    "1 butir telur\n" +
                    "600 ml\n" +
                    "30 ml Frisian Flag Bendera Kental Manis yang Nikmat\n" +
                    "Bahan Isian:\n" +
                    "Smoked beef \n" +
                    "Mayonaise\n" +
                    "Telur rebus\n" +
                    "Keju\n" +
                    "Bahan Lapisan Luar:\n" +
                    "100 ml sisa adonan kulit\n" +
                    "100 gr tepung roti\n" +
                    "Minyak untuk menggoreng\n"+
                    "Langkah Memasak:\n" +
                    "Campur bahan adonan kulit\n" +
                    "Tambahkan Frisian Flag Bendera Kental Manis yang Nikmat\n" +
                    "Olesi wajan anti lengket dengan minyak, cetak adonan, masak\n" +
                    "Isi kulit dengan smoked beef, mayo, keju, dan telur rebus\n" +
                    "Gulung / lipat menjadi risol\n" +
                    "Celup risol ke dalam sisa adonan kulit lalu ke tepung roti\n" +
                    "Goreng hingga matang"
    };

    private static int[] makananPhoto ={
            R.drawable.buko_mangga,
            R.drawable.nagasari_nangka,
            R.drawable.es_kuwut,
            R.drawable.pudding_lumut,
            R.drawable.es_teler,
            R.drawable.jagung_susu,
            R.drawable.susu,
            R.drawable.bubur_mutiara,
            R.drawable.es_jeruk,
            R.drawable.risoles_mayo
    };
    static ArrayList<RvMainModel> getListData() {
        ArrayList<RvMainModel> list = new ArrayList<>();
        for (int position = 0; position < makananNames.length; position++) {
            RvMainModel makanan = new RvMainModel();
            makanan.setTitle(makananNames[position]);
            makanan.setDescription(makananDetails[position]);
            makanan.setPhoto(makananPhoto[position]);
            list.add(makanan);
        }
        return list;
    }
}
