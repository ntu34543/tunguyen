package NguyenThanhTu;
public class Hinh {
    private int rong;
    private int dai;
    private float ban_kinh;
    private int canh;

    // HCN
    public Hinh(int rong, int dai) {
        this.setRong(rong);
        this.setDai(dai);
    }
    public int getDai() {
        return dai;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }
    public int getRong() {
        return rong;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }

    // Hinh Vuong
    public Hinh(int canh) {
        this.setCanh(canh);
    }
    public int getCanh() {
        return canh;
    }
    public void setCanh(int canh) {
        this.canh = canh;
    }


    // Hinh Tron
    public Hinh(float ban_kinh) {
        this.setBan_kinh(ban_kinh);
    }
    public float getBan_kinh() {
        return ban_kinh;
    }
    public void setBan_kinh(float ban_kinh) {
        this.ban_kinh = ban_kinh;
    }     
}