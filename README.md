  Ticket Yönetim Uygulaması

Ticket Yönetim Uygulaması
=========================

Bu proje, Spring Cloud altyapısı kullanılarak geliştirilmiş bir mikroservis uygulamasıdır. Aşağıda projenin detayları bulunmaktadır:

Amaç
----

Bu uygulama, kullanıcıların ticket oluşturabileceği ve yönetebileceği bir sistem sağlar. Spring Cloud kullanılarak, dağıtık sistemler arası iletişim sağlanmıştır.

Kullanılan Teknolojiler
-----------------------

*   Spring Boot
*   Spring Cloud (Feign Client, API Gateway)
*   MySQL
*   Cassandra
*   Docker
*   Maven

Özellikler
----------

*   **Account Servisi:** Kullanıcı hesaplarının yönetildiği servis. MySQL veritabanını kullanır.
*   **Ticket Servisi:** Kullanıcıların ticketlerini oluşturduğu ve yönettiği servis. Cassandra veritabanını kullanır.
*   **API Gateway:** Gelen istekleri yönlendirir ve güvenlik katmanı sağlar.
*   **Spring Boot Admin:** Uygulamaların durumunu izlemek ve yönetmek için bir araç.
*   **Docker:** Uygulamaların konteynerize edilmesi ve dağıtılması için kullanılır.

Kullanım
--------

1.  Projeyi klonlayın: `git clone https://github.com/sizin-kullanici-adi/sizin-proje-adi.git`
2.  Ana dizine gidin: `cd your-project-directory`
3.  Docker kullanarak gerekli servisleri başlatın: `docker-compose up -d`
4.  Ticket Servisi'ni başlatın: `cd ticket-service && mvn spring-boot:run`
5.  Account Servisi'ni başlatın: `cd account-service && mvn spring-boot:run`
6.  API Gateway'yi başlatın: `cd api-gateway && mvn spring-boot:run`
7.  Spring Boot Admin Panelini başlatın: `cd spring-boot-admin && mvn spring-boot:run`

Uygulamayı başlattıktan sonra, tarayıcınızdan [localhost:8088](http://localhost:8088) adresine giderek API Gateway aracılığıyla uygulamaya erişebilirsiniz.

Katkıda Bulunma
---------------

Katkılarınızı memnuniyetle karşılıyoruz! Projeye katkıda bulunmak istiyorsanız, lütfen aşağıdaki adımları izleyin:

1.  Bu projeyi forklayın.
2.  Yeni bir branch oluşturun: `git checkout -b feature/branch-name`
3.  Değişikliklerinizi yapın ve bunları commit edin: `git commit -am 'Add some feature'`
4.  Branch'inizi kendi fork'ünüze pushlayın: `git push origin feature/branch-name`
5.  Bir Pull Request oluşturun.

İletişim
--------

Eğer bir sorunuz varsa, lütfen enessisik@hotmail.com adresinden benimle iletişime geçiniz.
