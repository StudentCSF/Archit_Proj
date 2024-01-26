package service

import data.physics.KinematicsData
import data.physics.Position
import data.physics.Velocity

class Transition {

    fun updatePosition(kinematicsData: List<KinematicsData>) {
        val diffPosition = kinematicsData.map { Position(it.velocity.x, it.velocity.y) }
        for (i in kinematicsData.indices) {
            kinematicsData[i].position += diffPosition[i]
        }
    }

    fun updateVelocity(velocities: MutableList<Velocity>, diffVelocities: MutableList<Velocity>, weights: List<Float>) {
        for (i in velocities.indices) {
            velocities[i].x += diffVelocities[i].x
            velocities[i].y += diffVelocities[i].y - 9.81f * weights[i]
        }
    }
}