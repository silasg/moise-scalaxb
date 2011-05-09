// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package moise

case class OsType(properties: Option[moise.PropertiesType],
  structuralspecification: moise.SsType,
  functionalspecification: Option[moise.FsType],
  normativespecification: Option[moise.NsType],
  id: Option[String] = None,
  osversion: String)


case class Roledefinitions(role: moise.RoleDefType*)


case class Linktype(id: String)


case class Linktypes(linktype: moise.Linktype*)


case class SsType(properties: Option[moise.PropertiesType],
  roledefinitions: Option[moise.Roledefinitions],
  linktypes: Option[moise.Linktypes],
  groupspecification: Option[moise.GroupSpecificationType])


case class Goal(id: String)


case class Preferred(mission: String)


case class Mission(properties: Option[moise.PropertiesType],
  goal: Seq[moise.Goal],
  preferred: Seq[moise.Preferred],
  id: String,
  min: Option[BigInt] = None,
  max: Option[BigInt] = None)


case class Scheme(properties: Option[moise.PropertiesType],
  goal: moise.GoalDefType,
  mission: Seq[moise.Mission],
  id: Option[String] = None,
  monitoringscheme: Option[String] = None)


case class FsType(properties: Option[moise.PropertiesType],
  scheme: Seq[moise.Scheme])


case class Norm(id: String,
  condition: Option[String] = None,
  role: String,
  typeValue: String,
  mission: String,
  timeconstraint: Option[String] = None)


case class NsType(properties: Option[moise.PropertiesType],
  norm: Seq[moise.Norm])


case class Property(id: String,
  value: String)


case class PropertiesType(propertiestypesequence1: moise.PropertiesTypeSequence1*)

case class PropertiesTypeSequence1(property: moise.Property)

case class Extends(role: Option[String] = None)


case class RoleDefType(properties: Option[moise.PropertiesType],
  extendsValue: Seq[moise.Extends],
  id: String)

trait ScopeType

object ScopeType {
  def fromString(value: String): ScopeType = value match {
    case "intra-group" => Intragroup
    case "inter-group" => Intergroup

  }
}

case object Intragroup extends ScopeType { override def toString = "intra-group" }
case object Intergroup extends ScopeType { override def toString = "inter-group" }

trait CardinalityObjectType

object CardinalityObjectType {
  def fromString(value: String): CardinalityObjectType = value match {
    case "role" => RoleValue
    case "group" => Group

  }
}

case object RoleValue extends CardinalityObjectType { override def toString = "role" }
case object Group extends CardinalityObjectType { override def toString = "group" }


case class Role(id: Option[String] = None,
  min: Option[BigInt] = None,
  max: Option[BigInt] = None)


case class Roles(role: moise.Role*)


case class Link(from: Option[String] = None,
  to: Option[String] = None,
  typeValue: Option[String] = None,
  scope: moise.ScopeType,
  extendssubgroups: Boolean,
  bidir: Boolean)


case class Links(link: moise.Link*)


case class Includegroupspecification(uri: Option[String] = None)


case class Subgroups(includegroupspecification: Seq[moise.Includegroupspecification],
  groupspecification: Seq[moise.GroupSpecificationType])


case class Cardinality(min: Option[BigInt] = None,
  max: Option[BigInt] = None,
  objectValue: moise.CardinalityObjectType,
  id: String)


case class Compatibility(from: String,
  to: String,
  scope: moise.ScopeType,
  extendssubgroups: Boolean,
  bidir: Boolean,
  typeValue: Option[String] = None)


case class Formationconstraints(cardinality: Seq[moise.Cardinality],
  compatibility: Seq[moise.Compatibility])


case class GroupSpecificationType(roles: Option[moise.Roles],
  links: Option[moise.Links],
  subgroups: Seq[moise.Subgroups],
  formationconstraints: Option[moise.Formationconstraints],
  id: String,
  min: Option[BigInt] = None,
  max: Option[BigInt] = None,
  monitoringscheme: Option[String] = None)


case class PlanType(properties: Option[moise.PropertiesType],
  goal: Seq[moise.GoalDefType],
  operator: moise.PlanOperatorType,
  successrate: Option[Double] = None)


case class GoalDefType(argument: Seq[moise.ArgumentType],
  plan: Option[moise.PlanType],
  id: String,
  min: Option[BigInt] = None,
  ds: Option[String] = None,
  typeValue: Option[moise.GoalType] = None,
  ttf: Option[String] = None)


case class ArgumentType(id: String,
  value: Option[String] = None)

trait PlanOperatorType

object PlanOperatorType {
  def fromString(value: String): PlanOperatorType = value match {
    case "sequence" => Sequence
    case "choice" => Choice
    case "parallel" => Parallel

  }
}

case object Sequence extends PlanOperatorType { override def toString = "sequence" }
case object Choice extends PlanOperatorType { override def toString = "choice" }
case object Parallel extends PlanOperatorType { override def toString = "parallel" }

trait GoalType

object GoalType {
  def fromString(value: String): GoalType = value match {
    case "achievement" => Achievement
    case "maintenance" => Maintenance

  }
}

case object Achievement extends GoalType { override def toString = "achievement" }
case object Maintenance extends GoalType { override def toString = "maintenance" }

