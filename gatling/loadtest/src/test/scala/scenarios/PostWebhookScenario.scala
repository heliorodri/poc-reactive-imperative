package scenarios

import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder


class PostWebhookScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("post webhook scenario")
    .exec(GetPostcdesRequest)

}
