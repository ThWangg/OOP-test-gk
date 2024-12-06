public class HanhKhach implements IHanhKhach{
    private String id;
    private String tenKhachHang;
    private int namSinh;
    private String soHoChieu;
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien;
    private Ticket[] danhSachVeDaDat;
    private String diaChi;

    public HanhKhach(String id, String tenHanhKhach, int namSinh, String soHoChieu, String idHangBay, String maTheThanhVien, double soDiemBayTichLuy, char hangTheThanhVien, String diaChi){
        this.id = id;
        this.tenKhachHang = tenHanhKhach;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.idHangBay = idHangBay;
        this.maTheThanhVien = maTheThanhVien;
        this.soDamBayTichLuy = soDiemBayTichLuy;
        this.hangTheThanhVien = hangTheThanhVien;
        this.danhSachVeDaDat = new Ticket[5];
        this.diaChi = diaChi;
    }

    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getTenKhachHang(){
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang){
        this.tenKhachHang = tenKhachHang;
    }

    public int getNamSinh(){
        return namSinh;
    }

    public void setNamSinh(int namSinh){
        this.namSinh = namSinh;
    }

    public String getSoHoChieu(){
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu){
        this.soHoChieu = soHoChieu;
    }

    public String getIdHangBay(){
        return idHangBay;
    }

    public void setIdHangBay(String idHangBay){
        this.idHangBay = idHangBay;
    }


    public String getMaTheThanhVien(){
        return maTheThanhVien;
    }

    public void setMaTheThanhVien(String maTheThanhVien){
        this.maTheThanhVien = maTheThanhVien;
    }

    public double getSoDamBayTichLuy(){
        return soDamBayTichLuy;
    }

    public void setSoDamBayTichLuy(double soDamBayTichLuy){
        this.soDamBayTichLuy = soDamBayTichLuy;
    }

    public char getHangTheThanhVien(){
        return hangTheThanhVien;    
    }

    public void setHangTheThanhVien(char hangTheThanhVien){
        this.hangTheThanhVien = hangTheThanhVien;
    }

    public Ticket[] getDanhSachVeDaDat(){
        return danhSachVeDaDat;
    }

    public void setDanhSachVe(Ticket[] danhSachVeDaDat){
        if (danhSachVeDaDat.length <= 5) {
            this.danhSachVeDaDat = danhSachVeDaDat;
        }
        else{
            System.out.println("danh sách vé k vượt quá 5");
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void datVe(){
        int demVe = 0;
        for(int i = 0; i < danhSachVeDaDat.length; i++){
            if(danhSachVeDaDat[i].getTrangThaiVe() == 'C'){
                demVe++;
            }
        }
        if(demVe >= 5){
            System.out.println("số lượng vé đã đủ");
        }
        else{
            String maVe = "V" + String.format("%05d", demVe + 1);
            Ticket veMoi = new Ticket(maVe, maChuyenBay, hangGhe, this);
        }
    }
}
