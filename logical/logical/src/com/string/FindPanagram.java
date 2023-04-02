package com.string;

public class FindPanagram {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over the lazy dog";
		System.out.println(ispanageram(s.toLowerCase()));		

		}

		private static boolean ispanageram(String s) {
			if(s.length()<26) {
				
				return false;
			}else {
				for(char ch='a';ch<='z';ch++) {
					if(s.indexOf(ch)<0) {
						return false;
					}
					
				}
			}
		return true;	
		}

	}


