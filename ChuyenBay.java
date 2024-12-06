import java.util.ArrayList;

public class ChuyenBay{
    private String maChuyenBay;
    private String sanBayDi;
    private String sanBayDen;
    private String ngayBay;
    private String gioBay;
    private int soGheEconomy;
    private int soGheBusiness;
    private int soGheFirst;
    private Ghe[] danhSachGhe;
    private char trangThai;
    private Ticket[] danhSachVe;
    private double khoangCachBay;

    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, String gioBay, double khoangCachBay){
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.soGheEconomy = 120;
        this.soGheBusiness = 40;
        this.soGheFirst = 20;
        this.khoangCachBay = khoangCachBay;
        this.trangThai = 'S';
        this.danhSachGhe = khoiTaoDanhSachGhe();
    }
    private Ghe[] khoiTaoDanhSachGhe() {
        ArrayList<Ghe> danhSach = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            for (char c = 'A'; c <= 'F'; c++){
                danhSach.add(new Ghe("E" + i + c, 'E', true, 500.0));
            }
        }
        for (int i = 1; i <= 10; i++){
                for (char c = 'A'; c <= 'D'; c++) {
                danhSach.add(new Ghe("B" + i + c, 'B', true, 1500.0));
            }
        }
        for (int i = 1; i <= 5; i++){
            for (char c = 'A'; c <= 'B'; c++) {
                danhSach.add(new Ghe("F" + i + c, 'F', true, 3000.0));
            }
        }
        return danhSach.toArray(new Ghe[0]);
    }

    public String getMaChuyenBay(){
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay){
        this.maChuyenBay = maChuyenBay;
    }

    public String getSanBayDi(){
        return sanBayDi;
    }

    public void setSanBayDi(String sanBayDi){
        this.sanBayDi = sanBayDi;
    }
    
    public String getSanBayDen(){
        return sanBayDen;
    }

    public void setSanBayDen(String sanBayDen){
        this.sanBayDen = sanBayDen;
    }

    public String getNgayBay(){
        return ngayBay;
    }

    public void setNgayBay(String ngayBay){
        this.ngayBay = ngayBay;
    }

    public String getGioBay(){
        return gioBay;
    }

    public void setGioBay(String gioBay){
        this.gioBay = gioBay;
    }

    public int getSoGheEconomy(){
        return soGheEconomy;
    }

    public void setSoGheEconomy(int soGheEconomy){
        this.soGheEconomy = soGheEconomy;
    }

    public int getSoGheBusiness(){
        return soGheBusiness;
    }

    public void setSoGheBusiness(int soGheBusiness){
        this.soGheBusiness = soGheBusiness;
    }

    public int getSoGheFirst(){
        return soGheFirst;
    }

    public void setSoGheFirst(int soGheFirst){
        this.soGheFirst = soGheFirst;
    }

    public Ghe[] getDanhSachGhe(){
        return danhSachGhe;
    }

    public char getTrangThai(){
        return trangThai;
    }

    public void setTrangThai(char trangThai){
        this.trangThai = trangThai;
    }

    public double getKhoangCachBay(){
        return khoangCachBay;
    }

    public Ticket[] getDanhSachVe(){
        return danhSachVe;
    }

    public boolean kiemtraGheTrong(char hangGhe){
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getHangGhe() == hangGhe && ghe.getTrangThai()) {
                return true;
            }
        }
        return false;
    }

    public void datGhe(String maGhe){
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getMaGhe().equals(maGhe)) {
                ghe.setTrangThai(false);
                System.out.println("ghế đã đc đặt");
            }
            else
            {
                System.out.println("Ghế đã đc đặt trước");
            }
        }
    }  
    
    public void huyGhe(String maGhe){
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getMaGhe().equals(maGhe)) {
                ghe.setTrangThai(true);
                System.out.println("ghế đã hủy");
            }
            else
            {
                System.out.println("ghế k tồn tại");
            }
        }
    }

    public String toString(){
        return "mã chuyến bay: " + maChuyenBay + ", sân bay đi: " + sanBayDi + ", sân bay đến: " + sanBayDen + ", ngày bay: " + ngayBay + ", giờ bay: " + gioBay + ", trạng thái: " + trangThai;
    }
}