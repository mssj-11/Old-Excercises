/* Operaciones de E/S bloqueantes */
var urls = db.query("select * from urls");  //  Esperar

urls.each(function (url) {
    var page = http.get(url);  //  Esperar
    save(page);  //  Esperar
});



/* Operaciones de E/S no bloqueantes, peticion asincrona */
db.query("select * from urls", function(urls) {

    url.each(function(url) {

        http.get(url, function(page) {
            save(page);
        });
    });
});