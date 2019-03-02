package notjustpackage;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )

    {
        System.out.println( "Hello World!" );
        Human person = new Human(0);
        person.Breathe();
        System.out.println(person.getOxygen());

        Map<Human,Human> groupOfHumans = new Map<Human, Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object o) {
                return false;
            }

            @Override
            public boolean containsValue(Object o) {
                return false;
            }

            @Override
            public Human get(Object o) {
                return null;
            }

            @Override
            public Human put(Human human, Human human2) {
                return null;
            }

            @Override
            public Human remove(Object o) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Human, ? extends Human> map) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Human> keySet() {
                return null;
            }

            @Override
            public Collection<Human> values() {
                return null;
            }

            @Override
            public Set<Entry<Human, Human>> entrySet() {
                return null;
            }
        };

        Set<Human> village = new Set<Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Human> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Human human) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Human> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Collection<Human> people = new Collection<Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Human> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Human human) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Human> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        List<Human> humans = new List<Human>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Human> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Human human) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Human> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Human> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Human get(int i) {
                return null;
            }

            @Override
            public Human set(int i, Human human) {
                return null;
            }

            @Override
            public void add(int i, Human human) {

            }

            @Override
            public Human remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Human> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Human> listIterator(int i) {
                return null;
            }

            @Override
            public List<Human> subList(int i, int i1) {
                return null;
            }
        };

    }
}
