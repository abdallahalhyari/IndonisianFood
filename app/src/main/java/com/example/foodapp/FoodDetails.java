package com.rajendra.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class FoodDetails extends AppCompatActivity {

    // now we will get data from intent and set to UI

    ImageView imageView;
    TextView itemName, itemPrice, itemRating;
    RatingBar ratingBar;
    TextView dec;
    String name;
    String price;
    String rating;
    String imageUrl;
    @Override
    protected void onStart() {
        super.onStart();

        if (music.n==0){
            music.mediaPlayer.pause();
        }
        else {
            music.mediaPlayer.start();
        }
    }
    protected void onPause() {
        super.onPause();

        music.mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        Intent intent = getIntent();
        dec = findViewById(R.id.textView8);
        name = intent.getStringExtra("name");
        price = intent.getStringExtra("price");
        rating = intent.getStringExtra("rating");
        imageUrl = intent.getStringExtra("image");

        imageView = findViewById(R.id.imageView5);
        itemName = findViewById(R.id.name);
        itemPrice = findViewById(R.id.price);
        itemRating = findViewById(R.id.rating);
        ratingBar = findViewById(R.id.ratingBar);

        switch (name) {
            case "Soto Betawi\n(Jakarta soup)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-FKJbSsk/0/X3/soto-betawi-jakarta-21-X3.jpg").
                        into(imageView);
                      dec.setText("Soto Betawi is usually prepared with beef, which is boiled with aromatic herbs like lemongrass and Indonesian bay " +
                              "leaves, and flavored with candlenut, galangal, garlic, and shallots, and finally often a combination of both fresh cow milk and coconut milk are added to make the soup creamy. The soup is usually served in a bowl, " +
                              " topped with some crispy fried shallots, and eaten with a plate of rice, and some Indonesian pickles (known as acar)");
            break;
                      case "Sate Ayam / Sate\nKambing (satay)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-9hLVhWh/0/X3/indonesian-sate-ayam-1-X3.jpg").
                        into(imageView);
                dec.setText("One of the common recipes includes the meat marinated in sweet kecap manis soy sauce, before being skewered. I think" +
                        " is the main reason why Indonesian sate is so good, is because the skewers of meat are typically grilled on an extremely " +
                        "hot charcoal fire, so the meat cooks quickly, while leaving it smoky and juicy.");
           break;
            case "Sate Padang\n(Padang satay)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-MmprL3V/0/X3/sate-padang-1-X3.jpg").
                        into(imageView);
                dec.setText("The skewers of meat, which often include beef pieces, beef tongue, and offal, are first marinated in a mixture of spices, " +
                        "then grilled over hot flaming charcoal, and finally they are often served over sliced up compressed rice cake, called ketupat, and then covered in a thick brown colored sauce, " +
                        "and sprinkled with crispy shallots. The result of Sate Padang is not the prettiest dish you’ll ever see, but the taste is incredible");
            break;
                case "Ayam Bakar Taliwang\n(grilled chicken)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-Q4M8Pkt/0/X3/ayam-taliwang-jakarta-1-X3.jpg").
                        into(imageView);
                dec.setText("This type of grilled chicken originates from the island of Lombok, and it’s popular with spicy grilled chicken lovers " +
                        "throughout Indonesia. When I saw the amount of chilies caked onto my ayam bakar Taliwang, " +
                        "I knew I was in for a life-changing grilled chicken experience, and it was true");
            break;
                case "Pepes\n(herbal packet)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-Lz4VMGZ/0/X3/indonesian-food-115-X3.jpg").
                        into(imageView);
                dec.setText("some of the most common versions of pepes include chicken, different types of fish, tofu, or mushrooms, mixed with shallots, garlic, chilies, turmeric, candlenut, and lemon basil. What I love so much is that the ingredients, since they are all wrapped in a banana leaf and cooked, " +
                        "all mesh together really well, but also the banana leaf gives an extra green essence to whatever is cooked inside.");
            break;
                case "Babi Pangang\n(Batak grilled pork)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-9ksXtDn/0/X3/indonesian-food-33-X3.jpg").
                        into(imageView);
                dec.setText("From my understanding, babi pangang can refer to grilled pork many different ways, but the version I had was nice and salty, and had the most incredible grill fire roasted flavor of just about any grilled pork I’ve ever had. And additionally, " +
                        "the pork itself was incredibly well marbled, not too fatty, but with a great ratio so it was still juicy and succulent.");
            break;
                case "Ayam Goreng\n(fried chicken)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-nnZgJ3g/0/X3/indonesian-food-6-X3.jpg").
                        into(imageView);
                dec.setText("For many types of Indonesian fried chicken, the chicken is not heavily breaded or battered, but it’s marinated in lots of pureed garlic and shallots, lightly battered, and deep fried to a serious golden crispiness. What I love about Indonesian fried chicken is that all " +
                        "that flavor gets embedded into the chicken instead of the batter. Here’s a great recipe if you want to make Indonesian fried chicken.");
            break;
                case "Bebek Goreng\n(fried duck)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/City-Guides/i-bMfqjcX/0/X3/jakarta-travel-guide-21-X3.jpg").
                        into(imageView);
                dec.setText(" The duck was deep fried until crispy, even all the way through the skin to the meat some of it was crispy. Served with rice, an assortment of raw herbs like lemon basil (maybe to cut the grease), " +
                        "and not forgetting the sambal chili sauce, Indonesian bebek goreng is a true treat of a meal.");
            break;
                case "Ikan Bakar\n(grilled fish)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-7HM7dMM/0/X3/indonesian-food-9-X3.jpg").
                        into(imageView);
                dec.setText("There are many different types of ikan bakar, but typically the fish is butterfly cut so it lays flat, then it’s rubbed in a sambal sauce marinade, and then finally it’s grilled. " +
                        "Ikan bakar is then served with either kecap manis or a variety of different sambal chili sauces and rice");
            break;
                case "Pecel Lele\n(fried catfish)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-G7LtkFS/0/X3/indonesian-food-58-X3.jpg").
                        into(imageView);
                dec.setText("The catfish are prepared pretty simple, just salted and sometimes rubbed with some coriander and turmeric, and then deep fried until extra crispy all the way through. The catfish I ate in Indonesia were pretty " +
                        "small, about the size of a sausage, so when they were deep fried they almost turned chip-like, fried solidly.");
        break;
            case "Ikan Goreng\n(deep fried fish)":
                Glide.with(getApplicationContext())
                        .load("https://photos.smugmug.com/Indonesia-2016/i-nZLRMcK/0/X3/indonesian-food-76-X3.jpg").
                        into(imageView);
                dec.setText("Along with ikan bakar (Indonesian grilled fish), ikan goreng or deep fried fish, is another common way to prepare different types of fish and seafood. There are probably hundreds of different types of fish that can be used to make ikan goreng, but one fried fish delicacy of Sundanese cuisine is fried freshwater gourami. The fish are sometimes cut in a way that exposes more of " +
                        "the skin to the oil, and then deep fried so the skin and outer layers of the fish are completely crispy");
                break;
        }

        itemName.setText(name);
        itemPrice.setText(price);
        itemRating.setText(rating);
        ratingBar.setRating(Float.parseFloat(rating));

    }


    public void add_cartt(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "Add To Cart", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }

    public void home_page(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void recycle1(View view) {
        Intent intent = new Intent(this, Add_Cart.class);
        startActivity(intent);


    }
}
