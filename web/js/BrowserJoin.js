/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


// JavaScript code to handle Approve button
function approveMember(userId, eventID, listItem,approveButton) {
    // Thay đổi giao diện ngay lập tức
    listItem.innerHTML = 'Đã xét duyệt'; // Thay đổi nội dung của list item
    approveButton.style.display = 'none';
    // Gửi yêu cầu xét duyệt thành viên bằng AJAX (nếu cần)
    $.ajax({
        type: "POST",
        url: "ApproveMemberServlet", // Điều hướng đến servlet xử lý xét duyệt
        data: {userId: userId, eventID: eventID},
        // Truyền userId, eventID cho servlet
        success: function (data) {
            // Xử lý thành công (nếu cần)
            alert(data); // Hiển thị thông báo từ servlet (nếu có)
        },
        error: function (error) {
            // Xử lý lỗi (nếu cần)
            alert("Đã xảy ra lỗi khi xét duyệt thành viên.");
        },
    });
}

// JavaScript code to handle Reject button
function rejectMember(userId, eventID, listItem,approveButton) {
    // Thay đổi giao diện ngay lập tức
    listItem.innerHTML = 'Đã từ chối'; // Thay đổi nội dung của list item
    approveButton.style.display = 'none';
    // Gửi yêu cầu từ chối thành viên bằng AJAX (nếu cần)
    $.ajax({
        type: "POST",
        url: "RejectMemberServlet", // Điều hướng đến servlet xử lý từ chối
        data: {userId: userId, eventID: eventID}, // Truyền userId cho servlet
        success: function (data) {
            // Xử lý thành công (nếu cần)
            alert(data); // Hiển thị thông báo từ servlet (nếu có)
        },
        error: function (error) {
            // Xử lý lỗi (nếu cần)
            alert("Đã xảy ra lỗi khi từ chối thành viên.");
        },
    });
}
