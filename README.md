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