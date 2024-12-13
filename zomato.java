import java.util.Scanner;
class zomato
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\t__WELCOME TO ZOMOTO__");
		System.out.println( );
		System.out.println("SELECT THE HOTEL" );
		System.out.println("__________________");
		System.out.println( );
		System.out.println("1.DINDUGAL THALAPAKATTI \n2.SS HYDRABADHI \n3.SALEM RR BIRIYANI \n4.COPPER KITCHEN" );
		int hotel=sc.nextInt();
		              //1 r 2 r 3 r 4 hotel
		switch (hotel)
		{
		case 1:{//dindugal
			System.out.println("\t\t\tVANNAKAM DA MAPLE DINDUGAL THALAPAKATTI LENTHU");
			System.out.println("\t\t\t_______________________________________________");
			System.out.println("SELECT YOUR FAVOURITE FOOD");
			System.out.println("1.MUTTON BIRIYANI \n2.CHICKEN BIRIYANI \n3.BEEF BIRIYANI \n4.FISH BIRIYANI");
			int food=sc.nextInt();
			        //food=1 r 2 r 3 r 4
					switch (food)
					{
					case 1://MUTTON BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*380
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //MUTTON BIRIYANI
					case 2://CHICKEN BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=280;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //CHIKEN BIRIYANI
					case 3://BEEF BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //BEEF BIRIYANI
					case 4://FISH BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=250;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //FISH BIRIYANI
						default :
							{
								System.out.println("INVALID");
								break;
							}
					}
			
			
			break;
			}//DINDUGAL
			
			
		case 2:
			{//SS HYDRABATHI
			System.out.println("\t\t\tNAMASKKARR DA MAPLE SS HYDRABATHI LUUU");
			System.out.println("\t\t\t_______________________________________________");
			System.out.println("SELECT YOUR FAVOURITE FOOD");
			System.out.println("1.MUTTON BIRIYANI \n2.CHICKEN BIRIYANI \n3.BEEF BIRIYANI \n4.FISH BIRIYANI");
			int food=sc.nextInt();
			        //food=1 r 2 r 3 r 4
					switch (food)
					{
					case 1://MUTTON BIRIYANI
						{
						    System.out.println("ENTER QUANTITY"); 
							//QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*380
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //MUTTON BIRIYANI
					case 2://CHICKEN BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=280;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //CHIKEN BIRIYANI
					case 3://BEEF BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //BEEF BIRIYANI
					case 4://FISH BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=250;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //FISH BIRIYANI
						default :
							{
								System.out.println("INVALID");
								break;
							}
					}
			

			
			break;// HYDRABATHI
			}//SS HYDRABATHI
			
			
		case 3:
			{//RR BIRIYANI
			System.out.println("\t\t\tVANNAKANGAA SALEM RR BIRIYANI LENTHU");
			System.out.println("\t\t\t_______________________________________________");
			System.out.println("SELECT YOUR FAVOURITE FOOD");
			System.out.println("1.MUTTON BIRIYANI \n2.CHICKEN BIRIYANI \n3.BEEF BIRIYANI \n4.FISH BIRIYANI");
			int food=sc.nextInt();
			        //food=1 r 2 r 3 r 4
					switch (food)
					{
					case 1://MUTTON BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*380
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //MUTTON BIRIYANI
					case 2://CHICKEN BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=280;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //CHIKEN BIRIYANI
					case 3://BEEF BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*380
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //BEEF BIRIYANI
					case 4://FISH BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=250;
							int bill=qty*price1;
							         //2*250
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							//PAYMENT MODE
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //FISH BIRIYANI
						default :
							{
								System.out.println("INVALID");
								break;
							}
					}
			
			
			break;
			 //BIRIYANI
			}//RR BIRIYANI
		case 4:
			{//COPPER KITCHEN
			System.out.println("\t\t\tGREETING FROM COPPER KITCHEN");
			System.out.println("\t\t\t_______________________________________________");
			System.out.println("SELECT YOUR FAVOURITE FOOD");
			System.out.println("1.MUTTON BIRIYANI \n2.CHICKEN BIRIYANI \n3.BEEF BIRIYANI \n4.FISH BIRIYANI");
			int food=sc.nextInt();
			        //food=1 r 2 r 3 r 4
					switch (food)
					{
					case 1://MUTTON BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*380
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							//PAYMENT GATEWAY
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //MUTTON BIRIYANI
					case 2://CHICKEN BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=280;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //CHIKEN BIRIYANI
					case 3://BEEF BIRIYANI
						{
						    System.out.println("ENTER QUANTITY");  //QTY 
							int qty=sc.nextInt();
							int price1=380;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //BEEF BIRIYANI
					case 4://FISH BIRIYANI
						{
						    System.out.println("ENTER QUANTITY"); 
							//ENTER YOUR QUANTITY
							int qty=sc.nextInt();
							int price1=250;
							int bill=qty*price1;
							         //2*280
							System.out.println("TOTAL BILL :"+bill);
							System.out.println("__________________");
							System.out.println("REDIRECTING TO THE PAYMENT GATEWAY...");
							System.out.println("");
							System.out.println("\t\tSELECT PAYMENT MODE \n1.UPI \n2.CARD METHOD");
							int payment=sc.nextInt();
							
							System.out.println("ENTER BILL AMOUNT BELOW");
							int enter_bill_amt=sc.nextInt();
							
							if (enter_bill_amt==bill)
							{
								int sys_otp=(int)(Math.random()*999+999);
								System.out.println("THIS IS YOUR OTP :"+sys_otp);
								Thread.sleep(3000);
								System.out.print("\t\tPROCESSING");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.print(".");
								Thread.sleep(1000);
								System.out.println(".");
								
								System.out.println("ENTER YOUR OTP");
								int enter_your_otp=sc.nextInt();
							
								
								if (sys_otp==enter_your_otp)
								{
									System.out.println("\t\tORDER CONFRIMED");
									
									Thread.sleep(1000);
									
									System.out.println("\t\tDELIEVERED WITHIN 5 MIN");
									Thread.sleep(1000);
									System.out.println("\t\t***********************");
									System.out.println("\t\tTANK U PLZZ VISIT AGAIN");
								}
							}
							else 
								{
									System.out.println("ORDER CANCELED");
								}
							
							
							
						break;
						}  //FISH BIRIYANI
						default :
							{
								System.out.println("INVALID");
								break;
							}
					}
			
			
			break;
			
             ////COPPER KITCHEN
			}//COPPER KITCHEN
		default :
			{
				System.out.println("INVALID");
				break ;
			}
		
		}
		
		
		
	}
}
