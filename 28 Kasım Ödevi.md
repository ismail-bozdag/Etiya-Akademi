# 28 Kasım Ödevi
## Inner Join

```SQL

select * from products p 
inner join products_categories pc
on p.product_id=pc.product_id 
inner join categories c
on c.category_id=pc.category_id

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/InnerJoin.png)
## Left Join

```SQL

select * from products p 
left join products_categories pc
on p.product_id=pc.product_id

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/Left%20join.png)
## RIGHT JOIN

```SQL

select * from products p 
right join products_categories pc
on p.product_id=pc.product_id

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/right%20join.png)

## INSERT

```SQL

insert into products (name,price,discount_rate,stock,supplierid)
values('Silgi',10,0.1,250,1)

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/Insert.png)
## UPDATE

```SQL

update users
set name = 'İsmail Bozdağ', phone = '5346211012'
where user_id =8

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/update.png)
## IN

```SQL

select * from users u
where name in ('ismail','veysel')

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/IN.png)
## GROUP BY

```SQL

select s.name as "Tedarikci Adı", COUNT(p.stock) as "Ürün stok sayısı" from products p 
inner join suppliers s 
on p.supplierid = s.supplierid
group by s.name

```

![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/Group%20by.png)
## BETWEEN

```SQL

select p.name as "Ürün Adı", p.stock as "Ürün stok sayısı" from products p 
group by p.name, p.stock
having p.stock
between 100 and 200

```
![](https://raw.githubusercontent.com/ismail-bozdag/Etiya-Akademi/main/SQLhomework/%C4%B0mages/Between.png)