module.exports = {
    devServer: {
        open: true,
        port: 8088,
        // Paths
        //company
        proxy: 'http://192.168.1.12:8011/hamusuta'
        //home
        //proxy: 'http://192.168.1.119:8011/hamusuta'
    }
}