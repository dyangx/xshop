function login() {
    $('#err').html('');
    var username = $.trim($('#username').val());
    var pwd = $.trim($('#pwd').val());
    var yzm = $.trim($('#vcode').val());
    if (!username) {
        $('#err').html('用户名不能为空');
        return;
    }
    if (!pwd) {
        $('#err').html('密码不能为空');
        return;
    }
    if (!yzm) {
        $('#err').html('验证码不能为空');
        return;
    }
    $.ajax({
        dataType: 'json',
        type: 'post',
        data: {username: username, password: pwd, vcode: yzm},
        url: '/xshop/account/dologin.json',
        success: function (data) {
            if(data.code == 100){

            }else{
                $('#err').html(data.msg);
                $('#yzm').click();
            }
        }
    });
}
