package com.away1994.dist.program.type;

import com.away1994.dist.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.dist.feature.plantuml.classes.relation.ClassesDiagramRelation;
import com.away1994.dist.program.method.MethodElement;
import com.away1994.dist.program.method.MethodTag;
import com.away1994.dist.program.variable.VariableElement;
import com.away1994.dist.program.variable.VariableTag;

import java.util.Set;
import java.util.TreeSet;

import static com.away1994.dist.program.type.TypeTag.OBJECT;

public abstract class AbstractTypeElement implements TypeElement {
    String name;
    Set<TypeTag> tags;

    @Override
    public String getName() {
        return this.name;
    }


    public AbstractTypeElement() {
    }



    public AbstractTypeElement(String name, Set<TypeTag> tags) {
        this.name = name;
        this.tags = tags;
    }

    public AbstractTypeElement(String name) {
        this.name = name;
        this.tags = new TreeSet();
        this.tags.add(OBJECT);
    }

    @Override
    public Set<TypeTag> getTags() {
        return this.tags;
    }




    @Override
    public Set<ClassElement> getClasses() {
        return null;
    }

    @Override
    public Set<ClassElement> getClasses(Set<TypeRelationTag> tags) {
        return null;
    }

    @Override
    public Set<InterfaceElement> getInterfaces() {
        return null;
    }

    @Override
    public Set<InterfaceElement> getInterface(Set<TypeRelationTag> tags) {
        return null;
    }

    @Override
    public Set<VariableElement> getVariables() {
        return null;
    }

    @Override
    public Set<VariableElement> getVariables(Set<VariableTag> tags) {
        return null;
    }

    @Override
    public Set<MethodElement> getMethods() {
        return new TreeSet<>();
    }

    @Override
    public Set<MethodElement> getMethods(Set<MethodTag> tags) {
        return new TreeSet<>();
    }



    @Override
    public Set<ClassesDiagramElement> getClassesDiagramElements() {
        return new TreeSet<>();
    }

    @Override
    public Set<ClassesDiagramRelation> getClassesDiagramRelations() {
        return new TreeSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractTypeElement that = (AbstractTypeElement) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
