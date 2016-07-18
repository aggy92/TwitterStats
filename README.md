# TwitterStats
Usługa została postawiona przy użyciu Spring Boota, z wykorzystaniem streaming API Twittera.


Docker: <a href=https://hub.docker.com/r/aggy/scratch/>https://hub.docker.com/r/aggy/scratch/</a><br>
Usługę uruchamiamy komendą <b>'docker run aggy/scratch'</b>.

Wystawione api(u mnie domyślnie 192.168.99.100):<br>
1. Sprawdzenie statusu połączenia<br>
http://192.168.99.100:8080/status<br>
2. Pobranie statystyk uzytkownikow<br>
http://192.168.99.100:8080/stats/user?name=nazwa_uzytkownika // informacje dotyczace podanego uzytkownika<br>
http://192.168.99.100:8080/stats/user/all                    // informacje dotyczące wszystkich użytkowników<br>
http://192.168.99.100:8080/stats/userDetailed?name=nazwa_uzytkownika //rozszerzone informacje dotyczace podanego uzytkownika<br>
http://192.168.99.100:8080/stats/userDetailed/all //rozszerzone informacje dotyczące wszystkich użytkowników<br><br>
Zrzut z Travisa:<br>
<a href='https://postimg.org/image/ej0fricd3/' target='_blank'><img src='https://s31.postimg.org/ej0fricd3/travis.png' border='0' alt='postimage'/></a>
