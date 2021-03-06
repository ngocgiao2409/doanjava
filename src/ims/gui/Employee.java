/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import ims.bll.QLNhanVienBLL;
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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAT
 */
public class Employee extends javax.swing.JFrame {

    QLNhanVienBLL gioiTinhBLL = new QLNhanVienBLL();
    QLNhanVienBLL pBBLL = new QLNhanVienBLL();
    QLNhanVienBLL doiBLL = new QLNhanVienBLL();
    QLNhanVienBLL toNhomBLL = new QLNhanVienBLL();
    QLNhanVienBLL quocTichBLL = new QLNhanVienBLL(); 
    QLNhanVienBLL danTocBLL = new QLNhanVienBLL();  
    QLNhanVienBLL tonGiaoBLL = new QLNhanVienBLL(); 
    QLNhanVienBLL honNhanBLL = new QLNhanVienBLL(); 
    QLNhanVienBLL tpGiaDinhBLL = new QLNhanVienBLL(); 
    QLNhanVienBLL tpXaHoiBLL = new QLNhanVienBLL(); 
    QLNhanVienBLL nhomMauBLL = new QLNhanVienBLL();
    QLNhanVienBLL sucKhoeBLL = new QLNhanVienBLL();
    ThongTinNhanVien nhanVien = new ThongTinNhanVien();
    QLNhanVienBLL addNewNV = new QLNhanVienBLL();
    GioiTinh gT = new GioiTinh();
    PhongBan pB = new PhongBan();
    Doi doi = new Doi();
    ToNhom to = new ToNhom();
    QuocTich quocTich = new QuocTich();
    DanToc danToc = new DanToc();
    TonGiao tonGiao = new TonGiao();
    HonNhan honNhan = new HonNhan();
    TPGiaDinh giaDinh = new TPGiaDinh();
    TPXaHoi xaHoi = new TPXaHoi();
    NhomMau nhomMau = new NhomMau();
    LoaiSucKhoe sucKhoe = new LoaiSucKhoe();
    public Employee() {
        initComponents();
        stateButton(true);
         setInfoDialog();
    }
    public  void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);        
        setResizable(false);
    }
    public void stateButton(boolean value){
        
//        btNew.setVisible(value);
//        btEdit.setVisible(value);
//        btDelete.setVisible(value);
//        btPrint.setVisible(value);
//        btClose.setVisible(value);
        btnSave.setVisible(value);
        btCancel.setVisible(value);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboPB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboDoi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNgayVaoDonVi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboTo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboQuocTich = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboDanToc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboTonGiao = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboHonNhan = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtNoiOHienTai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtThuongTru = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNoiSinh = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNguyenQuan = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNgayCap = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNoiCap = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cboTPGiaDinh = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cboTPXaHoi = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtNhanDang = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cboNhomMau = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtChieuCao = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCanNang = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cboSucKhoe = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtBenhLy = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDTDD = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setText("Ghi");
        btnSave.setPreferredSize(new java.awt.Dimension(75, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        btCancel.setText("Hủy");
        btCancel.setPreferredSize(new java.awt.Dimension(75, 23));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        jLabel1.setText("Mã NV:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 19, -1, -1));
        getContentPane().add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 16, 125, -1));

        jLabel2.setText("Họ tên:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 19, -1, -1));
        getContentPane().add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 16, 220, -1));

        jLabel3.setText("Phòng ban:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 19, -1, -1));

        cboPB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPBItemStateChanged(evt);
            }
        });
        getContentPane().add(cboPB, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 16, 322, -1));

        jLabel4.setText("Ngày sinh:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, -1, -1));
        getContentPane().add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 51, 125, -1));

        jLabel5.setText("Giới tính:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 51, -1, -1));

        cboGioiTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGioiTinhItemStateChanged(evt);
            }
        });
        cboGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGioiTinhActionPerformed(evt);
            }
        });
        getContentPane().add(cboGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 51, 90, -1));

        jLabel6.setText("Đội:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 54, -1, -1));

        cboDoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDoiItemStateChanged(evt);
            }
        });
        getContentPane().add(cboDoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 51, 322, -1));

        jLabel7.setText("Ngày vào đơn vị:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 89, -1, -1));
        getContentPane().add(txtNgayVaoDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 86, 125, -1));

        jLabel8.setText("Tổ:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 89, -1, -1));

        cboTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboToItemStateChanged(evt);
            }
        });
        getContentPane().add(cboTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 86, 322, -1));

        jLabel9.setText("Quốc tịch:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 136, -1, -1));

        cboQuocTich.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboQuocTichItemStateChanged(evt);
            }
        });
        getContentPane().add(cboQuocTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 133, 150, -1));

        jLabel10.setText("Dân tộc:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 136, -1, -1));

        cboDanToc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDanTocItemStateChanged(evt);
            }
        });
        getContentPane().add(cboDanToc, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 133, 111, -1));

        jLabel11.setText("Tôn giáo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 136, -1, -1));

        cboTonGiao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTonGiaoItemStateChanged(evt);
            }
        });
        getContentPane().add(cboTonGiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 133, 130, -1));

        jLabel12.setText("Hôn nhân:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 136, -1, -1));

        cboHonNhan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHonNhanItemStateChanged(evt);
            }
        });
        getContentPane().add(cboHonNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 133, 163, -1));

        jLabel13.setText("Nơi ở hiện tại:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 178, -1, -1));
        getContentPane().add(txtNoiOHienTai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 910, -1));

        jLabel14.setText("Thường trú:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 224, -1, -1));
        getContentPane().add(txtThuongTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 221, 910, -1));

        jLabel15.setText("Nơi sinh:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, -1, -1));
        getContentPane().add(txtNoiSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 267, 910, -1));

        jLabel16.setText("Nguyên quán:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 316, -1, -1));
        getContentPane().add(txtNguyenQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 313, 910, -1));

        jLabel17.setText("Số CMND:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 360, -1, -1));
        getContentPane().add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 357, 200, -1));

        jLabel18.setText("Ngày cấp:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 360, -1, -1));
        getContentPane().add(txtNgayCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 357, 200, -1));

        jLabel19.setText("Nơi cấp:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 360, -1, -1));
        getContentPane().add(txtNoiCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 310, -1));

        jLabel20.setText("TP. Gia đình:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 405, -1, -1));

        cboTPGiaDinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTPGiaDinhItemStateChanged(evt);
            }
        });
        getContentPane().add(cboTPGiaDinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 402, 200, -1));

        jLabel21.setText("TP. Xã hội:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 405, -1, -1));

        cboTPXaHoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTPXaHoiItemStateChanged(evt);
            }
        });
        getContentPane().add(cboTPXaHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 402, 200, -1));

        jLabel22.setText("Nhận dạng:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 405, -1, -1));
        getContentPane().add(txtNhanDang, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 402, 310, -1));

        jLabel23.setText("Nhóm máu:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 449, -1, -1));

        cboNhomMau.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNhomMauItemStateChanged(evt);
            }
        });
        getContentPane().add(cboNhomMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 446, 120, -1));

        jLabel24.setText("Chiều cao:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 449, -1, -1));
        getContentPane().add(txtChieuCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 446, 85, -1));

        jLabel25.setText("Cân nặng:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 449, -1, -1));
        getContentPane().add(txtCanNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 446, 109, -1));

        jLabel26.setText("Loại sức khỏe:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 449, -1, -1));

        cboSucKhoe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSucKhoeItemStateChanged(evt);
            }
        });
        getContentPane().add(cboSucKhoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 446, 88, -1));

        jLabel27.setText("Bệnh lý:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 449, -1, -1));
        getContentPane().add(txtBenhLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 446, 128, -1));

        jLabel28.setText("Điện thoại:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 490, -1, -1));
        getContentPane().add(txtDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 180, -1));

        jLabel29.setText("Điện thoại DĐ:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 493, -1, -1));
        getContentPane().add(txtDTDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 490, 194, -1));

        jLabel30.setText("Email:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 493, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 490, 304, -1));

        jLabel31.setText("Ghi chú:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 540, -1, -1));
        getContentPane().add(txtGhiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 537, 910, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        stateButton(true);
        try{
        String maNV = txtMaNV.getText();
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = (Date) formatter.parse(ngaySinh);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String ngayVaoDonGia = txtNgayVaoDonVi.getText();    
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = (Date) formatter1.parse(ngayVaoDonGia);
        java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
        
        String noiOHienTai = txtNoiOHienTai.getText();
//        String gioiTinh = cboGioiTinh.getSelectedItem().toString();
//        String pB = cboPB.getSelectedItem().toString();
//        String doi = cboDoi.getSelectedItem().toString();
//        String to = cboTo.getSelectedItem().toString();
//        String quocTich = cboQuocTich.getSelectedItem().toString();
//        String danToc = cboDanToc.getSelectedItem().toString();
//        String tonGiao = cboTonGiao.getSelectedItem().toString();
//        String honNhan = cboHonNhan.getSelectedItem().toString();
        String thuongTru = txtThuongTru.getText();
        String noiSinh = txtNoiSinh.getText();
        String nguyenQuan = txtNguyenQuan.getText();
        String cMND = txtCMND.getText();
        
        String ngayCap = txtNgayCap.getText();
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
        Date date2 = (Date) formatter2.parse(ngayCap);
        java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());
        
        String noiCap = txtNoiCap.getText();
//        String tpGiadinh = cboTPGiaDinh.getSelectedItem().toString();
//        String tpXaHoi = cboTPXaHoi.getSelectedItem().toString();
        String nhanDang = txtNhanDang.getText();
//        String nhomMau = cboNhomMau.getSelectedItem().toString();
        int chieuCao = Integer.parseInt(txtChieuCao.getText());
        int canNang = Integer.parseInt(txtCanNang.getText());
//        String sucKhoe = cboSucKhoe.getSelectedItem().toString();
        String benhLy = txtBenhLy.getText();
        String dienThoai = txtDienThoai.getText();
        String dTDD = txtDTDD.getText();
        String email = txtEmail.getText();
        String ghiChu = txtGhiChu.getText();
//        studentModel = new Student();
        nhanVien.setMaNV(maNV);
        nhanVien.setHoTen(hoTen);
        nhanVien.setNgaySinh(sqlDate);
        nhanVien.setNgayVaoDonGia(sqlDate1);
        nhanVien.setNoiOHienTai(noiOHienTai);
        nhanVien.setThuongTru(thuongTru);
        nhanVien.setNoiSinh(noiSinh);
        nhanVien.setNguyenQuan(nguyenQuan);
        nhanVien.setSoCMND(cMND);
        nhanVien.setNoiCap(noiCap);
        nhanVien.setNgayCap(sqlDate2);
        nhanVien.setNhanDang(nhanDang);
        nhanVien.setChieuCao(chieuCao);
        nhanVien.setCanNang(canNang);
        nhanVien.setBenhLy(benhLy);
        nhanVien.setDienThoai(dienThoai);
        nhanVien.setdTDD(dTDD);
        nhanVien.setEmail(email);
        nhanVien.setGhiChu(ghiChu);
        nhanVien.setMaGioiTinh(gT.getMaGioiTinh());
        nhanVien.setMaPB(pB.getMaPB());
        nhanVien.setMaDoi(doi.getMaDoi());
        nhanVien.setMaTo(to.getMaTo());
        nhanVien.setMaQuocTich(quocTich.getMaQuocTich());
        nhanVien.setMaDanToc(danToc.getMaDanToc());
        nhanVien.setMaTonGiao(tonGiao.getMaTonGiao());
        nhanVien.setMaHonNhan(honNhan.getMaHonNhan());
        nhanVien.setMaTPGiaDinh(giaDinh.getMaTPGiaDinh());
        nhanVien.setMaTPXaHoi(xaHoi.getMaTPXaHoi());
        nhanVien.setMaNhomMau(nhomMau.getMaNhomMau());
        nhanVien.setMaSucKhoe(sucKhoe.getMaSucKhoe());
//        txtMaNV.setText(nhanVien.getMaGioiTinh());
//        txtNgaySinh.setText(nhanVien.getMaTo());
//        txtNgayVaoDonVi.setText(nhanVien.getMaDoi());
        addNewNV.addNewNhanVienBLL(nhanVien);
        this.dispose();
        }catch(Exception e){
            e.printStackTrace();
        }
//        ClearData();
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[0]);
//        int row = jTable1.getRowCount()-1;
//        model.setValueAt(studentModel.getId(), row, 0);
//        model.setValueAt(studentModel.getFull_name(), row, 1);
//        model.setValueAt(studentModel.getAge(), row, 2);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
         stateButton(true);
         System.exit(0);
    }//GEN-LAST:event_btCancelActionPerformed

    private void cboGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGioiTinhActionPerformed
        
    }//GEN-LAST:event_cboGioiTinhActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        DefaultComboBoxModel modelGT = (DefaultComboBoxModel) cboGioiTinh.getModel();
        ArrayList<GioiTinh> gioiTinhListModel = gioiTinhBLL.readGioiTinhBLL();
        GioiTinh gioiTinhModel = new GioiTinh();
        for (int i = 0; i < gioiTinhListModel.size(); i++) {
            gioiTinhModel = gioiTinhListModel.get(i);
            modelGT.addElement(gioiTinhModel.getLoaiGioiTinh());
        }
        gioiTinhListModel.clear();
        
        DefaultComboBoxModel modelPB = (DefaultComboBoxModel) cboPB.getModel();
        ArrayList<PhongBan> pBListModel = pBBLL.readPhongBanBLL();
        PhongBan pBModel = new PhongBan();
        for (int i = 0; i < pBListModel.size(); i++) {
            pBModel = pBListModel.get(i);
            modelPB.addElement(pBModel.getTenPB());
        }
        pBListModel.clear();
        
        DefaultComboBoxModel modelDoi = (DefaultComboBoxModel) cboDoi.getModel();
        ArrayList<Doi> doiListModel = doiBLL.readDoiBLL();
        Doi doiModel = new Doi();
        for (int i = 0; i < doiListModel.size(); i++) {
            doiModel = doiListModel.get(i);
            modelDoi.addElement(doiModel.getTenDoi());
        }
        doiListModel.clear();
        
        DefaultComboBoxModel modelToNhom = (DefaultComboBoxModel) cboTo.getModel();
        ArrayList<ToNhom> toNhomListModel = toNhomBLL.readToNhomBLL();
        ToNhom toNhomModel = new ToNhom();
        for (int i = 0; i < toNhomListModel.size(); i++) {
            toNhomModel = toNhomListModel.get(i);
            modelToNhom.addElement(toNhomModel.getTenTo());
        }
        toNhomListModel.clear();
        
        DefaultComboBoxModel modelQuocTich = (DefaultComboBoxModel) cboQuocTich.getModel();
        ArrayList<QuocTich> quocTichListModel = quocTichBLL.readQuocTichBLL();
        QuocTich quocTichModel = new QuocTich();
        for (int i = 0; i < quocTichListModel.size(); i++) {
            quocTichModel = quocTichListModel.get(i);
            modelQuocTich.addElement(quocTichModel.getTenQuocTich());
        }
        quocTichListModel.clear();
        
        DefaultComboBoxModel modelDanToc = (DefaultComboBoxModel) cboDanToc.getModel();
        ArrayList<DanToc> danTocListModel = danTocBLL.readDanTocBLL();
        DanToc danTocModel = new DanToc();
        for (int i = 0; i < danTocListModel.size(); i++) {
            danTocModel = danTocListModel.get(i);
            modelDanToc.addElement(danTocModel.getTenDanToc());
        }
        danTocListModel.clear();
        
        DefaultComboBoxModel modelTonGiao = (DefaultComboBoxModel) cboTonGiao.getModel();
        ArrayList<TonGiao> tonGiaoListModel = tonGiaoBLL.readTonGiaoBLL();
        TonGiao tonGiaoModel = new TonGiao();
        for (int i = 0; i < tonGiaoListModel.size(); i++) {
            tonGiaoModel = tonGiaoListModel.get(i);
            modelTonGiao.addElement(tonGiaoModel.getTenTonGiao());
        }
        tonGiaoListModel.clear();
        
        DefaultComboBoxModel modelHonNhan = (DefaultComboBoxModel) cboHonNhan.getModel();
        ArrayList<HonNhan> honNhanListModel = tonGiaoBLL.readHonNhanBLL();
        HonNhan honNhanModel = new HonNhan();
        for (int i = 0; i < honNhanListModel.size(); i++) {
            honNhanModel = honNhanListModel.get(i);
            modelHonNhan.addElement(honNhanModel.getLoaiHonNhan());
        }
        honNhanListModel.clear();
        
        DefaultComboBoxModel modelGiaDinh = (DefaultComboBoxModel) cboTPGiaDinh.getModel();
        ArrayList<TPGiaDinh> tpGiaDinhListModel = tpGiaDinhBLL.readTPGiaDinhBLL();
        TPGiaDinh tpGiaDinhModel = new TPGiaDinh();
        for (int i = 0; i < tpGiaDinhListModel.size(); i++) {
            tpGiaDinhModel = tpGiaDinhListModel.get(i);
            modelGiaDinh.addElement(tpGiaDinhModel.getLoaiTPGiaDinh());
        }
        tpGiaDinhListModel.clear();
        
        DefaultComboBoxModel modelXaHoi = (DefaultComboBoxModel) cboTPXaHoi.getModel();
        ArrayList<TPXaHoi> tpXaHoiListModel = tpXaHoiBLL.readTPXaHoiBLL();
        TPXaHoi tpXaHoiModel = new TPXaHoi();
        for (int i = 0; i < tpXaHoiListModel.size(); i++) {
            tpXaHoiModel = tpXaHoiListModel.get(i);
            modelXaHoi.addElement(tpXaHoiModel.getLoaiTPXaHoi());
        }
        tpXaHoiListModel.clear();
        
        DefaultComboBoxModel modelNhomMau = (DefaultComboBoxModel) cboNhomMau.getModel();
        ArrayList<NhomMau> nhomMauListModel = nhomMauBLL.readNhomMauBLL();
        NhomMau nhomMauModel = new NhomMau();
        for (int i = 0; i < nhomMauListModel.size(); i++) {
            nhomMauModel = nhomMauListModel.get(i);
            modelNhomMau.addElement(nhomMauModel.getLoaiNhomMau());
        }
        tpXaHoiListModel.clear();
        
        DefaultComboBoxModel modelSucKhoe = (DefaultComboBoxModel) cboSucKhoe.getModel();
        ArrayList<LoaiSucKhoe> sucKhoeListModel = sucKhoeBLL.readSucKhoeBLL();
        LoaiSucKhoe sucKhoeModel = new LoaiSucKhoe();
        for (int i = 0; i < sucKhoeListModel.size(); i++) {
            sucKhoeModel = sucKhoeListModel.get(i);
            modelSucKhoe.addElement(sucKhoeModel.getLoaiSucKhoe());
        }
        sucKhoeListModel.clear();
    }//GEN-LAST:event_formWindowOpened

    private void cboGioiTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGioiTinhItemStateChanged
        String takeGT = cboGioiTinh.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        gT = nV.takeMaGioiTinhBLL(takeGT);
    }//GEN-LAST:event_cboGioiTinhItemStateChanged

    private void cboPBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPBItemStateChanged
        String takePB = cboPB.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        pB = nV.takePBBLL(takePB);
    }//GEN-LAST:event_cboPBItemStateChanged

    private void cboDoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDoiItemStateChanged
        String takeDoi = cboDoi.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        doi = nV.takeDoiBLL(takeDoi);
    }//GEN-LAST:event_cboDoiItemStateChanged

    private void cboToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboToItemStateChanged
        String takeTo = cboTo.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        to = nV.takeToBLL(takeTo);
    }//GEN-LAST:event_cboToItemStateChanged

    private void cboQuocTichItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboQuocTichItemStateChanged
        String takeQuocTich = cboQuocTich.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        quocTich = nV.takeQuocTichBLL(takeQuocTich);
    }//GEN-LAST:event_cboQuocTichItemStateChanged

    private void cboDanTocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDanTocItemStateChanged
        String takeDanToc = cboDanToc.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        danToc = nV.takeDanTocBLL(takeDanToc);
    }//GEN-LAST:event_cboDanTocItemStateChanged

    private void cboTonGiaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTonGiaoItemStateChanged
        String takeTonGiao = cboTonGiao.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        tonGiao = nV.takeTonGiaoBLL(takeTonGiao);
    }//GEN-LAST:event_cboTonGiaoItemStateChanged

    private void cboHonNhanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHonNhanItemStateChanged
        String takeHonNhan = cboHonNhan.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        honNhan = nV.takeHonNhanBLL(takeHonNhan);
    }//GEN-LAST:event_cboHonNhanItemStateChanged

    private void cboTPGiaDinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTPGiaDinhItemStateChanged
        String takeGiaDinh = cboTPGiaDinh.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        giaDinh = nV.takeGiaDinhBLL(takeGiaDinh);
    }//GEN-LAST:event_cboTPGiaDinhItemStateChanged

    private void cboTPXaHoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTPXaHoiItemStateChanged
        String takeXaHoi = cboTPXaHoi.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        xaHoi = nV.takeXHBLL(takeXaHoi);
    }//GEN-LAST:event_cboTPXaHoiItemStateChanged

    private void cboNhomMauItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNhomMauItemStateChanged
        String takeMau = cboNhomMau.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        nhomMau = nV.takeNhomMauBLL(takeMau);
    }//GEN-LAST:event_cboNhomMauItemStateChanged

    private void cboSucKhoeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSucKhoeItemStateChanged
        String takeSucKhoe = cboSucKhoe.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        sucKhoe = nV.takeSucKhoeLL(takeSucKhoe);
    }//GEN-LAST:event_cboSucKhoeItemStateChanged


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboDanToc;
    private javax.swing.JComboBox<String> cboDoi;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboHonNhan;
    private javax.swing.JComboBox<String> cboNhomMau;
    private javax.swing.JComboBox<String> cboPB;
    private javax.swing.JComboBox<String> cboQuocTich;
    private javax.swing.JComboBox<String> cboSucKhoe;
    private javax.swing.JComboBox<String> cboTPGiaDinh;
    private javax.swing.JComboBox<String> cboTPXaHoi;
    private javax.swing.JComboBox<String> cboTo;
    private javax.swing.JComboBox<String> cboTonGiao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBenhLy;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtCanNang;
    private javax.swing.JTextField txtChieuCao;
    private javax.swing.JTextField txtDTDD;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayCap;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgayVaoDonVi;
    private javax.swing.JTextField txtNguyenQuan;
    private javax.swing.JTextField txtNhanDang;
    private javax.swing.JTextField txtNoiCap;
    private javax.swing.JTextField txtNoiOHienTai;
    private javax.swing.JTextField txtNoiSinh;
    private javax.swing.JTextField txtThuongTru;
    // End of variables declaration//GEN-END:variables
}
