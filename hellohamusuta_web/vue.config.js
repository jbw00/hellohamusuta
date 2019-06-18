module.exports = {
    devServer: {
        open: true,
        port: 8088,
        // Paths
        proxy: 'http://192.168.1.12:8011/hamusuta'
    }
}