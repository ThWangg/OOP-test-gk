public class Ticket{
    private String maVe;
    private String maChuyenBay;
    private String maGhe;
    private char hangGhe;
    private double giaVe;
    private char trangThaiVe;
    private HanhKhach hanhKhach;
    private String ngayDatVe;

    public Ticket(String maVe, String maChuyenBay, String maGhe, char hangGhe, double giaVe, char trangThaiVe, HanhKhach hanhKhach, String ngayDatVe){
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.giaVe = giaVe;
        this.trangThaiVe = trangThaiVe;
        this.hanhKhach = hanhKhach;
        this.ngayDatVe = ngayDatVe;
    }

    public String getMaVe(){
        return maVe;
    }

    public void setMaVe(String maVe){
        this.maVe = maVe;
    }

    public String getMaChuyenBay(){
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay){
        this.maChuyenBay = maChuyenBay;
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

    public double getGiaVe(){
        return giaVe;
    }

    public void setGiaVe(double giaVe){
        this.giaVe = giaVe;
    }

    public char getTrangThaiVe(){
        return trangThaiVe;
    }

    public void setTrangThaiVe(char trangThaiVe){
        this.trangThaiVe = trangThaiVe;
    }

    public HanhKhach getHanhKhach(){
        return hanhKhach;
    }

    public void setHanhKhach(HanhKhach hanhKhach){
        this.hanhKhach = hanhKhach;
    }

    public String getNgayDatVe(){
        return ngayDatVe;
    }

    public void setNgayDatVe(String ngayDatVe){
        this.ngayDatVe = ngayDatVe;
    }

    public double tinhGiaVe(char hangGhe){
        switch(hangGhe){
            default : return 1000000.0;
            case 'B': return 3000000.0;
            case 'F': return 5000000.0;
        }
    }

    public String toString(){
        return "Ticket [maVe=" + maVe + ", maChuyenBay=" + maChuyenBay + ", maGhe=" + maGhe + ", hangGhe=" + hangGhe + ", giaVe=" + giaVe + ", trangThaiVe=" + trangThaiVe + ", hanhKhach=" + hanhKhach + ", ngayDatVe=" + ngayDatVe + "]";
    }

}