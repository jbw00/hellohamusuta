module.exports = {
    configureWebpack: {
        devServer: {
            open: true,
            port: 8088,
            before(app) {
                //mock接口
                //调试文章类型
                app.get('/api/getArticleType', (req, res) => {
                    res.json({
                        success: true,
                        options: [
                            {
                                value: "选项1",
                                label: "日语"
                            },
                            {
                                value: "选项2",
                                label: "音乐"
                            },
                            {
                                value: "选项3",
                                label: "技术"
                            },
                            {
                                value: "选项4",
                                label: "小说"
                            },
                            {
                                value: "选项5",
                                label: "摄影"
                            }
                        ]
                    })
                }),

                    //调试文章
                    app.post('/api/testartic', (req, res) => {
                        const message = req.query;
                        res.json({
                            success: true,
                            message: message
                        })
                    })
            }
        }
    }
}
