/**
 * @author Kaan Fırat
 *
 * @since 1.0
 */

package com.crewl.app.domain.usecase.onboarding

import androidx.annotation.VisibleForTesting
import com.crewl.app.framework.usecase.UseCaseController
import com.crewl.app.domain.repository.OnboardingRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadOnboardingUseCase @Inject constructor
    (@get: VisibleForTesting(otherwise = VisibleForTesting.PROTECTED) internal val repository: OnboardingRepository) :
    UseCaseController<Unit, Boolean>() {
    override suspend fun execute(params: Unit): Flow<Boolean> = repository.readOnboardingState()
}


