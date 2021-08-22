package tu;
import java.util.*;

import quanlythuvien.NguoiMuon;
import quanlythuvien.quanly;


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        static ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        static ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();
        System.out.print("1. Sách tham khảo !\n2. Sách giáo khoa !\n");
        int luachon;
        arrSachGiaoKhoa.add(new NguoiMuon(2222,"Văn lớp 10","NXB Giáo Dục Việt Nam",1,16.500f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(1111,"Toán lớp 10","NXB Giáo Dục Việt Nam",1,18.650f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(3333,"Anh lớp 10","NXB Giáo Dục Việt Nam",1,19.500f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(4444,"Lý lớp 11","NXB Giáo Dục Việt Nam",1,18.700f,"Mới"));
        do {
            System.out.print("Chọn loại sách: ");
            luachon = input.nextInt();
            if (luachon == 1){
                System.out.println("Bạn chọn sách tham khảo !");
                System.out.print("""1.
                 Nhập thêm sách tham khảo:\n2. Hiển thị sách có sẵn:\n3. Sắp xếp theo tên tác giả:\n""");

                System.out.print("4. Sắp xếp theo ID cuốn sách:\n5. Tìm kiếm theo ID của sách:\n6. Tìm kiếm theo tên của sách:\n");
                System.out.print("7. Thêm cuốn sách:\n8. Cập nhật sách:\n9. Thoát!\n");
                int chon,n;
                do {
                    System.out .print("Chọn trương trình: ");
                    chon = input.nextInt();
                    switch(chon){
                        case 1: quanly.show1(arrSachGiaoKhoa);
                        //case 2: 
                    }  
                } while ((chon < 1) || (chon > 9));
            }
            if (luachon == 2){
                System.out.println("Bạn chọn sách giáo khoa !");
                System.out.print("1. Nhập thêm sách giáo khoa:\n2. Hiển thị sách có sẵn:\n3. Sắp xếp theo tên tác giả:\n");
                System.out.print("4. Sắp xếp theo ID cuốn sách:\n5. Tìm kiếm theo ID của sách:\n6. Tìm kiếm theo tên của  sách:\n");
                System.out.print("7. Thêm cuốn sách:\n8. Cập nhật sách:\n9. Thoát!\n");
                
                int chon,n;
                do {
                    System.out .print("Chọn trương trình: ");
                    chon = input.nextInt();
                    switch(chon){
                        case 1: quanly.show2(arrSachThamKhao);
                        //case 2: 
                    }  
                } while ((chon < 1) || (chon > 9));
            }
        } while (luachon < 1 || luachon > 2);
        //     switch(luachon){
        //         case 1: nhap();
        //         case 2: shows();
        //         case 3: sort_name();
        //         case 4: sort_ID();
        //         case 5: find_ID();
        //         case 6 : find_name();
        //         case 7: add();
        //         case 8: update();
        //         case 9: exit();
        //     }
        // }
        //SachGiaoKhoa s1 = new SachGiaoKhoa();

// SachGiaoKhoa
       
        arrSachGiaoKhoa.add(new NguoiMuon(5555,"Hóa lớp 11","NXB Giáo Dục Việt Nam",1,17.780f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(6666,"Sinh lớp 11","NXB Giáo Dục Việt Nam",1,18.900f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(7777,"Sử lớp 12","NXB Giáo Dục Việt Nam",1,20.500f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(8888,"Địa lớp 12","NXB Giáo Dục Việt Nam",1,17.320f,"Mới"));
        arrSachGiaoKhoa.add(new NguoiMuon(9999,"GDCD lớp 12","NXB Giáo Dục Việt Nam",1,17.250f,"Mới"));
// SachThamKhao              
        arrSachThamKhao.add(new SachThamKhao(1010,"Văn lớp 10","NXB Đại học Huế",1,39.800f));
        arrSachThamKhao.add(new SachThamKhao(2020,"Toán lớp 10","NXB Đại học Huế",1,36.600f));
        arrSachThamKhao.add(new SachThamKhao(3030,"Anh lớp 10","NXB Đại học Huế",1,42.000f));
        arrSachThamKhao.add(new SachThamKhao(4040,"Lý lớp 11","NXB Đại học Sư phạm TPHCM",1,37.500f));
        arrSachThamKhao.add(new SachThamKhao(5050,"Hóa lớp 11","NXB Đại học Sư phạm TPHCM",1,36.500f));
        arrSachThamKhao.add(new SachThamKhao(6060,"Sinh lớp 11","NXB Đại học Sư phạm TPHCM",1,41.100f));
        arrSachThamKhao.add(new SachThamKhao(7070,"Sử lớp 12","NXB Đại học Sư phạm Hà Nội",1,37.800f));
        arrSachThamKhao.add(new SachThamKhao(8080,"Địa lớp 12","NXB Đại học Sư phạm Hà Nội",1,43.250f));
        arrSachThamKhao.add(new SachThamKhao(9090,"GDCD lớp 12","NXB Đại học Sư phạm Hà Nội",1,41.800f));


        
        // int chon,n;
        // do {
        //     System.out .print("Chọn trương trình: ");
        //     chon = input.nextInt();
        //     switch(chon){
        //         case 1: quanly.show1(arrSachGiaoKhoa);
        //         //case 2: 
        //     }  
        // } while ((chon < 1) || (chon > 9));
    }
}
