package all4share;
import java.util.*;

class Company{

  String name;
  String code;
  float price=0;
  private int central;
  private float range;
  String HQ;
  float percentage;
  private float high;
  private float low;
  private float high3d;
  private float low3d;
  private float high1m;
  private float low1m;
  private float high6m;
  private float low6m;
  Random rand=new Random();

Company(Cname c){
  name=c.name();
  code=name.substring(0,2)+String.valueOf(12*(int)name.charAt(0));
  //Cname comp=c;
  switch(c){
    case Mahindra:
    central=310;
    range=1.4f;
    HQ="New Delhi,IN";
    break;
    case Titan:
    central=360;
    range=2f;
    HQ="Bangalore,IN";
    break;
    case Reliance:
    central=225;
    range=0.8f;
    HQ="Mumbai,IN";
    break;
    case Tata:
    central=420;
    range=2.6f;
    HQ="Mumbai,IN";
    break;
    case Nike:
    central=650;
    range=4f;
    HQ="Oregon,USA";
    break;
  }
   //price=getCurrentPrice();
   high=(central-range)+rand.nextFloat()*range;
   low=(central-range)+rand.nextFloat()*range;
   high3d=(central-range)+rand.nextFloat()*range;
   low3d=(central-range)+rand.nextFloat()*range;
   high1m=(central-range*1.5f)+rand.nextFloat()*(range*1.5f);
   low1m=(central-range*1.5f)+rand.nextFloat()*(range*1.5f);
   high6m=(central-range*3f)+rand.nextFloat()*(range*3f);
   low6m=(central-range*3f)+rand.nextFloat()*(range*3f);
}

float getCurrentPrice(){
  float p=(central-range)+rand.nextFloat()*range;
  if(price==0f) percentage=rand.nextFloat();
  else{
    percentage=(float)((p-price)/price)*100;
  }
  price=p;
  return price;
}

float getHigh(){
  if(high>price){
      return high;
    }
  else{
    high=price;
    return price;
  }
}

float getLow(){
  if(low>price){
      low=price;
      return price;
    }
  else{
    return low;
  }
}

float getHigh3d(){
  if(high3d>price) return high3d;
  else{
    high3d=price;
    return price;
  }
}

float getLow3d(){
  if(low3d>price){
      low3d=price;
      return price;
    }
  else{
    return low3d;
  }
}

float getHigh1m(){
  if(high6m>price)
      if(high6m>high3d) return high1m;
      else return high3d;
  else{
    high1m=price;
    return price;
  }
}

float getLow1m(){
  if(low1m<price)
      if(low1m<low3d) return low1m;
      else return low3d;
  else{
    low1m=price;
    return price;
  }
}

float getHigh6m(){
  if(high6m>price)
      if(high6m>high1m) return high6m;
      else return high1m;
  else{
    high6m=price;
    return price;
  }
}

float getLow6m(){
  if(low6m<price)
      if(low6m<low1m) return low6m;
      else return low1m;
  else{
    low6m=price;
    return price;
  }
}

//void getNews();//random news blogs related to the company

}
