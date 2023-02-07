// 스크립트
// 페이지 영역 맞춰서 스크롤하는 스크립트
window.addEventListener("wheel", function(e){
e.preventDefault();
},{passive : false});



var mHtml = $("html");
var page = 1;


mHtml.animate({scrollTop : 0},10);

$(window).on("wheel", function(e) {
    if(mHtml.is(":animated")) return;
    if(e.originalEvent.deltaY > 0) {
        if(page == 5) return;
        page++;
    } else if(e.originalEvent.deltaY < 0) {
        if(page == 1) return;
        page--;
    }
    var posTop =(page-1) * $(window).height();
    mHtml.animate({scrollTop : posTop});
});



// 스크롤 버튼 스크립트
$(".downBtn").click(function(){
    $('html, body').animate({scrollTop:($('#content1').height())}, 550);
});  
