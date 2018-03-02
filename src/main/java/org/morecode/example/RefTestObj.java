/**
 * taken from https://www.ibm.com/developerworks/cn/java/j-lo-langref/
 */
package org.morecode.example;

public class RefTestObj {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "[id=" + this.id + "]";
    }

    @Override
    protected void finalize() {
        System.out.println("Object [" + this.hashCode() + "][id=" + this.id + "] come into finalize");
        try {
            super.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
