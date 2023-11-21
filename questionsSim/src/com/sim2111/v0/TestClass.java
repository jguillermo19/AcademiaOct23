package com.sim2111.v0;
import java.util.function.BiFunction;
import java.util.function.Function;


//What changes, when applied independent of each other, 
//will enable the following code to compile?

// Assume appropriate import statements


		class TestClass {
		    public double process(double payment, int rate) {
		        double defaultrate = 0.10; // 1 EFECTIVE FINAL

		        if (rate > 10) {
		            //defaultrate = rate; // 2
		            //rate++;
		        }

		        //CLASE LOCAL
		        class Implement {
		            public int apply(double data) {
		            	
		            	BiFunction<Integer, Double, Integer> f = 
		            			(m, n)->m+(int)(n*m); 
		            			
		            	return f.apply((int)data, defaultrate);

		            	
		            	//Function<Integer, Integer> f = x->x+(int)(x*rate);
		            	
//		                Function<Integer, Integer> f = 
//		                		x -> x + (int) (x * defaultrate); // 3
		                		
		                //return f.apply((int) data); // 4
		            }
		        }

		        Implement i = new Implement();
		        return i.apply(payment);
		    }
		}