Spring Bean
* Bean
 - Trong Spring, các đối tượng tạo thành xương sống của ứng dụng của bạn và được quản lý bởi
  bộ chứa Spring IoC được gọi là các bean. Bean là một đối tượng được khởi tạo, lắp ráp và quản lý bởi bộ chứa Spring IoC
 * Spring IoC
   -IoC Container là thành phần thực hiện IoC.

    Trong Spring, Spring Container (IoC Container) sẽ tạo các đối tượng, lắp rắp chúng lại với nhau, cấu hình các đối
    tượng và quản lý vòng đời của chúng từ lúc tạo ra cho đến lúc bị hủy.

    Spring container sử dụng DI để quản lý các thành phần, đối tượng để tạo nên 1 ứng dụng. Các thành phần, đối tượng
    này gọi là Spring Bean (mình sẽ nói về Spring Bean trong các bài sau)

    Để tạo đối tượng, cấu hình, lắp rắp chúng, Spring Container sẽ đọc thông tin từ các file xml và thực thi chúng.
     * IoC
      - IoC(Inversion of Control): Đảo ngược điều khiển, nó giúp làm thay đổi luồng điều khiển của chương trình một cách
       linh hoạt.

        Thường dùng với Denpendency Injection.
      * Denpendency Injection
       -Dependency Inject là 1 kỹ thuật, 1 design pattern cho phép xóa bỏ sự phụ thuộc hard-code và làm cho ứng dụng
       của bạn dễ mở rộng và maintain hơn.