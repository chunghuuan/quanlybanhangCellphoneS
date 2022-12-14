
/****** Object:  Database [QLBH_CellPhoneS]    Script Date: 28/5/2021 11:37:45 PM ******/
CREATE DATABASE QLBH_CellphoneS
Use QLBH_CellPhoneS

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLBH_CellPhoneS].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET RECOVERY FULL 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET  MULTI_USER 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLBH_CellPhoneS] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLBH_CellPhoneS] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'QLBH_CellPhoneS', N'ON'
GO
USE [QLBH_CellPhoneS]
GO
/****** Object:  Table [dbo].[ChiNhanh]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiNhanh](
	[MaChiNhanh] [nvarchar](10) NOT NULL,
	[TenChiNhanh] [nvarchar](100) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SDT] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaChiNhanh_ChiNhanh] PRIMARY KEY CLUSTERED 
(
	[MaChiNhanh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChinhSachBaoHanh]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChinhSachBaoHanh](
	[MaBH] [nvarchar](10) NOT NULL,
	[TenCSBH] [nvarchar](100) NULL,
	[ThoiHan] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaBH_ChinhSachBaoHanh] PRIMARY KEY CLUSTERED 
(
	[MaBH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTDDH]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTDDH](
	[MaDH] [nvarchar](10) NOT NULL,
	[MaSP] [nvarchar](10) NOT NULL,
	[SLMua] [nvarchar](100) NULL,
	[MaBH] [nvarchar](10) NULL,
 CONSTRAINT [PK_MaDH_MaSP] PRIMARY KEY CLUSTERED 
(
	[MaDH] ASC,
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTKM]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTKM](
	[MaCT] [nvarchar](10) NOT NULL,
	[TenCT] [nvarchar](100) NULL,
	[NoiDung] [nvarchar](100) NULL,
	[TGAD] [nvarchar](100) NULL,
	[TyLeGiam] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaCT_CTKM] PRIMARY KEY CLUSTERED 
(
	[MaCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonDatHang]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonDatHang](
	[MaDH] [nvarchar](10) NOT NULL,
	[NgayLap] [nvarchar](100) NULL,
	[YeuCauKhac] [nvarchar](100) NULL,
	[MaCT] [nvarchar](10) NULL,
	[MaTT] [nvarchar](10) NULL,
	[MaKH] [nvarchar](10) NULL,
	[MaNV] [nvarchar](10) NULL,
 CONSTRAINT [PK_MaDH_DonDatHang] PRIMARY KEY CLUSTERED 
(
	[MaDH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HinhThucThanhToan]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HinhThucThanhToan](
	[MaTT] [nvarchar](10) NOT NULL,
	[TenHT] [nvarchar](100) NULL,
	[GhiChu] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaHT_HinhThucThanhToan] PRIMARY KEY CLUSTERED 
(
	[MaTT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nvarchar](10) NOT NULL,
	[HoTenKH] [nvarchar](100) NULL,
	[GioiTinh] [nvarchar](4) NULL,
	[CMND] [nvarchar](100) NULL,
	[NgaySinh] [nvarchar](100) NULL,
	[DienThoai] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaKH_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](10) NOT NULL,
	[HoTenNV] [nvarchar](100) NULL,
	[SDT] [nvarchar](100) NULL,
	[Email] [nvarchar](100) NULL,
	[ChucVu] [nvarchar](100) NULL,
	[MaChiNhanh] [nvarchar](10) NULL,
	[Tendangnhap] [nvarchar](10) NULL,
 CONSTRAINT [PK_MaNV_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhomSP]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhomSP](
	[MaNhom] [nvarchar](10) NOT NULL,
	[TenNhom] [nvarchar](100) NULL,
 CONSTRAINT [PK_MaNhom_NhomSP] PRIMARY KEY CLUSTERED 
(
	[MaNhom] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nvarchar](10) NOT NULL,
	[TenSP] [nvarchar](100) NULL,
	[HangSX] [nvarchar](100) NULL,
	[MoTa] [nvarchar](100) NULL,
	[NgayRaMat] [nvarchar](100) NULL,
	[DVT] [nvarchar](100) NULL,
	[BoNho] [nvarchar](100) NULL,
	[XuatXu] [nvarchar](100) NULL,
	[GiaBan] [nvarchar](100) NULL,
	[TinhTrang] [nvarchar](100) NULL,
	[MaNhom] [nvarchar](10) NULL,
 CONSTRAINT [PK_MaSP_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 28/5/2021 11:37:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[Tendangnhap] [nvarchar](10) NOT NULL,
	[Matkhau] [nvarchar](10) NOT NULL,
	[LoaiTK] [nvarchar](10) NULL,
 CONSTRAINT [PK_Tendangnhap_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[Tendangnhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiNhanh] ([MaChiNhanh], [TenChiNhanh], [DiaChi], [SDT]) VALUES (N'HN01', N'CellPhoneS Thái Hà', N'19 Thái Hà, P, Đống Đa, Hà Nội', N'+8419006480')
INSERT [dbo].[ChiNhanh] ([MaChiNhanh], [TenChiNhanh], [DiaChi], [SDT]) VALUES (N'HN02', N'CellPhoneS Bạch Mai', N'524 Bạch Mai, P, Hai Bà Trưng, Hà Nội', N'+8419006480')
INSERT [dbo].[ChiNhanh] ([MaChiNhanh], [TenChiNhanh], [DiaChi], [SDT]) VALUES (N'SG01', N'CellPhoneS XVNT', N'536 Xô Viết Nghệ Tĩnh, Phường 25, Q. Bình Thạnh, Thành phố Hồ Chí Minh', N'+8418002097')
INSERT [dbo].[ChiNhanh] ([MaChiNhanh], [TenChiNhanh], [DiaChi], [SDT]) VALUES (N'SG02', N'CellPhoneS QuangTrung', N'59 Quang Trung, Phường 10, Gò Vấp, Thành phố Hồ Chí Minh', N'+8418002097')
GO
INSERT [dbo].[ChinhSachBaoHanh] ([MaBH], [TenCSBH], [ThoiHan]) VALUES (N'BH01', N'Bảo hành tiêu chuẩn', N'12 tháng')
INSERT [dbo].[ChinhSachBaoHanh] ([MaBH], [TenCSBH], [ThoiHan]) VALUES (N'BH02', N'Đổi mới 30 ngày miễn phí', N'30 ngày')
INSERT [dbo].[ChinhSachBaoHanh] ([MaBH], [TenCSBH], [ThoiHan]) VALUES (N'BH03', N'Bảo hành mở rộng', N'6 tháng')
GO
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH01', N'SP019', N'2', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP001', N'3', N'BH02')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP002', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP004', N'3', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP007', N'3', N'BH02')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP010', N'2', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP011', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH02', N'SP012', N'2', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP001', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP003', N'3', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP004', N'3', N'BH02')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP006', N'5', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP007', N'5', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP010', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP014', N'4', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP016', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH03', N'SP020', N'4', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH04', N'SP001', N'7', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH04', N'SP005', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH04', N'SP008', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH04', N'SP011', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH04', N'SP012', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH05', N'SP002', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH06', N'SP007', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH07', N'SP002', N'1', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP001', N'1', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP002', N'1', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP003', N'1', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP004', N'1', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP005', N'3', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH09', N'SP008', N'3', N'BH03')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH10', N'SP001', N'3', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH10', N'SP003', N'3', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH10', N'SP004', N'4', N'BH01')
INSERT [dbo].[CTDDH] ([MaDH], [MaSP], [SLMua], [MaBH]) VALUES (N'DH10', N'SP005', N'1', N'BH01')
GO
INSERT [dbo].[CTKM] ([MaCT], [TenCT], [NoiDung], [TGAD], [TyLeGiam]) VALUES (N'CT01', N'Không áp dụng', N'Không áp dụng khuyến mãi', N'Vô thời hạn ', N'1')
INSERT [dbo].[CTKM] ([MaCT], [TenCT], [NoiDung], [TGAD], [TyLeGiam]) VALUES (N'CT02', N'Khách hàng mới', N'Giảm giá cho hóa đơn đầu tiên của khách', N'30 ngày sau ngày khách hàng mở tài khoản', N'0.9')
INSERT [dbo].[CTKM] ([MaCT], [TenCT], [NoiDung], [TGAD], [TyLeGiam]) VALUES (N'CT03', N'Giảm 30%', N'Giảm 30% cho hóa đơn trên 20 triệu', N'1/5 - 30/5', N'0.7')
INSERT [dbo].[CTKM] ([MaCT], [TenCT], [NoiDung], [TGAD], [TyLeGiam]) VALUES (N'CT04', N'FreeShip', N'Miễn phí vận chuyển với tất cả giá trị đơn hàng', N'15/4 - 15/5', N'1')
GO
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH01', N'3/5/2021', N'Khách hàng cần hướng dẫn cách sử dụng sản phẩm', N'CT01', N'TT01', N'KH001', N'NV02')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH02', N'4/5/2021', N'Khách hàng yêu cầu chỉ nhận sản phẩm màu trắng', N'CT02', N'TT02', N'KH003', N'NV03')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH03', N'5/5/2021', N'Khách hàng yêu cầu đăng ký Icloud', N'CT04', N'TT02', N'KH006', N'NV03')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH04', N'6/5/2021', N'Khách hàng yêu cầu cài đặt thêm ứng dụng', N'CT01', N'TT04', N'KH005', N'NV04')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH05', N'22/05/2021', N'Xuất hóa đơn đỏ', N'CT01', N'TT01', N'KH001', N'NV02')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH06', N'22/05/2021', N'Xuất hóa đơn đỏ', N'CT01', N'TT01', N'KH003', N'NV02')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH07', N'22/05/2021', N'', N'CT01', N'TT01', N'KH002', N'NV02')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH08', N'25/05/2021', N'', N'CT01', N'TT01', N'KH003', N'NV04')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH09', N'28/05/2021', N'Xuất hóa đơn đỏ', N'CT01', N'TT01', N'KH001', N'NV02')
INSERT [dbo].[DonDatHang] ([MaDH], [NgayLap], [YeuCauKhac], [MaCT], [MaTT], [MaKH], [MaNV]) VALUES (N'DH10', N'28/05/2021', N'', N'CT01', N'TT01', N'KH005', N'NV02')
GO
INSERT [dbo].[HinhThucThanhToan] ([MaTT], [TenHT], [GhiChu]) VALUES (N'TT01', N'Tiền mặt', N'')
INSERT [dbo].[HinhThucThanhToan] ([MaTT], [TenHT], [GhiChu]) VALUES (N'TT02', N'Thẻ', N'Chỉ chấp nhận thanh toán với hóa đơn trên 200k')
INSERT [dbo].[HinhThucThanhToan] ([MaTT], [TenHT], [GhiChu]) VALUES (N'TT03', N'Momo', NULL)
INSERT [dbo].[HinhThucThanhToan] ([MaTT], [TenHT], [GhiChu]) VALUES (N'TT04', N'VNPay', NULL)
GO
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH001', N'Chi Pu', N'Nữ', N'281207476', N'16/04/93', N'0965745745')
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH002', N'Đàm Vĩnh Hưng', N'Nam', N'281207741', N'02/10/97', N'0946852852')
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH003', N'Nguyễn Thanh Tùng', N'Nam', N'281207854', N'05/07/94', N'0468978978')
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH004', N'Vũ Thu Minh', N'Nữ', N'281207742', N'22/09/77', N'0945666666')
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH005', N'Huỳnh Trấn Thành', N'Nam', N'281207895', N'05/02/87', N'0947888888')
INSERT [dbo].[KhachHang] ([MaKH], [HoTenKH], [GioiTinh], [CMND], [NgaySinh], [DienThoai]) VALUES (N'KH006', N'Nguyễn Hòa', N'Nữ', N'281207887', N'31/05/95', N'0978888777')
GO
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV01', N'Lê Bảo', N'0978888777', N'lebao19@gmail.com', N'Thủ Kho', N'HN01', N'thukho')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV02', N'Nguyễn Vũ Huy', N'0978888444', N'vuhuy20@gmail.com', N'NV bán hàng', N'HN01', N'nhanvien1')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV03', N'Nguyễn Đào', N'0978888222', N'nguyendao2@gmail.com', N'Quản trị viên', N'HN01', N'admin1')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV04', N'Trần Tiến', N'0978888777', N'trantien11@gmail.com', N'NV bán hàng', N'HN02', N'nhanvien2')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV05', N'Trần Văn Cường', N'0978888225', N'tranvancuong2@gmail.com', N'NV bán hàng', N'HN02', N'nhanvien3')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV06', N'Tiểu Cường', N'0978888722', N'tieucuong2@gmail.com', N'Thủ Kho ', N'SG01', N'thukho')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV07', N'Hà Huy Hiếu', N'0941716521', N'huyhieu10@gmail.com', N'Quản trị viên', N'SG01', N'admin2')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV08', N'Mai Xuân Thanh', N'0895421251', N'xuanthanh10@gmail.com', N'NV bán hàng', N'SG02', N'nhanvien4')
INSERT [dbo].[NhanVien] ([MaNV], [HoTenNV], [SDT], [Email], [ChucVu], [MaChiNhanh], [Tendangnhap]) VALUES (N'NV09', N'Nguyễn Hiền', NULL, N'hiennguyen12@gmail.com', N'NV bán hàng', N'SG02', N'nhanvien5')
GO
INSERT [dbo].[NhomSP] ([MaNhom], [TenNhom]) VALUES (N'N01', N'Điện thoại thông minh')
INSERT [dbo].[NhomSP] ([MaNhom], [TenNhom]) VALUES (N'N02', N'Đồng hồ thông minh')
INSERT [dbo].[NhomSP] ([MaNhom], [TenNhom]) VALUES (N'N03', N'Laptop')
INSERT [dbo].[NhomSP] ([MaNhom], [TenNhom]) VALUES (N'N04', N'Phụ kiện')
GO
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP001', N'Iphone 12 Pro Max', N'Apple', N'Dòng điện thoại mới ra mắt của Apple', N'10/2020', N'1 Hộp', N'128Gb', N'Mỹ', N'32000000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP002', N'Iphone 12', N'Apple', N'Dòng điện thoại phân khúc giả rẻ của Apple', N'10/2020', N'1 Hộp', N'128Gb', N'Mỹ', N'23360000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP003', N'SS Galaxy S21+', N'Samsung', N'Khám phá thế giới đa sắc màu với màn hình AMOLED 120 Hz', N'01/2021', N'1 Hộp', N'256Gb', N'Hàn Quốc', N'28990000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP004', N'SS Galaxy Note 20 Ultra', N'Samsung', N'Thiết kế đẳng cấp lôi cuốn đến từng chi tiết', N'01/2021', N'1 Hộp', N'256Gb', N'Hàn Quốc', N'28990000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP005', N'Mi 11 5G', N'Xiaomi', N'Thiết kế nổi bật với cụm camera độc nhất', N'02/2021', N'1 Hộp', N'256Gb', N'Trung Quốc', N'19900000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP006', N'Mi Redmi Note 10 Pro', N'Xiaomi', N'Cấu tạo bền bỉ, thiết kế cao cấp', N'02/2021', N'1 Hộp', N'256Gb', N'Trung Quốc', N'7490000', N'Còn hàng', N'N01')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP007', N'Apple Watch S6 40mm', N'Apple', N'Thiết kế sang trọng, hiện đại, là phụ kiện thời trang khẳng định đẳng cấp', N'15/09/2020', N'1 Hộp', N'32Gb', N'Mỹ', N'9990000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP008', N'Apple Watch S5 44mm', N'Apple', N'Màn hình OLED Retina không bao giờ tắt', N'10/2019', N'1 Hộp', N'32Gb', N'Mỹ', N'10392000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP009', N'SS Galaxy Watch 3 LTE 41mm', N'Samsung', N'40 mặt đồng hộ đa dạng, đặc sắc', N'8/2020', N'1 Hộp', N'32Gb', N'Hàn Quốc', N'6490000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP010', N'SS Galaxy Fit2', N'Samsung', N'Kiểu dáng hiện đại và nhỏ gọn', N'5/2019', N'1 Hộp', N'8Gb', N'Hàn Quốc', N'790000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP011', N'Huawei Watch GT2 46mm', N'Huawei', N'Thời lượng pin lên đến 2 tuần ', N'10/2019', N'1 Hộp', N'4 GB', N'Trung Quốc', N'3990000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP012', N'Huami Amazfit GTR 42mm', N'Huawei', N'Thiết kế hiện đại, năng động', N'7/2019', N'1 Hộp', N'4 GB', N'Trung Quốc', N'1943000', N'Còn hàng', N'N02')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP013', N'MacBook Pro M1 2020', N'Apple', N'Thiết kế nguyên khối từ kim loại tái chế', N'2020', N'1 Hộp', N'SSD : 256Gb', N'Mỹ', N'31000000', N'Còn hàng', N'N03')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP014', N'MacBook Air M1 2020', N'Apple', N'Thiết kế mỏng nhẹ, màu sắc sang trọng', N'2020', N'1 Hộp', N'SSD : 256Gb', N'Mỹ', N'28900000', N'Còn hàng', N'N03')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP015', N'Laptop HP 348 G7 i5', N'HP', N'Hiệu năng mạnh mẽ, tốc độ nhanh chóng', N'2019', N'1 Hộp', N'SSD : 512Gb', N'Mỹ', N'16990000', N'Còn hàng', N'N03')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP016', N'IdeaPad Slim 5 14IIL05 i5', N'Lenovo', N'Mỏng nhẹ, hiện đại', N'2020', N'1 Hộp', N'SSD : 512Gb', N'Trung Quốc', N'16990000', N'Còn hàng', N'N03')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP017', N'Tai nghe Bluetooth Kanen K6', N'Kanen', N'Nghe 18h, sạc 2h', N'2020', N'1 Hộp', N'Không', N'Trung Quốc', N' 390000', N'Còn hàng', N'N04')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP018', N'Polymer 10.000mAh Type C', N'Anker', N'dung tích khủng: 10000 mha', N'2020', N'1 Hộp', N'Không', N'Mỹ', N'1000000', N'Còn hàng', N'N04')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP019', N'Loa Bluetooth Mozard BT100', N'Mozard', N'Thiết kế chắc chắn, màu đen thanh lịch', N'2020', N'1 Hộp', N'Không', N'Mỹ', N'2090000', N'Còn hàng', N'N04')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP020', N'Tai nghe Bluetooth AirPods 2 ', N'Apple', N'Hỗ trợ kích hoạt Siri bằng giọng nói', N'2020', N'1 Hộp', N'Không', N'Mỹ', N'3790000', N'Còn hàng', N'N04')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [HangSX], [MoTa], [NgayRaMat], [DVT], [BoNho], [XuatXu], [GiaBan], [TinhTrang], [MaNhom]) VALUES (N'SP021', N'Xiaomi Redmi Note 10', N'Xiaomi', N'Thiết kế đẹp mắt, sang trọng đến từng chi tiết', N'03/2021', N'1 Hộp', N'128Gb', N'Trung Quốc', N'5090000', N'Còn hàng', N'N01')
GO
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'admin1', N'admin123', N'1')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'admin2', N'admin123', N'1')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'nhanvien1', N'nv123', N'2')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'nhanvien2', N'nv123', N'2')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'nhanvien3', N'nv123', N'2')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'nhanvien4', N'nv123', N'2')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'nhanvien5', N'nv123', N'2')
INSERT [dbo].[TaiKhoan] ([Tendangnhap], [Matkhau], [LoaiTK]) VALUES (N'thukho', N'tk123', N'3')
GO
ALTER TABLE [dbo].[CTDDH]  WITH CHECK ADD  CONSTRAINT [FK_MaBH_ChinhSachBaoHanh] FOREIGN KEY([MaBH])
REFERENCES [dbo].[ChinhSachBaoHanh] ([MaBH])
GO
ALTER TABLE [dbo].[CTDDH] CHECK CONSTRAINT [FK_MaBH_ChinhSachBaoHanh]
GO
ALTER TABLE [dbo].[CTDDH]  WITH CHECK ADD  CONSTRAINT [FK_MaDH_DonDatHang] FOREIGN KEY([MaDH])
REFERENCES [dbo].[DonDatHang] ([MaDH])
GO
ALTER TABLE [dbo].[CTDDH] CHECK CONSTRAINT [FK_MaDH_DonDatHang]
GO
ALTER TABLE [dbo].[CTDDH]  WITH CHECK ADD  CONSTRAINT [FK_MaSP_SanPham2] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[CTDDH] CHECK CONSTRAINT [FK_MaSP_SanPham2]
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_MaCT_ChiNhanh] FOREIGN KEY([MaCT])
REFERENCES [dbo].[CTKM] ([MaCT])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_MaCT_ChiNhanh]
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_MaKH_ChiNhanh] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_MaKH_ChiNhanh]
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_MaNV_ChiNhanh] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_MaNV_ChiNhanh]
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_MaTT_ChiNhanh] FOREIGN KEY([MaTT])
REFERENCES [dbo].[HinhThucThanhToan] ([MaTT])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_MaTT_ChiNhanh]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_MaChiNhanh_ChiNhanh] FOREIGN KEY([MaChiNhanh])
REFERENCES [dbo].[ChiNhanh] ([MaChiNhanh])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_MaChiNhanh_ChiNhanh]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_Tendangnhap_TaiKhoan] FOREIGN KEY([Tendangnhap])
REFERENCES [dbo].[TaiKhoan] ([Tendangnhap])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_Tendangnhap_TaiKhoan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_MaNhom_NhomSP] FOREIGN KEY([MaNhom])
REFERENCES [dbo].[NhomSP] ([MaNhom])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_MaNhom_NhomSP]
GO
USE [master]
GO
ALTER DATABASE [QLBH_CellPhoneS] SET  READ_WRITE 
GO
