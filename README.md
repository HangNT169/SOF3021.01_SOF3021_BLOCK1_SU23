# Buổi 1 : Overview Spring Boot
1.1: Spring
- Spring Boot bản chất nó là 1 Framework của Java giúp code trở nên dễ dàng, hỗ trợ nhiều hơn..
- Spring hỗ trợ IOC, DI.. => Giúp dễ dàng mở rộng ứng dụng ( học trong các bài tới)
  1.2: Pom
- Pom.xml : chứa các khai báo thư viện(dependence) được sử dụng trong dự án.Các thứ viện này được quản lý bởi maven.
- Trong quá trình làm và phát triển thị các bạn có thể thêm bỏ thư viên nếu cầu cho dự án. Nhưng mỗi lần thay đổi File pomm thì phải build lại.
- Ngoài ra bắt buộc trong File pomm phải có dependence tomcat-embed. Cái này dùng để nhúng tomcat webserver vào dự án.

      1.3. application.pro..
- Là file cấu hình mặc định của ứng dụng. Có thể là cấu hình kết nối với CSDL hoặc cấu hình view của dự án…
- Mặc định của Spring boot là dùng thymeleaf là những File html nên khi muốn dùng View là JSP => Phải cấu hình ở đây với đường dẫn bằt đầu là … và hậu tố duôiiii là ….

  1.4: Chú ý
- Tất cả các package như là controller, model, service… phải được đặt trong đường dẫn cơm… vì đây là đường dẫn tên package cấu hình Bean . Nếu đặt trong đường dẫn khác thì phải khai báo đường dẫn cụ thể.

  1.5. Chạy project
- Với dự án spring boot bản chất của nó là theo mô hình design signleton . Nó nhận diện main chính để chạy bằng annotation @SpingBootAplication.

  1.6: Trao đổi :
  - Model sẽ chứa dữ liệu chia sẻ với View


# Buổi 2:
## 1. Mô hình MVC.
### 1.1 Khái niệm
MVC là viết tắt của cụm từ “Model-View-Controller“.
Đây là mô hình thiết kế được sử dụng trong kỹ thuật phần mềm.
<br/>
MVC là một mẫu kiến trúc phần mềm để tạo lập giao diện người dùng trên máy tính.
<br/>
MVC chia thành ba phần được kết nối với nhau và mỗi thành phần đều có một nhiệm vụ riêng của nó và độc lập với các thành phần khác.
<br/>
MVC cũng được sử dụng rộng rãi trong phát triển web, sự khác biệt được tùy chỉnh liên quan đến sự có mặt của server - client.
<br/>
### 2. Cách thành phần trong MVC
#### Model
- Có nhiệm vụ thao tác với Database
- Nó chứa tất cả các hàm, các phương thức truy vấn trực tiếp với dữ liệu
  - Controller sẽ thông qua các hàm, phương thức đó để lấy dữ liệu rồi gửi qua View
#### View
- Là giao diện người dùng (User Interface)
- Chứa các thành phần tương tác với người dùng như menu, button, image, text,...
- Nơi nhận dữ liệu từ Controller và hiển thị
- Notes: Nói về view trong spring boot (nhăc lại).Với view spring thì nó hỗ trợ jsp
  hoặc là Thymeleaf (html). Mặc định là sử dụng thymeleaf.
#### Controller
- Là thành phần trung gian giữa Model và View
- Đảm nhận vai trò tiếp nhận yêu cầu từ người dùng, thông qua Model để lấy dữ liệu sau đó thông qua View để hiển thị cho người dùng
### 3. Cách chạy (hoạt động)
Đầu tiên user(client) gửi request tới server.
<br/>
Thì ở phía server (controller) sẽ tiếp nhận request vừa gửi và giao tiếp với model.
<br/>
Ở đây model có thể giao tiếp với database để lấy dữ liệu.
<br/>
Sau khi lấy xong dự liệu thì controller sẽ gửi dữ liệu vừa lấy được về view
<br/>
và từ view sẽ hiển thị (reponse)ra cho người dùng trên trình duyệt.

