# OOP:
    - Lấy đối tượng làm nền tảng để xây dựng các giải thuật, dựa trên cấu trúc class và object

# Đối tượng: 
    - Thực thể có thuộc tính và hành vi

# Lớp đối tượng:
    - Tập hợp nhiều đối tượng có các đặc tính giống nhau.
# Modifier
|Access Modifier| trong cùng 1 lớp	|cùng package |ngoài package nhưng thông qua kế thừa	|ngoài package|
|------|----------|---------|-------|------|
|Private|	Y|	N|	N|	N|
|Default|	Y|	Y|	N|	N|
|Protected|	Y|	Y|	Y|	N|
|Public|	Y|	Y|	Y|	Y|

`packege`: nhóm các lớp có cùng điểm chung

# Method
- Accessor: để truy cập (truy xuất) các giá trị của các thuộc tính
- Mutator: để thay đổi (sửa đổi) các giá trị của thuộc tính
- Contructor: phương thức đặt biệt để khởi tạo đối tượng

# Class
- service class: cung cấp các dịch vụ chức năng cho client class, bao gồm các thuộc tính và method
- client class: phải có main method, sử dụng các dịch vụ do service class cung cấp

# Encapsulation - Tính đóng gói
- Đóng gói ở đây là đóng gói các biến, method thành các class; đóng gói các class thành 1 package…
- Giúp che giấu thông tin, đảm bảo sự toàn vẹn dữ liệu, bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay để giá trị các thuộc tính hay có thể truy cập trực tiếp.
# Inheritance - Tính kế thừa
- Sử dụng lại các thuộc tính, method sẵn có từ các class khác mà không phải xây dựng từ đầu.
- Sử dụng từ khóa extends.
- Lớp con sẽ kế thừa toàn bộ thuộc tính có phạm vi truy cập từ protected của lớp cha.
- Sử dụng từ khóa final để chặn kế thừa.
# Abstract - Tính trừu tượng
- Tập trung vào việc đối tượng muốn làm gì chứ không tập trung vào cách nó thực hiện
- Là quá trình ẩn đi những thứ phức tạp và chỉ hiển thị ra nhưng thông tin cần thiết cho user
- Cách để đạt tính trừu tượng:
    - Trừu tượng 1 phần (0-100%): `abstract class`
    - Trừu tượng toàn phần (100%): `interface`
- Lợi ích:
    - Giảm độ phức tạp
    - Tăng khả năng bảo mật
    - Dễ dàng bảo trì

- Interface: 
    - Xác định các hành vi thông dụng cho 1 tập các lớp
    - Một nhóm các `method` liên quan với nhau
    - Khai báo bằng từ khóa `interface`
    - Không phải là 1 lớp
    - Dùng từ khóa `implements` để triển khai interface trong class

- Abstract class:
    - sử dụng từ khóa `abstract` để khai báo 1 lớp trừu tượng
    - Bao gồm các `abstract method` và `non-abstract method`
    - Phải được kế thừa (`extends`) và triển khai toàn bộ các `abstract method`.
    - Không thể khởi tạo 1 đối tượng trực tiếp từ `abstract class`.
    - Có thể có constructor

- Abstract method:
    - Sử dụng từ khóa `abstract` để khai báo 1 phương thức trừu tượng
    - Không có phần triển khải (body)

- Ví dụ: Khi gửi tin nhắn SMS người dùng được biết nơi nhập tin nhắn, người nhận và bấm vào nút nào để gửi còn quá trình tin nhắn được gửi đi ntn đã được ẩn đi và người dùng chỉ biết được tin nhắn đã được gửi đi thành công chưa.

# Polymorphism - Tính đa hình
- Tính đa hình ở đây được hiểu là đa hình thái, ví dụ cùng 1 method nhưng tùy vào tham số truyền vào hoặc cài đặt ở lớp con mà nó thực hiện các phép toán khác nhau.

- Vd: oeverloading, overriding
# Contructor 
- Default Constructor
- Parameterized Constructor
- Copy Constructor

# Super
- Dùng khởi tạo contructor của subclass thông qua contructor của superclass
- Dùng để gọi các phương thức của superclass gần nhất

# Overriding
- Định nghĩa lại phương thức trong qúa trình phát triển

# Ví dụ

![](https://niithanoi.edu.vn/pic/Product/images/tutorials/vi-du-ve-abstraction-trong-lap-trinh-huong-doi-tuong-trong-java-1.jpg)

- Tạo ra 1  abstract class Animal có tên và phương thức say(),abstract class này thể hiện tính trừu tượng, có nghĩa ta định ra rằng dù là con vật gì đi nữa thì nó cũng có phương thức say().
- Tạo 2 lớp cat và dog kế thừa từ lớp animal, sau đó định nghĩa lại phương thước say() trong cat và dog. Điều này thể hiện tính kế thừa(cat và dog đều có đặc điểm chung là say()), đóng gói (đóng gói biến tên và phương thức say() với nhau ), tính đa hình(cùng một phương thức say() nhưng mỗi con vật lại có cách kêu khác nhau)
