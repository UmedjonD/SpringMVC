<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang = "en">

<head>
    <meta charset="UTF-8">
    <title>Products</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>

<body>
    <!-- мое ммя и кнопка для выхода -->
    <div class="myname">
        <h5>"${user.getLogin()}"</h5>
        <input type="button" value=" Нажми меня нежно" onclick="javascript:window.location='index'">
    </div>

    <div class="exit">
            <!--<input type="button" value="выход" onclick="javascript:window.location='index'">-->
    </div>
    <div class="books">
        <h3>Books</h3>
        <hr>
    </div>

    <!-- Корзина -->


    <div class="search">

        <input type="text" placeholder="поиск..." autocomplete="off" id = "qq">

        <div id="zatemnenie2">
            <div id="okno2">
                <div class="hhhh"><a href="#" class="close"><b>X</b></a></div>

                <div class="inserach">ПОИСК</div><hr><br>
                <input id="inserch2" type="text" width="20%"/><br><br>
                <button type="submit">найти</button>
            </div>
    </div>

        <a href="#zatemnenie2">
            <input type="submit" value="искать">
        </a>


         <div id="zatemnenie">
                        <div id="okno">
                                <div class="hhhh">Закрыть
                            <a href="#" class="close"><b>X</b></a>
                            </div>

                            <div id="okno_elements">
                                <table id="okno_elements_table" style="width:100%" cellspacing="0"></table>
                            </div>
                            <div class="pole">
                                <div class="oformit">
                                    <input class="add" type="button" value="Оформить">
                                </div>

                                <div id="suka">Сумма:</div>
                                <div id="summa">0</div>
                                <div id="blyat">Скидка:</div>
                                <div id="skidka">0</div>
                                <div id="nahoi">Итого:</div>
                                <div id="itogo">0</div>
                            </div>
                        </div>
                </div>

        <a href="#zatemnenie">
            <input type="submit" value="Корзина">
            <span id="count">0</span>
        </a>


    </div>
    <br>
    <!-- Отсюда книги -->
    <p>Рады приветствовать <span>Вас</span> в нашем книжном интернет магазине. Здесь Вы найдете огромное количество интереснейших книжных изданий</p>
    <div class="img">


            <div id="viewed"></div>

         <c:forEach var = "product" items = "${Products}">

                    <div class="product_detail">

                        <table style="width: 100%">
                                    <tbody>
                                        <tr>
                                            <td>
                                                <!--<img src="${product.getUrl()}" />-->

                                            </td>
                                            <td>
                                                    <div class="name"><b>"${product.getNameBook()}"</b></div>
                                            </td>
                                            <td>

                                                       "${product.getPrice()}"
                                            </td>
                                            <td>
                                                    <div class="price">"${product.getNameBook()}"</div>
                                            </td>
                                            <td>
                                                    <div class="add"> <input type="button" value="Положить в корзину"></div>
                                            </td>
                                        </tr>
                                    </tbody>
                        </table>
                    </div>
         </c:forEach>


    <br>
    <div class="categories2"><b>Категория Фентези</b></div>

    <div class="product" onclick="product1(this);">
        <img src="https://cdn.eksmo.ru/v2/ITD000000000895639/COVER/cover1__w220.jpg" >
        <div class="name-item">Irka Khortisa</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://cdn.eksmo.ru/v2/ITD000000000895639/COVER/cover1__w220.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="https://i.pinimg.com/originals/87/e7/4f/87e74f2d9ff647eeb71a2573f238ceb2.jpg" >
        <div class="name-item">Opasno</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://i.pinimg.com/originals/87/e7/4f/87e74f2d9ff647eeb71a2573f238ceb2.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="http://samlib.ru/img/s/sychewa_anastasija_wiktorowna/chasperedrassvetom/chperasv7759.jpg" >
        <div class="name-item">Derzki</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="http://samlib.ru/img/s/sychewa_anastasija_wiktorowna/chasperedrassvetom/chperasv7759.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxGUz1UJKvKlRxtObZ7KukE-USDz83rRWW_Km2Mwdxc8h2vg1YFQ" >
        <div class="name-item">Kak pulya</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxGUz1UJKvKlRxtObZ7KukE-USDz83rRWW_Km2Mwdxc8h2vg1YFQ" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="http://pooha.net/images/fantasy-books-7.jpg" >
        <div class="name-item">Rezki</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="http://pooha.net/images/fantasy-books-7.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="https://cs8.pikabu.ru/post_img/2016/10/03/5/14754813942919801.jpg" >
        <div class="name-item">Svoi</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://cs8.pikabu.ru/post_img/2016/10/03/5/14754813942919801.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="https://i.pinimg.com/originals/87/e7/4f/87e74f2d9ff647eeb71a2573f238ceb2.jpg" >
        <div class="name-item">Galina</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://i.pinimg.com/originals/87/e7/4f/87e74f2d9ff647eeb71a2573f238ceb2.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtrp0x5kU-Tmi7exgwIy9ISotWD7UvVqEBCxXkR9oEzNH_xD8_" >
        <div class="name-item">Irka Galina</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtrp0x5kU-Tmi7exgwIy9ISotWD7UvVqEBCxXkR9oEzNH_xD8_" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <div class="product" onclick="product1(this);">
        <img src="http://www.knor.ru/shop/pictb/25/06/2506141.jpg" >
        <div class="name-item">Goals</div>
    </div>

    <div class="product_detail">
        <table style="width: 100%">
            <tbody>
                <tr>
                    <td>
                        <img src="http://www.knor.ru/shop/pictb/25/06/2506141.jpg" >

                    </td>
                    <td>
                            <div class="name"><b>Learn Java</b></div>
                    </td>
                    <td>

                               год: 2007<br>
                               автор: Умед Ф.
                    </td>
                    <td>
                            <div class="price">40$</div>
                    </td>
                    <td>
                            <div class="add"> <input type="button" value="Положить в корзину"></div>
                    </td>
                </tr>
                </tbody>
        </table>
     </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/script.js"></script>


</body>

</html>
