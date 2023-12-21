import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

class Myset<T> implements Set<T> {
    private HashMap<T, Integer> map = new HashMap<>();
    private int index = 0;

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean add(T e) {
        if (map.containsKey(e)) {
            return false;
        }
        map.put(e, index++);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (map.containsKey(o)) {
            map.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            if (!map.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<? extends T> iterator = c.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            if (add(iterator.next())) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (!map.containsKey(o)) {
                flag = true;
            } else {
                remove(o);
            }
        }
        return flag;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            if (remove(iterator.next())) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <E> E[] toArray(E[] a) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
}