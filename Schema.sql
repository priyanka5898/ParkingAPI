
    create table booking (
       booking_id integer not null auto_increment,
        create_at TIMESTAMP,
        duration integer,
        slot_id integer,
        status varchar(255),
        updated_at TIMESTAMP,
        user_id integer,
        primary key (booking_id)
    ) type=MyISAM;

    create table parking (
       parking_id integer not null auto_increment,
        area varchar(255),
        created_at TIMESTAMP,
        locality varchar(255),
        pincode integer,
        charge integer,
        updated_at TIMESTAMP,
        primary key (parking_id)
    ) type=MyISAM;

    create table payment (
       pay_id integer not null auto_increment,
        amount_paid integer,
        booking_id integer,
        create_at TIMESTAMP,
        paid_by varchar(255),
        payment_status varchar(255),
        update_at TIMESTAMP,
        user_id integer,
        primary key (pay_id)
    ) type=MyISAM;

    create table slot (
       slot_id integer not null auto_increment,
        slot_status varchar(255),
        create_at TIMESTAMP,
        parking_id integer,
        slot_number varchar(255),
        update_at TIMESTAMP,
        primary key (slot_id)
    ) type=MyISAM;

    create table user_parking (
       user_id integer not null auto_increment,
        created_at TIMESTAMP,
        updated_at TIMESTAMP,
        user_contact bigint,
        user_email varchar(255),
        user_name varchar(255),
        user_password varchar(255),
        primary key (user_id)
    ) type=MyISAM;

     create table wallet (
           id integer not null auto_increment,
            user_id integer,
            balance integer,
            create_at TIMESTAMP,
            update_at TIMESTAMP,
            primary key (id)
        ) type=MyISAM;
