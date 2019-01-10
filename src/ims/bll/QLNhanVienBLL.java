/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.QLNhanVienDAL;
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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mBuu
 */
public class QLNhanVienBLL {
     QLNhanVienDAL dal = new QLNhanVienDAL();
     
     public ArrayList<ThongTinNhanVien> readNhanVienBLL() {
         ArrayList<ThongTinNhanVien> listNhanVien = new ArrayList<>();
         listNhanVien = dal.readNhanVienDAL();
         return listNhanVien;
     }
     
     public ArrayList<GioiTinh> readGioiTinhBLL() {
         ArrayList<GioiTinh> listGioiTinh = new ArrayList<>();
         listGioiTinh = dal.readGioiTinhDAL();
         return listGioiTinh;
     }
     
     public ArrayList<PhongBan> readPhongBanBLL() {
         ArrayList<PhongBan> listPB = new ArrayList<>();
         listPB = dal.readPBDAL();
         return listPB;
     }
     
     public ArrayList<Doi> readDoiBLL() {
         ArrayList<Doi> listDoi = new ArrayList<>();
         listDoi = dal.readDoiDAL();
         return listDoi;
     }
     
     public ArrayList<ToNhom> readToNhomBLL() {
         ArrayList<ToNhom> listToNhom = new ArrayList<>();
         listToNhom = dal.readToNhomDAL();
         return listToNhom;
     }
     
     public ArrayList<QuocTich> readQuocTichBLL() {
         ArrayList<QuocTich> listQuocTich = new ArrayList<>();
         listQuocTich = dal.readQuocTichDAL();
         return listQuocTich;
     }
     
     public ArrayList<DanToc> readDanTocBLL() {
         ArrayList<DanToc> listDanToc = new ArrayList<>();
         listDanToc = dal.readDanTocDAL();
         return listDanToc;
     }
     
     public ArrayList<TonGiao> readTonGiaoBLL() {
         ArrayList<TonGiao> listTonGiao = new ArrayList<>();
         listTonGiao = dal.readTonGiaoDAL();
         return listTonGiao;
     }
     
     public ArrayList<HonNhan> readHonNhanBLL() {
         ArrayList<HonNhan> listHonNhan = new ArrayList<>();
         listHonNhan = dal.readHonNhanDAL();
         return listHonNhan;
     }
     
     public ArrayList<TPGiaDinh> readTPGiaDinhBLL() {
         ArrayList<TPGiaDinh> listTPGiaDinh = new ArrayList<>();
         listTPGiaDinh = dal.readTPGiaDinhDAL();
         return listTPGiaDinh;
     }
     
     public ArrayList<TPXaHoi> readTPXaHoiBLL() {
         ArrayList<TPXaHoi> listTPXaHoi = new ArrayList<>();
         listTPXaHoi = dal.readTPXaHoiDAL();
         return listTPXaHoi;
     }
     
     public ArrayList<NhomMau> readNhomMauBLL() {
         ArrayList<NhomMau> listNhomMau = new ArrayList<>();
         listNhomMau = dal.readNhomMauDAL();
         return listNhomMau;
     }
     
     public ArrayList<LoaiSucKhoe> readSucKhoeBLL() {
         ArrayList<LoaiSucKhoe> listSucKhoe = new ArrayList<>();
         listSucKhoe = dal.readSucKhoeDAL();
         return listSucKhoe;
     }
     
     public void addNewNhanVienBLL(ThongTinNhanVien nhanVien) {
        dal.addNewNhanVienDAL(nhanVien);
    }
     
     public void deleteNhanVienBLL(String id) {
        dal.deleteNhanVienDAL(id);
    }
     
     public void editNhanVienBLL(ThongTinNhanVien id) {
        dal.editNhanVienDAL(id);
    }
    
     public GioiTinh takeMaGioiTinhBLL(String loaiGioiTinh) {
         GioiTinh gT = new GioiTinh();
         gT = dal.takeMaGioiTinhDAL(loaiGioiTinh);
         return gT;
     }
     
     public PhongBan takePBBLL(String loaiPB) {
         PhongBan pB = new PhongBan();
         pB = dal.takeMaPBDAL(loaiPB);
         return pB;
     }
     
     public Doi takeDoiBLL(String tenDoi) {
         Doi doi = new Doi();
         doi = dal.takeMaDoiDAL(tenDoi);
         return doi;
     }
     
     public ToNhom takeToBLL(String tenTo) {
         ToNhom to = new ToNhom();
         to = dal.takeToDAL(tenTo);
         return to;
     }
     
     public QuocTich takeQuocTichBLL(String tenQuocTich) {
         QuocTich quocTich = new QuocTich();
         quocTich = dal.takeQuocTichDAL(tenQuocTich);
         return quocTich;
     }
     
     public DanToc takeDanTocBLL(String tenDanToc) {
         DanToc danToc = new DanToc();
         danToc = dal.takeDanTocDAL(tenDanToc);
         return danToc;
     }
     
     public TonGiao takeTonGiaoBLL(String tenTonGiao) {
         TonGiao tonGiao = new TonGiao();
         tonGiao = dal.takeTonGiaoDAL(tenTonGiao);
         return tonGiao;
     }
     
     public HonNhan takeHonNhanBLL(String loaiHonNhan) {
         HonNhan honNhan = new HonNhan();
         honNhan = dal.takeHonNhanDAL(loaiHonNhan);
         return honNhan;
     }
     
     public TPGiaDinh takeGiaDinhBLL(String loaiGD) {
         TPGiaDinh giaDinh = new TPGiaDinh();
         giaDinh = dal.takeGiaDinhDAL(loaiGD);
         return giaDinh;
     }
     
     public TPXaHoi takeXHBLL(String loaiXH) {
         TPXaHoi xaHoi = new TPXaHoi();
         xaHoi = dal.takeXHDAL(loaiXH);
         return xaHoi;
     }
     
     public NhomMau takeNhomMauBLL(String loaiMau) {
         NhomMau nhomMau = new NhomMau();
         nhomMau = dal.takeNhomMauDAL(loaiMau);
         return nhomMau;
     }
     
     public LoaiSucKhoe takeSucKhoeLL(String loaiSucKhoe) {
         LoaiSucKhoe sucKhoe = new LoaiSucKhoe();
         sucKhoe = dal.takeSucKhoeDAL(loaiSucKhoe);
         return sucKhoe;
     }
}