### 3. Request Mapping
- Request Mapping bao gồm có thể là GET, POST.
- Default của nó là get
  (demo quay lai Buoi 1 them method)

### 4. HTTP Request Method .
- Get = R : Doc
- Post = C: Tao moi
- Put = U: Update
- Delete = D: Delete
- Patch
  ..
- => Tuy nhien voi Java 5 thi chung ta chi su dung Get, Post con cac phuong thuc khac
- chung ta se su dung trong java 6. No la rest api o java 5 chua hoc.

=> Với Java 5 thì chỉ cần hiểu đơn giản:
- Get : Hiển thị thông tin(form)
- Post : Xử lý form (có thể là Update, Create, Delete...)

// Bài Tập:
Tạo 1 class SinhVien gồm các thuộc tính maSV-String, ten-String,tuoi-int.
Hiển thị 5 học sinh lên table.
Detail sinh viên
Tìm kiếm theo tên.

### 5.Lombox trong quá trình làm bt giới thiệu luôn về lombox
https://viblo.asia/p/tat-tan-tat-ve-mo-hinh-mvc-Rk74avjAJeO
https://viblo.asia/p/cung-tim-hieu-ve-http-request-methods-djeZ1xBoKWz
## Buoi 3: Giới thiệu về responsebody(Phan biet controller,restcontroller) + form
### 1. Request Mapping(tiep)
- Request Param : Lấy các giá trị khác nhau của ô input. Thuộc tính name của ô input => Lấy giá trị của ô param đấy
- PathVariable:Lấy các giá trị trên đường dẫn url.
- ModelAttribute: Spring tự tạo đối tượng với constructor không tham số và gán cho đối
  số có @ModelAttribute
- Databinding là sự kết nối dữ liệu của bean trong Model vào các Điều khiển form và ngược lại.
### 2. Controller và RestController
Controller trong ứng dụng Spring Boot là nơi tiếp nhận request và trả về response cho client. Có thể hiểu controller chính là lớp trung gian giữa server của bạn và bên ngoài.
<br/>
Về mặt code, Controller chỉ đơn thuần là một bean được đánh dấu với @Controller hoặc @RestController.
<br/>
Trong Spring Boot, có hai dạng Controller, tương ứng hai annotation trên:
<br/>
@Controller có thể trả về View qua một String hoặc JSON data trong response body (nếu được chỉ định). Thích hợp cho các controller có routing, chuyển trang các kiểu.
@RestController chỉ có thể trả về data trong response body. Thích hợp cho các controller để cung cấp API.
<br/>
https://viblo.asia/p/spring-boot-xu-ly-request-trong-controller-nhu-the-nao-phan-1-gGJ59ANj5X2
## Buổi 4: Validator
https://viblo.asia/p/dung-validation-bang-tay-trong-spring-boot-phan-1-3P0lPGyoZox
https://techmaster.vn/posts/36877/xac-thuc-request-bang-spring-boot-validation
@NotNull – kiểm tra giá trị null<br/>
@AssertTrue – kiểm tra giá trị thuộc tính là true<br/>
@Size – kiểm tra độ dài min and max<br/>
@Min – kiểm tra giá trị nhỏ nhất<br/>
@Max – Kiểm tra giá trị lớn nhất<br/>
@Email – kiểm tra email có hợp lệ<br/>
@NotEmpty – kiểm tra không được trống và empty<br/>
@NotBlank – kiểm tra giá trị không được null hoặc khoảng trắng<br/>
@Positive and @PositiveOrZero – kiểm tra chỉ được phép là số nguyên dương từ 0 trở đi<br/>
@Negative and @NegativeOrZero – kiểm tra số âm<br/>
@Past and @PastOrPresent – kiểm tra ngày từ quá khứ đến hiện tại.<br/>
@Future and @FutureOrPresent – kiểm tra ngày từ hiện tại đến tương lai<br/>