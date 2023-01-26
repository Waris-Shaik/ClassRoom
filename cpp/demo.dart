void main(){
  
  User user = User('waris shaik', 22);
  User userOne = User('habib syed', 23);
  User userTwo = User('areef omar', 22);
  User userThree = User('sameer shaik', 23);
  User userFour = User('habeeb shaik', 21);
  User userFive = User('samiulla shaik', 22);
  SuperUser text = SuperUser('jake sully', 22);
  
  print(user.name);
  print(userOne.name);
  print(userTwo.name);
  print(userThree.name);
  print(userFour.name);
  print(userFive.name);
  print(text.name);
  text.msg();
  text.login();
 
  
  
}

class User{
 late String name; 
 late int age;
  
  User(this.name, this.age);
  
  void login(){
    print('you logged in');
  }
 
}

class SuperUser extends User{
  
  SuperUser(name, age) : super(name, age);
  
  void msg(){
    print('hii have a great day!');
  }
}