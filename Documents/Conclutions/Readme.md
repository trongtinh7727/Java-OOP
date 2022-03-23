# Modifier
|Access Modifier| trong cùng 1 lớp	|cùng package |ngoài package nhưng thông qua kế thừa	|ngoài package|
|------|----------|---------|-------|------|
|Private|	Y|	N|	N|	N|
|Default|	Y|	Y|	N|	N|
|Protected|	Y|	Y|	Y|	N|
|Public|	Y|	Y|	Y|	Y|

`packege`: nhóm các lớp có cùng điểm chung

# Method
- Có 2 loại:
    - static (class) method: không cần khởi tạo đối tượng, sử dụng trực tiếp tê class để truy xuất đến.
    - non-static (instance/object) method: cần khởi tạo 1 đối tượng, truy xuất đén method thong qa đối tượng đó

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
- Vd: overriding
# Polymorphism - Tính đa hình
- Tính đa hình ở đây được hiểu là đa hình thái, ví dụ cùng 1 method nhưng tùy vào tham số truyền vào hoặc cài đặt ở lớp con mà nó thực hiện các phép toán khác nhau.

- Vd: oeverloading

# Contructor 
- Default Constructor
- Parameterized Constructor
- Copy Constructor