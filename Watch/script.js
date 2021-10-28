const hour = document.getElementById('hr');
const minute = document.getElementById('min');
const second = document.getElementById('sec');

setInterval(()=>
{
    let date= new Date();
    let hr=date.getHours()*30;
    let min=date.getMinutes()*6;
    let sec=date.getSeconds()*6;//ghadi ki hands kaise run hogi uski calculation
    
    hour.style.transform=`rotateZ(${(hr)+(min/12)}deg)`;
    minute.style.transform=`rotateZ(${min}deg)`;
    second.style.transform=`rotateZ(${sec}deg)`;

})