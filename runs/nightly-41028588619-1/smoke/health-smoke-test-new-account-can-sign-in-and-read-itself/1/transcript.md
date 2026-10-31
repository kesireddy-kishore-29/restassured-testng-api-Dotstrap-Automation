# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 374 | `qa-0157cad5-e382-4fe2-b405-af4ce85a66e6` |
| 2 | `POST /v1/auth/token` | 200 | 79 | `qa-8540588a-5b38-4697-a2c2-8a24da90d941` |
| 3 | `GET /v1/accounts/me` | 200 | 46 | `qa-ecfc4efb-ce9e-4180-914b-22912e9f8c2b` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-9cb1c5ae-4702-474b-82be-5e2e73a3be78` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-65f62117-0322-4eba-b107-f40745acfce6` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-f596e010-cff1-4ccd-9e5e-c8b77e22e6ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0157cad5-e382-4fe2-b405-af4ce85a66e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0157cad5-e382-4fe2-b405-af4ce85a66e6
Content-Type: application/json

--- request body ---
{"handle":"qa-12e32f77f09b","displayName":"QA 12e32f77f09b","password":"****","region":"eu"}

--- response: 201 in 374 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0157cad5-e382-4fe2-b405-af4ce85a66e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-12e32f77f09b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3423c64-1b23-4321-8415-ac0f9350ee89","handle":"qa-12e32f77f09b","displayName":"QA 12e32f77f09b","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.317765669Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8540588a-5b38-4697-a2c2-8a24da90d941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8540588a-5b38-4697-a2c2-8a24da90d941
Content-Type: application/json

--- request body ---
{"handle":"qa-12e32f77f09b","password":"****"}

--- response: 200 in 79 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8540588a-5b38-4697-a2c2-8a24da90d941
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3423c64-1b23-4321-8415-ac0f9350ee89"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecfc4efb-ce9e-4180-914b-22912e9f8c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecfc4efb-ce9e-4180-914b-22912e9f8c2b
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecfc4efb-ce9e-4180-914b-22912e9f8c2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3423c64-1b23-4321-8415-ac0f9350ee89","handle":"qa-12e32f77f09b","displayName":"QA 12e32f77f09b","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.317765669Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cb1c5ae-4702-474b-82be-5e2e73a3be78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cb1c5ae-4702-474b-82be-5e2e73a3be78
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cb1c5ae-4702-474b-82be-5e2e73a3be78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3423c64-1b23-4321-8415-ac0f9350ee89","handle":"qa-12e32f77f09b","displayName":"QA 12e32f77f09b","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.317765669Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65f62117-0322-4eba-b107-f40745acfce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f62117-0322-4eba-b107-f40745acfce6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65f62117-0322-4eba-b107-f40745acfce6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f596e010-cff1-4ccd-9e5e-c8b77e22e6ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f596e010-cff1-4ccd-9e5e-c8b77e22e6ae
Content-Type: application/json

--- request body ---
{"handle":"qa-12e32f77f09b","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f596e010-cff1-4ccd-9e5e-c8b77e22e6ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f596e010-cff1-4ccd-9e5e-c8b77e22e6ae"}
```
