
/* 헤더바 스크롤 내리면 사라지고 올리면 나타나는 스크립트 */
var lastScrollTop = 0;

$(window).scroll(function(){
    var scrollTop = $(this).scrollTop(); /* 스크롤바 수직 위치를 가져옵니다, 괄호 안에 값(value)이 있을 경우 수직 위치를 정합니다. */
        // scrollTop - 선택한 요소의 스크롤바 수직 위치를 반환하거나 스크롤바 수직 위치를 정하는 메소드
    
    if(scrollTop >= 100) { // 숫자에 따라 아래로 스크롤 했을 때 사라지는 영역의 크기가 바뀝니다.
        if ((scrollTop > lastScrollTop) && (lastScrollTop>0)) { /* &&: AND, 두 값이 모두 참이어야 값이 출력 */
            /* 화면에 나오지 않을 때: top값을 마이너스로 요소가 보이지 않게 사용해야함 */
            $("#header").css("top","-100px");
        } else {
            $("#header").css("top","0px");
        }

        lastScrollTop = scrollTop;
    } 

    $(".content").each(function () {
        var contentIndex = $(this).attr("id");
        if(scrollTop >= $(this).offset().top) {
            $(".scroll_03 a").removeClass("on");
            $(".scroll_03 a[href=#"+contentIndex+"]").addClass("on");
        }
    })
});

/* 메인화면 페이드인 후 메인텍스트 페이드인 */
$(document).ready( function() {
    $("#main_1").fadeIn( 1000, function() {
        $("#titleText").fadeIn(2500);
    } );
  } );

// $(function(){
//     $("#main_1").fadeIn(3000);
// })

// /* 메인텍스트 페이드인 효과 */
// $(function(){
//     $("#titleText").fadeIn(3000);
// })

/* 서브컨텐츠들 페이드인효과 */
/* 서브컨텐츠 첫번째 효과*/
$(document).ready(function() {
    $(window).scroll( function(){
        $("#sub1").each( function(i){
            
            var bottom_of_element = $(this).offset().top + $(this).outerHeight();
            var bottom_of_window = $(window).scrollTop() + $(window).height();
            
            if( bottom_of_window > bottom_of_element ){
                $(this).animate({'opacity':'1','margin-left':'0px'},1000);
            }
            
        }); 
    });
});

/* 나머지 서브컨텐츠 효과 */ 
AOS.init();
