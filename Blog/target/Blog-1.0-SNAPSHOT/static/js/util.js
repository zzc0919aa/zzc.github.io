/**
 * 获取地址栏参数
 * @type {URLSearchParams}
 */
window.onload = function () {
    let params = new URL(location.href).searchParams;
    let [message] = [params.get('message')]
    console.log(message)
    document.querySelector('#message').innerHTML = message
}
