package com.majid.SpringPractice;

import java.util.Objects;

public class Dish {
		private String name;
		private String taste;
		private String orgin;
		
		
		
		public Dish(String name, String taste, String orgin) {
			super();
			this.name = name;
			this.taste = taste;
			this.orgin = orgin;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTaste() {
			return taste;
		}
		public void setTaste(String taste) {
			this.taste = taste;
		}
		public String getOrgin() {
			return orgin;
		}
		public void setOrgin(String orgin) {
			this.orgin = orgin;
		}
		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dish other = (Dish) obj;
			return Objects.equals(name, other.name);
		}
		@Override
		public String toString() {
			return "Dish [name=" + name + ", taste=" + taste + ", orgin=" + orgin + "]";
		}
		
		
		
}
