/*
调用接口
*/
function call(methodName, method, ver, data, successCallback) {
    data.methodName = methodName;
    data.method = method;
    data.ver = ver;
    var url = "/Services/Proxy.ashx?r=" + Math.random();
    $.ajax({
        url: url,
        dataType: "json",
        data: data,
        success: function (result) {
            if (result.isSuccessful) {
                successCallback(result);
            }
            else {
                if (result.data != undefined) {
                    alert(result.data.description);
                }
                else {
                    alert(result.description);
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            //alert(errorThrown);
        }
    });
}
