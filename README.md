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

## Buổi 5: Bean, DI, IOC
### 1. Khái niệm ràng buộc tight-coupling
tight-coupling hay "liên kết ràng buộc" là một khái niệm trong Java ám chỉ việc mối quan hệ
giữa các Class quá chặt chẽ.
Khi yêu cầu thay đổi logic hay một class bị lỗi sẽ dẫn tới ảnh hưởng tới toàn bộ các Class khác.
<br/>
loosely-coupled là cách ám chỉ việc làm giảm bớt sự phụ thuộc giữa các Class với nhau.
https://loda.me/articles/core-khai-niem-tight-coupling-lien-ket-rang-buoc-va-cach-loosely-coupled
### 2. DI(Dependency Injection)
Dependency Injection is a design pattern
Khái niệm Dependency Injection từ đây mà ra~

Dependency Injection là việc các Object nên phụ thuộc vào các Abstract Class
và thể hiện chi tiết của nó sẽ được Inject vào đối tượng lúc runtime.
Bây giờ muốn Girl mặc gì khác, bạn chỉ cần tạo một Class kế thừa Outfit
và Inject (dịch là Tiêm vào cũng được) nó vào Girl là xong!

Các cách để Inject dependency vào một đối tượng có thể kể đến như sau:

Constructor Injection: Cái này chính là ví dụ của mình, tiêm dependency ngay vào Contructor cho tiện.
Setter Injection: Ồ, sao không chứ  chúng ta học về Setter từ những bài học vỡ lòng rồi, quá hợp lý.
Xài girl.setOutfit(new Naked()) 😈
Interface Injection: Mỗi Class muốn inject cái gì,
thì phải implement một Interface có chứa một hàm inject(xx)
(Gần như thay thế cho setter ý bạn). Rồi bạn muốn inject gì đó thì gọi cái hàm inject(xx) ra.
Cách này hơi dài và khó cho người mới.
https://loda.me/articles/core-gii-thch-dependency-injection-di-v-ioc-bng-ngc-trinh

### 3.IOC (Inversion of Control)
Dependency Injection giúp chúng ta dễ dàng mở rộng code và giảm sự phụ thuộc giữa các dependency với nhau.
Tuy nhiên, lúc này, khi code bạn sẽ phải kiêm thêm nhiệm vụ Inject dependency (tiêm sự phụ thuộc).
Thử tưởng tượng một Class có hàng chục dependency thì bạn sẽ phải tự tay inject từng ý cái.
Việc này lại dẫn tới khó khăn trong việc code, quản lý code và dependency
<br/>
Đối với Java thì có một số Framework hỗ trợ chúng ta Inversion of Control (IOC), trong đó nổi bật có:
<br/>
Spring framework
<br/>
Google Guice
<br/>
Spring framework là một framework từ những ngày đầu,
ra đời để hiện thực ý tưởng Inversion of Control (IOC),
tuy nhiên, theo thời gian, Spring lớn mạnh và trở thành một hệ sinh thái rộng lớn phục vụ
rất nhiều chức năng trên nền tảng IoC này.
<br/>
Google Guice ra đời sau và tập trung vào nhiệm vụ DI thôi.
<br/>
Spring là một framework được xây dựng dựa trên nguyên lý Dependency injection.
Bản thân Spring có chứa IoC container, có nhiệm vụ tạo và quản lý các module:

IoC container của Spring gọi là Application context
Các module chứa trong IoC container được Spring gọi là các Bean
Spring Boot sử dụng các annotation
dạng như @Component để đánh dấu lên class,
chỉ ra rằng class đó cần tạo một module.
Ngoài @Component, còn có các annotation khác như @Repository,
@Controlller, @Service,... cũng được đánh dấu là module.

Khi ứng dụng Spring Boot chạy, thì IoC container sẽ thực hiện quá trình như sau:

Quét tìm (scan) các class được đánh dấu là Bean,
và tạo một object singleton, bỏ vào IoC container
Khi có một Bean phụ thuộc vào Bean khác, thì IoC sẽ tìm trong container,
nếu chưa có thì tạo, nếu đã có thì lấy ra và inject vào bean cần nó

### 4. Vòng đời của Spring
https://loda.me/articles/sb3-spring-bean-life-cycle-postconstruct-va-predestroy

### 5. Kiến trúc trong Spring
Kiến trúc MVC trong Spring Boot được xây dựng dựa trên tư tưởng "độc lập"
kết hợp với các nguyên lý thiết kế hướng đối tượng (một đại diện tiêu biểu là Dependency Inversion).
Độc lập ở đây ám chỉ việc các layer phục vụ các mục đích nhất định,
khi muốn thực hiện một công việc ngoài phạm vi thì sẽ đưa công việc xuống các layer thấp hơn.
<br/>
Kiến trúc Controller-Service - Repository chia project thành 3 lớp:
<br/>
Consumer Layer hay Controller: là tầng giao tiếp với bên ngoài và handler các request từ bên ngoài tới hệ thống.
<br/>
Service Layer: Thực hiện các nghiệp vụ và xử lý logic
<br/>
Repository Layer: Chịu trách nhiệm giao tiếp với các DB, thiết bị lưu trữ,
xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu.

#### @Controller vs @Service vs @Repository
Để phục vụ cho kiến trúc ở trên, Spring Boot tạo ra 3 Annotation là @Controller vs @Service vs @Repository
để chúng ta có thể đánh dấu các tầng với nhau.

@Service Đánh dấu một Class là tầng Service, phục vụ các logic nghiệp vụ.
@Repository Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.
<br/>
Về bản chất @Service và @Repository cũng chính là @Component. Nhưng đặt tên khác nhau để giúp chúng ta phân biệt các tầng với nhau.
Tuy nhiên từ góc độ thiết kế thì chúng ta cần phân rõ 3 Annotation này cho các Class đảm nhiệm đúng nhiệm vụ của nó.
@Service gắn cho các Bean đảm nhiệm xử lý logic
<br/>
@Repository gắn cho các Bean đảm nhiệm giao tiếp với DB
<br/>
@Component gắn cho các Bean khác.
https://viblo.asia/p/dependency-injection-ap-dung-vao-spring-boot-nhu-the-nao-phan-2-3P0lP1wG5ox
https://loda.me/articles/sb4-component-vs-service-vs-repository#866437bcfef049c2a3cd66fc92f4568a
