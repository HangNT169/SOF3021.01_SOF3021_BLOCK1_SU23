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

## Buoi 8: JPA (basic)
https://hangnt169.github.io/2022-11-05-crud-spring-boot/
https://stackjava.com/spring/so-sanh-phan-biet-crudrepository-voi-jparepository-trong-spring-data.html
https://viblo.asia/p/spring-boot-12-spring-jpa-method-atquery-Qbq5Q4nGlD8

## Buôi 9: JPA (advance)
https://viblo.asia/p/spring-boot-12-spring-jpa-method-atquery-Qbq5Q4nGlD8

## Buoi 10: Schedule
https://www.baeldung.com/spring-scheduled-tasks
https://viblo.asia/p/scheduling-task-trong-spring-boot-yMnKMy2QK7P