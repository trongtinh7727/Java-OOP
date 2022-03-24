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

# Class
- service class: cung cấp các dịch vụ chức năng cho client class, bao gồm các thuộc tính và method
- client class: phải có main method, sử dụng các dịch vụ do service class cung cấp

# Encapsulation - Tính đóng gói
- Đóng gói ở đây là đóng gói các biến, method thành các class; đóng gói các class thành 1 package…
- Giúp che giấu thông tin, đảm bảo sự toàn vẹn dữ liệu, bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay để giá trị các thuộc tính hay có thể truy cập trực tiếp.
# Inheritance - Tính kế thừa
- Sử dụng lại các thuộc tính, method sẵn có từ các class khác mà không phải xây dựng từ đầu.
# Abstract - Tính trừu tượng
- Từ mô tả, ta tự định nghĩa ra các thuộc tính, method của đối tượng

# Polymorphism - Tính đa hình
- Tính đa hình ở đây được hiểu là đa hình thái, ví dụ cùng 1 method nhưng tùy vào tham số truyền vào hoặc cài đặt ở lớp con mà nó thực hiện các phép toán khác nhau.

- Vd: oeverloading, overriding
# Contructor 
- Default Constructor
- Parameterized Constructor
- Copy Constructor

# Ví dụ

![](https://niithanoi.edu.vn/pic/Product/images/tutorials/vi-du-ve-abstraction-trong-lap-trinh-huong-doi-tuong-trong-java-1.jpg)

- Tạo ra 1  abstract class Animal có tên và phương thức say(),abstract class này thể hiện tính trừu tượng, có nghĩa ta định ra rằng dù là con vật gì đi nữa thì nó cũng có phương thức say().
- Tạo 2 lớp cat và dog kế thừa từ lớp animal, sau đó định nghĩa lại phương thước say() trong cat và dog. Điều này thể hiện tính kế thừa(cat và dog đều có đặc điểm chung là say()), đóng gói (đóng gói biến tên và phương thức say() với nhau ), tính đa hình(cùng một phương thức say() nhưng mỗi con vật lại có cách kêu khác nhau)
