window.onload = function () {

    // 获取全选复选框
    let parent = document.querySelector('#parent');
    // 获取所有子复选框
    let child = document.querySelectorAll('#child input[type=checkbox]');
    /**
     * 全选功能
     */
    parent.addEventListener('click', () => {
        for (let i = 0; i < child.length; i++) {
            child[i].checked = parent.checked
        }
    })
    /**
     * 子复选框非全选中，则取消父复选框选中
     */
    for (let i = 0; i < child.length; i++) {
        child[i].addEventListener('click', () => {
            if (!child.checked) parent.checked = false;
        })
    }

    /**
     * 子复选框全选中后，父复选框选中
     */
    for (let i = 0; i < child.length; i++) {
        child[i].addEventListener('click', () => {
            for (let j = 0; j < child.length; j++) {
                if (!child[j].checked) {
                    parent.checked = false
                    break
                }
                parent.checked = true
            }
        })
    }



}