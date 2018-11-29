// function f() {
//     var id=document.getElementById("lampId");
//     if(id<=0 || id>5){
//         alert("没有当前路灯号");
//         document.getElementById("submit").disabled = true;
//     }else {
//         document.getElementById("submit").disabled = false;
//     }
// }

document.addEventListener('DOMContentLoaded', function () {
    // var reinput = document.getElementById('reinput');
    var id = document.getElementById('lampId');
    id.addEventListener('blur', function () {
        if (id.value >5 || id.value<=0) {
            alert('没有当前的路灯号');
            document.getElementById("bt1").disabled=true;
        }else{
            document.getElementById("bt1").disabled=false;
        }
    })
})

document.addEventListener('DOMContentLoaded', function () {
    // var reinput = document.getElementById('reinput');
    var id = document.getElementById('carId');
    id.addEventListener('blur', function () {
        if (id.value >5 || id.value<=0) {
            alert('没有当前的路灯号');
            document.getElementById("bt2").disabled=true;
        }else{
            document.getElementById("bt2").disabled=false;
        }
    })
})


