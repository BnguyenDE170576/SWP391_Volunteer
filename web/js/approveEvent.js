/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$(document).ready(function () {
                // Xử lý khi nút "Detail" được nhấp
                $('.detail-button').click(function () {
                    var eventElement = $(this).closest('.list-group-item');
                    var eventName = eventElement.data('activityname');
                    var eventDescription = eventElement.data('description');
                    var eventStartDate = eventElement.data('startdate');
                    var eventEndDate = eventElement.data('enddate');
                    var eventMemberLimit = eventElement.data('memberlimit');
                    var eventLocation = eventElement.data('location');

                    // Cập nhật thông tin chi tiết sự kiện trong modal
                    $('#event-name').text(eventName);
                    $('#event-description').text(eventDescription);
                    $('#event-start-date').text(eventStartDate);
                    $('#event-end-date').text(eventEndDate);
                    $('#modal-memberLimit').text(eventMemberLimit);
                    $('#modal-location').text(eventLocation);

                    // Hiển thị modal
                    $('#eventModal').modal('show');
                });
            });
            // Xử lý khi nút "Xét Duyệt" được nhấp
            function approveEvent(eventID, thisItem, rejectButton) {
                thisItem.innerHTML = 'Đã xét duyệt'; 
                rejectButton.style.display = 'none';
                $.ajax({
                    type: "POST",
                    url: "ApproveControl", // Điều hướng đến servlet xử lý xét duyệt
                    data: {eId: eventID, check: "1"},
                    success: function (data) {
                        // Xử lý thành công (nếu cần)
                       
                    },
                    error: function (error) {
                        // Xử lý lỗi (nếu cần)
                        alert("Đã xảy ra lỗi khi xét duyệt hoạt động.");
                    },
                });
            }


            // Xử lý khi nút "Từ Chối" được nhấp
            function rejectEvent(eventID, thisItem, approveButton) {
                thisItem.innerHTML = 'Đã từ chối'; // Thay đổi nội dung của list item
                approveButton.style.display = 'none';
                $.ajax({
                    type: "POST",
                    url: "ApproveControl", // Điều hướng đến servlet xử lý từ chối
                    data: {eId: eventID, check: "2"}, // 
                    success: function (data) {
                        // Xử lý thành công (nếu cần)
                      
                    },
                    error: function (error) {
                        // Xử lý lỗi (nếu cần)
                        alert("Đã xảy ra lỗi khi từ chối hoạt động.");
                    },
                });
            }
