food_Amount = float(input('Enter ypur food Amount $: '));
tip_Msg = input('Enter how much tip u wanna give %: ');
tip_Perc =  float(tip_Msg) / food_Amount;
tip_Amount = food_Amount * tip_Perc;
total_Bill = food_Amount + tip_Amount;
print('total Amount is $: ',  total_Bill)
print('Details are :')
print('food Amount :', food_Amount);
print('tip Given :',tip_Msg)
print('calc Done :', tip_Perc);
print('tip Aount :', tip_Amount);
print('food Amount :', food_Amount);
print('total Amount :', total_Bill)