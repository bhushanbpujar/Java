package com.arrayList;


public class Emp implements Comparable {
		int id;
		String name;
		Emp(){
			
		}
		Emp(int id,String name){
			this.id=id;
			this.name=name;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}
		@Override
		public int compareTo(Object o) {
			return this.id-((Emp)o).id;
		}
		
}
