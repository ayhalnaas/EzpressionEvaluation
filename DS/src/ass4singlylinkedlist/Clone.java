package ass4singlylinkedlist;

import java.util.Arrays;

public class Clone<E> implements Cloneable {

        public static final int Capacity=10;
        private E[] array;
        private int size;

        public Clone() {
            array = (E[]) new Object[Capacity];
            size = 0;
        }//q4 lab7
        public Clone<E> clone(){
            try {
                Clone<E> clonedStack = (Clone<E>) super.clone();
                clonedStack.array = Arrays.copyOf(array,size);
                return clonedStack;
            }catch (CloneNotSupportedException e){
                throw new InternalError(e);
            }
        }

    }
