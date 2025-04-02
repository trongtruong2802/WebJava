document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("productForm").addEventListener("submit", function (event) {
        let isValid = true; // Cờ kiểm tra dữ liệu hợp lệ

        // Lấy các phần tử input
        let title = document.getElementById("title");
        let description = document.getElementById("description");
        let category = document.getElementById("category");
        let price = document.getElementById("price");
        let file = document.getElementById("file");

        // Kiểm tra từng trường
        if (title.value.trim() === "") {
            document.getElementById("titleError").classList.remove("d-none");
            isValid = false;
        } else {
            document.getElementById("titleError").classList.add("d-none");
        }

        if (description.value.trim() === "") {
            document.getElementById("descError").classList.remove("d-none");
            isValid = false;
        } else {
            document.getElementById("descError").classList.add("d-none");
        }

        if (category.value.trim() === "") {
            document.getElementById("categoryError").classList.remove("d-none");
            isValid = false;
        } else {
            document.getElementById("categoryError").classList.add("d-none");
        }

        if (price.value.trim() === "") {
            document.getElementById("priceError").classList.remove("d-none");
            isValid = false;
        } else {
            document.getElementById("priceError").classList.add("d-none");
        }

        if (file.value.trim() === "") {
            document.getElementById("fileError").classList.remove("d-none");
            isValid = false;
        } else {
            document.getElementById("fileError").classList.add("d-none");
        }

        // Nếu có lỗi, ngăn form submit
        if (!isValid) {
            event.preventDefault();
        }
    });
});
