package frc.robot.subsystems;
import com.ctre.phoenix.sensors.CANCoder;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class SwerveModule {
    private final Talon m_driveMotor;
    private final Talon m_turningMotor;

    private final RelativeEncoder m_driveEncoder;
    private final CANCoder m_turningEncoder;


}
