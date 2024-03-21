<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ticket Yönetim Uygulaması</title>
</head>
<body>
    <h1>Ticket Yönetim Uygulaması</h1>

    <p>Bu proje, Spring Cloud altyapısı kullanılarak geliştirilmiş bir mikroservis uygulamasıdır. Aşağıda projenin detayları bulunmaktadır:</p>

    <h2>Amaç</h2>
    <p>Bu uygulama, kullanıcıların ticket oluşturabileceği ve yönetebileceği bir sistem sağlar. Spring Cloud kullanılarak, dağıtık sistemler arası iletişim sağlanmıştır.</p>

    <h2>Kullanılan Teknolojiler</h2>
    <ul>
        <li>Spring Boot</li>
        <li>Spring Cloud (Feign Client, API Gateway)</li>
        <li>MySQL</li>
        <li>Cassandra</li>
        <li>Docker</li>
        <li>Maven</li>
    </ul>

    <h2>Özellikler</h2>
    <ul>
        <li><strong>Account Servisi:</strong> Kullanıcı hesaplarının yönetildiği servis. MySQL veritabanını kullanır.</li>
        <li><strong>Ticket Servisi:</strong> Kullanıcıların ticketlerini oluşturduğu ve yönettiği servis. Cassandra veritabanını kullanır.</li>
        <li><strong>API Gateway:</strong> Gelen istekleri yönlendirir ve güvenlik katmanı sağlar.</li>
        <li><strong>Spring Boot Admin:</strong> Uygulamaların durumunu izlemek ve yönetmek için bir araç.</li>
        <li><strong>Docker:</strong> Uygulamaların konteynerize edilmesi ve dağıtılması için kullanılır.</li>
    </ul>

    <h2>Kullanım</h2>
    <ol>
        <li>Projeyi klonlayın: <code>git clone https://github.com/sizin-kullanici-adi/sizin-proje-adi.git</code></li>
        <li>Ana dizine gidin: <code>cd your-project-directory</code></li>
        <li>Docker kullanarak gerekli servisleri başlatın: <code>docker-compose up -d</code></li>
        <li>Ticket Servisi'ni başlatın: <code>cd ticket-service &amp;&amp; mvn spring-boot:run</code></li>
        <li>Account Servisi'ni başlatın: <code>cd account-service &amp;&amp; mvn spring-boot:run</code></li>
        <li>API Gateway'yi başlatın: <code>cd api-gateway &amp;&amp; mvn spring-boot:run</code></li>
        <li>Spring Boot Admin Panelini başlatın: <code>cd spring-boot-admin &amp;&amp; mvn spring-boot:run</code></li>
    </ol>

    <p>Uygulamayı başlattıktan sonra, tarayıcınızdan <a href="http://localhost:8080">localhost:8080</a> adresine giderek API Gateway aracılığıyla uygulamaya erişebilirsiniz.</p>

    <h2>Katkıda Bulunma</h2>
    <p>Katkılarınızı memnuniyetle karşılıyoruz! Projeye katkıda bulunmak istiyorsanız, lütfen aşağıdaki adımları izleyin:</p>
    <ol>
        <li>Bu projeyi forklayın.</li>
        <li>Yeni bir branch oluşturun: <code>git checkout -b feature/branch-name</code></li>
        <li>Değişikliklerinizi yapın ve bunları commit edin: <code>git commit -am 'Add some feature'</code></li>
        <li>Branch'inizi kendi fork'ünüze pushlayın: <code>git push origin feature/branch-name</code></li>
        <li>Bir Pull Request oluşturun.</li>
    </ol>

    <h2>Lisans</h2>
    <p>Bu proje MIT Lisansı altında lisanslanmıştır. Detaylı bilgi için <a href="LICENSE">LICENSE</a> dosyasına bakınız.</p>

    <h2>İletişim</h2>
    <p>Eğer bir sorunuz varsa, lütfen [sizin-emailiniz] adresinden benimle iletişime geçiniz.</p>
</body>
</html>
