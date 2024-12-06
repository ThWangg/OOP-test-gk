public class Ghe{
    private String maGhe;
    private char hangGhe;
    private boolean trangThai;
    private double giaCoBan;

    public Ghe(String maGhe, char hangGhe, boolean trangThai, double giaCoBan){
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.trangThai = trangThai;
        this.giaCoBan = giaCoBan;
    }

    public String getMaGhe(){
        return maGhe;
    }

    public void setMaGhe(String maGhe){
        this.maGhe = maGhe;
    }

    public char getHangGhe(){
        return hangGhe;
    }

    public void setHangGhe(char hangGhe){
        this.hangGhe = hangGhe;
    }

    public boolean getTrangThai(){
        return trangThai;
    }

    public void setTrangThai(boolean trangThai){
        this.trangThai = trangThai;
    }

    public double getGiaCoBan(){
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan){
        this.giaCoBan = giaCoBan;
    }

    public String toString(){
        return "Ghế[mã ghế: " + maGhe + ", hạng ghế: " + hangGhe + ", trạng thái: " + trangThai + ", giá cơ bản: " + giaCoBan + "]";
    }
}