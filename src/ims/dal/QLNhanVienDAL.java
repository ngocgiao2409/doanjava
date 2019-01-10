/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import static ims.dal.QLNhanVienDAL.conn;
import ims.dto.DanToc;
import ims.dto.Doi;
import ims.dto.GioiTinh;
import ims.dto.HonNhan;
import ims.dto.LoaiSucKhoe;
import ims.dto.NhomMau;
import ims.dto.PhongBan;
import ims.dto.QuocTich;
import ims.dto.TPGiaDinh;
import ims.dto.TPXaHoi;
import ims.dto.ThongTinNhanVien;
import ims.dto.ToNhom;
import ims.dto.TonGiao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mBuu
 */
public class QLNhanVienDAL extends Database{
    public static Connection conn = null;
    public static Statement stmt = null;
    public ArrayList<ThongTinNhanVien> readNhanVienDAL(){
        ArrayList<ThongTinNhanVien> emList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaNV, HoTen, NgaySinh, NoiSinh FROM thongtinnhanvien";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                ThongTinNhanVien em = new ThongTinNhanVien();
                em.setMaNV(rs.getString("MaNV"));
                em.setHoTen(rs.getString("HoTen"));
                em.setNgaySinh(rs.getDate("NgaySinh"));
                em.setNoiSinh(rs.getString("NoiSinh"));
                emList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return emList;
        }  
    } 
    public ArrayList<GioiTinh> readGioiTinhDAL(){
        ArrayList<GioiTinh> gTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaGioiTinh, LoaiGioiTinh FROM gioitinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                GioiTinh gT = new GioiTinh();
                gT.setMaGioiTinh(rs.getString("MaGioiTinh"));
                gT.setLoaiGioiTinh(rs.getString("LoaiGioiTinh"));
                gTList.add(gT);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return gTList;
        }  
    }  
    public ArrayList<PhongBan> readPBDAL(){
        ArrayList<PhongBan> pBList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaPB, TenPB FROM phongban";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                PhongBan pB = new PhongBan();
                pB.setMaPB(rs.getString("MaPB"));
                pB.setTenPB(rs.getString("TenPB"));
                pBList.add(pB);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return pBList;
        }  
    }
    
    public ArrayList<Doi> readDoiDAL(){
        ArrayList<Doi> doiList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaDoi, TenDoi FROM doi";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                Doi doi = new Doi();
                doi.setMaDoi(rs.getString("MaDoi"));
                doi.setTenDoi(rs.getString("TenDoi"));
                doiList.add(doi);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return doiList;
        }  
    }
    
    public ArrayList<ToNhom> readToNhomDAL(){
        ArrayList<ToNhom> toNhomList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaTo, TenTo FROM tonhom";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                ToNhom toNhom = new ToNhom();
                toNhom.setMaTo(rs.getString("MaTo"));
                toNhom.setTenTo(rs.getString("TenTo"));
                toNhomList.add(toNhom);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return toNhomList;
        }  
    }
    
    public ArrayList<QuocTich> readQuocTichDAL(){
        ArrayList<QuocTich> quocTichList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaQuocTich, TenQuocTich FROM quoctich";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                QuocTich quocTich = new QuocTich();
                quocTich.setMaQuocTich(rs.getString("MaQuocTich"));
                quocTich.setTenQuocTich(rs.getString("TenQuocTich"));
                quocTichList.add(quocTich);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return quocTichList;
        }  
    }
    
    public ArrayList<DanToc> readDanTocDAL(){
        ArrayList<DanToc> danTocList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaDanToc, TenDanToc FROM dantoc";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                DanToc danToc = new DanToc();
                danToc.setMaDanToc(rs.getString("MaDanToc"));
                danToc.setTenDanToc(rs.getString("TenDanToc"));
                danTocList.add(danToc);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return danTocList;
        }  
    }
    
    public ArrayList<TonGiao> readTonGiaoDAL(){
        ArrayList<TonGiao> tonGiaoList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaTonGiao, TenTonGiao FROM tongiao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                TonGiao tonGiao = new TonGiao();
                tonGiao.setMaTonGiao(rs.getString("MaTonGiao"));
                tonGiao.setTenTonGiao(rs.getString("TenTonGiao"));
                tonGiaoList.add(tonGiao);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tonGiaoList;
        }  
    }
    
    public ArrayList<HonNhan> readHonNhanDAL(){
        ArrayList<HonNhan> honNhanList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaHonNhan, LoaiHonNhan FROM honnhan";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                HonNhan honNhan = new HonNhan();
                honNhan.setMaHonNhan(rs.getString("MaHonNhan"));
                honNhan.setLoaiHonNhan(rs.getString("LoaiHonNhan"));
                honNhanList.add(honNhan);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return honNhanList;
        }  
    }
    
    public ArrayList<TPGiaDinh> readTPGiaDinhDAL(){
        ArrayList<TPGiaDinh> tpGiaDinhList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaTPGiaDinh, LoaiTPGiaDinh FROM tpgiadinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                TPGiaDinh tpGiaDinh = new TPGiaDinh();
                tpGiaDinh.setMaTPGiaDinh(rs.getString("MaTPGiaDinh"));
                tpGiaDinh.setLoaiTPGiaDinh(rs.getString("LoaiTPGiaDinh"));
                tpGiaDinhList.add(tpGiaDinh);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tpGiaDinhList;
        }     
    }
    
    public ArrayList<TPXaHoi> readTPXaHoiDAL(){
        ArrayList<TPXaHoi> tpXaHoiList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaTPXaHoi, LoaiTPXaHoi FROM tpxahoi";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                TPXaHoi tpXaHoi = new TPXaHoi();
                tpXaHoi.setMaTPXaHoi(rs.getString("MaTPXaHoi"));
                tpXaHoi.setLoaiTPXaHoi(rs.getString("LoaiTPXaHoi"));
                tpXaHoiList.add(tpXaHoi);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return tpXaHoiList;
        }     
    }
    
    public ArrayList<NhomMau> readNhomMauDAL(){
        ArrayList<NhomMau> nhomMauList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaNhomMau, LoaiMau FROM nhommau";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                NhomMau nhomMau = new NhomMau();
                nhomMau.setMaNhomMau(rs.getString("MaNhomMau"));
                nhomMau.setLoaiNhomMau(rs.getString("LoaiMau"));
                nhomMauList.add(nhomMau);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return nhomMauList;
        } 
    }
    
    public ArrayList<LoaiSucKhoe> readSucKhoeDAL(){
        ArrayList<LoaiSucKhoe> sucKhoeList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e){
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaSucKhoe, LoaiSucKhoe FROM loaisuckhoe";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()){
                LoaiSucKhoe sucKhoe = new LoaiSucKhoe();
                sucKhoe.setMaSucKhoe(rs.getString("MaSucKhoe"));
                sucKhoe.setLoaiSucKhoe(rs.getString("LoaiSucKhoe"));
                sucKhoeList.add(sucKhoe);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
        } finally {
            return sucKhoeList;
        } 
    }
    
    public void addNewNhanVienDAL(ThongTinNhanVien nhanVien){
        conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String maNV = nhanVien.getMaNV();
            String hoTen = nhanVien.getHoTen();
            String gioiTinh = nhanVien.getMaGioiTinh();
            String phongBan = nhanVien.getMaPB();
            String doi = nhanVien.getMaDoi();
            String to = nhanVien.getMaTo();
            String quocTich = nhanVien.getMaQuocTich();
            String danToc = nhanVien.getMaDanToc();
            String tonGiao = nhanVien.getMaTonGiao();
            String honNhan = nhanVien.getMaHonNhan();
            String giaDinh = nhanVien.getMaTPGiaDinh();
            String xaHoi = nhanVien.getMaTPXaHoi();
            String nhomMau = nhanVien.getMaNhomMau();
            String sucKhoe = nhanVien.getMaSucKhoe();
            Date ngaySinh = nhanVien.getNgaySinh();
            Date ngayVaoDonGia = nhanVien.getNgayVaoDonGia();
            String noiOHienTai = nhanVien.getNoiOHienTai();
            String thuongTru = nhanVien.getThuongTru();
            String noiSinh = nhanVien.getNoiSinh();
            String nguyenQuan = nhanVien.getNguyenQuan();
            String cMND = nhanVien.getSoCMND();
            Date ngayCap = nhanVien.getNgayCap();
            String noiCap = nhanVien.getNoiCap();
            String nhanDang = nhanVien.getNhanDang();
            int chieuCao = nhanVien.getChieuCao();
            int canNang = nhanVien.getCanNang();
            String benhLy = nhanVien.getBenhLy();
            String dienThoai = nhanVien.getDienThoai();
            String dTDD = nhanVien.getdTDD();
            String email = nhanVien.getEmail();
            String ghiChu = nhanVien.getGhiChu();
            
            String sql = "INSERT INTO `thongtinnhanvien`(`MaNV`, `HoTen`, `NgaySinh`, `MaGioiTinh`, `NgayVaoDonGia`, `MaPB`, `MaDoi`, `MaTo`,`MaQuocTich`, `MaDanToc`, `MaTonGiao`, `MaHonNhan`, `NoiOHienTai`,`ThuongTru`, `NoiSinh`, `NguyenQuan`, `SoCMND`,`NgayCap`, `NoiCap`, `MaTPGiaDinh`, `MaTPXaHoi`,`NhanDang`, `MaNhomMau`, `ChieuCao`, `CanNang`, `MaSucKhoe`, `BenhLy`, `DienThoai`, `DTDD`, `Email`, `GhiChu`) VALUES ('" + maNV + "','" + hoTen + "','"+ngaySinh+"','" + gioiTinh + "','"+ngayVaoDonGia+"','" + phongBan + "','" + doi + "','" + to + "','" + quocTich + "','" + danToc + "','" + tonGiao + "','" + honNhan + "','" + noiOHienTai + "','" + thuongTru + "','" + noiSinh + "','" + nguyenQuan + "','" + cMND + "','"+ngayCap+"','" + noiCap + "','" + giaDinh + "','" + xaHoi + "' ,'" + nhanDang + "','" + nhomMau + "'," + chieuCao + "," + canNang + ",'" + sucKhoe + "','" + benhLy + "','" + dienThoai + "','" + dTDD + "','" + email + "','" + ghiChu + "')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //LẤY MÃ CBO
    public GioiTinh takeMaGioiTinhDAL(String loaiGioiTinh) {
        GioiTinh gT = new GioiTinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaGioiTinh, LoaiGioiTinh FROM gioitinh WHERE LoaiGioiTinh = '" + loaiGioiTinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                gT.setMaGioiTinh(rs.getString("MaGioiTinh"));
                gT.setLoaiGioiTinh(rs.getString("LoaiGioiTinh"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
                return gT;
            }
    }
    public PhongBan takeMaPBDAL(String loaiPB) {
        PhongBan pB = new PhongBan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaPB, TenPB FROM phongban WHERE TenPB = '" + loaiPB + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                pB.setMaPB(rs.getString("MaPB"));
                pB.setTenPB(rs.getString("TenPB"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return pB;
        }
    }
    
    public Doi takeMaDoiDAL(String tenDoi) {
        Doi doi = new Doi();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaDoi, TenDoi FROM doi WHERE TenDoi = '" + tenDoi + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                doi.setMaDoi(rs.getString("MaDoi"));
                doi.setTenDoi(rs.getString("TenDoi"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return doi;
        }
    }
    
    public ToNhom takeToDAL(String tenTo) {
        ToNhom to = new ToNhom();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTo, TenTo FROM tonhom WHERE TenTo = '" + tenTo + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                to.setMaTo(rs.getString("MaTo"));
                to.setTenTo(rs.getString("TenTo"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return to;
        }
    }
    
    public QuocTich takeQuocTichDAL(String tenQuocTich) {
        QuocTich quocTich = new QuocTich();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaQuoctich, TenQuocTich FROM quoctich WHERE TenQuocTich = '" + tenQuocTich + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                quocTich.setMaQuocTich(rs.getString("MaQuoctich"));
                quocTich.setTenQuocTich(rs.getString("TenQuocTich"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return quocTich;
        }
    }
    
     public DanToc takeDanTocDAL(String tenDanToc) {
        DanToc danToc = new DanToc();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaDanToc, TenDanToc FROM dantoc WHERE TenDanToc = '" + tenDanToc + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                danToc.setMaDanToc(rs.getString("MaDanToc"));
                danToc.setTenDanToc(rs.getString("TenDanToc"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return danToc;
        }
    }
     
     public TonGiao takeTonGiaoDAL(String tenTonGiao) {
        TonGiao tonGiao = new TonGiao();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTonGiao, TenTonGiao FROM tongiao WHERE TenTonGiao = '" + tenTonGiao + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                tonGiao.setMaTonGiao(rs.getString("MaTonGiao"));
                tonGiao.setTenTonGiao(rs.getString("TenTonGiao"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return tonGiao;
        }
    }
     
     public HonNhan takeHonNhanDAL(String loaiHonNhan) {
        HonNhan honNhan = new HonNhan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaHonNhan, LoaiHonNhan FROM honnhan WHERE LoaiHonNhan = '" + loaiHonNhan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                honNhan.setMaHonNhan(rs.getString("MaHonNhan"));
                honNhan.setLoaiHonNhan(rs.getString("LoaiHonNhan"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return honNhan;
        }
    }
     
     public TPGiaDinh takeGiaDinhDAL(String loaiGD) {
         TPGiaDinh giaDinh = new TPGiaDinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTPGiaDinh, LoaiTPGiaDinh FROM tpgiadinh WHERE LoaiTPGiaDinh = '" + loaiGD + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                giaDinh.setMaTPGiaDinh(rs.getString("MaTPGiaDinh"));
                giaDinh.setLoaiTPGiaDinh(rs.getString("LoaiTPGiaDinh"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return giaDinh;
        }
    }
     
     public TPXaHoi takeXHDAL(String loaiXH) {
         TPXaHoi xaHoi = new TPXaHoi();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTPXaHoi, LoaiTPXaHoi FROM tpxahoi WHERE LoaiTPXaHoi = '" + loaiXH + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                xaHoi.setMaTPXaHoi(rs.getString("MaTPXaHoi"));
                xaHoi.setLoaiTPXaHoi(rs.getString("MaTPXaHoi"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return xaHoi;
        }
    }
    
     public NhomMau takeNhomMauDAL(String loaiMau) {
         NhomMau nhomMau = new NhomMau();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaNhomMau, LoaiMau FROM nhommau WHERE LoaiMau = '" + loaiMau + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                nhomMau.setMaNhomMau(rs.getString("MaNhomMau"));
                nhomMau.setLoaiNhomMau(rs.getString("LoaiMau"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return nhomMau;
        }
    }
     
     public LoaiSucKhoe takeSucKhoeDAL(String loaiSucKhoe) {
         LoaiSucKhoe sucKhoe = new LoaiSucKhoe();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaSucKhoe, LoaiSucKhoe FROM loaisuckhoe WHERE LoaiSucKhoe = '" + loaiSucKhoe + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                sucKhoe.setMaSucKhoe(rs.getString("MaSucKhoe"));
                sucKhoe.setLoaiSucKhoe(rs.getString("LoaiSucKhoe"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return sucKhoe;
        }
    }
//     public void deleteNhanVienDAL(String id){
//        conn = getConnection();
//        try {
//            String sql = "DELETE FROM thongtinnhanvien WHERE MaNV = '?'";
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setString(1, id);
//            preparedStatement.executeUpdate(sql);           
//        } catch (SQLException e) {
//            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null,e);
//        }
//     }
     public void deleteNhanVienDAL(String id) {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "DELETE FROM thongtinnhanvien WHERE MaNV = " + id;
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
     public void editNhanVienDAL(ThongTinNhanVien nhanVien) {
         conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String maNV = nhanVien.getMaNV();
            String hoTen = nhanVien.getHoTen();
            String gioiTinh = nhanVien.getMaGioiTinh();
            String phongBan = nhanVien.getMaPB();
            String doi = nhanVien.getMaDoi();
            String to = nhanVien.getMaTo();
            String quocTich = nhanVien.getMaQuocTich();
            String danToc = nhanVien.getMaDanToc();
            String tonGiao = nhanVien.getMaTonGiao();
            String honNhan = nhanVien.getMaHonNhan();
            String giaDinh = nhanVien.getMaTPGiaDinh();
            String xaHoi = nhanVien.getMaTPXaHoi();
            String nhomMau = nhanVien.getMaNhomMau();
            String sucKhoe = nhanVien.getMaSucKhoe();
            Date ngaySinh = nhanVien.getNgaySinh();
            Date ngayVaoDonGia = nhanVien.getNgayVaoDonGia();
            String noiOHienTai = nhanVien.getNoiOHienTai();
            String thuongTru = nhanVien.getThuongTru();
            String noiSinh = nhanVien.getNoiSinh();
            String nguyenQuan = nhanVien.getNguyenQuan();
            String cMND = nhanVien.getSoCMND();
            Date ngayCap = nhanVien.getNgayCap();
            String noiCap = nhanVien.getNoiCap();
            String nhanDang = nhanVien.getNhanDang();
            int chieuCao = nhanVien.getChieuCao();
            int canNang = nhanVien.getCanNang();
            String benhLy = nhanVien.getBenhLy();
            String dienThoai = nhanVien.getDienThoai();
            String dTDD = nhanVien.getdTDD();
            String email = nhanVien.getEmail();
            String ghiChu = nhanVien.getGhiChu();
            String sql = "UPDATE `thongtinnhanvien` SET `HoTen`='" + hoTen + "',`NgaySinh`='" +ngaySinh+ "',`MaGioiTinh`='" + gioiTinh + "',`NgayVaoDonGia`='" + ngayVaoDonGia + "',`MaPB`='" + phongBan + "',`MaDoi`='" + doi + "',`MaTo`='" + to + "',`MaQuocTich`='" + quocTich + "',`MaDanToc`='" + danToc + "',`MaTonGiao`='" + tonGiao + "',`MaHonNhan`='" + honNhan + "',`NoiOHienTai`='" + noiOHienTai + "',`ThuongTru`='" + thuongTru + "',`NoiSinh`='" + noiSinh + "',`NguyenQuan`='" + nguyenQuan + "',`SoCMND`='" + cMND + "',`NgayCap`='" + ngayCap + "',`NoiCap`='" + noiCap + "',`MaTPGiaDinh`='" + giaDinh + "',`MaTPXaHoi`='" + xaHoi + "',`NhanDang`='" + nhanDang + "',`MaNhomMau`='" + nhomMau + "',`ChieuCao`=" + chieuCao + ",`CanNang`=" + canNang + ",`MaSucKhoe`='" + sucKhoe + "',`BenhLy`='" + benhLy + "',`DienThoai`='" + dienThoai + "',`DTDD`='" + dTDD + "',`Email`='" + email + "',`GhiChu`='" + ghiChu + "' WHERE MaNV = " + nhanVien;
            stmt.executeUpdate(sql);
     } catch (Exception e) {
            e.printStackTrace();
     }
     }
}
