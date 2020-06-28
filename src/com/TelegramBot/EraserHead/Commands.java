package com.TelegramBot.EraserHead;

import java.util.Random;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public  class Commands extends TelegramLongPollingBot {
	
	public final static String PREFIX = "/";
	public static String []getMessage;
	public static long chatId;
	public static int msgId;
	public static String member;

	@Override
	public void onUpdateReceived(Update update) {
		
	      String []Message = update.getMessage().getText().split("\\s+");
	      long chat_id = update.getMessage().getChatId();
          int msg_id = update.getMessage().getMessageId();
          String mem = update.getMessage().getChat().getFirstName();
          
	      getMessage = Message;
	      chatId = chat_id;
	      msgId = msg_id;
	      member = mem;
	      	

	      if (update.hasMessage() && update.getMessage().hasText()) 
	      {
	    	  
	    	  if(Message[0].equalsIgnoreCase(PREFIX+"test")) {
	    		  SendMessage msg = new SendMessage()
	    				  .setChatId(chat_id)
	    				  .setText("I am Working Fine !!!");
	    		  try {
					execute(msg);
				} catch (TelegramApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  }
		   
		    if(getMessage[0].equalsIgnoreCase(PREFIX+"diss")) {
		    	Diss();
	        }
		
			if(getMessage[0].equalsIgnoreCase(PREFIX+"waifu")) {
		    	Waifu();
            }
 		
    		if(getMessage[0].equalsIgnoreCase(PREFIX+"Developer")) {
     			Developer();
    		}
  		
    		if(getMessage[0].equalsIgnoreCase(PREFIX+"say")) {
    			Say();
    		}
		
    	   	if(getMessage[0].equalsIgnoreCase(PREFIX+"iq")) {
     			IQ();
    		}
		
    		if(getMessage[0].equalsIgnoreCase(PREFIX+"convert")) {
    			Convert();
    		}
 		
    		if(getMessage[0].equalsIgnoreCase(PREFIX+"gravitational")) {
    	   		Gravitational();
     		}
		
     		if(getMessage[0].equalsIgnoreCase(PREFIX+"avogadro")) {
     			avogadro();
     		}
		
     		if(getMessage[0].equalsIgnoreCase(PREFIX+"planck")) {
     			Planck();
    	   	}
		
    		if(getMessage[0].equalsIgnoreCase(PREFIX+"epsilon")) {
    			Epsilon();
    		}
    		
    		BasicAbility();
    		new SaikatBOTGame().onUpdateReceived(update);
    		
    		
    }
	      
	      
		
}

	@Override
	   public String getBotUsername() {
	       // Return bot username
	       // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
	       return "xSaikatBot";
	   }

	   @Override
	   public String getBotToken() {
	       // Return bot token from BotFather
	       return "1153525992:AAGLeLK-KcKkO2VPSm6Wk-q_cS8SaibRn9s";
	   }
  
	   public void Waifu() {
		   long chat_id = chatId;
	       SendPhoto photo = new SendPhoto()
				  .setChatId(chat_id)
				  .setPhoto(waifu());
		  
		  try {
				execute(photo);
			} catch (TelegramApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   
       public String waifu() {
    	   
    	   String waifu[] = {
    			   "https://pm1.narvii.com/6563/5fa949a47a8a12b3e115ac89b2cd5f5e5acdb9bc_hq.jpg",
    			   "https://www.vippng.com/png/detail/238-2382660_tippy-hoodie-anime-girls-anime-girl-cute-anime.png",
    			   "https://wallpapercave.com/wp/wp5114631.jpg",
    			   "https://i.pinimg.com/736x/14/79/9d/14799d9779f9b44d7116783ce7121d5f.jpg",
    			   "https://wallpapercave.com/wp/wp3452807.jpg",
    			   "https://www.wallpaperup.com/uploads/wallpapers/2016/09/26/1020331/5a94556e430bfbb3d60b5af233521d19-700.jpg",
    			   "https://i.pinimg.com/originals/a6/38/72/a63872eb3f1d9f8c5691617918cff56e.jpg",
    			   "https://i.pinimg.com/564x/da/69/ce/da69ce1b092ff200d63420e50a9e2c1b.jpg",
    			   "https://i.pinimg.com/originals/19/12/98/191298926e6a8e02bc05409ee39ebf5c.jpg",
    			   "https://i.pinimg.com/736x/bd/38/f2/bd38f2e73ec72fc63af466525f53636d.jpg",
    			   "https://wallpapercave.com/wp/wp6051017.jpg"
    			  
    	   };
    	   
    	   int i = toGenerate(waifu.length);
    	   
    	   return waifu[i];
       }
       
       public static int toGenerate(int x) {
	 		Random generator = new Random();
	 		int y = generator.nextInt(x);
	 		
	 		return y ;
	 	}
       
       public void avogadro() {
    	   long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
           
           SendMessage msg =  new SendMessage()
   				   .setChatId(chat_id)
   				   .setReplyToMessageId(msg_id)
   				   .setText("Avogadro's Constant : 6.022 x 10^23 per mole");
 			  		  
  		  try {
 				execute(msg);
 			} catch (TelegramApiException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
       }
       
       public void BasicAbility() {
    	   String []getMessage = Commands.getMessage;
	    	  long chat_id = Commands.chatId;
	          int msg_id = Commands.msgId;
	    	   
	    	   if(getMessage[0].equalsIgnoreCase("saikat")) {
	        	   SendMessage msg = new SendMessage()
	        			   .setChatId(chat_id)
	        			   .setReplyToMessageId(msg_id)
	        			   .setText("Hey, He is My Developer");
	        	   try {
	    			execute(msg);
	    		} catch (TelegramApiException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	           }
	    	  
	    	  for(int i = 0 ; i < getMessage.length; i++) {
	    		  if(getMessage[i].equalsIgnoreCase("noice") || getMessage[i].equalsIgnoreCase("nice")) {
	    			 SendMessage msg = new SendMessage()
	    					 .setChatId(chat_id)
	    					 .setText("👍");
	    			 
	    			 try {
						execute(msg);
					} catch (TelegramApiException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   					 
	    			 
	    		  }
	    	  }
	    	  
	    	  for(int i = 0 ; i < getMessage.length; i++) {
	    		  if(getMessage[i].equalsIgnoreCase("bye") || getMessage[i].equalsIgnoreCase("byy")) {
	    			 SendMessage msg = new SendMessage()
	    					 .setChatId(chat_id)
	    					 .setText("👋");
	    			 
	    			 try {
						execute(msg);
					} catch (TelegramApiException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}   					 
	    			 
	    		  }
	    	  }
	    	  
	    	  if(getMessage[0].equalsIgnoreCase("Hi")||getMessage[0].equalsIgnoreCase("Hello")||getMessage[0].equalsIgnoreCase("yo")) {
	    		  
	    		  
	       	   SendMessage msg = new SendMessage()
	       			   .setChatId(chat_id)
	       			   .setText("Hello "+member);
	       	          	          			   
	       	   try {
	   			execute(msg);
	   		} catch (TelegramApiException e) {
	   			// TODO Auto-generated catch block
	   			e.printStackTrace();
	   		}
	          }
	  			
	  			for(int i = 0 ; i < getMessage.length; i++) {
	  	    		  if(getMessage[i].equalsIgnoreCase("lmao") || getMessage[i].equalsIgnoreCase("lol")) {
	  	    			 SendMessage msg = new SendMessage()
	  	    					 .setChatId(chat_id)
	  	    					 .setText("😂");
	  	    			 
	  	    			 try {
	  						execute(msg);
	  					} catch (TelegramApiException e) {
	  						// TODO Auto-generated catch block
	  						e.printStackTrace();
	  					}   					 
	  	    			 
	  	    		  }
	  			}
	  			
	  			 if(getMessage[0].equalsIgnoreCase("op")||getMessage[0].equalsIgnoreCase("good")) {
	  	    		  SendSticker sendSticker = new SendSticker()
	  	    				  .setSticker("CAACAgIAAxkBAAL5n171qSxo6eotjBzx3lv--xenwmBbAAIFAQACVp29Crfk_bYORV93GgQ")
	  	    				  .setChatId(chat_id);
	  	    		  
	  	    		  try {
	  					execute(sendSticker);
	  				} catch (TelegramApiException e) {
	  					// TODO Auto-generated catch block
	  					e.printStackTrace();
	  				}
	  	    	  }
	  	    	  
	  	    	  if(getMessage[0].equalsIgnoreCase("ornoob")) {
	  	    		  SendMessage msg = new SendMessage()
	  	    				   .setChatId(chat_id)
	  	    				   .setReplyToMessageId(msg_id)
	  	    				   .setText("Lmao !!! Ornoob You Won't Get Mini14 😂 😂 😂");
	  	   		  
	  	   		  try {
	  	 				execute(msg);
	  	 			} catch (TelegramApiException e) {
	  	 				// TODO Auto-generated catch block
	  	 				e.printStackTrace();
	  	 			}
	  	    	  }
       }
       
       public void Convert() {
    	   String []getMessage = Commands.getMessage;
     	   long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
              
              if(getMessage[1].startsWith("$")) {
    			  String value = getMessage[1].substring(1);
    			  System.out.print(value);
    			  Double USD = Double.valueOf(value);
    			  double INR = 75.6029334 * USD;
    			  INR = Math.ceil(INR*100)/100;
    			  
    			  SendMessage message = new SendMessage()
    					  .setChatId(chat_id)
    					  .setReplyToMessageId(msg_id)
    					  .setText("INR Value : Rs."+INR);
    			  try {
 					execute(message);
 				} catch (TelegramApiException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
    		  }
    		  
    		  else if(getMessage[1].startsWith("Rs.")){
    			  String value = getMessage[1].substring(3);
    			  Double INR = Double.valueOf(value);
    			  double USD = INR / 75.6029334;
    			  USD = Math.ceil(USD*100)/100;
    			  
    			  SendMessage message = new SendMessage()
    					  .setChatId(chat_id)
    					  .setReplyToMessageId(msg_id)
    					  .setText("USD Value : $"+USD);
    			  try {
 					execute(message);
 				} catch (TelegramApiException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
    		  }
       }
       
       public void Developer() {
    	   long chat_id = Commands.chatId;
           SendMessage msg = new SendMessage()
 				   .setChatId(chat_id)
 				   .setText("Instagram : instagram.com/@Saikat._\nTelegram : t.me/xSaikat\nGmail : sd.appdeveloping@gmail.com");
		  
		  try {
				execute(msg);
			} catch (TelegramApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       }
       
       public void Diss() {
    	   String []getMessage = Commands.getMessage;
 	      long chat_id = Commands.chatId;
           String diss = dissDialogue(getMessage[1]);
 	    		   
 	    		   if(getMessage[1].equalsIgnoreCase("saikat")||getMessage[1].equalsIgnoreCase("eraserhead")) {
 	    			  SendMessage msg = new SendMessage()
 	 	    				   .setChatId(chat_id)
 	 	    				   .setText("You Cannot Diss The Developer");
 	    			 try {
 	 					execute(msg);
 	 				} catch (TelegramApiException e) {
 	 					// TODO Auto-generated catch block
 	 					e.printStackTrace();
 	 				}
 	    		   }
 	    		   else {
 	    			  SendMessage msg = new SendMessage()
 	 	    				   .setChatId(chat_id)
 	 	    				   .setText(diss);
 	 	    		   
 	 	    		   try {
 	 					execute(msg);
 	 				} catch (TelegramApiException e) {
 	 					// TODO Auto-generated catch block
 	 					e.printStackTrace();
 	 				}
 	    		   }
 	    }
       
       public void Epsilon() {
    	   long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
              
              SendMessage msg =  new SendMessage()
      				   .setChatId(chat_id)
      				   .setReplyToMessageId(msg_id)
      				   .setText("Epsilon Naught : 8.85 x 10^-12 farads per meter");
    			  		  
     		  try {
    				execute(msg);
    			} catch (TelegramApiException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
       }
       
       public void Gravitational() {
    	   long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
              
              SendMessage msg =  new SendMessage()
      				   .setChatId(chat_id)
      				   .setReplyToMessageId(msg_id)
      				   .setText("Gravitational Constant : 6.67 x 10^-11 Nm^2/kg^2");
    			  		  
     		  try {
    				execute(msg);
    			} catch (TelegramApiException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
       }
       
       public void IQ() {
    	   String []getMessage = Commands.getMessage;
     	  long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
              
              int x = toGenerate(120);
    			
   			 SendMessage msg =  new SendMessage()
     				   .setChatId(chat_id)
     				   .setReplyToMessageId(msg_id)
     				   .setText("WOW !!! "+getMessage[1]+" Your IQ is "+x);
   			  		  
    		  try {
   				execute(msg);
   			} catch (TelegramApiException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
       }
             
       public void Planck() {
    	   long chat_id = Commands.chatId;
           int msg_id = Commands.msgId;
              
              SendMessage msg =  new SendMessage()
      				   .setChatId(chat_id)
      				   .setReplyToMessageId(msg_id)
      				   .setText("Planck's Constant : 6.626 x 10^-34 J s");
    			  		  
     		  try {
    				execute(msg);
    			} catch (TelegramApiException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
       }
       
       public void Say() {
    	   String []getMessage = Commands.getMessage;
     	  long chat_id = Commands.chatId;
           int i = getMessage.length;
    			String say = "";
    			for(int j = 1 ; j < i ; j++) {
    				say = say + " " + getMessage[j];
    			}
    			
    			SendMessage msg = new SendMessage()
    				   .setChatId(chat_id)
    				   .setText(say);
    			
    			try {
  				execute(msg);
  			} catch (TelegramApiException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
       }
       
       public String dissDialogue(String s) {
	 		String x = "";
	 		
	 		switch(toGenerate(9)) {
	 			case 0 : x = s + ", You Piece Of Shit"; break;
	 			case 1 : x = s + " Got a Smol PP.."; break;
	 			case 2 : x = s +", Go Suck Your Own Dick"; break;
	 			case 3 : x = " My Balls Are More Pretty Than " + s + "'s Face"; break;
	 			case 4 : x = s +" Eat My Pubic Hairs"; break;
	 			case 5 : x = s +" Momma Like To Comb My Pubic Hairs"; break;
	 			case 6 : x = s +", Your Mouth is Filled With My Cum"; break;
	 			case 7 : x = "I Farted On "+ s + "'s Mouth"; break;
	 			case 8 : x = s +", Go Jerk Your 2cm Dick"; break;
	 			case 9 : x = s +"'s Momma Likes To Jerk My Dick"; break;
	 		}
	 		return x;
	 	}
       
    
}
