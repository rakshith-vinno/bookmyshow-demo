create table City (
	uuid_ VARCHAR(75) null,
	city_id LONG not null primary key,
	city_Name VARCHAR(75) null
);

create table Movies (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	rating DOUBLE,
	release_date DATE null,
	length_min INTEGER
);

create table Movies_City (
	movie_id LONG not null,
	city_id LONG not null,
	primary key (movie_id, city_id)
);