import java.util.ArrayList;
import java.util.List;

public class HangBay{
    private String id;
    private String tenHangBay;
    private List<ChuyenBay> danhSachChuyenBay;
    private List<HanhKhach> danhSachHanhKhach;
    private double[] bangGiaCoBan;

    public HangBay(String id, String tenHangBay, double[] bangGiaCoBan){
        this.id = id;
        this.tenHangBay = tenHangBay;
        this.danhSachChuyenBay = new ArrayList<>();
        this.danhSachHanhKhach = new ArrayList<>();
        this.bangGiaCoBan = bangGiaCoBan;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTenHangBay(){
        return tenHangBay;
    }

    public void setTenHangBay(String tenHangBay){
        this.tenHangBay = tenHangBay;
    }

    public ChuyenBay[] getDanhSachChuyenBay(){
        return danhSachChuyenBay;
    }

    public void setDanhSachChuyenBay(ChuyenBay[] danhSachChuyenBay){
        this.danhSachChuyenBay = danhSachChuyenBay;
    }

    public HanhKhach[] getDanhSachHanhKhach(){
        return danhSachHanhKhach;
    }

    public void setDanhSachHanhKhach(HanhKhach[] danhSachHanhKhach){
        this.danhSachHanhKhach = danhSachHanhKhach;
    }

    public double[] getBangGiaCoBan(){
        return bangGiaCoBan;
    }

    public void setBangGiaCoBan(double[] bangGiaCoBan){
        this.bangGiaCoBan = bangGiaCoBan;
    }

    public void themChuyenBay(ChuyenBay chuyenBay){
        danhSachChuyenBay.add(chuyenBay);
    }

    public void xoaChuyenBay(String maChuyenBay){
        for(ChuyenBay chuyenBay : danhSachChuyenBay){
            if(chuyenBay.getMaChuyenBay().equals(maChuyenBay)){
                danhSachChuyenBay.remove(chuyenBay);
            }
        }
    }

    public ChuyenBay timChuyenBay(String maChuyenBay){
        for (ChuyenBay chuyenBay : danhSachChuyenBay) {
            if(cb.getMaChuyenBay() == maChuyenBay){
                return chuyenBay;
            }
        }
    
    public void themHanhKhach(HanhKhach hanhKhachMoi){
        danhSachHanhKhach.add(hanhKhachMoi);
    }

    public void xoaHanhKhach(String id){
        for(HanhKhach hanhKhach : danhSachHanhKhach){
            if(hanhKhach.getId().equals(id)){
                danhSachHanhKhach.remove(hanhKhach);
                System.out.println("đã xoá khách hàng");
            }
        }
    }

    public HanhKhach timHanhKhach(String id){
        for (HanhKhach hanhKhach : danhSachHanhKhach) {
            if(hanhKhach.getId().equals(id)){
                return hanhKhach;
            }
        }
        return null;
    }
    
    public double tinhTongDoanhThu() {
        double doanhThu = 0.0;
        for (ChuyenBay cb : danhSachChuyenBay) {
            for (Ghe ghe : cb.kiemTraGheTrong(true)){
                doanhThu += ghe.getGiaCoBan();
            }
        }
        return doanhThu;
    }
}