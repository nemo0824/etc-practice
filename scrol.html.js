const saTitle = document.getElementsByClassName('sa-title')[0];
const saIntro = document.getElementsByClassName('sa-intro');
const saCount = document.getElementsByClassName('sa-count')[0];
const saCountBg = document.getElementsByClassName('sa-count-bg')[0];
const saAppBg = document.getElementsByClassName('sa-app-bg')[0];
const saAppText = document.getElementsByClassName('sa-app-text')[0];
const saAppImg = document.getElementsByClassName('sa-app-img')[0];



setTimeout(() => {
    saTitle.classList.remove('mv-top-title');
    saTitle.classList.add('show');
}, 200);



setTimeout(() => {
    saAppText.classList.add('show-opacity');
}, 800);

setTimeout(() => {
    saAppBg.classList.remove('mv-left-bg');
}, 1000);

setTimeout(() => {
    saAppImg.classList.add('show-opacity');
}, 1300);



window.addEventListener('scroll', () => {
    for(let i = 0; i < saIntro.length; i++){
        if(saIntro[i].getBoundingClientRect().top - window.innerHeight < 0){
            saIntro[i].classList.remove('mv-left-intro');
            saIntro[i].classList.add('show');
        }
    }

    if(saCountBg.getBoundingClientRect().top - window.innerHeight < 0){
        saCountBg.classList.remove('mv-left-bg');
    }
})
